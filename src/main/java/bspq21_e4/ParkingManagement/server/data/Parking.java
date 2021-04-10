package bspq21_e4.ParkingManagement.server.data;



public class Parking {

	int nSlots;
	int availableSlots;
	int occupiedSlots;
	int floors;
	
	public Parking(int nSlots, int availableSlots, int occupiedSlots, int floors) {
		this.nSlots = nSlots;
		this.availableSlots = availableSlots;
		this.occupiedSlots = occupiedSlots;
		this.floors = floors;
	}

	public int getNSlots() {
	    return nSlots;
	  }
	
	public void setNSlots(int newSlots) {
	    this.nSlots = newSlots;
	  }
	
	public int getAvailableSlots() {
	    return availableSlots;
	  }
	
	public void setAvailableSlots(int newAvailableSlots) {
	    this.availableSlots = newAvailableSlots;
	  }
	
	public int getOccupiedSlots() {
	    return occupiedSlots;
	  }

	public void setOccupiedSlots(int newOccupiedSlots) {
	    this.nSlots = newOccupiedSlots;
	  }

	public int getFloor() {
	    return floors;
	  }
	
	public void setFloor(int newFloor) {
	    this.floors = newFloor;
	  }	
	
	public boolean checkAvailability() {
		if(availableSlots > 0) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Parking [nSlots=" + nSlots + ", availableSlots=" + availableSlots + ", occupiedSlots=" + occupiedSlots
				+ ", floors=" + floors + "]";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
