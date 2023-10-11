package day01_loop;

public class MultiTask {
    public static void main(String[] args) {

        String word = "autumn is coming";
        // a u t u m n

        String result = word.charAt(0) + " " + word.charAt(1) + " " + word.charAt(2) + " " + word.charAt(3) + " " + word.charAt(4) + word.charAt(5);

        for (int i = 0; i < word.length(); i++) {

            System.out.print(word.charAt(i) + " ");

        }

        for (int i = 0; i < word.length(); i++) {

            result += word.charAt(i) + " ";
        }
        System.out.print(result);


        // print  reverse
        for (int i = word.length()-1; i > 0; i--) {
            System.out.println(word.charAt(i));

        }
        //print only first word "autumn"
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' '){
                break; // use also with continue
            }
            System.out.println(word.charAt(i));
////I created a new branch
        }

    }
}
