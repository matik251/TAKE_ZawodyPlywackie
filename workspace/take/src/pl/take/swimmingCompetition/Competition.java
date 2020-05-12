package pl.take.swimmingCompetition;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAttribute;

public class Competition implements Serializable {
    int competitionId;
    Date startDate;
    Date endDate;
    String name;
    String place;
    
    @OneToMany
    List<Race> races;

    @Id
    @GeneratedValue
    @XmlAttribute
    public int getCompetitiontId() {
        return this.competitionId;
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

    public List<Race> getRaces(){
        return this.races;
    }
    
    public void setRaces(List<Race> races){
        this.races = races;
    }

}