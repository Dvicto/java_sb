package artem.test.service;

import artem.test.dao.FilmDAO;
import artem.test.dao.FilmDAOImpl;
import artem.test.model.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {

    private FilmDAO filmDAO;

    @Autowired
    public void setFilmDAO(FilmDAO filmDAO){
        this.filmDAO = filmDAO;
    }

    @Transactional
    public List<Film> allFilms() {
        return filmDAO.allFilms();
    }

    @Transactional
    public void add(Film film) {
        filmDAO.add(film);
    }

    @Transactional
    public void delete(Film film) {
        filmDAO.delete(film);
    }

    @Transactional
    public void edit(Film film) {
        filmDAO.edit(film);
    }

    @Transactional
    public Film getById(int id) {
        return filmDAO.getById(id);
    }
}