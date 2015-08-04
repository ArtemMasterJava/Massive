
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
        int[] newMassive = new int[myMassive.length ];
        for (int i = 0; i < myMassive.length; i++) {
            if (target!=i) {
                newMassive[i] = myMassive[i];
            }
        }
        int[] result = new int[newMassive.length -1];
        for (int i = 0; i < result.length; i++) {
            if(newMassive[i]!=0){
                result[i]= newMassive[i];
            }
        }

        return result;
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
