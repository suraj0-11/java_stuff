﻿import java.io.File;
import java.util.Scanner;
class FileP {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        String fname = obj.next();
        File f1 = new File(fname);
        System.out.println("File Name: " + f1.getName());
        f1.setWritable(false);
        System.out.println(f1.exists() ? "File exists" : "File does not exist");
        System.out.println(f1.canWrite() ? "File is writeable" : "File is not writeable");
        System.out.println(f1.canRead() ? "File is readable" : "File is not readable");
        String fileName = f1.toString();
        int index = fileName.lastIndexOf('.');
        if (index > 0) {
            String type = fileName.substring(index + 1);
            System.out.println("File type is " + type);
        } else {
            System.out.println("File doesn't have type");
        }
        System.out.println("File size: " + f1.length() + " Bytes");
    }
}
