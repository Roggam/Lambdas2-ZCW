import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LambdaTest {
    @Test
    public void lambdaTest1(){
        //given
        MetaApp metaApp = new MetaApp();
        Lambda lambda = new Lambda();
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
        String actual = MetaApp.personString(metaApp.getPersonList(), lambda.maleOlderThan20) ;
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void lambdaTest2(){
        //given
        MetaApp metaApp = new MetaApp();
        Lambda lambda = new Lambda();
        Person leon = new Person("Leon",
                LocalDate.of(1993, 01, 01),
                Person.Sex.MALE, "leon@hotmail.com");
        Person dolio = new Person("Dolio",
                LocalDate.of(2021, 01, 01),
                Person.Sex.MALE, "dolio@hotmail.com");
        Person mary = new Person("Mary",
                LocalDate.of(2015, 01, 01),
                Person.Sex.FEMALE, "mary@hotmail.com");

        String expected = "Person{name='Mary', " +
                "birthday=2015-01-01, " +
                "gender=FEMALE, " +
                "emailAddress='mary@hotmail.com'}";
        //when
        metaApp.add(leon);
        metaApp.add(dolio);
        metaApp.add(mary);
        String actual = MetaApp.personString(metaApp.getPersonList(), lambda.femaleYoungerThan15) ;
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void lambdaTest3(){
        //given
        MetaApp metaApp = new MetaApp();
        Lambda lambda = new Lambda();
        Person leon = new Person("Leon",
                LocalDate.of(1993, 01, 01),
                Person.Sex.MALE, "leon@hotmail.com");
        Person dolio = new Person("Dolio",
                LocalDate.of(2021, 01, 01),
                Person.Sex.MALE, "dolio@hotmail.com");
        Person mary = new Person("Mary",
                LocalDate.of(1990, 01, 01),
                Person.Sex.FEMALE, "mary@hotmail.com");

        String expected = "Person{name='Leon', birthday=1993-01-01, " +
                "gender=MALE, emailAddress='leon@hotmail.com'}\n" +

                "Person{name='Mary', birthday=1990-01-01, " +
                "gender=FEMALE, emailAddress='mary@hotmail.com'}";
        //when
        metaApp.add(leon);
        metaApp.add(dolio);
        metaApp.add(mary);
        String actual = MetaApp.personString(metaApp.getPersonList(), lambda.olderThan25) ;
        //then
        Assert.assertEquals(expected,actual);
    }


}
