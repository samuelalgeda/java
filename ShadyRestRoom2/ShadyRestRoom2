import java.util.Scanner;

public class ShadyRestRoom2 {
    public static void main(String[] args) {
        int selection;
        int selection2;
        int price;
        String result;
        final int QUEEN = 1, KING = 2, SUITE = 3;
        final int QPRICE = 125, KPRICE = 139, SPRICE = 165;
        final int LAKE = 1, PARK = 2;
        final String QSTRING = "Queen bed", KSTRING = "King bed",
                SSTRING = "Suite with a king bed and pull-out couch",
                INVALIDSTRING = "an invalid option";

        final String KKing = " a lake view";
        final String PPark = " a park view";

        Scanner in = new Scanner(System.in);

        System.out.println("\t\n\nMenu\n");
        System.out.println("(" + QUEEN + ") " + QSTRING);
        System.out.println("(" + KING + ") " + KSTRING);
        System.out.println("(" + SUITE + ") " + SSTRING);
        System.out.print("Enter Selection (1, 2, or 3) >> ");
        selection = in.nextInt();

        System.out.println("Please choose a view:");
        System.out.println("(" + LAKE + ")" + KKing);
        System.out.println("(" + PARK + ")" + PPark);
        selection2 = in.nextInt();

        if (selection == QUEEN && selection2 == LAKE) {
            result = QSTRING + KKing;
            price = QPRICE + 15;
        } else if (selection == QUEEN && selection2 == PARK) {
            result = QSTRING + PPark;
            price = QPRICE ;
        } else if (selection == KING && selection2 == LAKE) {
            result = KSTRING + KKing;
            price = KPRICE + 15;
        } else if (selection == KING && selection2 == PARK) {
            result = KSTRING + PPark;
            price = KPRICE + 15;
        } else if (selection == SUITE && selection2 == LAKE) {
            result = SSTRING + KKing;
            price = SPRICE + 15;
        } else if (selection == SUITE && selection2 == PARK) {
            result = SSTRING + PPark;
            price = SPRICE + 15;
        } else {
            result = INVALIDSTRING;
            price = 140;
        }

        System.out.println("You selected " + result + "  $" + price);
    }
}
