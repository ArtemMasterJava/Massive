
/**
 * Created by USER on 27.07.2015.
 */
public class Massive {


    public static int[] addElement(int[] myMassive, int newElement) {
        int[] newMassive = new int[myMassive.length + 1];
        System.arraycopy(myMassive, 0, newMassive, 0, myMassive.length);
        newMassive[newMassive.length - 1] = newElement;


        return newMassive;
    }
}
