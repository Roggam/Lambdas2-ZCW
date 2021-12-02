import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Leon", LocalDate.now(), Person.Sex.MALE, "@hotmail.com");
        Person person2 = new Person("Mary", LocalDate.now(), Person.Sex.FEMALE, "@hotmail.com");
        Person person3 = new Person("Dolio", LocalDate.of(1995, 06, 07), Person.Sex.MALE, "@hotmail.com");

        CheckPerson localClass = new LocalClass();
        Lambda lambda = new Lambda();
        Anonymous anonymous = new Anonymous();

        MetaApp metaApp = new MetaApp();

        metaApp.add(person);
        metaApp.add(person2);
        metaApp.add(person3);

        MetaApp.printPersons(metaApp.getPersonList(), anonymous.maleOlderThan20);

    }
}
