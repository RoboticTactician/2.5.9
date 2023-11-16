public class Book {
    private int rating;
    private String title;
    private String author;

    /*** Constructor ****/
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    /*** Accessor methods ***/
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getRating() {
        return rating;
    }

    public String toString() {
        StringBuilder info = new StringBuilder();
        info.append("\"").append(title).append("\", written by ").append(author);
        if (rating != 0) {
            info.append(", rating is ").append(rating);
        }
        return info.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book otherBook = (Book) obj;
        return title.equals(otherBook.title) &&
               author.equals(otherBook.author) &&
               rating == otherBook.rating;
    }

    /*** Mutator methods ***/
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void adjustRating(int rating) {
        if ((this.rating + rating >= 0) && (this.rating + rating <= 10))
            this.rating += rating;
    }
}
