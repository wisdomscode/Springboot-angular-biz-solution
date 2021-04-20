import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { BusinessDetailComponent } from './business-detail/business-detail.component';
import { BusinessesComponent } from './businesses/businesses.component';
import { MakepaymentComponent } from './makepayment/makepayment.component';

const routes: Routes = [
  { path: '', component:BusinessesComponent },

  {
    path: "business/:id", component:BusinessDetailComponent
  },

  {
    path: 'pay/:id', component:MakepaymentComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
