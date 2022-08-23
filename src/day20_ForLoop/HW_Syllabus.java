package day20_ForLoop;

public class HW_Syllabus {
    public static void main(String[] args) {

        /*Syllables
        Given a String separated by dashes calculate how many syllables the words are
        Ex:
        Input:
        ja-va
        Output:
        2*/

        String word = "ba-na-na";
        int syllabus = 0;

        for(int i = 0; i < word.length(); i++ ){
            if(word.charAt(i) == '-'){
                syllabus++;
            }

        }
        System.out.println(syllabus);

    }
}
