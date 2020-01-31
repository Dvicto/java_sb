package artem.test.dao;

import java.util.List;
import artem.test.model.Film;

public interface FilmDAO {
    List<Film> allFilms();
    void add(Film film);
    void delete(Film film);
    void edit(Film film);
    Film getById(int id);
}
