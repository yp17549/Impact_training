
import java.util.LinkedList;

class linkedlistlast {

    public static void main(String[] args) {

        LinkedList<Integer> l = new LinkedList<>();

        l.add(100);
        l.add(200);
        l.add(300);
        l.add(400);

        System.out.println("" + l);

        System.out.println("Remove first element from the list: "
                + l.removeLast());

        System.out.println("" + l);
    }
}
