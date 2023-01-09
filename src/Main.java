import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Personal personal = new Personal();
        personal.addUser(new User("Ivan","Ivanov",25))
                .addUser(new User("Sasha","Petrova",19))
                .addUser(new User("Anton","Krutov",50))
                .addUser(new User("Ivan","Ivanov",26));

        User bigBoss = new User(personal,"Vasiliy","Pupkin",22);

        Personal personal2 = new Personal();
        personal2.addUser(new User("Vova","Anonimov",57));
        User smallBoss = new User(personal2,"Aleksandr","Makedonskiy",71);
        personal.addUser(smallBoss);

        for (User item : personal) {
            System.out.println(item);
            
        }

        System.out.println("____________________");
        Collections.sort(personal.getUsers());

        personal.forEach(System.out::println);

        System.out.println("----------------------");

        Company company = new Company(bigBoss);
        for (User item:company) {
            System.out.println(item);
        }
        System.out.println("-------------------");

        Job job = new Job();
        job.AddJob("Работа");
        for (Job item : job) {
            System.out.println(item);
        }
    }
}