package cai.peter.interview.bonus;

/**
 * Created by peter on 13/02/17.
 */
public class Band1 extends Performance {

    public Band1(String start, String end, int priority){
        super("band1", start, end, priority);
    }

    /**
     * here not actually parsing start time and end time to populate the array, use hard-coded value instead
     * @return
     */
    @Override
    public int[] showInArray() {
        int[] result = new int[180];
        for (int i =0; i< 30; i++) { //from "7:01pm" to "7:30pm"
            result[i] = this.getPriority();
        }
        return result;
    }
}
