package system_of_the_gym;

import static system_of_the_gym.Member.listofmembers;

public class AddMemberController {

    public String AddMemberController1(String i, String n, String a, String d, String m, String y, String h, String w, String da, String cm, String ty, String tn, boolean in) {
        Member me = new Member();
        String l = "";
        int x = 0;
        for (int z = 0; z < Member.listofmembers.size(); z++) {
            if (Member.listofmembers.get(z).getID1(z).equals(i)) {
                l = "Repeated ID! Try Again";
                x++;
            }
        }
        if (x == 0) {
            me=me.add(i,n,a,d,m,y,h,w,da,cm,ty,tn,in);
            me.setID(i);
            me.setname(n);
            me.setadress(a);
            me.setbirthdate(d + "/" + m + "/" + y);
            me.setheight(h);
            me.setweight(w);
            me.setregdate(da + "/" + cm + "/" + ty);
            me.setnumofmonth(tn);
            me.setinbody(in );
            listofmembers.add(me);

        }
        return l;
    }
}
