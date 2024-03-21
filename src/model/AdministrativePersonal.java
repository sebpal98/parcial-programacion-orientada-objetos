package model;

public class AdministrativePersonal extends Person {
    private int hireDate;
    private String officeID;
    private String dependenci;

    public AdministrativePersonal(String id, String name, String lastName, String civilStatus) {
        super(id, name, lastName, civilStatus);
    }

    public void changeOffice(String newOffice) {
        this.officeID = newOffice;
    }

    public void changeDependenci(int newDependenci) {
        switch (newDependenci) {
            case 1:
                this.dependenci = "vicerrectoría financiera";
                break;
            case 2:
                this.dependenci = "Facultad de Ingeniería";
                break;
            case 3:
                this.dependenci = "Facultad de Artes ASAB";
                break;
            case 4:
                this.dependenci = "Facultad de Ciencias y Educación";
                break;
            case 5:
                this.dependenci = "Facultad del Medio Ambiente";
                break;
            case 6:
                this.dependenci = "Facultad de Tecnología";
                break;

            default:
                System.out.println(
                        "No es una oficina valida (1: vicerrectoría financiera,\n Facultad (2: Ingeniería, 3: Artes ASAB,Ciencias y Educación, 4: del Medio Ambiente o 5: Tecnólogica)");
                break;
        }
    }

    public String getDependenci() {
        return dependenci;
    }

    public void setDependenci(String dependenci) {
        this.dependenci = dependenci;
    }

    public int getHireDate() {
        return hireDate;
    }

    public void setHireDate(int hireDate) {
        this.hireDate = hireDate;
    }

    public String getOfficeID() {
        return officeID;
    }

    public void setOfficeID(String officeID) {
        this.officeID = officeID;
    }

    @Override
    public String toString() {
        return "AdministrativePersonal [hireDate=" + hireDate + ", officeID=" + officeID + ", dependenci=" + dependenci
                + "]";
    }

}
