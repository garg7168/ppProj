package com.flp.fms.dao;

import java.util.List;

import com.flp.ems.domain.Film;

public interface IFilmDao
{
	abstract void addFilm(Film film);
	abstract void modifyFilm();
	abstract boolean removeFilm(int film_id);
	abstract Film searchFilm(int film_id);
	abstract List<Film> getAllFilm();
}
