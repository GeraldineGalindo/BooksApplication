package ed.ed.booksapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ed.ed.booksapp.models.BookDTO
import ed.ed.booksapp.repository.BookRepository
import ed.ed.booksapp.viewmodels.BookViewModel
import kotlinx.android.synthetic.main.activity_books_register.*

class BooksRegister : AppCompatActivity() {
    lateinit var bookRepository: BookRepository
    lateinit var bookViewModel: BookViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books_register)
        bookRepository = BookRepository()
        bookViewModel = BookViewModel()

        btnCancel.setOnClickListener{
            var booksListPage= Intent(this, BooksList::class.java)
            startActivity(booksListPage);
        }

        btnRegister.setOnClickListener{
            var book: BookDTO = BookDTO(1, txtTitle.text.toString(), 12, txtEditorial.text.toString(), txtAuthor.text.toString(), txtDescription.text.toString(), "1");
            bookViewModel.registerBook(book);
            var booksListPage= Intent(this, BooksList::class.java)
            startActivity(booksListPage);
        }
    }
}