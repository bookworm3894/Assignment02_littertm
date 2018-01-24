/**
 * Name: Tiffany Litteral
 * Course: 1090C/ 002/ Fall 2017 
 * Assignment: Assignment You
 * Due Date: 9/12/2016 
 * Description: build a problem description using something in your world. Then create the design and write the code. Refer to the attached assignment that we did on Thursday. 
 * Your problem must have at least 5 variables, including one double and one integer, and a calculation that uses your variables.
 * Citations: None 
 * 
 */
package assignmentYou_littertm;

public class AssignmentYou_littertm {

	public static void main(String[] args) {

		double averageDaysNannyingInWeek = 2.5;//The average amount of days I nanny in one week
		double costOfPremiumGas = 2.75;// The average cost of Premium 
		double gasUsedIn25Miles = 1.5;// The average mount of miles I travel to one family's house round trip
		double totalGasExpenses = costOfPremiumGas * gasUsedIn25Miles * averageDaysNannyingInWeek;// Multiply the days I Nanny by the average cost of gas and mileage traveled 
		System.out.println("This is the Total cost of Gas: $" + totalGasExpenses);
		
		int costOfEntertainmentSupplies= 50;// The cost of supplies for entertainment like Arts and Crafts 
		double totalExpensesOfNannying= totalGasExpenses + costOfEntertainmentSupplies;// The total Expenditures for one week of Nannying.
		System.out.println("This is the Total Expenses of Nannying: $" + totalExpensesOfNannying);

		int ratePerHour = 14;//The average amount I am paid per hour from one family 
		int averageHoursSpentNannying = 5;// The average amount of hours I spend at one job 
		double totalAmountEarnedWeek = ratePerHour * averageHoursSpentNannying * averageDaysNannyingInWeek - totalExpensesOfNannying;/**Multiply the rate per hour
		by the hours spent nannying and the average days I nanny in a week and subtract the total expenses of Nannying to equal the total amount earned in one week*/
		double totalAmountEarnedMonth= totalAmountEarnedWeek * 4 ; // Find the total amount earned in a month by multiplying by the average amount of weeks in a month, 4
		System.out.println( "The Total Amount I Earn in a Week: $" + totalAmountEarnedWeek);
		System.out.println("Total Amount I Earn in a Month: $" + totalAmountEarnedMonth);
		
		
		
		

	}

}
