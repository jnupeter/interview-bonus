package cai.peter.interview.bonus;

/**
 * Created by peter on 14/02/17.
 */
public class Band5 extends Performance {

    public Band5(String start, String end, int priority){
        super("band5", start, end, priority);
    }

    @Override
    public int[] showInArray() {
        int[] result = new int[180];
        for (int i = 90; i < 120; i++) { //"8:30pm", "9:00pm"
            result[i] = this.getPriority();
        }
        return result;
    }
}
