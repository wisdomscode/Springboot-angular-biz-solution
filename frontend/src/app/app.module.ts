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

@NgModule({
  declarations: [
    AppComponent,
    BusinessDetailComponent,
    FilterPipe,
    BusinessesComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,

  ],
  providers: [BusinessService, CityService, PaymentService, MenuService],
  bootstrap: [AppComponent]
})
export class AppModule { }
