import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { Observable } from 'rxjs';
import { Payment } from './payment';

@Injectable({
  providedIn: 'root'
})
export class PaymentService {
  private apiServiceUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient) { }

  public getOrders(): Observable<Payment[]> {
    return this.http.get<Payment[]>(`${this.apiServiceUrl}/payments/all`);
  }

  public addOrder(payment: Payment): Observable<Payment> {
    return this.http.post<Payment>(`${this.apiServiceUrl}/payments/add`, payment);
  }
}
