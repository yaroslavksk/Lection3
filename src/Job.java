import java.util.LinkedList;
import java.util.Iterator;

public class Job implements Iterable<Job>{


    private LinkedList<String> jobs = new LinkedList<>();

    public void AddJob(String Name) {
        jobs.add(Name);
    }

    @Override
    public Iterator<Job> iterator() {
        return new Iterator<Job>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index<jobs.size();
            }

            @Override
            public Job next() {
                index++;
                return null;
                //return jobs.get(index++); //как привести к типу? ошибка mismath
            }
        };
    }
}
