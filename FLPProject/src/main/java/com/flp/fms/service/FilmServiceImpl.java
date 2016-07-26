package com.flp.fms.service;

import java.text.ParseException;
import java.util.List;
import com.flp.ems.domain.Film;
import com.flp.fms.dao.FilmDaoImplForList;
import com.flp.fms.dao.IFilmDao;

public class FilmServiceImpl implements IFilmService{
   IFilmDao filmDao;
   public FilmServiceImpl() {
	filmDao=new FilmDaoImplForList();
}
	public void  addFilm(Film film) throws ParseException {
		 filmDao.addFilm(film);
		
	}

	public void modifyFilm() {
	 filmDao.modifyFilm();
		
	}

	public boolean removeFilm(int film_id) {
		
		return filmDao.removeFilm(film_id);
	}

	public Film searchFilm(int film_id) {
		
		return filmDao.searchFilm(film_id);
	}

	public List<Film> getAllFilm() {
		
		return filmDao.getAllFilm();
	}
	
	}
	


