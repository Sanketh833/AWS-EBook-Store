import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import Book from 'Entity/Book';
import { BookService } from 'src/app/book.service';

@Component({
  selector: 'app-author-books',
  templateUrl: './author-books.component.html',
  styleUrls: ['./author-books.component.css']
})
export class AuthorBooksComponent implements OnInit {
 
  book:Book=new Book();
  books:Book[]=[];

  constructor(public bookService:BookService,
    public router:Router) { }

  ngOnInit(): void {
  }

    getByEmail(email:string){
      const promise=this.bookService.retrieveAllByEmail(email);
      promise.subscribe((response)=>{
        console.log(response);
        this.books=response as Book[];
      })

    }

    editBook(id:number){

      console.log()
this.router.navigate(['updateBook',id])

    }
    
    deleteBook(id:number){
      const promise=this.bookService.deleteBook(id);
      promise.subscribe((response)=>{
        console.log(response);
        this.getByEmail(this.book.email);
      })

    }
   

  }

 


