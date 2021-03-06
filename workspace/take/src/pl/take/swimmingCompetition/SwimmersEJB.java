package pl.take.swimmingCompetition;

import java.util.List;

import javax.ejb.Stateful;
import javax.persistence.*;

@Stateful
public class SwimmersEJB {

	@PersistenceContext(name="komis") /*swimmingCompetition*/
	EntityManager manager;
	
	public Swimmers get(int id) {
		return manager.find(Swimmers.class, id);
	}
	
	public List<Swimmers> getAll() {
		Query query = manager.createQuery("select c from Swimmers c");
		@SuppressWarnings("unchecked")
		List<Swimmers> list = query.getResultList();
		return list;
	}
	
	public void create(Swimmers t) {
		manager.persist(t);
	}
	
	public void update(Swimmers t) {
		t = manager.merge(t);
	}
	
	public void delete(int id) {
		Swimmers swimmers = manager.find(Swimmers.class, id);
		manager.remove(swimmers);
	}
}
