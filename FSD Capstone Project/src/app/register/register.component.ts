import { Component } from '@angular/core';
import { User } from '../Models/User';
import { UserserviceService } from '../service/userservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent {
  user:User = new User();
  constructor(private service:UserserviceService,private router:Router){

  }
  onSubmit(){
    console.log(this.user);
    this.service.saveUser(this.user).subscribe(x=>console.log(x));
    alert("Registration completed successfully")
    this.router.navigate(['list']);
  }
}
