
public class string {

    public static void main(String[] args) {
        String name = "Parul University";
        String variable = "events";
        String name1 = new String("Parul University");
        String name2 = new String("Parul University");

        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Starts with 'P: " + name.startsWith("P"));
        System.out.println("Contains 'Parul': " + name.contains("University"));
        System.out.println("Character at 3rd position: " + name.charAt(3));
        System.out.println("SubString: " + name.substring(0, 3));
        System.out.println("Compare those 2: " + name.equals(name1));
        System.out.println("Compare those 2: " + name1.equals(name2));
        //System.out.println(name1.append("n-block"));
        System.out.println("Conversion of immutable to mutable--------");
        StringBuilder yash = new StringBuilder(name);
        StringBuilder yashpatil = new StringBuilder(variable);
        System.out.println(yash.append(" n-block"));
        System.out.println(name2.concat(" batch-9"));
    }
}
