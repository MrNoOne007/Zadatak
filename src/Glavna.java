public class Glavna {

	public static void main(String[] args) {

		Person person = new Person("Neko", "Doboj City", "055-907-759", "nekoludo@hotmail.com");

		Student student = new Student("Niko", "Tuzla", "055-907-759", "nikoludo@hotmail.com", 3);

		Employee employee = new Employee("Netko", "Tesanj", "035-907-760", "netkoludo@hotmail.com", 14, 60000);

		Faculty faculty = new Faculty("Una", "Marsala Tita", "033-907-761", "uni@hotmail.com", 44, 65000, "4pm to 6pm",
				"Profesor");

		Staff staff = new Staff("Tina", "Ulica bb, Nigdje", "033-907-762", "glavoluda@hotmail.com", 9, 44000,
				"Asistent");

		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
	}
}