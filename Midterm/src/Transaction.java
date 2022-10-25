import java.util.Scanner;
public class Transaction extends Market {
    public static void main(String[] args) {
        Market goodyandfresh = new Market();

        Scanner sc = new Scanner(System.in);

        System.out.println(" -------------------------------------------------------- ");
        System.out.println(" |                 GOODY & FRESH MARKET                 | ");
        System.out.println(" -------------------------------------------------------- ");
        System.out.println(" | Available Fruits:                        Price:      | ");
        System.out.println(" |                    Apple      :          10          | ");
        System.out.println(" |                    Grapes     :          15          | ");
        System.out.println(" |                    Mango      :          30          | ");
        System.out.println(" |                    Orange     :          20          | ");
        System.out.println(" |                    Banana     :          25          | ");
        System.out.println(" -------------------------------------------------------- ");
//------------------------customer no.
        double[] numbers = new double[5];

        for (int i = 1; i < numbers.length; i++) {
            System.out.println("Customer No: ");
            numbers[i] = sc.nextDouble();
            System.out.println("_____________________________________________________");

//----------------------------customer name
            Scanner cusName = new Scanner(System.in);
            System.out.println("Customer Name: ");
            String name = cusName.nextLine();
            System.out.println("CUSTOMER: " + name);
            System.out.println("_____________________________________________________");


///chosen fruit
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the available Fruit listed above: ");
            String fruit = input.nextLine();
            System.out.println("You entered: " + fruit);



//Price
            Scanner price = new Scanner(System.in);
            System.out.println("Enter Price: ");
            int prc = sc.nextInt();
            System.out.println("The price of " + fruit + " is " + prc);

///Quantity
            Scanner quantity = new Scanner(System.in);
            System.out.println("Quantity: ");
            int quan = sc.nextInt();
            System.out.println("Quantity of " + fruit + " is: " + quan);

            //sc.close();//closing the scanner class
//TOTAL
            int total = prc * quan;
            System.out.println("---------------------------------------------------------------");
            System.out.println("TOTAL PURCHASE:  " + total);
            System.out.println("---------------------------------------------------------------");


            //----------------yes or no
            Scanner YesNo = new Scanner(System.in);
            System.out.println("Type \"YES\" to confirm transaction | Type \"NO\" to cancel transaction:");
            String yesno = YesNo.next();

            if (yesno.equals("YES")) {
                System.out.println("------------------TRANSACTION CONFIRMED-----------------------");
            } else if (yesno.equals("NO")) {
                System.out.println("-------------------TRANSACTION CANCELLED----------------------");
            }


            goodyandfresh.Fruit();
            goodyandfresh.Shop();
            break;
        }
    }
}



//GELLACO AND SILAWAN
//midterm























