package chapter10;

import java.io.*;

public class JavaIOSystem {

    public static void main(String[] args) throws IOException {

        File dir = new File(".");
        File dir2 = new File("..");
        boolean r;
        r = dir.isDirectory();
        r = dir.isFile();
        r = dir.exists();
    }

}
