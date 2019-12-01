package earthquakes.searches;

public class EqSearch{

	private int distance;
	private int minmag;
	private double lat;
	private double lon;
	private String location;


	public EqSearch(){};

	public void setDistance(int d){
		distance = d;
	}

	public void setMinmag(int mag){
		minmag = mag;
	}

	public void setLat(double l){
		lat = l;
	}
	
	public void setLon(double l){
		lon = l;
	}

	public void setLocation(String loc){
		location = loc;
	}

	public int getDistance(){
		return this.distance;
	}

	public int getMinmag(){
		return this.minmag;
	}

	public double getLat(){
		return this.lat;
	}

	public double getLon(){
		return this.lon;
	}
	
	public String getLocation(){
		return this.location;
	}
}
