package demo02;

import java.util.ArrayList;

public class ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> List = new ArrayList<>();

        List.add("周杰伦");
        List.add("王力宏");
        List.add("昆凌");
        List.add("陈信宏");
        System.out.println(List);

        PrintArrayList(List);
    }

    public static void PrintArrayList(ArrayList<String> List) {
        System.out.print("{");
        for (int i = 0; i < List.size(); i++) {
            String name = List.get(i);
            if (i == List.size() - 1) {
                System.out.print(name + "}");
            } else {
                System.out.print(name + "@");
            }
        }
    }
}
