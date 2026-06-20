package CarPooling;

public class CarPooling {
	double milesDriven;
	double gallonCost;
	double averageMileage;
	double parkingFees;
	double tolls;
	double vehicleCost;

	public CarPooling () {}

	public CarPooling (double averageMileage, double gallonCost, double milesDriven, double parkingFees, double tolls) {
		this.averageMileage = averageMileage;
		this.gallonCost = gallonCost;
		this.milesDriven = milesDriven;
		this.parkingFees = parkingFees;
		this.tolls = tolls;
	}

	void vehicleCost (){
		vehicleCost = (milesDriven/ averageMileage)*gallonCost;
		System.out.println ("Vehicle Cost : " +vehicleCost);

	}
	void calculateTotalCost(){
		System.out.println ("Total Cost : "+ (vehicleCost+parkingFees+tolls));
	}

	public double getAverageMileage () {
		return averageMileage;
	}

	public void setAverageMileage (double averageMileage) {
		this.averageMileage = averageMileage;
	}

	public double getGallonCost () {
		return gallonCost;
	}

	public void setGallonCost (double gallonCost) {
		this.gallonCost = gallonCost;
	}

	public double getMilesDriven () {
		return milesDriven;
	}

	public void setMilesDriven (double milesDriven) {
		this.milesDriven = milesDriven;
	}

	public double getParkingFees () {
		return parkingFees;
	}

	public void setParkingFees (double parkingFees) {
		this.parkingFees = parkingFees;
	}

	public double getTolls () {
		return tolls;
	}

	public void setTolls (double tolls) {
		this.tolls = tolls;
	}
}
