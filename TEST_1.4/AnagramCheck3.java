import java.util.Arrays;

public class AnagramCheck3{
    public static boolean anagramCheck3(String arg1, String arg2){
        boolean result  = false;
        
        //length check
        if(arg1.length() != arg2.length()){
            result = false;
        }

        //convert to char array as well as trimming and the lowercase
        char[] charArr1 = arg1.toLowerCase().trim().toCharArray();
        char[] charArr2 = arg2.toLowerCase().trim().toCharArray();

        //sort my char-array
        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        //check the equals or not
        result = Arrays.equals(charArr1, charArr2);
        return result;

    }

    public static void main(String[] args){
        boolean k = 
        anagramCheck3("hi", "ihofilfjlsdkajfl");
        System.out.println(k);

        
    }
}