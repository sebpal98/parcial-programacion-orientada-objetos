package model;

public class Teacher extends Person {

    private int hireDate;
    private String officeID;
    private String program;

    public Teacher(String id, String name, String lastName, String civilStatus) {
        super(id, name, lastName, civilStatus);
    }

    public void changeOffice(String newOffice) {
        this.officeID = newOffice;
    }

    public void changeProgram(String newProgram) {
        this.program = newProgram;
    }

    public int getHireDate() {
        return hireDate;
    }

    public void setHireDate(int hireDate) {
        this.hireDate = hireDate;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getOfficeID() {
        return officeID;
    }

    public void setOfficeID(String officeID) {
        this.officeID = officeID;
    }

    @Override
    public String toString() {
        return "Teacher [hireDate=" + hireDate + ", officeID=" + officeID + ", program=" + program + "]";
    }

}
