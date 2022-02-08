import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {
    
    public ArrayList<Integer> getTenRolls(){
        Random rando = new Random();
        ArrayList<Integer> randoNum = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            int nums = (rando.nextInt(20)+1);
            randoNum.add(nums);
            
        }
        return randoNum;
    }

    public char getRandomLetter(){
        Random rando = new Random();
        char[] alpho = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char randoLetter = ' ';
        int nums = (rando.nextInt(26));
        randoLetter = alpho[nums];
        return randoLetter;
    }

    public String generatePassword(){
        String rando = "";
        for( int i = 0; i < 8; i++){
            rando += getRandomLetter();
        }
        return rando;
    }

    public ArrayList<String> getNewPasswordSet (int length){
        ArrayList<String> newPassword = new ArrayList<String>();
        for(int i =0; i < length; i++){
            newPassword.add(generatePassword());
        }
        return newPassword;
    }

}