package bspq21_e4.ParkingManagement.server.data;

public class Slot{

	int id;
	int floor;
	SlotAvailability sl;
	
	public Slot(int id, int floor, SlotAvailability sl) {
		this.id = id;
		this.floor = floor;
		this.sl = sl;
	}

	public int getId() {
	    return id;
	  }
	
	public void setId(int newId) {
	    this.id = newId;
	  }
	
	public int getFloor() {
	    return floor;
	  }
	
	public void setFloor(int newFloor) {
	    this.floor = newFloor;
	  }
	
	public SlotAvailability getSl() {
	    return sl;
	  }
	
	public void setSl(SlotAvailability newSl) {
	    this.sl = newSl;
	  }
	
	public static void main(String[] args) {
		Slot s = new Slot(1, 1, SlotAvailability.GREEN);
		System.out.println(s.toString());
		System.out.println(s.getSl());
		s.setSl(SlotAvailability.RED);
		System.out.println(s.toString());
	}

	@Override
	public String toString() {
		return "Slot [id=" + id + ", floor=" + floor + ", sl=" + sl + "]";
	}
	
}
