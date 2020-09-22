package pl.take.swimmingCompetition;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/Swimmers")
@Consumes({ "application/json" })
@Produces({ "application/json" })
public class SwimmersREST implements MyInterface<Swimmers> {
	
	@EJB
	SwimmersEJB bean;

	@Override
	@GET
	@Path("/{id}")
	public Swimmers get(@PathParam("id") int id) {
		Swimmers swimmers = bean.get(id);
		return swimmers;
	}

	@GET
	public Response get() {
		List<Swimmers> swimmersList = bean.getAll();
		return Response.status(200).header("Access-Control-Allow-Origin","*").entity(swimmersList).build();
	}

	@Override
	@POST
	public void create(Swimmers t) {
		bean.create(t);
	}

	@Override
	@PUT
	public void update(Swimmers t) {
		bean.update(t);
	}

	@Override
	@DELETE
	@Path("/{id}")
	public void delete(@PathParam("id") int id) {
		bean.delete(id);
	}

}
