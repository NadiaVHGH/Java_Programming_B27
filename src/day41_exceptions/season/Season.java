package day41_exceptions.season;

public class Season {
    /*Create a class Season

	instance variables
		- name (String)
		- highest average temperature
		- lowest average temperature

	constructor:
		- initialize all fields

	methods:
		- activity(), toString()

		override activity in sub classes
     */

    String name;
    double highestTemp;
    double lowestTemp;

    public Season(String name, double highestTemp, double lowestTemp) {
        this.name = name;
        this.highestTemp = highestTemp;
        this.lowestTemp = lowestTemp;
    }

    public void activity(){
        System.out.println("GENERIC SEASON");
    }

    public String toString(){
        return name + " season with the highest temperature of " + highestTemp + " and a lowest temperature of " + lowestTemp;
    }
}
