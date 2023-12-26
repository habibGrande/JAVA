public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = "your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double coffee = 2.5;
        double latte = 4.0;
        double cappuccino = 4.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";


    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;


        System.out.println(generalGreeting + customer1);
        System.out.println(isReadyOrder1);

        // noah order
        if (isReadyOrder4) {
            System.out.println(displayTotalMessage + cappuccino);
        }
        // sam order
        System.out.println( coffee + coffee);
        if (isReadyOrder2) {
            System.out.println(readyMessage);
        }
        else{
            System.out.println(pendingMessage);
        }


        // jimmy order
        double jimmyorder = latte - coffee;
        System.out.println(displayTotalMessage + coffee + ", he owes: " + jimmyorder);

    }
}