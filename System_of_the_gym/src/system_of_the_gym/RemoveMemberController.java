
package system_of_the_gym;


public class RemoveMemberController {
    public void RMC(String s){
        for(int i=0;i<Member.listofmembers.size();i++)
                     {
                         
                       if(Member.listofmembers.get(i).getID1(i).equalsIgnoreCase(s))
                         {
                              Member.listofmembers.remove(i);
                         }
                        
                     }
    }
    
}
