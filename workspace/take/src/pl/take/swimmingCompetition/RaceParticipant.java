package pl.take.swimmingCompetition;

import java.io.Serializable;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class RaceParticipant implements Serializable {
	Time score;

    @ManyToOne
    Race race;

    @ManyToOne
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