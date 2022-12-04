import java.util.*;
public class linearsearch {
    public static int func(int ar[],int value){
        for(int i=0;i<ar.length;i++){
            if(ar[i]==value){
                return i;
            }
        }
                return -1;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ar[];
        int n=sc.nextInt();
        ar=new int[n];
        for(int i=0;i<n;i++){
             ar[i]=sc.nextInt();
        }
        System.out.println("Enter the value");
        int value=sc.nextInt();
        System.out.println(value+"is found"+func(ar,value));
    }
    
}
// Time complexity = O(n)
