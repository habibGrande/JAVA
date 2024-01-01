import java.util.ArrayList;

public class ListsIOfExceptions {

    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        for (int i = 0; i < myList.size(); i++) {
            try {
                Integer castedValue = (Integer) myList.get(i);
                System.out.println("No Error occurred at index " + i + ": "+ myList.get(i));
            } catch (ClassCastException e) {
                System.out.println("Error occurred at index " + i + ": " + myList.get(i) + " caused the error");
            }
        }
    }






}