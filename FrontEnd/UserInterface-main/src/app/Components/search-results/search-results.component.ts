import { Component, OnInit } from '@angular/core';
import Book from 'Entity/Book';
import { BookService } from 'src/app/book.service';

@Component({
  selector: 'app-search-results',
  templateUrl: './search-results.component.html',
  styleUrls: ['./search-results.component.css']
})
export class SearchResultsComponent implements OnInit {
  book:Book=new Book();
  books:Book[]=[];

  constructor(public bookService:BookService) { }

  ngOnInit(): void {
    const promise=this.bookService.getBooks();
    promise.subscribe((response)=>{
      console.log(response);
      this.books=response as Book[];
  })
}

}
