public class LocalClass implements CheckPerson{
    @Override
    public boolean test(Person p) {
        if(p.getGender() == Person.Sex.MALE && p.getAge() > 25) {
            return true;
        }
        return false;
    }
}
