public class Zeros {
    public static void main(String[] args) {
        int a[]={0,0,1,2,3,0,4,0,0,9,8,7,0,5,4,0};
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i] == 0){
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
                j++;
            }


        }
        System.out.println(a);
    }
}
