
package system_of_the_gym;

public class SearchForMemberController {
      public String SMC(String s) {
        int z = 0;
        String l = "";
        for (int i = 0; i < Member.listofmembers.size(); i++) {
   if(Member.listofmembers.get(i).getID1(i).equalsIgnoreCase(s))
                         {
                              l=("ID :"+s+"\n"+"Name :"+Member.listofmembers.get(i).getname1(i)
                             +"\n"+"Adress :"+Member.listofmembers.get(i).getadress1(i)+"\n"+"Birthdate :"+Member.listofmembers.get(i).getbirthdate1(i)
                             +"\n"+"Height :"+Member.listofmembers.get(i).getheight1(i)+"\n"+"Weight :"+Member.listofmembers.get(i).getweight1(i)
                             +"\n"+"Registration date :"+Member.listofmembers.get(i).getregdate1(i)+"\n"+"Number of Months :"+Member.listofmembers.get(i).getnumofmonth1(i)
                              +"\n"+"InBody :"+Member.listofmembers.get(i).getinbody1(i));
                             z++;
                         }
                        
        }
        if (z == 0) {
            l = "Not Found";
            return l;
        }

        return l;
    }
    
    
}
