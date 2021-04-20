import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Menu } from './menu';

@Injectable({
  providedIn: 'root'
})
export class MenuService {

  private apiServiceUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient) { }

  public getMenu(): Observable<Menu[]> {
    return this.http.get<Menu[]>(`${this.apiServiceUrl}/menus/all`);
  }
}
