import { Component, OnInit } from '@angular/core';
import { BookService } from 'src/app/book.service';
import Book from 'Entity/Book';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  book:Book=new Book();
  books:Book[]=[];

  constructor(public bookService:BookService,
    public router:Router) { }

  search(){
    this.refresh();
    this.router.navigate(['searchResults'])

  }

  refresh(){
    const promise=this.bookService.getBooks();
    promise.subscribe((response)=>{
      console.log(response);
      this.books=response as Book[];
  })
  }
  


  ngOnInit(): void {
 
   

}
}
