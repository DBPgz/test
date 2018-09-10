import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {
    @Test
    public void test1plus1()
    {
        // AAA
        //  Arrange = Organiser
        int arg1 = 1;
        int arg2 = 1;
        int expectedResult = 2;


        //Act = Action
        int returnedResult = Calculator.add(arg1, arg2);

        //Assert = Verifier
        Assert.assertEquals(expectedResult,returnedResult);

    }
    @Test  (expected =IndexOutOfBoundsException.class)// Pour le cas "MAX+1" = MIN (reflection de manière cyclique)
    public void testMax()
    {
        // AAA
        //  Arrange = Organiser
        int arg1 = Integer.MAX_VALUE;  //  Integer.MAX_VALUE =  2147483647
        int arg2 = 1;



        //Act = Action
        int returnedResult = Calculator.add(arg1, arg2);


    }

    @Test  (expected =IndexOutOfBoundsException.class)// Pour le cas "MIN+(-1)" = MAX
    public void testMin()
    {
        // AAA
        //  Arrange = Organiser
        int arg1 = Integer.MIN_VALUE;  // Integer.MIN_VALUE = -2147483648
        int arg2 = -1;



        //Act = Action
        int returnedResult = Calculator.add(arg1, arg2);


    }
}
