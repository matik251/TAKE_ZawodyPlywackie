package pl.take.swimmingCompetition;


import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;


@Entity 
@XmlRootElement
@Table(name="Race")
public class Race implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="raceId")
	@GeneratedValue
	int raceId;
 
	@Column(name="dateOfRace")
    Date dateOfRace;
	
	@Column(name="length")
    int length;
	
	@Column(name="genderCategory")
    char genderCategory;
	
	@Column(name="ageCategory")
    String ageCategory;
	
	@Column(name="raceName")
    String raceName;
	
	@Column(name="style")
    String style;

	@ManyToOne
	@JoinColumn(name="competitionID")
	Competition competition;
	
	
    public int getRaceId() {
        return this.raceId;
    }

    public void setRaceId(int raceId) {
    	this.raceId = raceId;
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
    
    public Competition getCompetition() {
    	return competition;
    }
    
    public void setCompetition(Competition competition) {
    	this.competition = competition;
    }
}
