
package system_of_the_gym;

public class RemoveInbodyController {
    public void RIC(String s){
     
                     for(int i=0;i<Inbody.listofinbodys.size();i++)
                     {
                         
                       if(Inbody.listofinbodys.get(i).getID1(i).equalsIgnoreCase(s))
                         {
                              Inbody.listofinbodys.remove(i);
                         }
                        
                     }

    }
    
}
