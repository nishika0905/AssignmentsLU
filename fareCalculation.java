
import java.util.Scanner;

class Uber {
    int fare; // fare of the ride
    int distanceTravelled; // distance travelled by rider

    // default constructor
    public Uber() {
        fare = 30;
    }

    // parameterized constructor
    public Uber(int amount) {
        /* amount=extra amount of the cab rider */

        fare = amount;
    }

    void showFare() {
        System.out.println("Total Fare: Rs. " + fare);
    }
}

class Rider {
    public static void main(String[] args) {
        int cabDistance;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the cab distance from user: ");

        cabDistance = sc.nextInt();

        if (cabDistance > 5) {
            Uber object = new Uber(30 + 10 * (cabDistance - 5));
            System.out.print("Enter the distance travelled: ");

            object.distanceTravelled = sc.nextInt();

            object.fare = object.fare + 10 * object.distanceTravelled;
            object.showFare();

        } else {
            Uber object = new Uber();
            System.out.print("Enter the distance traveeled: ");
            object.distanceTravelled = sc.nextInt();

            object.fare = object.fare + 10 * object.distanceTravelled;

            object.showFare();

        }
    }
}