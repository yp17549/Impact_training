
class vehicle {

    void featuers() {
        System.out.println("Car");
    }
}

class Car extends vehicle {

    void attribiutes() {
        System.out.println("Name:           Swift Dzire.");
        System.out.println("CC:             1197.");
        System.out.println("Seating Space:  4.");
    }
}

class electricCar extends Car {

    void featuer() {
        System.out.println("Name:           TATA TIAGIO EV.");
        System.out.println("CC:             1199.");
        System.out.println("Seating Space:  5.");
    }
}

public class vehicled {

    public static void main(String[] args) {
        electricCar s = new electricCar();
        s.featuer();
        s.attribiutes();
        s.featuers();
    }
}
