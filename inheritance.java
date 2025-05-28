
class yash {

    void Defination() {
        System.out.println("I am in Parul University.");
    }
}

class inCollege extends yash {

    void collegeName() {
        System.out.println("This is PIT.");
    }
}

public class inheritance {

    public static void main(String[] args) {
        inCollege yasha = new inCollege();
        yasha.Defination();
        yasha.collegeName();
    }
}
