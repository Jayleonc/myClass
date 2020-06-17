package demo11;

import java.io.FileWriter;
import java.io.IOException;

public class Writer01 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("/Users/jayleonc/myClass/a.txt",true);
        for (int i = 0; i < 20; i++) {
            fw.write("Jayleonc" + i + "\r");
        }

        fw.close();
    }
}
