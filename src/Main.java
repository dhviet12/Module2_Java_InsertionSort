public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 10, 21, 14, 3, 1, 0};
        System.out.println("Before sorting");
        for (int j : arr) {
            System.out.print(j + "\t");
        }
        insertionSort(arr);
        System.out.println();
        System.out.println("After sorting");
        for (int k : arr) {
            System.out.print(k + "\t");
        }
    }

    public static void insertionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
        }
    }
}
