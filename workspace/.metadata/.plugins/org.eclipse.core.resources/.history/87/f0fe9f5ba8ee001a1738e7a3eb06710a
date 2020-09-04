package pl.take.swimmingCompetition;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class MenuEJB {
	
	@PersistenceContext(name="menu")
	EntityManager manager;
	
	public void createSwimmers(Swimmers swimmers) {
		System.out.println("Creating swimmer!");
		manager.persist(swimmers);
	}

}
