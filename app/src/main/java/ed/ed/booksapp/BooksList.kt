package ed.ed.booksapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import ed.ed.booksapp.models.BookDTO
import ed.ed.booksapp.repository.BookRepository
import ed.ed.booksapp.viewmodels.BookViewModel
import kotlinx.android.synthetic.main.activity_books_list.*



class BooksList : AppCompatActivity() {
    lateinit var bookRepository: BookRepository
    lateinit var bookViewModel: BookViewModel
    lateinit var listae: List<BookDTO>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books_list)
        bookRepository = BookRepository()
        bookViewModel = BookViewModel()

        bookViewModel.model.observe(this, Observer(::updateRecyclerView))
        btnGoToRegister.setOnClickListener{
            var bookRegisterPage= Intent(this, BooksRegister::class.java)
            startActivity(bookRegisterPage);
        }

        btnRefresh.setOnClickListener{
            val lista: List<BookDTO>
            lista = bookRepository.getAllBooks()
            Log.d("tagged", lista.last().title)
            val bookAdapterList = BookListAdapter(lista as ArrayList<BookDTO>, this)
            recyclerView.adapter = bookAdapterList
            val linearLayoutManager = LinearLayoutManager(this)
            linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
            recyclerView.layoutManager = linearLayoutManager
        }
    }

    private fun updateRecyclerView(booksList: List<BookDTO>){
        listae = booksList
        Log.d("tagged", listae.last().title)
    }
}