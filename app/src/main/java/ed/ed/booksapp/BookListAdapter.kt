package ed.ed.booksapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ed.ed.booksapp.models.BookDTO
import kotlinx.android.synthetic.main.book_row.view.*

class BookListAdapter(val items: ArrayList<BookDTO>, val context: Context): RecyclerView.Adapter<BookListAdapter.BookListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookListViewHolder{
        val v = LayoutInflater.from(parent.context).inflate(R.layout.book_row, parent, false)
        return BookListViewHolder(v)
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun onBindViewHolder(holder: BookListViewHolder, position: Int) {
        val book = items.get(position)
        holder.itemView.txtTitle.text = book.title
        holder.itemView.txtAuthor.text = book.author
        holder.itemView.txtPages.text = book.pages.toString()
        holder.itemView.txtEditorial.text = book.editorial
        holder.itemView.txtDescription.text = book.description
    }

    class BookListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
}