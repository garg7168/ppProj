package com.flp.fms.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.flp.ems.domain.Actor;
import com.flp.ems.domain.Film;
import com.flp.ems.domain.Language;
import com.flp.fms.service.ActorServiceImpl;
import com.flp.fms.service.FilmServiceImpl;
import com.flp.fms.service.IActorService;
import com.flp.fms.service.IFilmService;

public class UserInteraction {

	IFilmService filmService;
	IActorService actorService;
	
	public UserInteraction()
	{
		filmService=new FilmServiceImpl();
		actorService=new ActorServiceImpl();
	}
	
	
	private static Scanner scan=new Scanner(System.in);

	public void addFilm() throws ParseException
	{
		List film=new ArrayList();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		System.out.println("Enter title");
		film.add(scan.next());
		
		System.out.println("Enter description");
		film.add(scan.next());
		
		System.out.println("Enter release date");
		
		film.add(dateFormat.parse(scan.next()));
		
		System.out.println("Enter rental duration");
		film.add(scan.nextInt());
		
		System.out.println("Enter rental rate");
		film.add(scan.nextFloat());
		
		System.out.println("Enter length of the movie");
		film.add(scan.nextInt());
		
		System.out.println("Enter replacement cost");
		film.add(scan.nextFloat());
		
		System.out.println("Enter rating");
		film.add(scan.nextFloat());
		
		System.out.println("Enter special features");
		film.add(scan.next());
		
		Language language=new Language();
		System.out.println("Enter language name");
		film.add(scan.next());
		
		
		
		System.out.println("Enter category name");
		film.add(scan.next());
				
		Set<Actor> actor = new HashSet<Actor>();
		System.out.println("enter no of actors");
		int noofactors=scan.nextInt();
		for(int i=1;i<=noofactors;i++){
			List actorDetails=new ArrayList();
			System.out.println("Enter the actor first name");
			actorDetails.add(scan.next());
			System.out.println("Enter the actor last name");
			actorDetails.add(scan.next());
			film.add(actorDetails);
			
		}
		filmService.addFilm(film);
	}
	
	
	public void modifyFilm() throws ParseException{
		
		
		
		
		
	}
	public void removeFilm(){
		System.out.println("enter id of the film to search");
		int film_id=scan.nextInt();
		if(filmService.removeFilm(film_id))
		{
			System.out.println("film Successfully removed");
		}
		else
		{
			System.out.println("film Not Found");
		}
	}
	public void searchFilm(){
		System.out.println("enter id of the film to search");
		int film_id=scan.nextInt();
		Film film=filmService.searchFilm(film_id);
		if(film!=null)
			System.out.println("film found"+film);
		else
			System.out.println("not found");
	}
	public void getAllFilm(){
		List<Film> films=filmService.getAllFilm();
		System.out.println("All films details are "+films);
		
	}
	public Actor addActor(){
		System.out.println("enter first name of actor");
		String first_name=scan.next();
		System.out.println("enter last name of actor");
		String last_name=scan.next();
		return actorService.addActor(first_name, first_name);
		
	}
	
	public void modifyActor(){
		
	}
	
    public void removeActor(){
		System.out.println(" enter actor_id to remove");
		int  actor_id =scan.nextInt();
		if(actorService.removeActor(actor_id))
		{
			System.out.println("actor removed successfully");
		}
		else{
			System.out.println("actor not found");
		}
	}
    public void searchActor(){
    	System.out.println("enter actor id to search ");
    	int actor_id=scan.nextInt();
    	Actor actor=actorService.searchActor(actor_id);
    	if(actor!=null){
    		System.out.println("actor found "+actor);
    	}
    	else{
    		System.out.println("actor not found");
    	}
		
	}
	 public void getAllActor(){
		 List<Actor> actor=actorService.getAllActor();
		 System.out.println("all actor details are"+actor);
		
		
	}
	
}
