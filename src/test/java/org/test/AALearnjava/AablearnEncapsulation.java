package org.test.AALearnjava;

import org.prac.seleniumpractice.practiceforinterview1;

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

        AaalearnEncapsulation p1 = new AaalearnEncapsulation();
        p1.setName("suhail");
        p1.setAge(29);
        p1.setPhn(9876543210l);

        AaalearnEncapsulation p2 = new AaalearnEncapsulation();
        p2.setName("arfaat");
        p2.setAge(18);
        p2.setPhn(7788992235l);

        AaalearnEncapsulation p3 = new AaalearnEncapsulation();
        p3.setName("salman");
        p3.setAge(16);
        p3.setPhn(9988762352l);


        List<AaalearnEncapsulation> li = new ArrayList<>();

        li.add(p1);
        li.add(p2);
        li.add(p3);

        for (AaalearnEncapsulation x : li) {
            System.out.println(x.getName());
            System.out.println(x.getAge());
            System.out.println(x.getPhn());
        }


/*
        for (int i = 0; i < li.size(); i++) {
            System.out.println("Name is " + li.get(i).getName());
            System.out.println("Age is " + li.get(i).getAge());
            System.out.println("phone is " + li.get(i).getPhn());
        }

 */


    }
}
