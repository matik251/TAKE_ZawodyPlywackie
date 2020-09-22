package pl.take.swimmingCompetition;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/RaceParticipant")
@Consumes({ "application/json" })
@Produces({ "application/json" })
public class RaceParticipantREST implements MyInterface<RaceParticipant> {

	@EJB
	RaceParticipantEJB bean;
	
	
//	@OPTIONS
//	@Path ("{path:.*}")
//	public Response options(){
//		return Response.status(200)
//				.header("Access-Control-Allow-Origin","*") 
//				.header("Access-Control-Allow-Headers", "origin, content-type, accept, autrhorization")
//				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, OPTIONS, HEAD")
//				.build();
//	}

	
	
	@Override
	@GET
	@Path("/{id}")
	public RaceParticipant get(@PathParam("id") int id) {
		RaceParticipant raceParticipant = bean.get(id);
		return raceParticipant;
	}

	@GET
	public Response get() {
		List<RaceParticipant> raceParticipantList = bean.getAll();
		return Response.status(200).header("Access-Control-Allow-Origin","*").entity(raceParticipantList).build();
	}

	@Override
	@POST
	public Response create(RaceParticipant t) {
		bean.create(t);
		return Response.status(200).header("Access-Control-Allow-Origin","*").entity("dodano").build();
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
