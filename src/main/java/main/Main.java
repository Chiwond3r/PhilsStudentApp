package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
    private final int id;
    private final String name;
    private final List<Double> grades;

    public Main(int id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public void addGrade(double grade) throws InvalidGradeException {
        if (grade < 0 || grade > 100) {
            throw new InvalidGradeException("Grade must be between 0 and 100.");
        }
        grades.add(grade);
    }

    public double calculateAverage() {
        if (grades.isEmpty()) {
            return 0;
        }
        double total = 0;
        for (double grade : grades) {
            total += grade;
        }
        return total / grades.size();
    }

    public void sortGrades() {
        Collections.sort(grades);
    }

    public void displayInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Grades: " + grades);
        System.out.println("Average: " + calculateAverage());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
