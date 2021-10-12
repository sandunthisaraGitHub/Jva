import java.sql.Array;
import java.util.Arrays;

public class AnagramCheck1{

    public static boolean anagramCheck1(String arg1, String arg2){
        boolean result = false;
        //length check
        if(arg1.length() !=  arg2.length()){
            result = false;
        }

        //simplified trim and the char array
        char[] argArray1 = arg1.toLowerCase().trim().toCharArray();
        char[] argArray2 = arg2.toLowerCase().trim().toCharArray();
        Arrays.sort(argArray1);
        Arrays.sort(argArray2);

        result = Arrays.equals(argArray1, argArray2);

        return result;
    }


    public static void main(String[] args) {
       boolean k  = anagramCheck1("HIIII", "iiiiH");
       System.out.print(k);
    }
}