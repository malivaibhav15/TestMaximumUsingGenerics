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

    @Test
    public void givenFloat_AtPositionOne_ShouldReturnMaximum()
    {
        Generics findMaximum = new Generics();
        Float maxNumber = findMaximum.maximumNumber(30.3f,10.01f,20.22f);
        Assert.assertEquals((Float) 30.3f,maxNumber);
    }
    @Test
    public void givenFloat_TwoIntegersSame_ShouldReturnMaximum()
    {
        Generics findMaximum = new Generics();
        Float maxNumber = findMaximum.maximumNumber(10.1f,30.20f,30.20f);
        Assert.assertEquals((Float) 30.20f,maxNumber);
    }
    @Test
    public void givenFloat_ThreeIntegerssame_ShouldReturnMaximum()
    {
        Generics findMaximum = new Generics();
        Float maxNumber = findMaximum.maximumNumber(30.10f,30.10f,30.10f);
        Assert.assertEquals((Float)30.10f,maxNumber);
    }

}
