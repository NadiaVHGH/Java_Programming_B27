package day12_Switch;

public class HW_Elevator {
    public static void main(String[] args) {
        /*
        add new class Elevator
declare and assign a floor number variable. The floor number represent which floor you want the elevator to go to. After getting to each floor show the information of which companies are on that floor. Use the following data:
	floor 1 --> Lobby, StarBucks, Amazon Pick Up
	floor 2 --> NASA, Cydeo, Discover
	floor 3 --> Uber, Lyft, Chase
	floor 4 --> Rooftop, Lounge
	any other floor value --> Invalid Floor Selected
         */
        String floor = "2";
        switch (floor){
            default:
            System.out.println("Invalid Floor Selected, should go 1 to 4");
            break;
            case "1":
                System.out.println("Lobby, StarBucks, Amazon Pick Up");
                break;
            case "2":
                System.out.println("NASA, Cydeo, Discover");
                break;
            case "3":
                System.out.println("Uber, Lyft, Chase");
                break;
            case "4":
                System.out.println("Rooftop, Lounge");
                break;
        }
        /*
         int floor = 2;
        String companies;

        switch (floor){

            case 1:
                companies = "Lobby, StarBucks, Amazon Pick Up";
                break; // stops the switch
            case 2:
                companies = "NASA, Cydeo, Discover";
                break; // stops the switch
            case 3:
                companies = "Uber, Lyft, Chase";
                break; // stops the switch
            case 4:
                companies = "Rooftop, Lounge";
                break; // stops the switch
            default: // defined anywhere in the switch, but it will be the case executed if no other case matches
                companies = "Invalid Floor Selected";
        }

        System.out.println("Floor " + floor + ": " + companies);
         */



    }
}
