/*
Colin Grad
09-15-2020
Flooring Project
*/
//main class
public class Flooring{
	public static double priceForFlooring(double a, double b){
		double price = a * b;
		return price;
	}
	public static void main(String[] args) {
		//decimal Format
		//variables
		int area_Calc = ((20*13) + (12*10) + (60)); //in feet
		double board_length = 2.5; //length of baord in feet
		double board_width = 0.5;  //width of board in feet
		double board_Area = board_length * board_width; //in inches
		double board_cost = 24.99; //cost of each pack of boards
		double calc_Flooring; //holder fr looring calc
		double flooring_Pack; //holder for packs of boards needed
		double area_Twenty; //area + extra 20%
		double number_Of_Packs; //packs origionally needed before rounding 
		double round_Up; //round up to higher whole number
		double final_Price; //final price afeter diverting math to fucntion
		//init print statemnts 
		System.out.println("****************************************\n");
		System.out.println("    Welcome to the flooring Calc\n");
		System.out.println("****************************************\n");
		//print area of room and board size plus the cost of the board
		System.out.println("The area of the Room is: " + area_Calc +" square feet\n"); 
		System.out.println("The area of one board is: " + board_Area + " square feet\n");
		System.out.println("Each package(6 boards) cost: $" + board_cost + "\n");
		//code for program
		area_Twenty = (area_Calc * 0.20) + area_Calc;
		flooring_Pack = area_Twenty / board_Area; // divide square footage by the square footage of board
		number_Of_Packs = flooring_Pack / 6; //divide by 6 cuz 6 boards in a pack
		round_Up = Math.ceil(number_Of_Packs); //round up to highest whole number
		System.out.println("Area of the floor without extra: " + area_Calc + "\n");
		System.out.println("Area of floor plus 20%: " + area_Twenty + "\n"); 
		System.out.println("Number of packs of flooring: " + round_Up + "\n");
		final_Price = priceForFlooring(round_Up, board_cost); //fucntion call to calc final price
		System.out.println("The total price of flooring is: $" + final_Price + "\n");
		
	}
}