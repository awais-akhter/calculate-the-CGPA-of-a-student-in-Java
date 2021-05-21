package StudentApp;

import java.util.Scanner;

public class LabMarks {
	
	private double marksICT = 0;
	private double marksFCP = 0;
	private double marksECA = 0;
	
	Scanner input = new Scanner(System.in);
	
	
	/**
	 * 
	 * Setters & Getters
	 * 
	 */

	public double getMarksICT() {
		return marksICT;
	}

	private void setMarksICT(double marksICT) {
		this.marksICT = marksICT;
	}

	public double getMarksFCP() {
		return marksFCP;
	}

	private void setMarksFCP(double marksFCP) {
		this.marksFCP = marksFCP;
	}

	public double getMarksECA() {
		return marksECA;
	}

	private void setMarksECA(double marksECA) {
		this.marksECA = marksECA;
	}
	
	
	
	/**
	 * Getting Inputs
	 */
	
	public void getICT() {
		System.out.print("Enter your marks in ICT Lab? ");
		double ict = input.nextDouble();
		setMarksICT(ict);
	}
		
	
	public void getFCP() {
		System.out.print("Enter your marks in FCP Lab? ");
		double fcp = input.nextDouble();
		setMarksFCP(fcp);
	}
	
	
	public void getECA() {
		System.out.print("Enter your marks in ECA Lab? ");
		double eca = input.nextDouble();
		setMarksECA(eca);
	}
	
	
	
	
	public double averageICT() {
		
		return marksICT * 0.25;
	}
	
	public double averageFCP() {
		
		return marksFCP * 0.25;
	}

	public double averageECA() {
		
		return marksECA * 0.25;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
