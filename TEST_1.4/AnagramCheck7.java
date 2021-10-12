import java.util.Arrays;

public class AnagramCheck7{
    public static boolean anagramCheck7(String arg1, String arg2){
        boolean result = false;
        if(arg1.length() != arg2.length()){
            result = false;
        }

        char[] charArr1 = arg1.toLowerCase().trim().toCharArray();
        char[] charArr2 = arg2.toLowerCase().trim().toCharArray();

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);


        result = Arrays.equals(charArr1, charArr2);


        return result;
    }
    public static void main(String[] args){
        boolean k = anagramCheck7("Hello", "Hello");
        System.out.println("\n"+k);
    }
}