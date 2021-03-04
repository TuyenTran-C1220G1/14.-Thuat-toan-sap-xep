public class SelectionSort {
    public static int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int currentMin = arr[i];
            int minCurrentIndex = i;

//            find min
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] <= currentMin) {
                    currentMin = arr[j];
                    minCurrentIndex = j;
                }
            }

            if (currentMin != i) {
                arr[minCurrentIndex] = arr[i];
                arr[i] = currentMin;
            }
        }

        return arr;

    }

    public static void main(String[] args) {
        int[] list = {1, 5, 2, 5, 6, 5, 5};
        selectionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
