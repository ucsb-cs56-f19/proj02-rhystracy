package hello;

public class EqSearch{

	private int distance;
	private int minmag;


	public EqSearch(){};

	public void setDistance(int d){
		distance = d;
	}

	public void setMinmag(int mag){
		minmag = mag;
	}
	public int getDistance(){
		return this.distance;
	}

	public int getMinmag(){
		return this.minmag;
	}
}
