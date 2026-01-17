package fileHandling;

import java.io.Serializable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
	String name;
    int id;

    Student() {
    }

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args) {

        Student s1 = new Student("Shivam", 11);
        File fs = new File("/Users/shivamkumar/Documents/FileHandling/Data.ser");

        try {
            // Create file if not exists
            fs.createNewFile();

            // Serialization
            FileOutputStream fo = new FileOutputStream(fs);
            ObjectOutputStream out = new ObjectOutputStream(fo);
            out.writeObject(s1);
            out.close();
            fo.close();

            // DeSerialization
            FileInputStream fi = new FileInputStream(fs);
            ObjectInputStream in = new ObjectInputStream(fi);
            Student s = (Student) in.readObject();
            in.close();
            fi.close();

            // Output
            System.out.println(s.name);
            System.out.println(s.id);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
