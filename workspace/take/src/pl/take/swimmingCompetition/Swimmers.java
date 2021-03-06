package pl.take.swimmingCompetition;

import java.io.Serializable;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;


@Entity 
@XmlRootElement
@Table(name="swimmers")
public class Swimmers implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="swimmerId")
	@GeneratedValue
    int swimmerId;
	
	@Column(name="name")
    String name;
	
	@Column(name="surname")
    String surname;
	
	@Column(name="gender")
    char gender;
	
	@Column(name="weight")
    int weight;
	
	@Column(name="height")
    int height;
	
	@Column(name="nationality")
    String nationality;
	
	@Column(name="team")
    String team;

    public int getSwimmerId() {
        return this.swimmerId;
    }
    
    public void setSwimmerId(int id) {
    	this.swimmerId = id;
    }

    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    
    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    
    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    
    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    
	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	
	public String getTeam() {
		return this.team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

}
