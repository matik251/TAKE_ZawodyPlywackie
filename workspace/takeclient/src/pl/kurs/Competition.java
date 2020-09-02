package pl.kurs;


import java.io.Serializable;
import java.sql.Date;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAttribute;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

@XmlRootElement
public class Competition implements Serializable {
	private static final long serialVersionUID = 1L;
    int competitionId;
    Date startDate;
    Date endDate;
    String name;
    String place;
    
//    @OneToMany
    List races;

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

    public List getRaces(){
        return this.races;
    }
    
    public void setRaces(List races){
        this.races = races;
    }

}