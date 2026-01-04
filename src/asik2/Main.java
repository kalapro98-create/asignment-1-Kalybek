package asik2;
import java.util.ArrayList;
import java.util.Collections;
public class Main{
    public static void printData(Iterable<Person> persons) {
        for (Person p : persons) {
            System.out.println(p.toString() + " earns " + p.getPaymentAmount() + " tenge");
        }
    }
        public static void main(String[] args){
            Employee e1 = new Employee("John", "Lennon", "Manager", 27045.78);
            Employee e2 = new Employee("George", "Harrison", "Engineer", 50000.00);
            Student s1 = new Student("Ringo", "Starr", 2.40);
            Student s2 = new Student("Paul", "McCartney", 3.50);
            ArrayList<Person> list = new ArrayList<>();

            list.add(s1);
            list.add(e1);
            list.add(s2);
            list.add(e2);
            Collections.sort(list);
            printData(list);
        }
}