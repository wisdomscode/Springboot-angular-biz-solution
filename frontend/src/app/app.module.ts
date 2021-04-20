import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BusinessService } from './business.service';
import { HttpClientModule } from '@angular/common/http';
import { CityService } from './city.service';
import { BusinessDetailComponent } from './business-detail/business-detail.component';
import { FilterPipe } from './filter.pipe';
import { BusinessesComponent } from './businesses/businesses.component';
import { FormsModule } from '@angular/forms';
import { PaymentService } from './payment.service';
import { MenuService } from './menu.service';
import { MakepaymentComponent } from './makepayment/makepayment.component';
// import { Angular4PaystackModule } from 'angular4-paystack';
import { NgxPayPalModule } from 'ngx-paypal';
import { PayComponent } from './pay/pay.component';

@NgModule({
  declarations: [
    AppComponent,
    BusinessDetailComponent,
    FilterPipe,
    BusinessesComponent,
    MakepaymentComponent,
    PayComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    NgxPayPalModule,
    // Angular4PaystackModule.forRoot('pk_test_b1e8bf82d10da04b26e60806e036e56363e65146'),

  ],
  providers: [BusinessService, CityService, PaymentService, MenuService],
  bootstrap: [AppComponent]
})
export class AppModule { }
