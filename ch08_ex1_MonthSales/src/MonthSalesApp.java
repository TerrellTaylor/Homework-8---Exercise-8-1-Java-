import java.text.NumberFormat;

public class MonthSalesApp {

    public static void main(String[] args) {
        System.out.println("Monthly Sales\n");
        
        // declare monthNames and monthSales arrays
        var monthNames = new String[12];
        var monthSales = new double[12];
        double total = 0;

        // get currency formatting
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // get one or more months
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get the input from the user
            int monthNumber = Console.getInt("Enter month number: ");
            
            // validate input
            if (monthNumber < 1 || monthNumber > 12) {
                Console.displayLine("Invalid month number. Try again.");
                continue;                
            }
            
            // get the index number for the month
            // and display the month name and sales            
            monthNames[0] = "January";
            monthSales[0] = 15.93;
            if (monthNumber == 1) {
                System.out.println("Sales for " + monthNames[0] + ": " + "$" + monthSales[0]);
            }
            monthNames[1] = "February";
            monthSales[1] = 29.12;
            if (monthNumber == 2) {
                System.out.println("Sales for " + monthNames[1] + ": " + "$" + monthSales[1]);
            }
            monthNames[2] = "March";
            monthSales[2] = 19.18;
            if (monthNumber == 3) {
                System.out.println("Sales for " + monthNames[2] + ": " + "$" + monthSales[2]);
            }
            monthNames[3] = "April";
            monthSales[3] = 93.79;
            if (monthNumber == 4) {
                System.out.println("Sales for " + monthNames[3] + ": " + "$" + monthSales[3]);
            }
            monthNames[4] = "May";
            monthSales[4] = 250.27;
            if (monthNumber == 5) {
                System.out.println("Sales for " + monthNames[4] + ": " + "$" + monthSales[4]);
            }
            monthNames[5] = "June";
            monthSales[5] = 87.26;
            if (monthNumber == 6) {
                System.out.println("Sales for " + monthNames[5] + ": " + "$" + monthSales[5]);
            }
            monthNames[6] = "July";
            monthSales[6] = 37.18;
            if (monthNumber == 7) {
                System.out.println("Sales for " + monthNames[6] + ": " + "$" + monthSales[6]);
            }
            monthNames[7] = "August";
            monthSales[7] = 64.00;
            if (monthNumber == 8) {
                System.out.println("Sales for " + monthNames[7] + ": " + "$" + monthSales[7]);
            }
            monthNames[8] = "September";
            monthSales[8] = 500.21;
            if (monthNumber == 9) {
                System.out.println("Sales for " + monthNames[8] + ": " + "$" + monthSales[8]);
            }
            monthNames[9] = "October";
            monthSales[9] = 44.45;
            if (monthNumber == 10) {
                System.out.println("Sales for " + monthNames[9] + ": " + "$" + monthSales[9]);
            }
            monthNames[10] = "November";
            monthSales[10] = 57.48;
            if (monthNumber == 11) {
                System.out.println("Sales for " + monthNames[10] + ": " + "$" + monthSales[10]);
            }
            monthNames[11] = "December";
            monthSales[11] = 79.43;
            if (monthNumber == 12) {
                System.out.println("Sales for " + monthNames[11] + ": " + "$" + monthSales[11]);
            }
            total = total + monthSales[monthNumber - 1];

            // check if the user wants to continue
            choice = Console.getString("Continue? (y/n): ");
            Console.displayLine();
        }
        
        // display the total sales for the year
        System.out.println("Total sales: " + currency.format(total));
        Console.displayLine();
    }    

}
