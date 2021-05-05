package ed.ed.booksapp.models

data class BookDTO(
    val id: Long,
    val title: String,
    val pages: Int,
    val editorial: String,
    val author: String,
    val description: String,
    val isbn: String
) {
}