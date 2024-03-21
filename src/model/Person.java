package model;

public class Person {

    private String id;
    private String name;
    private String lastName;
    private String civilStatus;

    public Person(String id, String name, String lastName, String civilStatus) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.civilStatus = civilStatus;
    }

    public void changeCivilStatus(String newStatus) {
        this.civilStatus = newStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCivilStatus() {
        return civilStatus;
    }

    // (soltero, casado, separado, unión libre, viudo

    public void setCivilStatus(String civilStatus) {
        switch (civilStatus.toLowerCase()) {
            case "soltero":
                this.civilStatus = civilStatus;
                break;
            case "casado":
                this.civilStatus = civilStatus;
                break;
            case "separado":
                this.civilStatus = civilStatus;
                break;
            case "union":
                this.civilStatus = civilStatus;
                break;
            case "viudo":
                this.civilStatus = civilStatus;
                break;

            default:
                System.out.println(
                        "No es un estado civil valido (soltero, casado, separado, union (Para union libre) o viudo)");
                break;
        }
    }

    @Override
    public String toString() {
        return "Persona [identificacion=" + id + ", Nombre=" + name + ", Apellido=" + lastName + ", Estado civil="
                + civilStatus + "]";
    }

}
