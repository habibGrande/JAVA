import java.util.ArrayList;
import java.util.Random;

/**
 * PuzzleJava
 */
public class PuzzleJava {

    public  ArrayList<Integer>  getTenRolls() {
        ArrayList<Integer> rolls = new ArrayList<>() ;
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(20) + 1;
            rolls.add(randomNumber);
        }
        return rolls;
    }
    public char getRandomLetter(){
        ArrayList<Character> latter = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 25; i++) {
            char randomLatter = (char) (random.nextInt(26) + 'a');
            latter.add(randomLatter);
        }
        int intRan = random.nextInt(25) + 1;
        char randomletters = latter.get(intRan);
        return randomletters;
    }
    public String generatePassword(){
        Random random = new Random();
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            char randomLatter = (char) (random.nextInt(26) + 'a');
            password.append(randomLatter);
        }
        return password.toString();
    }
    public String getNewPasswordSet(int length) {
        Random random = new Random();
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char randomLatter = (char) (random.nextInt(26) + 'a');
            password.append(randomLatter);
        }
        return password.toString();
    }

}   
