package menuForStudents;

import java.io.Serializable;
import java.util.Map;
import java.util.Scanner;

public class Currency implements CurrencyInterface, Serializable {
	int feesAmount;
	String currencyName;
	char currencySymbol;
	Boolean myCurrency = Boolean.TRUE;

	public Currency() {

	}

	@Override
	public Map<String, Map<String, Double>> showStudentFeesAmount(String studentName, Map<String, Double> studentsFees,
			Map<String, Map<String, Double>> studentsFeesAmount) {

		Scanner sc = new Scanner(System.in);
		Double studentFeesAmount = 0.0;
		Double studentsFeesCalculatedAmount = 0.0;

		System.out.println("Choose Currency :");
		System.out.println("1 : British pound");
		System.out.println("2 : US dollar ");
		System.out.println("3 : Swiss franc ");
		System.out.println("4 : Japanese yen");
		Integer currency = sc.nextInt();

		System.out.println("Enter Student's  Fees Amount :");
		studentFeesAmount = sc.nextDouble();

		if (currency == 1) {
			currencyName = "British pound";
			studentsFeesCalculatedAmount = studentFeesAmount * 2.28754;
		} else if (currency == 2) {
			currencyName = "US dollar";
			studentsFeesCalculatedAmount = studentFeesAmount * 2.59503;
		} else if (currency == 3) {
			currencyName = "Swiss franc";
			studentsFeesCalculatedAmount = studentFeesAmount * 2.59009;
		} else if (currency == 4) {
			currencyName = "Japanese yen";
			studentsFeesCalculatedAmount = studentFeesAmount * 386.446;
		}

		studentsFees.put(currencyName, studentsFeesCalculatedAmount);
		studentsFeesAmount.put(studentName, studentsFees);

		return studentsFeesAmount;

	}

}
