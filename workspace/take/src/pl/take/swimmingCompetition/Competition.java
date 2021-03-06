package pl.take.swimmingCompetition;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
@Table(name="Competition")
public class Competition implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="competitionId")
	@GeneratedValue
    int competitionId;
	
	@Column(name="startDate")
    Date startDate;
	
	@Column(name="endDate")
    Date endDate;
	
	@Column(name="name")
    String name;
	
	@Column(name="place")
    String place;
    
    @OneToMany(mappedBy="competition")
    Set<Race> raceList;

    public int getCompetitiontId() {
        return this.competitionId;
    }

    public void setCompetitionId(int competitionId) {
    	this.competitionId = competitionId;
    }
    
    
    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    
    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getPlace() {
        return this.place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    
    public Set<Race> getRaceList() {
    	return raceList;
    }
    
    public void setRaceList(Set<Race> raceList) {
    	this.raceList = raceList;
    }
}