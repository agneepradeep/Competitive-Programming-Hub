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

    public int getSecondLargest(int[] arr) {
        if (arr.length == 1) {
            return -1;
        } else {
            int a = -1;
            int b = -1;
            
            for (int i = 0; i<arr.length; i++) {
                if (arr[i] > a) {
                    b = a;
                    a = arr[i];
                } else if (arr[i] > b && arr[i] < a) {
                    b = arr[i];
                } else continue;
            }
            return b;
        }
    }
}