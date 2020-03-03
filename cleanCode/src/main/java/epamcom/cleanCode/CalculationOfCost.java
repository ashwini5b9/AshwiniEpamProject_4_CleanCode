package epamcom.cleanCode;

public class CalculationOfCost {
	double CalculationOfSimpleInterest(double p, double t, double r){
			double SI;
			SI = (p*t*r) / 100;
			return SI;
		}
	double CalculationOfCompoundInterest(double p, double t, double r){
			double CI;
			CI =  p * (Math.pow((1 + r / 100), t)); 
			return CI;
	}
}
