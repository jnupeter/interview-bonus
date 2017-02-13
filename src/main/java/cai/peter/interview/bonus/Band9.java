package cai.peter.interview.bonus;

/**
 * Created by peter on 14/02/17.
 */
public class Band9 extends Performance {

    public Band9(String start, String end, int priority){
        super("band9", start, end, priority);
    }

    @Override
    public int[] showInArray() {
        int[] result = new int[180];
        for (int i = 150; i < 170; i++) { //"9:30pm", "9:50pm"
            result[i] = this.getPriority();
        }
        return result;
    }
}
