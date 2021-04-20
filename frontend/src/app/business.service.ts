import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Business } from './business';
import { HttpClient } from '@angular/common/http';
import { environment } from '../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class BusinessService {

  private apiServiceUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient) { }

  public getBusiness(): Observable<Business[]> {
    return this.http.get<Business[]>(`${this.apiServiceUrl}/business/all`);
  }

  public addBusiness(business: Business): Observable<Business> {
    return this.http.post<Business>(`${this.apiServiceUrl}/business/add`, business);
  }

  public updateBusiness(business: Business): Observable<Business> {
    return this.http.put<Business>(`${this.apiServiceUrl}/business/update`, business);
  }

  public findBusiness(business: Business): Observable<Business> {
    return this.http.get<Business>(`${this.apiServiceUrl}/business/find/{id}`);
  }
}

