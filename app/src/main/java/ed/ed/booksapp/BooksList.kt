package ed.ed.booksapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import ed.ed.booksapp.models.BookDTO
import kotlinx.android.synthetic.main.activity_books_list.*
import kotlinx.android.synthetic.main.activity_books_register.*


class BooksList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books_list)

        val lista = arrayListOf<BookDTO>()
        lista.add(BookDTO(1,"Camelia", 180, "Editorial", "Author", "Description"))
        lista.add(BookDTO(2,"Margarita", 180, "Editorial", "Author", "Description"))

        val bookAdapterList = BookListAdapter(lista, this)
        recyclerView.adapter = bookAdapterList
        val linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = linearLayoutManager


       btnGoToRegister.setOnClickListener{
            var bookRegisterPage= Intent(this, BooksRegister::class.java)
            startActivity(bookRegisterPage);
        }
    }
}