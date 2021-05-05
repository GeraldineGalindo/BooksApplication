package ed.ed.booksapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_books_register.*

class BooksRegister : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books_register)

        btnCancel.setOnClickListener{
            var booksListPage= Intent(this, BooksList::class.java)
            startActivity(booksListPage);
        }


    }
}