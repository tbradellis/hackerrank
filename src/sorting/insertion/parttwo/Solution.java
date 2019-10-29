package sorting.insertion.parttwo;
public class Solution {

    // Complete the insertionSort2 function below.
    static void insertionSort2(int n, int[] arr) {
        for(int i = 0; i < n-1; i++){
            if(arr[i] > arr[i+1]){

                insertionSort1(i+2,arr);
            }
            printArrayNL(arr);

        }

    }
    @SuppressWarnings("Duplicates")
    static void insertionSort1(int n, int[] arr) {
        int hold = arr[n - 1];
        for (int i = n - 1; i >= 0; i--) {
            if(i==0){
                arr[i]=hold;
                break;
            }
            if (arr[i - 1] < hold ) {
                arr[i] = hold;
                break;
            } else {
                arr[i] = arr[i - 1];
            }
        }

    }
    static void printArrayNL(int[] a) {
        StringBuilder c = new StringBuilder("");
        for (int b : a) {
            c.append(b + " ");
        }
        System.out.println(c);
    }


    public static void main(String[] args) {
        int n = 7;
        int[] arr = {3, 4, 7, 5, 6, 2, 1};

        insertionSort2(n, arr);

    }
}
