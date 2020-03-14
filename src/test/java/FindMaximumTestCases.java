import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTestCases
{
    @Test
    public void givenIntegers_AtPositionOne_ShouldReturnMaximum()
    {
        Generics findMaximum = new Generics();
        Integer maxNumber = (Integer) findMaximum.testMaximum(10,20,30);
        Assert.assertEquals(30,(int)maxNumber);
    }
    @Test
    public void givenIntegers_TwoIntegersSame_ShouldReturnMaximum()
    {
        Generics findMaximum = new Generics();
        Integer maxNumber = (Integer) findMaximum.testMaximum(10,30,30);
        Assert.assertEquals(30,(int)maxNumber);
    }
    @Test
    public void givenIntegers_ThreeIntegersSame_ShouldReturnMaximum()
    {
        Generics findMaximum = new Generics();
        Integer maxNumber = (Integer) findMaximum.testMaximum(30,30,30);
        Assert.assertEquals(30,(int)maxNumber);
    }

    @Test
    public void givenFloat_AtPositionOne_ShouldReturnMaximum()
    {
        Generics findMaximum = new Generics();
        Float maxNumber = (Float) findMaximum.testMaximum(30.3f,10.01f,20.22f);
        Assert.assertEquals((Float) 30.3f,maxNumber);
    }
    @Test
    public void givenFloat_TwoFloatValuesSame_ShouldReturnMaximum()
    {
        Generics findMaximum = new Generics();
        Float maxNumber = (Float) findMaximum.testMaximum(10.1f,30.20f,30.20f);
        Assert.assertEquals((Float) 30.20f,maxNumber);
    }
    @Test
    public void givenFloat_ThreeFloatValuesSame_ShouldReturnMaximum()
    {
        Generics findMaximum = new Generics();
        Float maxNumber = (Float) findMaximum.testMaximum(30.10f,30.10f,30.10f);
        Assert.assertEquals((Float)30.10f,maxNumber);
    }
    @Test
    public void givenStrings_WhenMaxAtOne_ReturnMaximum() {
        Generics maxString = new Generics();
        String maximum = (String) maxString.testMaximum("va", "vai", "vaibhav");
        Assert.assertEquals("vaibhav", maximum);
    }

    @Test
    public void givenStrings_WhenMaxAtTwo_ReturnMaximum() {
        Generics maxString = new Generics();
        String maximum = (String) maxString.testMaximum("va", "vaibhav", "vaibh");
        Assert.assertEquals("vaibhav", maximum);
    }

    @Test
    public void givenStrings_WhenMaxAtThree_ReturnMaximum() {
        Generics maxString = new Generics();
        String maximum = (String) maxString.testMaximum("vaibh", "vai", "vaibhav");
        Assert.assertEquals("vaibhav", maximum);
    }

}
