import org.junit.Test;


import static org.junit.Assert.assertArrayEquals;

public class TestMassive {

    @Test
    public void addElement() {
        int[] myMassive = {1, 5, 4, 23, 65, 32, 78};
        int  newElement = 112;
        int[] expectedArray = {1, 5, 4, 23, 65, 32, 78, 112};

        int[] returnValue = Massive.addElement(myMassive,newElement);

        

        assertArrayEquals(expectedArray, returnValue);
    }
}