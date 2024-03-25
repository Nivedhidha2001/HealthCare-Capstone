import { Component } from '@angular/core';
import { UserserviceService } from '../service/userservice.service';
import { User } from '../Models/User';

@Component({
  selector: 'app-listusers',
  templateUrl: './listusers.component.html',
  styleUrls: ['./listusers.component.css']
})
export class ListusersComponent {

  users:User[];
  constructor(private service:UserserviceService){}

  ngOnInit(){
    this.service.getAllUsers().subscribe(x=>this.users=x);
  }
}
