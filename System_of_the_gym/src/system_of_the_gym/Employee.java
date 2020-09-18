
package system_of_the_gym;

import java.util.ArrayList;

public class Employee {
     public String name;
    public String ID;
    public String adress;
    public String birthdate;
    public String salary;
    public String DateOfEmployment;
    public String Position;
public static ArrayList<Employee> listofemployee = new ArrayList<Employee>();

public    Employee add(String i,String n,String a,String d,String m,String y,String s,String cd,String cm,String ty ,String p){
                  
                this.ID=i;
                this.name=n;
                this.adress=a;
                this.birthdate=d + "/" + m + "/" + y;
                this.salary=s;
                this.DateOfEmployment=cd + "/" + cm + "/" + ty;
                this.Position=p;
                return this ;
                
        
}
  public void setname(String s) {
        this.name = s;
    }

    public void setID(String i) {
        this.ID = i;
    }

    public void setadress(String i) {
        this.adress = i;
    }

    public void setbirthdate(String i) {
        this.birthdate = i;
    }

    public void setsalary(String i) {
        this.salary = i;
    }

    public void setdateofemployment(String i) {
        this.DateOfEmployment = i;
    }

    public void setposition(String i) {
        this.Position = i;
    }

    public String getname() {
        String s = "";
        for (int i = 0; i < listofemployee.size(); i++) {

            s = s + listofemployee.get(i).name + "\n";
        }
        return s;
    }

    public String getname1(int i1) {
        String s = "";
        for (int i = 0; i < listofemployee.size(); i++) {
            if (i == i1) {
                s = s + listofemployee.get(i).name;
            }
        }
        return s;
    }

    public String getID1(int i1) {
        String s = "";
        for (int i = 0; i < listofemployee.size(); i++) {
            if (i == i1) {
                s = listofemployee.get(i).ID;
            }
        }
        return s;
    }

    public String getID() {
        String s = "";
        for (int i = 0; i < listofemployee.size(); i++) {

            s = s + listofemployee.get(i).ID + "\n";
        }
        return s;
    }

    public String getadress() {
        String s = "";
        for (int i = 0; i < listofemployee.size(); i++) {

            s = s + listofemployee.get(i).adress + "\n";
        }
        return s;
    }

    public String getadress1(int i1) {
        String s = "";
        for (int i = 0; i < listofemployee.size(); i++) {
            if (i == i1) {
                s = s + listofemployee.get(i).adress;
            }
        }
        return s;
    }

    public String getbirthdate() {
        String s = "";
        for (int i = 0; i < listofemployee.size(); i++) {

            s = s + listofemployee.get(i).birthdate + "\n";
        }
        return s;
    }

    public String getbirthdate1(int i1) {
        String s = "";
        for (int i = 0; i < listofemployee.size(); i++) {
            if (i == i1) {
                s = s + listofemployee.get(i).birthdate;
            }
        }
        return s;
    }

    public String getsalary() {
        String s = "";
        for (int i = 0; i < listofemployee.size(); i++) {

            s = s + listofemployee.get(i).salary + "\n";
        }
        return s;
    }

    public String getsalary1(int i1) {
        String s = "";
        for (int i = 0; i < listofemployee.size(); i++) {
            if (i == i1) {
                s = s + listofemployee.get(i).salary;
            }
        }
        return s;
    }

    public String getdateofemployment() {
        String s = "";
        for (int i = 0; i < listofemployee.size(); i++) {

            s = s + listofemployee.get(i).DateOfEmployment + "\n";
        }
        return s;
    }

    public String getdateofemployment1(int i1) {
        String s = "";
        for (int i = 0; i < listofemployee.size(); i++) {
            if (i == i1) {
                s = s + listofemployee.get(i).DateOfEmployment;
            }
        }
        return s;
    }

    public String getposition() {
        String s = "";
        for (int i = 0; i < listofemployee.size(); i++) {

            s = s + listofemployee.get(i).Position + "\n";
        }
        return s;
    }

    public String getposition1(int i1) {
        String s = "";
        for (int i = 0; i < listofemployee.size(); i++) {
            if (i == i1) {
                s = s + listofemployee.get(i).Position;
            }
        }
        return s;
    }

}




