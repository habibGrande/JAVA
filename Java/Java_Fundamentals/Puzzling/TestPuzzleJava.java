import java.util.ArrayList;
import java.util.Random;
public class TestPuzzleJava {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);
		

		char RandomLetter = generator.getRandomLetter();
		System.out.println(RandomLetter);


		String generatePassword = generator.generatePassword();
		System.out.println(generatePassword);

		String getNewPasswordSet = generator.getNewPasswordSet(15);
		System.out.println(getNewPasswordSet);
    	        //..
		// Write your other test cases here.
		//..
	}
}
