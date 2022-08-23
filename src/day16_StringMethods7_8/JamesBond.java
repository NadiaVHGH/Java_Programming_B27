package day16_StringMethods7_8;

public class JamesBond {
    public static void main(String[] args) {

        /*Given two full names check if the two people are related. They will be considered to be related if they have the same last name
    Input:
        James Bond
        Jamie Bond
    Output:
        Related

    -------------------

    Input:
        James Bond
        Alex Benji
    Output:
        Not Related
         */
     String name1 = "James Bond";
     String name2 = "Jamie Bond";
     String lastName1= name1.substring(name1.length()-4);
     System.out.println(lastName1);
     String lastName2= name2.substring(name2.length()-4);
     System.out.println(lastName2);

     if (lastName1.equalsIgnoreCase(lastName2)){
         System.out.println("They are related.");
     }else{
         System.out.println("Not related");
        }
     String name3 = "Alex Benji";
     String lastname3 = name3.substring(name3.length()-5);
     if(lastName1.equalsIgnoreCase(lastname3)){
         System.out.println("related");
     }else{
         System.out.println("not related");
     }





        /*System.out.println("Enter your full name: ");
        String fName = input.nextLine();
        System.out.println("Enter your friend name: ");
        String sName = input.nextLine();

        if (fName.contains("bond") == sName.contains("bond")) {
            System.out.println("Related");
        }else{
            System.out.println("Not related");
        } */







    }
}
