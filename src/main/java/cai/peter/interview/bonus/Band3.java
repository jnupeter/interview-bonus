package cai.peter.interview.bonus;

/**
 * Created by peter on 14/02/17.
 */
public class Band3 extends Performance {

    public Band3(String start, String end, int priority){
        super("band3", start, end, priority);
    }

    @Override
    public int[] showInArray() {
        int[] result = new int[180];
        for (int i = 45; i < 65; i++) { //"7:46pm", "8:05pm"
            result[i] = this.getPriority();
        }
        return result;
    }
}
