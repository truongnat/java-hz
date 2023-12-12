import java.util.Arrays;

public class ArrayTask {
    public int arr1ToArr2() {
        int[] arr2 = {1,2,3,4,5,6};
        int[] arr1 = new int[arr2.length];

        for (int i = 0; i < arr2.length; i++) {
            arr1[i] = arr2[i];
        }

        System.out.println(Arrays.toString(arr2));

        return 0;
    }
}
