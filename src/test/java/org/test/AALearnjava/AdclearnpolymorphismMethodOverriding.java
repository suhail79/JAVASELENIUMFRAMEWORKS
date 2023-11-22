package org.test.AALearnjava;

public class AdclearnpolymorphismMethodOverriding extends AdblearnpolymorphismMethodOverriding {
    @Override
    public void Name() {
        System.out.println("name changed");
    }

    @Override
    public void property() {
        System.out.println("property changed");
    }

    @Override
    public void asset() {
        System.out.println("asset changed");
    }

    public static void main(String[] args) {

        //2=2 [this will work fine] [this will print overridden value]
/*
        AdclearnpolymorphismMethodOverriding or = new AdclearnpolymorphismMethodOverriding();
        or.Name();
        or.property();
        or.asset();
 */


        // 1=2 [this will work fine] [this will print overridden value]
         /*
        AdblearnpolymorphismMethodOverriding x = new AdclearnpolymorphismMethodOverriding();

        x.Name();
        x.property();
        x.asset();
        */

        // 1=1 [this will work fine] [this will print normal value of class1 ]
        /*
        AdblearnpolymorphismMethodOverriding y = new AdblearnpolymorphismMethodOverriding();
        y.Name();
        y.property();
        y.asset();
         */

        //2=1 [this will throw error]

        /*
        AdclearnpolymorphismMethodOverriding z = new AdblearnpolymorphismMethodOverriding();

        z.Name();
        z.asset();
        z.property();
        */


    }

}
