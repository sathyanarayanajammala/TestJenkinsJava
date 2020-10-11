import java.util.Arrays;

public class MinArray {

    public static void main(String[] args) {
        int[] B =  {1, 3, 6, 4, 1, 2};
         Arrays.sort(B);
        int min = B[0];
        for(int i=0;i<B.length;i++){
            if(i< B.length && B[i] == B[i+1] )
                continue;
            else if(i< B.length && B[i+1] == B[i] +1){
                continue;
            }
            else
                System.out.println(B[i]+1);


        }
    }
}
