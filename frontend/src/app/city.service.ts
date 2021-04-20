import { Injectable } from '@angular/core';
import { City } from './city';
import { environment } from 'src/environments/environment';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CityService {

  private apiServiceUrl = environment.apiBaseUrl;


  constructor(private http: HttpClient) { }

  public getCity(): Observable<City[]> {
    return this.http.get<City[]>(`${this.apiServiceUrl}/cities/all`);
  }
}
