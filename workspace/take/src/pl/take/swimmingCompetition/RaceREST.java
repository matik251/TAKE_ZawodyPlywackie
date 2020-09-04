package pl.take.swimmingCompetition;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.*;

@Path("/Race")
@Consumes({ "application/xml" })
@Produces({ "application/xml" })
public class RaceREST implements MyInterface<Race> {

	@EJB
	RaceEJB bean;
	
	@Override
	@GET
	@Path("/{id}")
	public Race get(int id) {
		Race race = bean.get(id);
		return race;
	}

	@Override
	@GET
	public List<Race> getAll() {
		List<Race> raceList = bean.getAll();
		return raceList;
	}

	@Override
	@POST
	public void create(Race t) {
		bean.create(t);
	}

	@Override
	@PUT
	public void update(Race t) {
		bean.update(t);
	}

	@Override
	@DELETE
	@Path("/{id}")
	public void delete(@PathParam("id") int id) {
		bean.delete(id);
	}
	

}