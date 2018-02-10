import java.util.Date;

public class Employee extends Person {

	private int office;
	private double plata;
	private Date dateHired;

	public Employee(String Ime, String address, String phone, String email, int office, double plata) {
		super(Ime, address, phone, email);
		this.office = office;
		this.plata = plata;
		this.dateHired = new Date();
	}

	public int getOffice() {
		return office;
	}

	public String getPlata() {
		return String.format("%.2f", plata);
	}

	public Date getDateHired() {
		return dateHired;
	}

	public void setOffice(int office) {
		this.office = office;
	}

	public void setPlata(double plata) {
		this.plata = plata;
	}

	public void setDateHired() {
		dateHired = new Date();
	}

	public String toString() {
		return super.toString() + "\nOffice: " + office + "\nSalary: €" + getPlata() + "\nDate hired: "
				+ getDateHired();
	}
}