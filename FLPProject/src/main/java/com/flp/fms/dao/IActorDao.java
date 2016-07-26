package com.flp.fms.dao;

import java.util.List;

import com.flp.ems.domain.Actor;

public interface IActorDao
{
	abstract Actor addActor(String first_name,String last_name);
	abstract void modifyActor();
	abstract boolean removeActor(int actor_id);
	abstract Actor searchActor(int actor_id);
	abstract List<Actor> getAllActor();
}

