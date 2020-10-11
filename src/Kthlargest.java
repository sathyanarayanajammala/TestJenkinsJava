import java.util.ArrayList;
import java.util.List;

public class Kthlargest {

    public static void main(String[] args) {
        //List<Integer> list = new ArrayList<>(10);
        int a[] = {3,4,5,2,4};
        int k=3;
        int temp=0;
        int m=-1;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                if(a[i]>a[j] ){
                    temp++;
                }
                else if(temp> k){
                    temp=0;
                    break;
                }
                if (temp==k)
                    m=i;

            }

        }
        if(m>0){
            System.out.println(a[m]);
        }
    }
}