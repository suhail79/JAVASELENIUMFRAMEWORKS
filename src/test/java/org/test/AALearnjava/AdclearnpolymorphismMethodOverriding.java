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
        AdclearnpolymorphismMethodOverriding or = new AdclearnpolymorphismMethodOverriding();
        or.Name();
        or.property();
        or.asset();
    }

}
