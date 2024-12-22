import java.util.Arrays;
// Sliding Window Technique
public class Main {
    public static void main(String[] args) {
      int a[]={100 ,2,3,4,5,6,7,8};
      int w=4;
      int c=0;
      int l=a.length;
      for(int i=0;i<w;i++){
          c+=a[i];
      }
      int max=c;
      for(int j=1;j<=l-w;j++){
        c=c-a[j-1]+a[j+w-1];
        if(c>max) {
            max = c;
        }
      }
        System.out.println(max);
    }
}




