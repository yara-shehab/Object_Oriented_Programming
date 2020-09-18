package system_of_the_gym;

public class SearchForEmployeeController {

    public String SEC(String s) {
        int z = 0;
        String l = "";
        for (int i = 0; i < Employee.listofemployee.size(); i++) {

            if (Employee.listofemployee.get(i).getID1(i).equalsIgnoreCase(s)) {
                l = (s + "\n" + Employee.listofemployee.get(i).getname1(i)
                        + "\n" + Employee.listofemployee.get(i).getadress1(i) + "\n" + Employee.listofemployee.get(i).getbirthdate1(i)
                        + "\n" + Employee.listofemployee.get(i).getdateofemployment1(i) + "\n" + Employee.listofemployee.get(i).getposition1(i)
                        + "\n" + Employee.listofemployee.get(i).getsalary1(i));
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
