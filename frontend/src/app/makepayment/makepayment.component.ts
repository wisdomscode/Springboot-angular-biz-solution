import { Component, OnInit } from '@angular/core';
import { Business } from '../business';
import { City } from '../city';
import { Menu } from '../menu';
import { Payment } from '../payment';
import { BusinessService } from '../business.service';
import { CityService } from '../city.service';
import { MenuService } from '../menu.service';
import { PaymentService } from '../payment.service';
import { NgForm } from '@angular/forms';
import { HttpErrorResponse } from '@angular/common/http';
import { Router } from '@angular/router';


@Component({
  selector: 'app-makepayment',
  templateUrl: './makepayment.component.html',
  styleUrls: ['./makepayment.component.css']
})
export class MakepaymentComponent implements OnInit {

  public businesses: Business[];

  public cities: City[];

  public menus: Menu[];

  public payment: Payment[];


  constructor(
    private router: Router,
    private businessService: BusinessService,
    private cityService: CityService,
    private menuService: MenuService,
    private paymentService: PaymentService) { }




  ngOnInit() {

  }

  redirect() {
    this.router.navigate(['/pay']);
  }

  public onOrderMeal(makeOrderForm: NgForm): void {
    this.paymentService.addOrder(makeOrderForm.value).subscribe(
      (response: Payment) => {
        console.log(response);
        console.log("Added successfully");

        this.redirect();
        // location.reload();
        // this.getMenu();
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    )
  }


}
