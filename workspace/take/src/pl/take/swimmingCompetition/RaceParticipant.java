package pl.take.swimmingCompetition;

import java.io.Serializable;
import java.sql.Time;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
@Table(name="RaceParticipant")
public class RaceParticipant implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="raceParticipantId")
	@GeneratedValue
	int raceParticipantId;
	
	@Column(name="time")
	Time score;

    @ManyToOne
    @JoinColumn(name="raceId")
    Race race;

    @ManyToOne
    @JoinColumn(name="swimmerId")
    Swimmers swimmer;

    
    public Time getScore() {
        return this.score;
    }

    public void setScore(Time score) {
        this.score = score;
    }

    
    public Race getRace() {
        return this.race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    
    public Swimmers getSwimmer() {
        return this.swimmer;
    }

    public void setSwimmer(Swimmers swimmer) {
        this.swimmer = swimmer;
    }
}