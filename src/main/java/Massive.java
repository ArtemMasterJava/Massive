
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

    public static int[] delElement(int[] myMassive, int target) {
        int[] newMassive = new int[myMassive.length-1];
        System.arraycopy(myMassive, target+1, newMassive, target,newMassive.length);

        return newMassive;
    }

    public static int[] addThisElement(int[] myMassive) {
        int[] newMassive = new int[myMassive.length+1];


        return newMassive;
    }

    public static int[] swapElement(int[] myMassive, int firstElementIndex, int secondElementIndex) {
        int[] newMassive = new int[myMassive.length];
        System.arraycopy(myMassive, 0, newMassive, 0, myMassive.length);
        int temp = newMassive[firstElementIndex];
        newMassive[firstElementIndex]=newMassive[secondElementIndex];
        newMassive[secondElementIndex]=temp;


        return newMassive;
    }
}
