package com.flp.fms.service;

import java.text.ParseException;
import java.util.List;

import com.flp.ems.domain.Film;


public interface IFilmService 
{
	abstract void addFilm(Film film) throws ParseException;
	abstract void modifyFilm();
	abstract boolean removeFilm(int film_id);
	abstract Film searchFilm(int film_id);
	abstract List<Film> getAllFilm();
}
