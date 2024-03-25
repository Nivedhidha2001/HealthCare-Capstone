import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RegisterComponent } from './register/register.component';
import { ListusersComponent } from './listusers/listusers.component';

const routes: Routes = [
  {path:'register',component:RegisterComponent},
  {path:'list',component:ListusersComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
