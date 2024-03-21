package model;

import java.util.ArrayList;

public class Student extends Person {

    private int code;
    private String carreer;
    private ArrayList<String> courseList = new ArrayList<>();

    public Student(String id, String name, String lastName, String civilStatus) {
        super(id, name, lastName, civilStatus);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getCarreer() {
        return carreer;
    }

    public void setCarreer(String carreer) {
        this.carreer = carreer;
    }

    public ArrayList<String> getCourseList() {
        return courseList;
    }

    public void addNewCourse(String course) {
        this.courseList.add(course);
    }

    @Override
    public String toString() {
        return "Student [code=" + code + ", carreer=" + carreer + "]";
    }

}
