package demo01;

public class array {
    public static void main(String[] args) {
        int array[] = new int[2];
        array[0] = 11;
        array[1] = 12;
        System.out.println(array[0]);

        int[] arrayA = { 10, 2, 300, 90, 887, 21 };
        int max = getMax(arrayA);
        System.out.println("最大值是：" + max);
    }

    public static int getMax(int[] arrayA) {
        int max = arrayA[0];
        for (int x = 1; x < arrayA.length; x++) {
            if (arrayA[x] > max) {
                max = arrayA[x];
            }
        }
        return max;
    }
}

