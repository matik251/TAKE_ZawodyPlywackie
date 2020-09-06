package pl.take.swimmingCompetition;

import java.util.List;

import javax.ejb.Stateful;
import javax.persistence.*;

@Stateful
public class RaceParticipantEJB {

	@PersistenceContext(name="swimmingCompetition")
	EntityManager manager;
	
	public RaceParticipant get(int id) {
		return manager.find(RaceParticipant.class, id);
	}
	
	public List<RaceParticipant> getAll() {
		Query query = manager.createQuery("select c from RaceParticipant c");
		@SuppressWarnings("unchecked")
		List<RaceParticipant> list = query.getResultList();
		return list;
	}
	
	public void create(RaceParticipant t) {
		manager.persist(t);
	}
	
	public void update(RaceParticipant t) {
		t = manager.merge(t);
	}
	
	public void delete(int id) {
		RaceParticipant raceParticipant = manager.find(RaceParticipant.class, id);
		manager.remove(raceParticipant);
	}
}
