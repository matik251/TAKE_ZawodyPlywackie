package pl.take.swimmingCompetition;

import javax.ejb.Local;

@Local
public interface Menu {

	/*
	 * Competition
	 */
	public abstract String createCompetition(Competition competition);

	public abstract Competition findCompetition(int idc);

	public abstract String updateCompetition(Competition competition);

	public abstract void deleteCompetition(int idc);

	/*
	 * Race
	 */
	public abstract String createRace(Race race);

	public abstract Race findRace(int idc);

	public abstract String updateRace(Race race);

	public abstract void deleteRace(int idc);
	
	/*
	 * RaceParticipant
	 */
	public abstract String createRaceParticipant(RaceParticipant raceParticipant);

	public abstract RaceParticipant findRaceParticipant(int idc);

	public abstract String updateRaceParticipant(RaceParticipant raceParticipant);

	public abstract void deleteRaceParticipant(int idc);
	
	/*
	 * Swimmers
	 */
	public abstract String createSwimmers(Swimmers swimmers);

	public abstract Competition find(int idc);

	public abstract String updateSwimmers(Swimmers swimmers);

	public abstract void deleteSwimmers(int idc);
}