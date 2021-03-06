package pl.take.swimmingCompetition;

import java.util.List;

import javax.ejb.Stateful;
import javax.persistence.*;

@Stateful
public class RaceEJB {

	@PersistenceContext(name="komis") /*swimmingCompetition*/
	EntityManager manager;
	
	public Race get(int id) {
		return manager.find(Race.class, id);
	}
	
	public List<Race> getAll() {
		Query query = manager.createQuery("select c from Race c");
		@SuppressWarnings("unchecked")
		List<Race> list = query.getResultList();
		return list;
	}
	
	public void create(Race t) {
		manager.persist(t);
	}
	
	public void update(Race t) {
		t = manager.merge(t);
	}
	
	public void delete(int id) {
		Race race = manager.find(Race.class, id);
		manager.remove(race);
	}
}
