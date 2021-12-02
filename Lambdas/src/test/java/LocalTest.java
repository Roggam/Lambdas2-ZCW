import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LocalTest {
    @Test
    public void localTest() {
        //given
        MetaApp metaApp = new MetaApp();
        CheckPerson localClass = new LocalClass();

        Person leon = new Person("Leon",
                LocalDate.of(1993, 01, 01),
                Person.Sex.MALE, "leon@hotmail.com");
        Person dolio = new Person("Dolio",
                LocalDate.of(2021, 01, 01),
                Person.Sex.MALE, "@hotmail.com");

        String expected = "Person{name='Leon', " +
                "birthday=1993-01-01, " +
                "gender=MALE, " +
                "emailAddress='leon@hotmail.com'}";
        //when
        metaApp.add(leon);
        metaApp.add(dolio);
       String actual = MetaApp.personString(metaApp.getPersonList(), localClass) ;
        //then
        Assert.assertEquals(expected,actual);

    }


}
