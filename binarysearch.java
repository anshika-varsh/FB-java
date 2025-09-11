
// import java.lang.annotation.Target;
// import java.lang.reflect.Array;
import java.util.Arrays;

// linear search 
// linear Search using binary search 
public class binarysearch{ 
   public static void main(String[]args){

    int [][]arr={
        {11,12,13,14},
        {15,16,17,18},
        {19,20,21,22},
    };
    int target=33;
    int[] ans=searchIn2d(arr,target);
    System.out.println(Arrays.toString(ans));
    System.out.println(maxIn2d(arr));

} 
static int[] searchIn2d(int [][]arr,int Target){
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            if(arr[i][j]==Target){
                return  new int []{i,j};
            }
            
        }
    }
    return new int[]{-1,-1};
}
static  int maxIn2d(int [][]arr){
    int max=arr[0][0];
    for(int []row:arr){
        for(int col:row){
            if(col>max){
                max=col;
            }
        }
    }
    return max;
}

}
// String name="Anshika";
// char target='b';
//  System.out.println(SearchInString(name,target));

// }
// static String SearchInString(String str, char target){
//     if(str.length()==0){
//         return "None";
//     }
//     for(int element=0;element<str.length();element++){
//         if(str.charAt(element)==target){
//             return "exist";
//         }
//     }
//     return "None";
// }