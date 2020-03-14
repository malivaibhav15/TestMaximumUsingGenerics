import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTestCases
{
    @Test
    public void givenIntegers_AtPositionOne_ShouldReturnMaximum()
    {
        Generics findMaximum = new Generics();
        Integer maxNumber = findMaximum.checkMaximum(30,10,20);
        Assert.assertEquals(30,(int)maxNumber);
    }
    @Test
    public void givenIntegers_TwoIntegersSame_ShouldReturnMaximum()
    {
        Generics findMaximum = new Generics();
        Integer maxNumber = findMaximum.checkMaximum(10,30,30);
        Assert.assertEquals(30,(int)maxNumber);
    }
    @Test
    public void givenIntegers_ThreeIntegerssame_ShouldReturnMaximum()
    {
        Generics findMaximum = new Generics();
        Integer maxNumber = findMaximum.checkMaximum(30,30,30);
        Assert.assertEquals(30,(int)maxNumber);
    }

    @Test
    public void givenFloat_AtPositionOne_ShouldReturnMaximum()
    {
        Generics findMaximum = new Generics();
        Float maxNumber = findMaximum.checkMaximum(30.3f,10.01f,20.22f);
        Assert.assertEquals((Float) 30.3f,maxNumber);
    }
    @Test
    public void givenFloat_TwoFloatValuesSame_ShouldReturnMaximum()
    {
        Generics findMaximum = new Generics();
        Float maxNumber = findMaximum.checkMaximum(10.1f,30.20f,30.20f);
        Assert.assertEquals((Float) 30.20f,maxNumber);
    }
    @Test
    public void givenFloat_ThreeFloatValuesSame_ShouldReturnMaximum()
    {
        Generics findMaximum = new Generics();
        Float maxNumber = findMaximum.checkMaximum(30.10f,30.10f,30.10f);
        Assert.assertEquals((Float)30.10f,maxNumber);
    }
    @Test
    public void givenStrings_WhenMaxAtOne_ReturnMaximum() {
        Generics maxString = new Generics();
        String maximum = maxString.checkMaximum("10", "20", "300");
        Assert.assertEquals("300", maximum);
    }

    @Test
    public void givenStrings_WhenMaxAtTwo_ReturnMaximum() {
        Generics maxString = new Generics();
        String maximum = maxString.checkMaximum("1", "700", "30");
        Assert.assertEquals("700", maximum);
    }

    @Test
    public void givenStrings_WhenMaxAtThree_ReturnMaximum() {
        Generics maxString = new Generics();
        String maximum = maxString.checkMaximum("30", "5", "700");
        Assert.assertEquals("700", maximum);
    }

}
