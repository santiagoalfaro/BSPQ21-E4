package bspq21_e4.ParkingManagement.server.data;

public class PremiumUser extends User{
	
	String email;
	String plate;
	int monthfee;

	public PremiumUser(String email, String plate, int monthfee) {
		this.email = email;
		this.plate = plate;
		this.monthfee = monthfee;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String newEmail) {
		this.email = newEmail;
	}
	
	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public int getMonthfee() {
		return monthfee;
	}

	public void setMonthfee(int monthfee) {
		this.monthfee = monthfee;
	}

	@Override
	public String toString() {
		return "PremiumUser [, email=" + email + ", plate=" + plate + ", monthfee=" + monthfee + "]";
	}

}
