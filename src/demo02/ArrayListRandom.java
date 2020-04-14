package demo02;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListRandom {
    public ArrayListRandom() {
    }

    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(33) + 1;
            List.add(num);
        }
        for (int i = 0; i < List.size(); i++) {
            System.out.println(List.get(i));
        }
    }
}
