package pl.take.swimmingCompetition;

import java.util.List;

import javax.ejb.Local;

@Local
public interface MyInterface<T> {

	T get(int id);
	
	List<T> getAll();
	
	void create(T t);
	
	void update(T t);

	void delete(int id);
}
