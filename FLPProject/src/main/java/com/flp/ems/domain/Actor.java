package com.flp.ems.domain;

import java.util.Date;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Actor 
{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable=false)
	private int actor_Id;
	
	@Column(nullable=false)
	private String first_name;
	
	@Column(nullable=false)
	private String last_name;
	
	@ManyToMany(mappedBy="actors")
    private Set<Film> films = new HashSet<Film>();
	
	@Column(insertable = false, updatable = false,nullable=false,columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Date last_update;
	
	public Actor()
	{
		
	}

	public Actor(String first_name, String last_name) {
		this.first_name=first_name;
		this.last_name=last_name;
	}

	public int getActor_Id() {
		return actor_Id;
	}

	public void setActor_Id(int actor_Id) {
		this.actor_Id = actor_Id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Date getLast_update() {
		return last_update;
	}

	public void setLast_update(Date date) {
		this.last_update = date;
	}

	public Set<Film> getFilms() {
		return films;
	}

	public void setFilms(Set<Film> films) {
		this.films = films;
	}

	@Override
	public String toString() {
		return "Actor [actor_Id=" + actor_Id + ", first_name=" + first_name + ", last_name=" + last_name + ", last_update=" + last_update + "]";
	}
}
