public class X6IcrementDecrement {
    public static void main(String[] args) {

        int lives = 5;
        lives = lives - 1;
        System.out.println(lives);

        lives--;//decrement
        System.out.println(lives); //3

        lives++; //increment
        System.out.println(lives); //4

        // Pre increment
        // Win a gift of 100 points for each win life
        // First increment then assign
        int gift = 100 + ++lives;
        System.out.println(gift); //105
        System.out.println(lives); //5

        // Post increment
        // Win a gift of 100 points for each win life
        // First assign then increment
        gift = 100 + lives++;
        System.out.println(gift); //105
        System.out.println(lives); //6

    }
}