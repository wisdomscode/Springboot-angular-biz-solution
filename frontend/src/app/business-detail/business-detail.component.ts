import { Component, OnInit } from '@angular/core';
import { Business } from '../business';
import { City } from '../city';
import { BusinessService } from '../business.service';
import { CityService } from '../city.service';
import { HttpErrorResponse } from '@angular/common/http';
import { Menu } from '../menu';
import { MenuService } from '../menu.service';
import { NgForm } from '@angular/forms';
import { PaymentService } from '../payment.service';
import { Payment } from '../payment';

@Component({
  selector: 'app-business-detail',
  templateUrl: './business-detail.component.html',
  styleUrls: ['./business-detail.component.css']
})
export class BusinessDetailComponent implements OnInit {

  public businesses: Business[];

  public cities: City[];

  public menus: Menu[];

  public payment: Payment[];

  constructor(
    private businessService: BusinessService,
    private cityService: CityService,
    private menuService: MenuService,
    private paymentService: PaymentService) { }

  ngOnInit() {
    this.getBusiness();
    this.getCity();
    this.getMenu();
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

  public getMenu(): void {
    this.menuService.getMenu().subscribe(
      (response: Menu[]) => {
        this.menus = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    )
  }


}

