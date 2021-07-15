public class MaxAndMinElemInArray {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 34, 74, 89, 4, 0};
        int n = arr.length;
        if (n > 0)
            findMaxAndMinValue(arr, n);
        else
            System.out.println("Empty Array");
    }

    static void findMaxAndMinValue(int arr[], int n) {
        int tempMin = arr[0];
        int tempMax = arr[0];
        for (int i = 0; i < n; i++) {
            if (tempMax < arr[i]) {
                tempMax = arr[i];
            }
            if (tempMin > arr[i]) {
                tempMin = arr[i];
            }
        }
        System.out.println("Maximum Value = " + tempMax);
        System.out.println("Minimum Value = " + tempMin);
    }
}
