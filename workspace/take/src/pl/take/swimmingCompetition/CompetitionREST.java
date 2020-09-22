package pl.take.swimmingCompetition;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/Competition")
@Consumes({ "application/json" })
@Produces({ "application/json" })
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

	@GET
	public Response get() {
		List<Competition> competitionList = bean.getAll();
		return Response.status(200).header("Access-Control-Allow-Origin","*").entity(competitionList).build();
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
