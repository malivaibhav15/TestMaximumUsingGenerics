import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTestCases
{
    @Test
    public void givenIntegers_AtPositionOne_ShouldReturnMaximum()
    {
        Generics findMaximum = new Generics();
        Integer maxNumber = findMaximum.maximumNumber(30,10,20);
        Assert.assertEquals(30,(int)maxNumber);
    }
    @Test
    public void givenIntegers_TwoIntegersSame_ShouldReturnMaximum()
    {
        Generics findMaximum = new Generics();
        Integer maxNumber = findMaximum.maximumNumber(10,30,30);
        Assert.assertEquals(30,(int)maxNumber);
    }
    @Test
    public void givenIntegers_ThreeIntegerssame_ShouldReturnMaximum()
    {
        Generics findMaximum = new Generics();
        Integer maxNumber = findMaximum.maximumNumber(30,30,30);
        Assert.assertEquals(30,(int)maxNumber);
    }


}
