import java.util.Scanner;
public class month {


    public static void main(String[] args) {
        
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        int[] daysInMonths = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a month: ");
        String inputMonth = scanner.nextLine();

        
        int days = -1; 

        for (int i = 0; i < months.length; i++) {
            if (months[i].equalsIgnoreCase(inputMonth)) {
                days = daysInMonths[i];
                break;
            }
        }

        
        if (days != -1) {
            System.out.println("Number of days in " + inputMonth + ": " + days);
        } else {
            System.out.println("january 31 days.");
        }

        
        scanner.close();
    }
}



