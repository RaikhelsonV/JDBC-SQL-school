package model;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private int id;
    private String name;
    private String description;
    private List<Student> students;

    public Course() {
        this.students = new ArrayList<Student>();
    }

    public Course(int id) {
        this.id = id;
    }

    public Course(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Course(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}