package pl.take.swimmingCompetition;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.*;

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

	@Override
	@GET
	public List<Swimmers> getAll() {
		List<Swimmers> swimmersList = bean.getAll();
		return swimmersList;
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
