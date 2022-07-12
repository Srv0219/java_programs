package com.java.srv.practice;

import java.io.*;

public class Serialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        StudentName studentName = new StudentName();
        studentName.name="Sourav Adak";
        studentName.rollNumber=70;

        File file = new File("Student.txt");
        FileOutputStream outputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(studentName);


         FileInputStream fileInputStream = new FileInputStream(file);
         ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
         StudentName studentName1 = (StudentName) objectInputStream.readObject();
        System.out.println(studentName1.name+" "+studentName1.rollNumber);

    }

}

class StudentName implements Serializable  {
    int rollNumber;
    String name;
}
