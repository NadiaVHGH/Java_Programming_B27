package day27_FirstMethod;

public class HW_EligiableToVote {
    public static void eligibleToVote(int age){
        if (age >= 18){
            System.out.println("You're eligible to vote");
        }else{
            System.out.println("You're not eligible to vote");
        }
    }

    public static void main(String[] args) {
        eligibleToVote(18);
        eligibleToVote(12);
        eligibleToVote(29);
    }
    /*public static void eligibleToVote(int age ){
     if(age >= 18){
         System.out.println("eligible to vote");
     }else{
         System.out.println("not eligible to vote");
     }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int Archie = scan.nextInt();
        eligibleToVote(Archie);
     */









}
