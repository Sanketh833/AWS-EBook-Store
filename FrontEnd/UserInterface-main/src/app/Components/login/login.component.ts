import { Component, OnInit } from '@angular/core';
import Author from 'Entity/Author';
import { BookService } from 'src/app/book.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  author:Author=new Author();
  authors:Author[]=[];
  constructor(public bookService: BookService) { }

  authorLogin(){
    const observable= this.bookService.authorlogin(this.author);
    observable.subscribe(
      (response:any)=>{
        console.log(response);
        this.authors.push(response);
      },
      function(error){
        console.log(error);
        alert("Something went wrong please try again!")
      }
    )
      
  
  }



  ngOnInit(): void {
  }

}
