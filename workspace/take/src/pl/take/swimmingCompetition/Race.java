package pl.take.swimmingCompetition;


import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;


@Entity 
@XmlRootElement
public class Race {
	int raceId;
    Date dateOfRace;
    int length;
    char genderCategory;
    String ageCategory;
    String raceName;
    String style;

    @Id
    @GeneratedValue
    @XmlAttribute
    public int getRaceId() {
        return this.raceId;
    }

    public Date getDateOfRace() {
        return this.dateOfRace;
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
