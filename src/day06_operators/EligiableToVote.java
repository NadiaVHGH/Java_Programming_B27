package day06_operators;

public class EligiableToVote {
    public static void main(String[] args) {
         int age = 21;
         boolean isCitizen = true;
         boolean hasCriminalBackground = false;
         boolean over18 = age>=18;

         boolean isEligible = isCitizen && over18 && !hasCriminalBackground;
         /*
          int age = 21;
         boolean isCitizen = true;
         boolean hasCriminalBackground = false;
         boolean over18 = age>=18;

         isCitizen  && over18 && !hasCriminalBackground;
         true       &&  true  && !false
         true       &&  true      true
              true   &&   true
                    true

         int age = 21;
         boolean isCitizen = true;
         boolean hasCriminalBackground = false;
         boolean over18 = age>=18;


          */

    }
}
