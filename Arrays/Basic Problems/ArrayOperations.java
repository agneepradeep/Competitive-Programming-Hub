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
    }

    public static void largestElement(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Largest Element :",arr[arr.length - 1]);
    }
}