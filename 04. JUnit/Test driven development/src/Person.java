public class Person {
    // Do not change these fields
    public static final String DEFAULT_NAME = "Unknown";
    public static final int MAX_AGE = 130;
    public static final int MIN_AGE = 0;
    private String name;
    private int age;

    // Fix the constructor to make its code pass the unit tests
    Person(String name, int age) {
        this.name = testPersonCreationNameNull(name);
        this.age = testPersonCreationValidArgs(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String testPersonCreationNameNull(String name){
        if (name == null || name.trim().equals("")){
            return DEFAULT_NAME;
        }else {
            return name;
        }
    }

    public int testPersonCreationValidArgs(int age) {
        if (MAX_AGE < age) {
            return MAX_AGE;
        } else {
            if (age > 0) {
                return age;
            } else {
                return MIN_AGE;
            }
        }
    }
}

//import org.junit.Test;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotNull;
//
//public class PersonTest {
//    @Test
//    public void testPersonCreationValidArgs() {
//        String name = "Jane Doe";
//        int age = Person.MIN_AGE + 23;
//        Person person = new Person(name, age);
//
//        assertEquals(name, person.getName());
//        assertEquals(age, person.getAge());
//    }
//
//    @Test
//    public void testPersonCreationNegativeAge() {
//        String name = "Jane Doe";
//        int age = Person.MIN_AGE - 1;
//        Person person = new Person(name, age);
//
//        assertEquals(Person.MIN_AGE, person.getAge());
//    }
//
//    @Test
//    public void testPersonCreationAgeOverUpperLimit() {
//        String name = "Jane Doe";
//        int age = Person.MAX_AGE + 1;
//        Person person = new Person(name, age);
//
//        assertEquals(Person.MAX_AGE, person.getAge());
//    }
//
//    @Test
//    public void testPersonCreationNameNull() {
//        String name = null;
//        int age = Person.MIN_AGE + 1;
//        Person person = new Person(name, age);
//
//        assertNotNull(person.getName());
//        assertEquals(Person.DEFAULT_NAME, person.getName());
//    }
//
//    @Test
//    public void testPersonCreationNameBlank() {
//        String name = "\t";
//        int age = Person.MIN_AGE + 1;
//        Person person = new Person(name, age);
//
//        assertEquals(Person.DEFAULT_NAME, person.getName());
//    }
//
//    @Test
//    public void testPersonCreationNameEmpty() {
//        String name = "";
//        int age = Person.MIN_AGE + 1;
//        Person person = new Person(name, age);
//
//        assertEquals(Person.DEFAULT_NAME, person.getName());
//    }
//}
