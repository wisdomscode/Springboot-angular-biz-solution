import { Component, OnInit } from '@angular/core';
import { Business } from './business';
import { BusinessService } from './business.service';
import { HttpErrorResponse } from '@angular/common/http';
import { City } from './city';
import { CityService } from './city.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  public businesses: Business[];

  public cities: City[];

  constructor(private businessService: BusinessService, private cityService: CityService) { }

  ngOnInit() {
    this.getBusiness();
    this.getCity();
  }

  public getBusiness(): void {
    this.businessService.getBusiness().subscribe(
      (response: Business[]) => {
        this.businesses = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }

  public getCity(): void {
    this.cityService.getCity().subscribe(
      (response: City[]) => {
        this.cities = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }

}
