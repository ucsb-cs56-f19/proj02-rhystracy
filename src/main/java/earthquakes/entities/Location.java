package earthquakes.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Location{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String uid;
	private long placeId;
	private String name;
	private double latitude;
	private double longitude;

	
	public long getId(){
		return this.id;
	}
	public void setId(long id){
		this.id = id;
	}

	public String getUid(){
		return this.uid;
	}
	public void setUid(String uid){
		this.uid = uid;
	}
	
	public long getPlaceId(){
		return this.placeId;
	}
	public void setPlaceId(long placeId){
		this.placeId = placeId;
	}

	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}

	public double getLatitude(){
		return this.latitude;
	}
	public void setLatitude(double latitude){
		this.latitude = latitude;
	}

	public double getLongitude(){
		return this.longitude;
	}
	public void setLongitude(double longitude){
		this.longitude = longitude;
	}
}
