import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { BusinessDetailComponent } from './business-detail/business-detail.component';
import { BusinessesComponent } from './businesses/businesses.component';

const routes: Routes = [
  {
    path: '', component:BusinessesComponent
  },

  {
    path: "business/:id", component:BusinessDetailComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
