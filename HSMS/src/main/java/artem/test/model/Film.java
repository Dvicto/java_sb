package artem.test.model;

import javax.persistence.*;


@Entity
@Table(name = "films")
public class Film {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "year")
    private int year;

    @Column(name = "genre")
    private String genre;

    @Column(name = "watched")
    private boolean watched;

    public Film(int id, String title, int year, String genre, boolean watched){
        this.genre = genre;
        this.id = id;
        this.title = title;
        this.watched = watched;
        this.year = year;
    }

    public Film(){

    }

    public int getId() {
        return id;
    }

    public boolean isWatched() {
        return watched;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setWatched(boolean watched) {
        this.watched = watched;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                ", watched=" + watched +
                '}';
    }
}
