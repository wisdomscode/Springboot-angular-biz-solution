import { Component, OnInit } from '@angular/core';
// import { PaystackOptions } from 'angular4-paystack';
import { IPayPalConfig, ICreateOrderRequest } from 'ngx-paypal';


@Component({
  selector: 'app-pay',
  templateUrl: './pay.component.html',
  styleUrls: ['./pay.component.css']
})
export class PayComponent implements OnInit {

  public payPalConfig?: IPayPalConfig;

    // options: PaystackOptions = {
  //   amount: 50000,
  //   email: 'user@mail.com',
  //   ref: `${Math.ceil(Math.random() * 10e10)}`
  // }

  constructor() { }

      // paymentInit() {
    //   console.log('Payment initialized');
    // }

    // paymentDone(ref: any) {
    //   this.title = 'Payment successfull';
    //   console.log(this.title, ref);
    // }

    // paymentCancel() {
    //   console.log('payment failed');
    // }

  ngOnInit(): void {
      // this.reference = `ref-${Math.ceil(Math.random() * 10e13)}`;
      this.initConfig();
  }

   // PAYPAL Config
   private initConfig(): void {
    this.payPalConfig = {
    currency: 'EUR',
    clientId: 'sb',
    createOrderOnClient: (data) => <ICreateOrderRequest>{
      intent: 'CAPTURE',
      purchase_units: [
        {
          amount: {
            currency_code: 'EUR',
            value: '9.99',
            breakdown: {
              item_total: {
                currency_code: 'EUR',
                value: '9.99'
              }
            }
          },
          items: [
            {
              name: 'Enterprise Subscription',
              quantity: '1',
              category: 'DIGITAL_GOODS',
              unit_amount: {
                currency_code: 'EUR',
                value: '9.99',
              },
            }
          ]
        }
      ]
    },
    advanced: {
      commit: 'true'
    },
    style: {
      label: 'paypal',
      layout: 'vertical'
    },
    onApprove: (data, actions) => {
      console.log('onApprove - transaction was approved, but not authorized', data, actions);
      actions.order.get().then(details => {
        console.log('onApprove - you can get full order details inside onApprove: ', details);
      });
    },
    onClientAuthorization: (data) => {
      console.log('onClientAuthorization - you should probably inform your server about completed transaction at this point', data);
      this.showSuccess = true;
    },
    onCancel: (data, actions) => {
      console.log('OnCancel', data, actions);
    },
    onError: err => {
      console.log('OnError', err);
    },
    onClick: (data, actions) => {
      console.log('onClick', data, actions);
    },
  };
  }


}
