package pl.take.swimmingCompetition;

import java.util.List;

import javax.ejb.Local;
import javax.ws.rs.core.Response;


@Local
public interface MyInterface<T> {

	//Response options();

	T get(int id);
	
	Response get();
	
	Response create(T t);
	
	void update(T t);

	void delete(int id);
}
