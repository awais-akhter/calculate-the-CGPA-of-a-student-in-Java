package StudentApp;

import java.util.Scanner;

public class TheoryMarks {

		private double marksICT = 0;
		private double marksFCP = 0;
		private double marksECA = 0;
		private double marksCAG = 0;
		private double marksECC = 0;
		
		Scanner input = new Scanner(System.in);
		
		
		
		/**
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
		public double getMarksECC() {
			return marksECC;
		}
		private void setMarksECC(double marksECC) {
			this.marksECC = marksECC;
		}

		public double getMarksCAG() {
			return marksCAG;
		}

		private void setMarksCAG(double marksCAG) {
			this.marksCAG = marksCAG;
		}
		
		
		
		
		
		/**
		 * Getting Inputs
		 */
		public void getICT() {
			System.out.print("Enter your marks in ICT Theory? ");
			double ict = input.nextDouble();
			setMarksICT(ict);
		}
			
		
		public void getFCP() {
			System.out.print("Enter your marks in FCP Theory? ");
			double fcp = input.nextDouble();
			setMarksFCP(fcp);
		}
		
		
		public void getECA() {
			System.out.print("Enter your marks in ECA Theory? ");
			double eca = input.nextDouble();
			setMarksECA(eca);
		}
		
		
		public void getCAG() {
			System.out.print("Enter your marks in CAG? ");
			double cag = input.nextDouble();
			setMarksCAG(cag);
		}
		
		
		public void getECC() {
			System.out.print("Enter your marks in ECC? ");
			double ecc = input.nextDouble();
			setMarksECC(ecc);
		}
			

	public double averageICT() {
		
		return marksICT * 0.75;
	}
	
	public double averageFCP() {
		
		return marksFCP * 0.75;
	}

	public double averageECA() {
		
		return marksECA * 0.75;
	}
	
	
	
	
	
	
	
	
	
}