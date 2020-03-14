public class Generics <E extends Comparable> {
    E firstValue;
    E secondValue;
    E thirdValue;

    //PARAMETERISED CONSTRUCTOR
    public Generics(E firstValue, E secondValue, E thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    public Generics() {

    }

    //METHOD TO COMPARE GENERIC PARAMETERS AND RETURN MAXIMUM

    public <E extends Comparable> E testMaximum(E firstValue, E secondValue, E thirdValue) {
        if (firstValue.compareTo(secondValue) >= 0 && firstValue.compareTo(thirdValue) >= 0) {
            return (E) firstValue;
        } else if (secondValue.compareTo(firstValue) >= 0 && secondValue.compareTo(thirdValue) >= 0) {
            return (E) secondValue;
        } else {
            return (E) thirdValue;
        }
    }
    //METHOD OVERRIDE TO INITIALISE THE PARAMETERS
    public E testMaximum ()
    {
        return testMaximum(firstValue, secondValue, thirdValue);
    }
}
