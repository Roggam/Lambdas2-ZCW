public class Lambda {
    CheckPerson maleOlderThan20 = p -> p.gender == Person.Sex.MALE && p.getAge() > 20;
    CheckPerson femaleYoungerThan15 = p -> p.gender == Person.Sex.FEMALE && p.getAge() < 15;
    CheckPerson olderThan25 = p ->  p.getAge() > 25;


}
