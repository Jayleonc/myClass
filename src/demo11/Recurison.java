package demo11;

import java.io.File;

public class Recurison {
    public static void main(String[] args) {
        File file = new File("/Users/jayleonc/myClass/Folder");
        getAllFile(file);
    }

    public static void getAllFile(File dir) {
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                getAllFile(file)
                ;
            }else {
//                String s = file.toString();
//                boolean b = s.endsWith(".java");
//                if (b) {
//                    System.out.println(file);
//                }
                if (file.getName().toLowerCase().endsWith(".java")) { //? toLowerCase -- > 转换为小写
                    System.out.println(file);
                }
            }
        }
    }
}
