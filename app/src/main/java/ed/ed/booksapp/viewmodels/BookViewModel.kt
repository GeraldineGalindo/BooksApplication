package ed.ed.booksapp.viewmodels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import ed.ed.booksapp.models.BookDTO
import ed.ed.booksapp.repository.BookRepository

class BookViewModel {
    private val repository: BookRepository = BookRepository()
    val model: LiveData<List<BookDTO>>
    get() = _model

    private val _model = MutableLiveData<List<BookDTO>>()

    fun registerBook(book: BookDTO){
        repository.addBook(book)
        Log.d("value", book.author.toString())
        _model.value = repository.getAllBooks()
    }
}