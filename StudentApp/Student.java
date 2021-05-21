package StudentApp;
import java.util.Scanner;

public class Student {

	
	private String Name;
	private String RegNo;
	
	Scanner input = new Scanner(System.in);
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		if (name.length() <20) {
			Name = name;
		} else
			System.out.println("Max Character Limit is 20");
		
	}
	public String getRegNo() {
		return RegNo;
	}
	public void setRegNo(String regNo) {
		if (regNo.length() <13) {
			RegNo = regNo;
		} else
			System.out.println("Max Character Limit is 13");
		
	}
	
	public void getInputs() {
		System.out.print("What is your Name? ");
		String studentName = input.nextLine();
		
		System.out.print("What is your Registration No.? ");
		String studentRegNo = input.nextLine();
		
		setName(studentName);
		setRegNo(studentRegNo);
	}
}
