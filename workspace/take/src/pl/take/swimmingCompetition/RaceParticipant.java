package pl.take.swimmingCompetition;

import javax.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;
import java.sql.Time;

import javax.persistence.Entity;

@Entity
@XmlRootElement
public class RaceParticipant implements Serializable {
	Time score;

    @ManyToOne
    Race race;

    @ManytToOne
    Swimmer swimmer;

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

    public Swimmer getSwimmer() {
        return this.swimmer;
    }

    public void setSwimmer(Swimmer swimmer) {
        this.swimmer = swimmer;
    }
}