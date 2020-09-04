package pl.take.swimmingCompetition;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/menu")

@Consumes({ "application/json" })
@Produces({ "application/json" })

public class MenuREST implements Menu {
	
	@EJB
	MenuEJB bean;
	
	@Override
	@POST
	public String createSwimmers(Swimmers swimmers) {
		bean.createSwimmers(swimmers);
		return "swimmer created!";
	}

	@Override
	public String createCompetition(Competition competition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Competition findCompetition(int idc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateCompetition(Competition competition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCompetition(int idc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String createRace(Race race) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Race findRace(int idc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateRace(Race race) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteRace(int idc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String createRaceParticipant(RaceParticipant raceParticipant) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RaceParticipant findRaceParticipant(int idc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateRaceParticipant(RaceParticipant raceParticipant) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteRaceParticipant(int idc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Competition find(int idc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateSwimmers(Swimmers swimmers) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteSwimmers(int idc) {
		// TODO Auto-generated method stub
		
	}

}
