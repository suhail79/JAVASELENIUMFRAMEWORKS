package org.test.AALearnjava;


/*
after using extends keyword for previous class Add unimplemented methods by using command+N

for creating object use this current class name no need of previous class name to be mentioned
 */

public class AbblearnpartialAbstraction extends AbalearnpartialAbstraction {


    @Override
    public void Moon() {
        System.out.println("chandrayan 3 launched");
    }

    @Override
    public void Sun() {

        System.out.println("Sun is very Hot");
    }

    public static void main(String[] args) {

        AbblearnpartialAbstraction a = new AbblearnpartialAbstraction();


        a.Earth();
        a.Moon();
        a.Sun();


    }


}



