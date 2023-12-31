import java.util.ArrayList;

/**
 * CafeUtil
 */
public class CafeUtil {
    public int getStreakGoal() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }
    public double getOrderTotal(double[] prices) {
        double total = 0.0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }
    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println( i + ": " + menuItems.get(i));
        }
    }
    
    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String username = System.console().readLine();
        System.out.println("Hello, " + username + "!");
        int customersNumber = customers.size();
        System.out.println("There are " + customersNumber + " people in front of you");

        customers.add(username);
        System.out.println(customers);
    }

}