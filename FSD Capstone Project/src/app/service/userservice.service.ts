import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from '../Models/User';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserserviceService {

  baseUrl:string="http://localhost:9090/api/user";
  constructor(private http:HttpClient) { }

  saveUser(user:User){
    return this.http.post(this.baseUrl,user);
  }
  getAllUsers():Observable<User[]>{
    return this.http.get<User[]>(this.baseUrl);
  }
}
