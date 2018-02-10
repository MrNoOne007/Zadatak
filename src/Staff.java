
public class Staff extends Employee {

	private String title;

	public Staff(String Ime, String address, String phone, String email, int office, double plata, String title) {
		super(Ime, address, phone, email, office, plata);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String toString() {
		return super.toString() + "\nTitle: " + title;
	}
}