package ed.ed.booksapp.repository

import ed.ed.booksapp.models.BookDTO

class BookRepository {
    private var books = arrayListOf<BookDTO>()

    constructor(){
        books.add(BookDTO(1,"Camelia", 180, "Editorial", "Author", "Description", "1"))
        books.add(BookDTO(2,"Margarita", 180, "Editorial", "Author", "Description","2"))
    }

    fun getAllBooks(): ArrayList<BookDTO> {
        return books;
    }

    fun addBook(book: BookDTO) {
        books.add(book);
    }
}