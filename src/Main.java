import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Анна", "Малышева иль-до dsa dds", 13));
        people.add(new Person("Александр", "Малышева dsa dsa ds", 24));
        people.add(new Person("Мирон", "Малышева иль-до", 54));
        people.add(new Person("Мария", "Карпова", 34));
        people.add(new Person("Василиса", "Иванво иль dsa dsa ds", 43));
        System.out.println(people);
        Collections.sort(people, new PersonComparator());
        System.out.println(people);
    }
}
