
public class RemoveDuplicater2{
  public static void removeDuplicator(char[] str){
    if(str == null) return;
    int len = str.length;
    if( len< 2 ) return;

    int tail  = 1;
    for(int i = 1; i<len; ++i){
      int j;
      for(j = 0 ; j< i ; j++){
        if(str[i] == str[j]){
          break;
        }
      }
      if(i==j){
        str[tail] = str[i];
        tail++;
      }
    }
      str[tail] = 0;

  }
}
