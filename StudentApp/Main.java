package StudentApp;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char choice;
		int choose = 0;
		Student student1 = new Student();
		TheoryMarks theoryMarks = new TheoryMarks();
		LabMarks labMarks = new LabMarks();
		
		
		student1.getInputs();
		
		System.out.printf("Do you want to Enter subject marks? (Y/N) ");
		choice = input.next().charAt(0);
		
		System.out.println("");
		
		while (choice == 'Y' || choice == 'y') { if (choice == 'Y' || choice == 'y') {
			System.out.printf("\n1. Enter Subject Marks (Theory Only)\n2. Enter Subject Marks (Theory & Lab)\n");
			int Choice = input.nextInt();
			
			System.out.println("");
			
			if (Choice == 1) {
				
				do
				{
					System.out.printf("\nAll Marks should be out of 100\n1. ICT\t2. FCP\t3. ECA\t4. CAG\t5. ECC\t6. Exit\n");
					choose = input.nextInt();
					
					switch (choose) {
					case 1:
						theoryMarks.getICT();
						break;
					case 2:
						theoryMarks.getFCP();
						break;
					case 3:
						theoryMarks.getECA();
						break;
					case 4:
						theoryMarks.getCAG();
						break;
					case 5:
						theoryMarks.getECC();
						break;
					case 6:
						System.out.println("");
						System.out.println("");
						System.out.printf("Do you want to Renter subject marks? (Y/N) ");
						choice = input.next().charAt(0);
						break;
					}
					
				} while(choose < 6);
				
			} else if (Choice == 2) {
				do
				{
					System.out.printf("\nAll Marks should be out of 100\n1. ICT\t2. FCP\t3. ECA\t4. CAG\t5. ECC\t6. Exit\n");
					choose = input.nextInt();
					
					switch (choose) {
					case 1:
						theoryMarks.getICT();
						labMarks.getICT();
						break;
					case 2:
						theoryMarks.getFCP();
						labMarks.getFCP();
						break;
					case 3:
						theoryMarks.getECA();
						labMarks.getECA();
						break;
					case 4:
						theoryMarks.getCAG();
						System.out.println("Lab N/A");
						break;
					case 5:
						theoryMarks.getECC();
						System.out.println("Lab N/A");
						break;
					case 6:
						System.out.println("");
						System.out.println("");
						System.out.printf("Do you want to Renter subject marks? (Y/N) ");
						choice = input.next().charAt(0);
						break;
					}
				} while(choose < 6);
			}
			
			
		} else if (choice == 'N' || choice == 'n') {
			System.exit(0);
		}
		} 
		
		
		
		
		/**
		 * 
		 * 
		 * DISPLAYING RESULTS
		 * 
		 */
	
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("Student Name: " + student1.getName());
		System.out.println("Registration No. " + student1.getRegNo());
		
		
		System.out.println("");
		System.out.printf("Subject\t\tTheory Marks\t\tLab Marks\n");
		System.out.printf("ICT\t\t %2f \t\t %2f\n", theoryMarks.getMarksICT(), labMarks.getMarksICT());
		System.out.printf("FCP\t\t %2f \t\t %2f\n", theoryMarks.getMarksFCP(), labMarks.getMarksFCP());
		System.out.printf("ECA\t\t %2f \t\t %2f\n", theoryMarks.getMarksECA(), labMarks.getMarksECA());
		System.out.printf("CAG\t\t %2f \t\t N/A\n", theoryMarks.getMarksCAG());
		System.out.printf("ECC\t\t %2f \t\t N/A\n", theoryMarks.getMarksECC());
		
	
		double totalMarks = (theoryMarks.averageICT()+labMarks.averageICT()) + (theoryMarks.averageFCP()+labMarks.averageFCP()) + (theoryMarks.averageECA()+labMarks.averageECA()) + theoryMarks.getMarksCAG() + theoryMarks.getMarksECC();
		double percentage = totalMarks * 100 / 500;
		double cgpa = (4 * percentage) / 100;
				
		System.out.println();
		System.out.println("Total Markks = " + totalMarks);
		System.out.println("Marks Percentage = " + percentage);
		System.out.println("CGPA = " + cgpa);
		System.out.println("");
		System.out.println("The subjects which in which Lab is included have 75% weightage of theory and 25% weightage of Lab");
			
	}
}
