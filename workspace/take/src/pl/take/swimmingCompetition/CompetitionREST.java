package pl.take.swimmingCompetition;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.*;

@Path("/Competition")
@Consumes({ "application/xml" })
@Produces({ "application/xml" })
public class CompetitionREST implements MyInterface<Competition> {

	@EJB
	CompetitionEJB bean;

	@Override
	@GET
	@Path("/{id}")
	public Competition get(@PathParam("id") int id) {
		Competition competition = bean.get(id);
		return competition;
	}

	@Override
	@GET
	public List<Competition> getAll() {
		List<Competition> competitionList = bean.getAll();
		return competitionList;
	}

	@Override
	@POST
	public void create(Competition t) {
		bean.create(t);
	}

	@Override
	@PUT
	public void update(Competition t) {
		bean.update(t);
	}

	@Override
	@DELETE
	@Path("/{id}")
	public void delete(@PathParam("id") int id) {
		bean.delete(id);
	}
}