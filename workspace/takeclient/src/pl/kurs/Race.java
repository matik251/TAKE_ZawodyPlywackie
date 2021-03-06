package pl.kurs;

import java.io.Serializable;
import java.sql.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Race implements Serializable {

	private static final long serialVersionUID = 1L;

	int raceId;
    
    Competition competition;

    Date dateOfRace;
    int length;
    char genderCategory;
    String ageCategory;
    String raceName;
    String style;

    @XmlAttribute
    public int getRaceId() {
        return this.raceId;
    }

    public Date getDateOfRace() {
        return this.dateOfRace;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    public Competition getCompetition() {
        return this.competition;
    }

    public void setDateOfRace(Date dateOfRace) {
        this.dateOfRace = dateOfRace;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public char getGenderCategory() {
        return this.genderCategory;
    }

    public void setGenderCategory(char genderCategory) {
        this.genderCategory = genderCategory;
    }

    public String getAgeCategory() {
        return this.ageCategory;
    }

    public void setAgeCategory(String ageCategory) {
        this.ageCategory = ageCategory;
    }

    public String getRaceName() {
        return this.raceName;
    }

    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }

    public String getStyle() {
        return this.style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}

