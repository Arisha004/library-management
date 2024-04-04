package hi;

import java.util.Scanner;

class library{
    String books;
    public void addbook(){
        System.out.println("book added");
    }
    public void returnbook(){
        System.out.println("book returned");
    }
    Scanner sc= new Scanner(System.in);
    String name;
    public void issuebook(String [] issue){
        int count=0;
        count++;;
        System.out.println("enter name: ");
        name=sc.nextLine();
        System.out.println("ENTER THE BOOK  YOU WANT TO ISSUE: ");
        books=sc.nextLine();
        System.out.println(name+ " SUCCESSFULLY ISSUED "+ books);
        for(String books:issue ){
            System.out.println("the book is issued" );
        }
        System.out.println("the no of books issued are :  "+count);

    }
    public void showavailablebook(String  [] book){
        for(String books:book ){
            System.out.println("the available books are: " + books);
        }
    }

}
public class mywork {
    public static void main(String[] args) {
library l=new library();
int count=0;
String [] booksi={"romeo and juliet, sad ,love ,thriller funny"};

        char choice;
        int option;
        String name;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("WELCOME TO MY LIBRARY MANAGEMENT");
            System.out.println("1) ADD BOOK");
            System.out.println("2) RETURN BOOK");
            System.out.println("3) ISSUE BOOK");
            System.out.println("4) AVAILABLE BOOK");
            Scanner sc1 = new Scanner(System.in);
            System.out.println("ENTER CHOICE: ");
            option=sc1.nextInt();
            if(option==1){
                l.addbook();
            } else if (option==2) {
                l.returnbook();
            } else if (option==3) {
                l.issuebook(booksi);
            }
            else if (option==4){
                l.showavailablebook(booksi);
            }
            else {
                System.out.println("invalid choice");
            }
            System.out.println("do you want to again review (y || n)");
            choice = sc.next().charAt(0);
        }
        while (choice=='Y' || choice=='y');

    }
}
