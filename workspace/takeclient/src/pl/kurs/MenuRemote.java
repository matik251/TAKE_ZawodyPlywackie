package pl.kurs;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;

import javax.xml.bind.JAXB;

public class MenuRemote implements Menu {
	
	String url = "http://localhost:8080/take/menu";

	@Override
	public void createSwimmers(Swimmers swimmers) {
		StringWriter sw = new StringWriter();
		JAXB.marshal(swimmers, sw);
		HttpHelper.doPost(url,sw.toString(),"application/xml");
	}

	@Override
	public void createCompetition(Competition competition) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Competition findCompetition(int idc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCompetition(Competition competition) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCompetition(int idc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createRace(Race race) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Race findRace(int idc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateRace(Race race) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteRace(int idc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createRaceParticipant(RaceParticipant raceParticipant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public RaceParticipant findRaceParticipant(int idc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateRaceParticipant(RaceParticipant raceParticipant) {
		// TODO Auto-generated method stub
		
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
	public void updateSwimmers(Swimmers swimmers) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSwimmers(int idc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Swimmers> get() {
		// TODO Auto-generated method stub
		return null;
	}

}