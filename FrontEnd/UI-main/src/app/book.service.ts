import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';




const URL = "http://localhost:8083/book"
const URLGET = "http://localhost:8083/allBooks"

const URLLOGIN = "http://localhost:8088/login"


@Injectable({
  providedIn: 'root'
})
export class BookService {



  getBooks() {
    return this.http.get(URLGET)
  }

  searchBooks(category: any, authorName: any, price: any, publisher: any) {
    return this.http.get("http://localhost:8083/searchbooks/" + category + '/' + authorName + '/' + price + '/' + publisher);
  }

  //   getbyparams(): Observable<any>{
  // let params1= new HttpParams().set('category',this.category);
  // let params2= new HttpParams().set('authorName','mars');
  // let params3= new HttpParams().set('price','1390');
  // // let params2= new HttpParams().set('AuthorName','mystery');
  // return this.http.get("http://localhost:8083/searchbooks",{params:params1})
  //   }




  createBook(books: {
    title: string;
    category: string;
    image: string;
    price: number;
    publisher: string;
    active: boolean;
    content: string;
    email: string;
    authorName: string;


  }) {
    return this.http.post(URL, books)

  }

  buyBook(readers: {
    readerEmail: string;
    readerName: string;
    cardNumber: number;
    cvv: number;
    id: number;
  }) {

    return this.http.post("http://localhost:8085/buy/", readers)
  }

  authorlogin(author: {
    email: string;
    password: string;


  }) {
    return this.http.post(URLLOGIN, author)

  }

  retrieveAllByEmail(email: string) {
    return this.http.get(`http://localhost:8083/getbookbyemail/${email}`)

  }

  updateBook(id: number, books: {
    title: string;
    category: string;
    image: string;
    price: number;
    publisher: string;
    active: boolean;
    content: string;



  }) {
    return this.http.put(`http://localhost:8083/update/${id}`, books)


  }

  deleteBook(id: number) {
    return this.http.delete(`http://localhost:8083/book/${id}`);
  }

  createAuthor(authors: {
    email: string;
    authorName: string;
    password: string;



  }) {
    return this.http.post(`http://localhost:8088/author`, authors)

  }




  constructor(public http: HttpClient) { }
}


