import java.util.ArrayList;
import java.util.List;

public class MetaApp {
    private List<Person> personList = new ArrayList<>();


    public void add(Person person) {
        personList.add(person);

    }

    public List<Person> getPersonList() {
        return personList;
    }

    public static void printPersons(
            List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }
    public static String personString(
            List<Person> roster, CheckPerson tester) {
        String result = "";
        for (Person p : roster) {
            if (tester.test(p)) {
             result += p.toString() + "\n";
            }
        }
        return result.trim();
    }

}
