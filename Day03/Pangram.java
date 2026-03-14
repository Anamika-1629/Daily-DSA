import java.util.*;

class Pangram {
    public boolean checkIfPangram(String sentence) {
        int len = sentence.length();
        
        HashSet <Character> alphabets = new HashSet<>();

        for (int i = 0; i < len; i++){
            char ch = sentence.charAt(i);
            alphabets.add(ch);
        }

        if (alphabets.size() == 26){
            return true;
        }
        else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Pangram obj = new Pangram();
        boolean result = obj.checkIfPangram(s);

        System.out.println(result);
    }
}