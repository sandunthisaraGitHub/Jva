import java.lang.reflect.Array;
import java.util.Arrays;

public class AnagramCheck6{
    public static boolean anagramCheck6(String arg1, String arg2){
        boolean result = false;
        if(arg1.length() != arg2.length() ){
            result = false;
        }

        char[] argArr1 = arg1.toLowerCase().trim().toCharArray();
        char[] argArr2 = arg2.toLowerCase().trim().toCharArray();

        Arrays.sort(argArr1);
        Arrays.sort(argArr2);

        result = Arrays.equals(argArr1, argArr2);

        return result;
    }

    public static void main(String[] args){
        boolean k = anagramCheck6("Hello", "Hello");
        System.out.println("\n"+k);
    }
}