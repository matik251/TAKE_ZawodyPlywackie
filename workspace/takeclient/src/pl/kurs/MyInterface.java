package pl.kurs;

import java.util.List;

public interface MyInterface<T> {

	T get(int id);
	
	List<T> getAll();
	
	void create(T t);
	
	void update(T t);
	
	void delete(T t);
}
