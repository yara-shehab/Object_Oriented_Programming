
package system_of_the_gym;


public class RemoveEmployeeController {
      public void REC (String m) {
    
          for(int i=0;i<Employee.listofemployee.size();i++)
                     {
                         
                       if(Employee.listofemployee.get(i).getID1(i).equalsIgnoreCase(m))
                         {
                              Employee.listofemployee.remove(i);
                         }
                        
                     }
                }
}
