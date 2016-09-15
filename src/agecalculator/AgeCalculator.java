package agecalculator;

import java.util.Date;

public class AgeCalculator {

    public static void main(String[] args) {
        Person person = new Person("Carlos", new Date(94,12,31));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años ");
    }
}
