package com.company.Exercise6;

import java.util.ArrayList;
import java.util.List;

public class TestSortStudent {

    private int n;
    private List<Student> students = new ArrayList<>();

    public TestSortStudent(int n) {
        this.n = n;
    }

    public void addValues(int[] arr) {
        if (arr.length != n) return;

        for (int i = 0; i < n; i++) {
            students.add(new Student(arr[i]));
        }
    }

    public void sort() {
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (students.get(j).getIdNumber() >= students.get(j - 1).getIdNumber()) {
                    break;
                }
                int t = students.get(j - 1).getIdNumber();
                students.get(j - 1).setIdNumber(students.get(j).getIdNumber());
                students.get(j).setIdNumber(t);
            }
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void print() {
        for (Student student : students) {
            System.out.print(student.getIdNumber() + " ");
        }
    }
}
