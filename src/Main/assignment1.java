package Main;

import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double time;
        double g = 9.8;
        double speed, distance;
        time = input.nextFloat();
        speed = g * time;
        distance = 0.5 * g * time * time;
        System.out.println("The speed of the object at " + time + " seconds after its release is " + speed + " and the distance the object has travelled in the " + time + " seconds after the relase is " + distance);
    }


}
