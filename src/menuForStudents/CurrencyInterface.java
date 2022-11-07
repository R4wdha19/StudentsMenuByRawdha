package menuForStudents;

import java.util.Map;

public interface CurrencyInterface {

	public Map<String, Map<String, Double>> showStudentFeesAmount(String studentName, Map<String, Double> studentsFees,
			Map<String, Map<String, Double>> studentsFeesAmount);

}
