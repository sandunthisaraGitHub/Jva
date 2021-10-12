import java.util.Arrays;

public class AnagramCheck2{
    public static boolean anagramCheck2(String arg1, String arg2){
        boolean result = false;
        //length check
        if(arg1.length() != arg2.length()){
            result = false;
        }

        //to Convert into lowercase and the to a char array and trim it down
        char[] array1 = arg1.toLowerCase().trim().toCharArray();
        char[] array2 = arg2.toLowerCase().trim().toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        result = Arrays.equals(array1, array2);

        return result;

    }

    public static void main (String[] args){
        boolean k = anagramCheck2("Hellllllo", "J");
        System.out.println(k+"\n");
    }
}