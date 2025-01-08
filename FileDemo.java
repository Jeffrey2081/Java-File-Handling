import java.io.*;
import java.util.*;
class FileDemo {
public static void main(String args[]) { 
File f1 = new File("FileDemo.txt");
System.out.println("File Name: " + f1.getName());
System.out.println("Path: " + f1.getPath());
System.out.println("Abs Path: " + f1.getAbsolutePath());
System.out.println("Parent: " + f1.getParent());
if(f1.exists()){ //Checks whether the file is present
System.out.println("Exists");}
if (f1.canWrite()) { //Checks whether the file is writeable
    System.out.println("is writeable");
}
if (f1.canRead()) {
    System.out.println("Readable");
}
if (f1.isDirectory()) {
    System.out.println("Is a directory");
}
if (f1.isFile()) {
    System.out.println("Is normal file");
}
if (f1.isAbsolute()) {
    System.out.println("Is absolute");
}
Date d=new Date(f1.lastModified());
System.out.println("File last modified: " + d);
System.out.println("File size: " + f1.length() + " Bytes");
}
}