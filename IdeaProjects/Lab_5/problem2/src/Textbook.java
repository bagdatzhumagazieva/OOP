import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Vector;

public class Textbook implements Serializable {
    private String title;
    private String author;
    private String isbn;

    public Textbook(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }

    public boolean equals(Object b) {
        if(b != null && this.getClass() == b.getClass())
            if(this.isbn.equals(((Textbook)b).isbn))
                return true;
        return false;
    }

    public String toString() {
        return author+" - "+title;
    }

    public void serialize(Vector<Textbook> v) {
        try {
            FileOutputStream f = new FileOutputStream("book.out");
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(v);
            o.flush();
            o.close();
            f.close();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}