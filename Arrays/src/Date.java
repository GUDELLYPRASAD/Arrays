
public class Date {

	public static void main(String[] args) {
		int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		        String[] monthNames = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

		       
		        String inputDate = "January 03 2023";
		        String[] dateParts = inputDate.split(" ");

		       
		        String monthStr = dateParts[0];
		        int day = Integer.parseInt(dateParts[1]);
		        int year = Integer.parseInt(dateParts[2]);

		        int monthIndex = 0;
		        
		        for (int i = 1; i <= 12; i++) {
		            if (monthNames[i].equalsIgnoreCase(monthStr)) {
		                monthIndex = i;
		                break;
		            }
		        }

		        int totalDays = 0;
		        
		        for (int i = 1; i < monthIndex; i++) {
		            totalDays += daysInMonth[i];
		        }
		        totalDays += day;

		        System.out.println("January 1 to " + inputDate + ": " + totalDays);
	}
}