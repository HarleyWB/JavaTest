package Test;

public class Test {
    public static int partion(int[] a, int low, int high) {
        int key = a[low];
        while (low < high) {
            while (a[high] > key && low < high) {
                high--;
            }
            a[low] = a[high];
            while (a[low] < key && low < high) {
                low++;
            }
            a[high] = a[low];

        }
        a[high] = key;
        return high;

    }

    public static void main(String[] args) {

        int[] a = {2, 7, 0, 1, 4};
        partion(a, 0, a.length - 1);
        for (int i : a) {
            System.out.println(i);
        }
    }

}