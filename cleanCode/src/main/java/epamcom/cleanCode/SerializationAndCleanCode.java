package epamcom.cleanCode;

import java.util.Scanner;

public class SerializationAndCleanCode {
	public static void main(String[] args) {			
			Scanner sc = new Scanner(System.in);			
			CalculationOfCost cc = new CalculationOfCost();
			ConstructionCost c = new ConstructionCost();
			System.out.println("Select among the following1");
			System.out.println("1.Calculation of Simple Interest");
			System.out.println("2.Calculation of Compound Interest");
			int option = sc.nextInt();
			System.out.println("Enter values of principal, time, rate");
			double p = sc.nextDouble();
			double t = sc.nextDouble();
			double r = sc.nextDouble();
			switch(option){
				case 1:
					System.out.println("Rs." + cc.CalculationOfSimpleInterest(p, t, r));
					break;
				case 2:
					System.out.println("Rs." + cc.CalculationOfCompoundInterest(p, t, r));
					break;
				default:
					System.out.println("INVALID OPTION");
			}
			System.out.println("Enter LEVEL");
			System.out.println("1. Normal");
			System.out.println("2. Medium");
			System.out.println("3. High");
			int level = sc.nextInt();
			int FullyAutomated;
			if(level == 3){
				System.out.println("Select option:");
				System.out.println("1.Fully automated house");
				System.out.println("0.Other option");
				FullyAutomated = sc.nextInt();
			}else{
				FullyAutomated = 0;
				
			}
			System.out.println("ENTER AREA: ");
			double Area = sc.nextDouble();
			System.out.println("Rs." + c.calculatesConstructionCost(Area, level, FullyAutomated));
	}
}