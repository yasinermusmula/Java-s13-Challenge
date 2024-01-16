package employeeApp;

import java.util.Arrays;

public class Employee {
    private int id;
    private String fullname;
    private String email;
    private String password;
    private String[] healthplans;

    public Employee(int id, String fullname, String email, String password, String[] healthplans) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.password = password;
        this.healthplans = healthplans;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealthplans() {
        return healthplans;
    }

    public void setHealthplans(String[] healthplan) {
        this.healthplans = healthplan;
    }

    public void addHealthplan(int index, String name){
        if (index <0 ){
            System.out.println("Index degeri 0'dan kücük olamaz ");
        } else{
            try {
                //name => A Sigorta
                //healthplans => A Sigorta, B Sigorta
                boolean isExist = false;
                for (String healthplan : healthplans){
                    if (healthplan != null && healthplan.equals(name)){
                        isExist = true;
                        System.out.println(name + " healthplans içerisinde vardır: ");
                        break;
                    }
                }
                if (!isExist){
                if  (healthplans[index]== null){
                    healthplans[index] = name;
                }
             else {
                    System.out.println("İlgili index doludur. " + index);
                  }
                }
            } catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("Invalid index: " + index);
            }
            catch (Exception exception){
                System.out.println("Error occured: " + exception.getMessage());
            }
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", healthplan=" + Arrays.toString(healthplans) +
                '}';
    }

}
