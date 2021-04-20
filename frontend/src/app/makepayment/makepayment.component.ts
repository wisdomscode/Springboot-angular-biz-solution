import { Component, OnInit } from '@angular/core';
import { Payment } from '../payment';
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

  public payment: Payment[];

  constructor(
    private router: Router,
    private paymentService: PaymentService) { }

  ngOnInit() {


  }

  redirect() {
    this.router.navigate(['/']);
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

  // public pay() {}
}
