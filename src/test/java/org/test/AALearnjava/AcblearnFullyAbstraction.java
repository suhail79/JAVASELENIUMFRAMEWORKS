package org.test.AALearnjava;

public class AcblearnFullyAbstraction implements AcalearnFullyAbstraction {


    @Override
    public void Car() {
        System.out.println("car name is Tata Altroz");
    }

    @Override
    public void Bus() {
        System.out.println("Bus name is Scania");
    }

    @Override
    public void Lorry() {
        System.out.println("Lorry name is Benz");
    }

    @Override
    public void Bike() {
        System.out.println("Bike name is Dominar");
    }

    public static void main(String[] args) {
        AcblearnFullyAbstraction fa = new AcblearnFullyAbstraction();
        fa.Car();
        fa.Bus();
        fa.Bike();
        fa.Lorry();
    }
}
