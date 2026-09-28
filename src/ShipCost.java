import java.util.Scanner;

import static java.lang.System.in;

public class ShipCost {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
        int ShipingCost = 0;
        double shippingCost= 0.2;

        System.out.println("Whats the price of the item?");
        int cost = in.nextInt();
        in.nextLine(); //clear the buffer
        if (cost >= 100.0) {
            shippingCost = 0.0;
        } else {
            shippingCost = cost * 0.02; // 2% shipping fee
        }
        double totalPrice = cost + shippingCost;
        System.out.printf("Shipping Cost: "+ shippingCost);
        System.out.printf(" Total Price: "+totalPrice);
    }
}