package pl.take.swimmingCompetition;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.*;

@Path("/RaceParticipant")
@Consumes({ "application/json" })
@Produces({ "application/json" })
public class RaceParticipantREST implements MyInterface<RaceParticipant> {

	@EJB
	RaceParticipantEJB bean;
	
	
	@Override
	@GET
	@Path("/{id}")
	public RaceParticipant get(@PathParam("id") int id) {
		RaceParticipant raceParticipant = bean.get(id);
		return raceParticipant;
	}

	@Override
	@GET
	public List<RaceParticipant> getAll() {
		List<RaceParticipant> raceParticipantList = bean.getAll();
		return raceParticipantList;
	}

	@Override
	@POST
	public void create(RaceParticipant t) {
		bean.create(t);
	}

	@Override
	@PUT
	public void update(RaceParticipant t) {
		bean.update(t);
	}

	@Override
	@DELETE
	@Path("/{id}")
	public void delete(@PathParam("id") int id) {
		bean.delete(id);
	}

}
