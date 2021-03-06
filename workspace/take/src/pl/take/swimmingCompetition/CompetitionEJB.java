package pl.take.swimmingCompetition;

import java.util.List;

import javax.ejb.Stateful;
import javax.persistence.*;

@Stateful
public class CompetitionEJB {

	@PersistenceContext(name="komis") /*swimmingCompetition*/
	EntityManager manager;
	
	public Competition get(int id) {
		return manager.find(Competition.class, id);
	}
	
	public List<Competition> getAll() {
		Query query = manager.createQuery("select c from Competition c");
		@SuppressWarnings("unchecked")
		List<Competition> list = query.getResultList();
		return list;
	}
	
	public void create(Competition t) {
		manager.persist(t);
	}
	
	public void update(Competition t) {
		t = manager.merge(t);
	}
	
	public void delete(int id) {
		Competition competition = manager.find(Competition.class, id);
		manager.remove(competition);
	}
}
