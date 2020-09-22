package pl.take.swimmingCompetition;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/Race")
@Consumes({ "application/json" })
@Produces({ "application/json" })
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

	@GET
	public Response get() {
		List<Race> raceList = bean.getAll();
		return Response.status(200).header("Access-Control-Allow-Origin","*").entity(raceList).build();
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
