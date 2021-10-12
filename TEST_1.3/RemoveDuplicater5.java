public class RemoveDuplicater5{
  public static void removeDuplicates(char[] str){
    if(str == null) return;
    int len = str.length;
    if(len<2) return;

    int tail = 1;

    for(int i = 0 ; i<len; i++){
      int j;
      for(j=0; j<tail; j++){
        if(str[i]==str[j])break;
      }
      if(j == tail){
        str[tail] = str[i];
        tail++;
      }
    }
    str[tail]=0;
    for(int k = 0 ; k<tail; k++){
      char let = str[k];
    System.out.println(" -- "+let);
  }
  }

  public static void main(String[] args){
    System.out.println("HELLO");
    String str = "iikklliiiiiiii";
    char[] ch = str.toCharArray();

    removeDuplicates(ch);
  }
}
