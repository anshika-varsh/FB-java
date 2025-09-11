
import java.util.Scanner;

public class array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int[]arr; //declaration of array
        // arr=new int[5]; // initialisation of array
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=sc.nextInt();
        // }
        // System.out.println(Arrays.toString(arr));

        // for(int num:arr){
        //     System.out.println(num);
        // }
        // String []str=new String[5];
        // for(int i=0;i<str.length;i++ ){
        //     str[i]=sc.next();
        // }
        // System.out.println(Arrays.toString(str));

        // int num[]={2,3,4,1,5};
        // System.out.println(Arrays.toString(num));
        // change(num);
        // System.out.println(Arrays.toString(num));
         int [][]arr=new int [3][2];
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]=sc.nextInt();
            }
        }

        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+"");
            }
            System.out.println("");
        }





    }
    // static void change (int[] arr){
    //     arr[0]=99;
    // }
    
}