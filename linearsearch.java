public class linearsearch{
    public static void main(String[] args) {
      int []  arr={11,12,66,96,122,133,155,180};
    int target=160;
    System.out.println(searchforceil(arr, target));
        
    }
    // static int search(int []arr,int target){
    //     int start=0;
    //     int end=arr.length-1;
        
    //     while(start<=end){
    //         int mid=start+(end-start)/2;
    //         if(arr[mid]>target){
    //             end=mid-1;
    //         }
    //         else if(target>arr[mid]){
    //             start=mid+1;
    //         }
    //         else{
    //             return mid;
    //         }


    //     }return -1;
     
        // static int searchforceil(int  arr[],int target){
        //     int start=0;
        //     int end=arr.length-1;
        //     while(start<=end){
        //         int mid=start+(end-start)/2;
        //         if(target>arr[mid]){
        //             start=mid+1;
        //         }
        //         else if(target<arr[mid]){
        //             end=mid-1;
        //         }
        //         else{
        //             return mid;
        //         }
        //     }
        //     return arr[start];
        // }
        
    }
