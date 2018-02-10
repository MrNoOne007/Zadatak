
public class Person {

	private String Ime;
	private String address;
	private String phone;
	private String email;

	public Person() {
		this("Unknown", "Unknown", "Unknown", "Unknown");
	}

	public Person(String Ime, String address, String phone, String email) {
		this.Ime = Ime;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

	public String getIme() {
		return Ime;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public void setIme(String Ime) {
		this.Ime = Ime;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return "\nName: " + Ime + "\nAddress: " + address + "\nPhone number: " + phone + "\nEmail address: " + email;
	}
}