import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';




const URL = "http://34.218.246.21:8083/book"
const URLGET = "https://dcf41pkqwg.execute-api.us-west-2.amazonaws.com/presentation/book-store"

const URLLOGIN = "http://34.218.246.21:8088/login"


@Injectable({
  providedIn: 'root'
})
export class BookService {



  getBooks() {
    return this.http.get(URLGET)
  }

  searchBooks(category: any, authorName: any, price: any, publisher: any) {
    return this.http.get("https://dcf41pkqwg.execute-api.us-west-2.amazonaws.com/presentation/%7Bproxy+%7D" + category + '/' + authorName + '/' + price + '/' + publisher);
  }



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

  buyBook(id: number, readers: {
    readerEmail: string;
    readerName: string;
    cardNumber: number;
    cvv: number;
    id: number;
  }) {

    return this.http.post(`http://34.218.246.21:8085/buy/${id}`, readers)
  }

  authorlogin(author: {
    email: string;
    password: string;


  }) {
    return this.http.post(URLLOGIN, author)

  }

  retrieveAllByEmail(email: string) {
    return this.http.get(`http://34.218.246.21:8083/getbookbyemail/${email}`)

  }
  getReadersBook(id: number) {
    return this.http.get(`http://34.218.246.21:8085/getspecificbook/${id}`)

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
    return this.http.put(`http://34.218.246.21:8083/update/${id}`, books)


  }

  deleteBook(id: number) {
    return this.http.delete(`http://34.218.246.21:8083/book/${id}`);
  }

  createAuthor(authors: {
    email: string;
    authorName: string;
    password: string;



  }) {
    return this.http.post(`https://dcf41pkqwg.execute-api.us-west-2.amazonaws.com/presentation/author`, authors)

  }




  constructor(public http: HttpClient) { }
}


