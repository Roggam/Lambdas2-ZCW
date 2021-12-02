public class Anonymous {

    CheckPerson femaleOlderThan10 = new CheckPerson() {
        @Override
        public boolean test(Person p) {
            if(p.getGender() == Person.Sex.FEMALE & p.getAge() > 10){
                return true;
            }
            return false;
        }
    };
    CheckPerson maleOlderThan20 = new CheckPerson() {
        @Override
        public boolean test(Person p) {
            if(p.getGender() == Person.Sex.MALE & p.getAge() > 20){
                return true;
            }
            return false;
        }
    };

}
