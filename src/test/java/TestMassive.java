import org.junit.Test;


import static org.junit.Assert.assertArrayEquals;

public class TestMassive {

    @Test
    public void addElement() {
        int[] myMassive = {1, 5, 4, 23, 65, 32, 78};
        int newElement = 112;
        int[] expectedArray = {1, 5, 4, 23, 65, 32, 78, 112};

        int[] returnValue = Massive.addElement(myMassive, newElement);


        assertArrayEquals(expectedArray, returnValue);
    }

    @Test
    public void delLastElement() {
        int[] myMassive = {1, 5, 4, 23, 65, 32, 78};
        int target = 6;
        int[] expectedArray = {1, 5, 4, 23, 65, 32};

        int[] returnValue = Massive.delElement(myMassive, target);


        assertArrayEquals(expectedArray, returnValue);
    }

    @Test
    public void delMidElement() {
        int[] myMassive = {1, 5, 4, 23, 65, 32, 78};
        int target = 3;
        int[] expectedArray = {1, 5, 4, 65, 32, 78};

        int[] returnValue = Massive.delElement(myMassive, target);


        assertArrayEquals(expectedArray, returnValue);
    }

    @Test
    public void delFirstElement() {
        int[] myMassive = {1, 5, 4, 23, 65, 32, 78};
        int target = 0;
        int[] expectedArray = {5, 4, 23, 65, 32, 78};

        int[] returnValue = Massive.delElement(myMassive, target);


        assertArrayEquals(expectedArray, returnValue);
    }

    @Test
    public void addThisElement() {
        int[] myMassive = {1, 5, 4, 23, 65, 32, 78};
        int element = 18;
        int index = 5;

        int[] expectedArray = {1, 5, 4, 23, 65, 18, 32, 78};

        int[] returnValue = Massive.addThisElement(myMassive, element, index);


        assertArrayEquals(expectedArray, returnValue);
    }

    @Test
    public void swapElement() {
        int[] myMassive = {1, 5, 4, 23, 65, 32, 78};
        int firstElementIndex = 0;
        int secondElementIndex = 1;
        int[] expectedArray = {5, 1, 4, 23, 65, 32, 78};

        int[] returnValue = Massive.swapElement(myMassive, firstElementIndex, secondElementIndex);


        assertArrayEquals(expectedArray, returnValue);
    }


}