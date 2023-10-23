package org.test.AALearnjava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AablearnEncapsulation {

    /*
     *in previous class we have declared variables as private & created getter & setter methods
     *here we are actually defining the variables and giving data here
     *while creating object we need to give previous class name
     */


    public static void main(String[] args) {

        AaalearnEncapsulation aa = new AaalearnEncapsulation();

        aa.setName("Suhail");
        aa.setRoll(11);
        aa.setInitial('S');
/*
        List<AaalearnEncapsulation> li = new ArrayList<AaalearnEncapsulation>();
        li.add(aa);

 */

        //normal For loop

       /* for (int i = 0; i < li.size(); i++) {
            System.out.println(li.get(i).getName());
            System.out.println(li.get(i).getRoll());
            System.out.println(li.get(i).getInitial());
        }
*/

        //enhanced for loop

        Set<AaalearnEncapsulation> li = new HashSet<>();
        li.add(aa);

        for (AaalearnEncapsulation ab : li) {
            System.out.println(ab.getName());
            System.out.println(ab.getRoll());
            System.out.println(ab.getInitial());
        }

    }
}
