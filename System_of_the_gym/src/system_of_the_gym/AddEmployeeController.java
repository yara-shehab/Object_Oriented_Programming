package system_of_the_gym;

import static system_of_the_gym.Employee.listofemployee;

public class AddEmployeeController {
    


    public String AddEmployeeController1(String id,String n,String a,String d,String m,String y,String s,String cd,String cm,String ty,String p) {
      
      
         Employee e=   new Employee();
         
      
        int x = 0;
        String l="";
        for (int z = 0; z <Employee.listofemployee.size(); z++) {
            if (Employee.listofemployee.get(z).getID1(z).equals(id)) {
                l = "Repeated ID! Try Again";
                x++;
            }
        }
            if (x == 0) {
               e=e.add(id,n,a,d,m,y,s,cd,cm,ty,p);
            
                e.setID(id);
                e.setname(n);
                e.setadress(a);
                e.setbirthdate(d + "/" + m + "/" + y);
                e.setsalary(s);
                e.setdateofemployment(cd + "/" + cm + "/" + ty);
                e.setposition(p);
                listofemployee.add(e);
            }
            return l;
        }
    }

