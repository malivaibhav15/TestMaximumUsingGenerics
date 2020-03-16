import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTestCases
{
    @Test
    public void givenIntegers_AtPositionOne_ShouldReturnMaximum()
    {
        Generics findMaximum = new Generics(10,20,30);
        Integer maxNumber = (Integer) findMaximum.testMaximum();
        Assert.assertEquals(30,(int)maxNumber);
    }
    @Test
    public void givenIntegers_TwoIntegersSame_ShouldReturnMaximum()
    {
        Generics findMaximum = new Generics(10,30,30);
        Integer maxNumber = (Integer) findMaximum.testMaximum();
        Assert.assertEquals(30,(int)maxNumber);
    }
    @Test
    public void givenIntegers_ThreeIntegersSame_ShouldReturnMaximum()
    {
        Generics findMaximum = new Generics(30,30,30);
        Integer maxNumber = (Integer) findMaximum.testMaximum();
        Assert.assertEquals(30,(int)maxNumber);
    }

    @Test
    public void givenFloat_AtPositionOne_ShouldReturnMaximum()
    {
        Generics findMaximum = new Generics(30.3f,10.01f,20.22f);
        Float maxNumber = (Float) findMaximum.testMaximum();
        Assert.assertEquals((Float) 30.3f,maxNumber);
    }
    @Test
    public void givenFloat_TwoFloatValuesSame_ShouldReturnMaximum()
    {
        Generics findMaximum = new Generics(10.1f,30.20f,30.20f);
        Float maxNumber = (Float) findMaximum.testMaximum();
        Assert.assertEquals((Float) 30.20f,maxNumber);
    }
    @Test
    public void givenFloat_ThreeFloatValuesSame_ShouldReturnMaximum()
    {
        Generics findMaximum = new Generics(30.10f,30.10f,30.10f);
        Float maxNumber = (Float) findMaximum.testMaximum();
        Assert.assertEquals((Float)30.10f,maxNumber);
    }
    @Test
    public void givenStrings_WhenMaxAtOne_ReturnMaximum() {
        Generics maxString = new Generics("va", "vai", "vaibhav");
        String maximum = (String) maxString.testMaximum();
        Assert.assertEquals("vaibhav", maximum);
    }

    @Test
    public void givenStrings_WhenMaxAtTwo_ReturnMaximum() {
        Generics maxString = new Generics("va", "vaibhav", "vaibh");
        String maximum = (String) maxString.testMaximum();
        Assert.assertEquals("vaibhav", maximum);
    }

    @Test
    public void givenStrings_WhenMaxAtThree_ReturnMaximum() {
        Generics maxString = new Generics("vaibh", "vai", "vaibhav");
        String maximum = (String) maxString.testMaximum();
        Assert.assertEquals("vaibhav", maximum);
    }
    @Test
    public <E> void givenThreeGeneric_WhenProper_ShoulReturnMaximum() {
        Generics FindMaximum = new Generics("vaibhav","1995","p");
        E maximumGeneric = (E) FindMaximum.testMaximum();
        Assert.assertEquals("vaibhav",maximumGeneric);
    }
}
