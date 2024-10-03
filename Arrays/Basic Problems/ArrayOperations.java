import java.util.*;

public ArrayOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] arr = new int[n];

        for(i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        largestElement(arr);
        isSorted(arr);
    }

    public static void largestElement(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Largest Element :",arr[arr.length - 1]);
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 1 ;i<arr.length ;i++) {
            if(arr[i] > arr[i-1]) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}