public class RemoveDuplicater3{
  public static void removeTheDuplicated(char[] val){
    if(val == null) return;
    int len = val.length;
    if(len<2) return;

    int tail = 1;
    for(int i = 1; i < len; ++i){
      int j;
      for(j = 0; j<tail ; ++j){
        if(val[i] == val[j]){
          break;
        }
      }
      if(tail == j){
        val[tail] = val[i];
        ++tail;
      }
    }
    val[tail] = 0;
    for(int k = 0 ; k<tail; k++){
      char let = val[k];
    System.out.println(" -- "+let);
  }

  }

  public static void main(String[] args){
    System.out.println("HELLO");
    String str = "iiiiiiiiii";
    char[] ch = str.toCharArray();

    removeTheDuplicated(ch);
  }
}
