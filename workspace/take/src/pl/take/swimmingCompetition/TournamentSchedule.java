package pl.take.swimmingCompetition;

import java.io.Serializable;

public class TournamentSchedule implements Serializable {
   int tournamentId;
   int raceId;

   public Object getTournamentId() {
       return this.tournamentId;
   }

   public void setTournamentId(int tournamentId) {
       this.tournamentId = tournamentId;
   }

   public int getRaceId() {
       return this.raceId;
   }

   public void setRaceId(int raceId) {
       this.raceId = raceId;
   }

}
