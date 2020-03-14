public class Generics
{
    public static int maximumNumber(Integer number1 , Integer number2 , Integer number3)
    {
        Integer maximum = Math.max(number1,number2);
        if (maximum > number3)
            return maximum;
        else
            return number3;

    }
}
