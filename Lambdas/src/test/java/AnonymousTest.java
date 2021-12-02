import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class AnonymousTest {
    @Test
    public void anonymousTest1(){
        //given
        MetaApp metaApp = new MetaApp();
       Anonymous anonymous = new Anonymous();
        Person leon = new Person("Leon",
                LocalDate.of(1993, 01, 01),
                Person.Sex.MALE, "leon@hotmail.com");
        Person dolio = new Person("Dolio",
                LocalDate.of(2021, 01, 01),
                Person.Sex.MALE, "dolio@hotmail.com");
        Person mary = new Person("Mary",
                LocalDate.of(2010, 01, 01),
                Person.Sex.FEMALE, "mary@hotmail.com");

        String expected = "Person{name='Mary', " +
                "birthday=2010-01-01, " +
                "gender=FEMALE, " +
                "emailAddress='mary@hotmail.com'}";
        //when
        metaApp.add(leon);
        metaApp.add(dolio);
        metaApp.add(mary);
        String actual = MetaApp.personString(metaApp.getPersonList(), anonymous.femaleOlderThan10) ;
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void anonymousTest2(){
        //given
        MetaApp metaApp = new MetaApp();
        Anonymous anonymous = new Anonymous();
        Person leon = new Person("Leon",
                LocalDate.of(1993, 01, 01),
                Person.Sex.MALE, "leon@hotmail.com");
        Person dolio = new Person("Dolio",
                LocalDate.of(2021, 01, 01),
                Person.Sex.MALE, "dolio@hotmail.com");
        Person mary = new Person("Mary",
                LocalDate.of(2010, 01, 01),
                Person.Sex.FEMALE, "mary@hotmail.com");

        String expected = "Person{name='Leon', " +
                "birthday=1993-01-01, " +
                "gender=MALE, " +
                "emailAddress='leon@hotmail.com'}";
        //when
        metaApp.add(leon);
        metaApp.add(dolio);
        metaApp.add(mary);
        String actual = MetaApp.personString(metaApp.getPersonList(), anonymous.maleOlderThan20);
        //then
        Assert.assertEquals(expected,actual);
    }

}
