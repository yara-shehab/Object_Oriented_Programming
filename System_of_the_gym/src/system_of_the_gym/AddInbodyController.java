
package system_of_the_gym;

import static system_of_the_gym.Inbody.listofinbodys;

public class AddInbodyController {
    public void AddInbodyController1(String id,String h,String a,String cg,String cd,String ch ,String cm,String cw,String ff,String cww ,String b,String w,String bi,String p){
           Inbody i = new Inbody();
                     i=i.add(id,h,a,cg,cd,ch,cm,cw,ff,cww,b,w,bi,p);
                     i.setID(id);
                     i.setheight(h);
                     i.setage(a);
                     i.setgender(cg);
                     i.settestdate(cd+"/"+ch+"/"+cm);
                     i.settime(cw+":"+ff+":"+cww);
                     i.setbodyfat(b);
                     i.setweight(w);
                     i.setBMI(bi);
                     i.setPBF(p);
                     listofinbodys.add(i);

}
}
