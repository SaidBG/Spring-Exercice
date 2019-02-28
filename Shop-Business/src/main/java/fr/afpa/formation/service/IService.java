package fr.afpa.formation.service;

import java.util.List;

public interface IService<T, E extends Exception> {

	public abstract T create(T t) throws E;
	
	public abstract List<T> findAll() throws E;

	public abstract T findById(Long id) throws E;
	
	public abstract void delete(Long id) throws E;
	
	public abstract T update(T t) throws E;

}