import java.util.*;
class array{
    public static void main(String args[]){
        //intialization of array
        int arr[]={ 22,33,44,765,200};
        System.out.println(Arrays.toString(arr));
        //Accessig of array
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        //modification of array
        arr[2]=69;
        arr[3]=789;
        System.out.println(Arrays.toString(arr));

    }
}