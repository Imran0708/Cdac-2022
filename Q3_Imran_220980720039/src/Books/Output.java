package Books;

import java.util.Scanner;

public class Output {
    public static void main(String arg[])
    {

        book a=new book();
        a.readData();
        a.displayData();
        book b=new book();
        b.readData();
        b.displayData();

        int ch;
        bookshop ob = new bookshop();
        Scanner in = new Scanner(System.in);
        while(true)
        {
            System.out.println("***MENU IS*");
            System.out.println("\t\t1.To enter the data\n\t\t2.To search a book\n\t\t3.Exit");

            System.out.println("Enter your choice from the above menu:");
            ch = in.nextInt();
            switch(ch)
            {
                case 1: ob.setdata();
                    break;
                case 2: ob.search();
                    break;
                case 3: System.exit(0);
            }//end of switch case
        }// end of while loop
    }//end of main function
}// end of class