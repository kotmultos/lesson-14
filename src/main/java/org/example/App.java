package org.example;

import org.example.comparator.StudentNameComparator;
import org.example.generics.Box;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Box <Integer> integerBox = new Box<>();
        integerBox.setValue(10);
        System.out.println(integerBox.getValue());

        Box<String> stringBox = new Box<>();
        stringBox.setValue("Hello");
        System.out.println(stringBox.getValue());


        Student student1 = new Student("Oleksandr", 19);
        Student student2 = new Student("Anton", 20);
        Student student3 = new Student("Sophia", 18);

        List<Student> studentList = Arrays.asList(student1, student2, student3);
        System.out.println(studentList);

        Collections.sort(studentList);
        System.out.println(studentList);

        studentList.sort(new StudentNameComparator());
        System.out.println(studentList);

        studentList.sort((Student s1, Student s2) -> s1.getAge() - s2.getAge());
        studentList.sort((s1, s2) -> s1.getAge() - s2.getAge());
        studentList.sort(Comparator.comparingInt(Student::getAge));
        studentList.sort(Comparator.comparing(Student::getAge));

        System.out.println(studentList);


    }
}
