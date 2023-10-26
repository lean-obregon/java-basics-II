import Composition.Table;
import Inheritance.Cat;

public class Main {
    public static void main(String[] args) {
        var myCat = new Cat("Gypsy");
        System.out.println(myCat.toString());

        var myTable = new Table(4);
    }
}