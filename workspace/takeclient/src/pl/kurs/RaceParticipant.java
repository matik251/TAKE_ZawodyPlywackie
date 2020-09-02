package pl.kurs;

import java.io.Serializable;
import java.sql.Time;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RaceParticipant implements Serializable {
	private static final long serialVersionUID = 1L;
	Time score;

    Race race;

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