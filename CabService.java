import java.util.Scanner;

public class CabService {
    // declearation of instance variables
    String cartype;
    double km;
    double bill;

    CabService() { // constructer
        cartype = "";
        km = bill = 0.0;
    }
    // method
    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enther the type of the car : ac/ non-ac ");
        cartype = sc.nextLine();
        System.out.println("enter the km travelled: ");
        km = sc.nextDouble();
    }
    void calculate() {
        if (cartype.equals("ac")) {
            if (km <= 5) {
                bill = 120;
            } else {
                bill = 150 + (km - 5) * 10; //doubt
            }
        } else if (cartype.equals("non-ac")) {
            if (km <= 5) {
                bill = 120;
            } else {
                bill = 120 + (km - 5) * 8;
            }
        } else {
            System.out.println("invalid choice");
        }
    }
    void display() {
        System.out.println("car type: " + cartype);
        System.out.println("km travelled: " + km);
        System.out.println("bill: " + bill);
    }

    public static void main(String[] args) {
        CabService obj = new CabService(); // creating an object od class cabservice
        obj.accept();
        obj.calculate();
        obj.display();

    }


            }
        


