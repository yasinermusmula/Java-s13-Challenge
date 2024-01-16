package employeeApp;

import java.util.Arrays;

// id, name, giro, String[] developerName
public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerName;

    public void checkGiro(double giro){
        if (giro<0){
            this.giro=0;
        } else {
            this.giro=giro;
        }
    }

    public Company(int id, String name, int giro, String[] developerName) {
        this.id = id;
        this.name = name;
        this.giro = giro;
        this.developerName = developerName;
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

    public double getGiro() {
        return giro;
    }

    public void setGiro(int giro) {
        this.giro = giro;
    }

    public String[] getDeveloperName() {
        return developerName;
    }

    public void setDeveloperName(String[] developerName) {
        this.developerName = developerName;
    }


    public void addEmployee(int index, String name){
        try {

            if (developerName[index]== null ){
                developerName[index] = name;
            } else {
                System.out.println("Index " + index + " doludur.");
            }
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Böyle bir index değeri yoktur " + index);
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerName=" + Arrays.toString(developerName) +
                '}';
    }
}





