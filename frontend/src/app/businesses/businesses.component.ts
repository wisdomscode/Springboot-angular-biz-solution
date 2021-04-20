import { Component, OnInit } from '@angular/core';
import { Business } from '../business';
import { City } from '../city';
import { BusinessService } from '../business.service';
import { CityService } from '../city.service';
import { HttpErrorResponse } from '@angular/common/http';


@Component({
  selector: 'app-businesses',
  templateUrl: './businesses.component.html',
  styleUrls: ['./businesses.component.css']
})
export class BusinessesComponent implements OnInit {
  public businesses: Business[];

  public cities: City[];

  constructor(private businessService: BusinessService, private cityService: CityService) { }

  ngOnInit() {
    this.getBusiness();
    this.getCity();
  }

  public searchBusinesses(key: string): void {
    const results: Business[] = [];
    for (const business of this.businesses) {
      if (business.state.name.toLowerCase().indexOf(key.toLowerCase()) !== -1
      || business.name.toLowerCase().indexOf(key.toLowerCase()) !== -1) {
        results.push(business);
      }
    }
    this.businesses = results;
    if (results.length === 0 || !key) {
      this.getBusiness();
    }
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

