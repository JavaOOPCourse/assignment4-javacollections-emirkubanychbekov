package service;

import model.Student;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    public void initializeStudents() {
        // TODO: Add at least 5 students
        students.add(new Student(1, "Alice", 3.5));
        students.add(new Student(2, "Bob", 1.8));
        students.add(new Student(3, "Charlie", 2.9));
        students.add(new Student(4, "Diana", 3.9));
        students.add(new Student(5, "Eve", 1.5));
    }

    public void removeLowGPA() {
        // TODO: Remove students with GPA < 2.0
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getGpa() < 2.0) {
                iterator.remove();
            }
        }
    }

    public void findHighestGPA() {
        // TODO: Find and print student with highest GPA
        Student topStudent = students.get(0);
        for (Student s : students) {
            if (s.getGpa() > topStudent.getGpa()) {
                topStudent = s;
            }
        }
        System.out.println(topStudent);
    }

    public void insertAtIndex() {
        // TODO: Insert new student at index 2
        students.add(2, new Student(6, "Frank", 3.2));
    }

    public void printStudents() {
        // TODO: Print using Iterator
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}