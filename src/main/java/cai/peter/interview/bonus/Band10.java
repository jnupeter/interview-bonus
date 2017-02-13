package cai.peter.interview.bonus;

/**
 * Created by peter on 14/02/17.
 */
public class Band10 extends Performance {

    public Band10(String start, String end, int priority){
        super("band10", start, end, priority);
    }

    @Override
    public int[] showInArray() {
        int[] result = new int[180];
        for (int i = 31; i < 60; i++) { //"7:31pm", "8:00pm"
            result[i] = this.getPriority();
        }
        return result;
    }
}
