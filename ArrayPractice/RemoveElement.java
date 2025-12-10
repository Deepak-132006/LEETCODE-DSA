package ArrayPractice;
public class RemoveElement{
    public static void main(String [] args){
        int[] arr = {3, 5, 7, 9, 11};

        int removeIndex = 2;

        int n = arr.length;

        for ( int i = removeIndex; i < n - 1; i++){
            arr[i] = arr[i + 1];
        }
        n = n - 1;
        System.out.print("After Removal: ");
        for ( int i = 0; i < n; i++ ){
            System.out.print(arr[i] + " ");
        }
    }
}