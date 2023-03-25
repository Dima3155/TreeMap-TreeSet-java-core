import java.util.Comparator;
public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o2.getSurname().split("[- ]").length - o1.getSurname().split("[- ]").length == 0)
            return o2.getAge() - o1.getAge();
        else
            return o2.getSurname().split("[- ]").length - o1.getSurname().split("[- ]").length;
    }
}

