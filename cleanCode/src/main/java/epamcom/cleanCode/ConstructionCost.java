package epamcom.cleanCode;

public class ConstructionCost {
	
	double calculatesConstructionCost(double Area,int level, int FullyAutomated){
			int price = 0;			
			if(level == 1){				
				price = 2000;
			} else if(level == 2){
				price = 4000;
			}else if(level == 3){				
				if(FullyAutomated == 0){
					price = 8000;
				}else if(FullyAutomated == 1){
					price = 10000;
				}
			}
			return Area * price;
		}
}