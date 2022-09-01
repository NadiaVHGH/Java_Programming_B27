package day41_exceptions.season;

public class Summer extends Season {
    /*Create a class Summer

	child class of Season

	constructor: set values to variables

	methods:
		activity(): Drink Lemonade
     */

    public Summer( double highestTemp, double lowestTemp) {
        super("Summer", highestTemp, lowestTemp);
    }


    @Override
    public void activity() {
        System.out.println("Drink lemonade");
    }
}
