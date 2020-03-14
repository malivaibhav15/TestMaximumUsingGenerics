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
    public static float maximumNumber(Float number1 , Float number2 , Float number3)
    {
        Float maximum = Math.max(number1,number2);
        if (maximum > number3)
            return maximum;
        else
            return number3;

    }
}
