package pl.kurs;

import java.util.List;

public interface Menu {

	/*
	 * Competition
	 */
	public abstract void createCompetition(Competition competition);

	public abstract Competition findCompetition(int idc);

	public abstract void updateCompetition(Competition competition);

	public abstract void deleteCompetition(int idc);

	/*
	 * Race
	 */
	public abstract void createRace(Race race);

	public abstract Race findRace(int idc);

	public abstract void updateRace(Race race);

	public abstract void deleteRace(int idc);
	
	/*
	 * RaceParticipant
	 */
	public abstract void createRaceParticipant(RaceParticipant raceParticipant);

	public abstract RaceParticipant findRaceParticipant(int idc);

	public abstract void updateRaceParticipant(RaceParticipant raceParticipant);

	public abstract void deleteRaceParticipant(int idc);
	
	/*
	 * Swimmers
	 */
	public abstract void createSwimmers(Swimmers swimmers);

	public abstract Competition find(int idc);

	public abstract void updateSwimmers(Swimmers swimmers);

	public abstract void deleteSwimmers(int idc);

	public abstract List<Swimmers> get();
	
}