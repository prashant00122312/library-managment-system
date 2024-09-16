// package library1;

import java.util.Scanner;

class library {
    int count;
    int newCount;
    int retCount;
    String issued;

    // contain the books which you want to issued

    // add the issued books to the issue array

    public void issuedBook(String[] issue, String[] books) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nenter the name of books which you want to issue ");
        String s = sc.nextLine();
        issued = s;
        for (String ele : issue) {
            if (ele != null) {
                count += 1;
            }
        }

        int aval = 0;

        for (int p = 0; p < books.length; p++) {

            if (s.equals(books[p])) {

                aval += 1;
                break;
            } else if (s != books[p]) {
                aval += 0;
            }
        }

        if (aval == 0) {
            System.out.println("sorry this  book is not available \n");

        } else if (aval != 0) {
            // System.out.println("yes book is available you can issue ") ;

            issue[count] = s;
            System.out.println("your book is issued \nthanku \n");
        }

        // to delete the issued book from the available book

        for (int i = 0; i < books.length; i++) {
            if (s.equals(books[i])) {
                for (int j = i; j < books.length - 1; j++) {
                    books[j] = books[j + 1];
                }
                break;
            }
        }

    }

    // contain the available boooks -->
    public void showAvailableBook(String[] books) {
        System.out.println("books available in library are --:");
        for (int i = 0; i < books.length - 1; i++) {
            if (books[i] != null) {
                System.out.println(books[i]);
                newCount += 1;
            }
        }
    }

    // contain the books which you want to add
    public void addBook(String[] books) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nenter the book which you want to add ");
        String add = sc.nextLine();
        System.out.println("this book is added to the library  \nthanku \n");
        for (String ele : books) {
            if (ele != null) {
                // System.out.println(ele);
                newCount += 1;
            }
        }
        books[newCount] = add;
    }

    // add all the issued books in issue array
    public void allIssuedBooks(String[] issue) {
        int issd = 0;
        System.out.println("all issued books are  --> ");
        for (String ele : issue) {

            if (ele != null) {

                System.out.println(ele);
                issd += 1;
            }

        }
        if (issd == 0) {
            System.out.println("\nno books are issued as  yet\n");
        }

    }

    // contain the books which you want to substract

    // to add the returned book in the available books

    public void returnBook(String[] books, String[] issue) {
        System.out.println("\nenter which book you want to return ");
        Scanner sc = new Scanner(System.in);
        String ret = sc.nextLine();
        for (String ele : books) {
            if (ele != null) {
                retCount += 1;
            }
        }

        int aval = 0;

        for (int p = 0; p < issue.length; p++) {

            if (ret.equals(issue[p])) {
                // System.out.println("yes book is available ") ;

                aval += 1;
                break;
            } else if (ret != issue[p]) {
                aval += 0;
            }
        }

        // System.out.println("the value return book " + aval ) ;

        if (aval == 0) {
            System.out.println("\nsorry  this  book can not be returned ");

        } else if (aval != 0) {
            System.out.println("\nyour book is returned ");
            System.out.println("thanku for returning \n");
            books[retCount] = ret;

        }

        // to delete the returned book from the issed array

        for (int i = 0; i < issue.length; i++) {
            if (ret.equals(issue[i])) {
                for (int j = i; j < issue.length - 1; j++) {
                    issue[j] = issue[j + 1];
                }
                break;
            }

        }

    }
}

public class librm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the college user id ");
        long id = sc.nextLong();

        sc.nextLine();
        System.out.println("please enter you pasword ");
        String pas = sc.nextLine();














        int count = 0;
        while (id != 0) {
            long r = id % 10;
            count += 1;
            id = id / 10;
        }
        // System.out.println("the value of count "+ count);

        // making the array of issued books
        String[] issue = new String[100];

        // making the array of available books
        String[] books = new String[100];

        // making the variable for class library
        library l = new library();

        // adding the books in the array
        books[0] = "vistas";
        books[1] = "moment";
        books[2] = "mukta";
        books[3] = "sciece";
        books[4] = "maths - 1 ";
        books[5] = "math - 2 ";
        books[6] = "xam idea";
        books[7] = "rd sharma";
        books[8] = "kumar";
        books[9] = "python";
        books[10] = "java";

        // calling by using various function

        // l.issuedBook(issue , books );
        // l.showAvailableBook(books);
        // l.addBook(books);
        // l.allIssuedBooks(issue);
        // l.returnBook(books , issue);

        if (count == 10) {
            System.out.println("correct user id ");

            boolean myBool = true;
            while (myBool != false) {
                System.out.println("for book issue type --->                | issue |\n");
                System.out.println("for  cheking the available books type --->     | aval |  \n");
                System.out.println("for adding the books  type --->                     | add | \n");
                System.out.println("for cheking the status of all issued books type --->  | issued |\n");
                System.out.println("for  returning the book   type  --->                        | return |\n");

                System.out.println("type  here ..........");
                String input = sc.nextLine();

                if (input.equals("issue")) {
                    l.issuedBook(issue, books);
                }

                else if (input.equals("aval")) {
                    l.showAvailableBook(books);
                }

                else if (input.equals("add")) {
                    l.addBook(books);
                }

                else if (input.equals("issued")) {
                    l.allIssuedBooks(issue);
                }

                else if (input.equals("return")) {
                    l.returnBook(books, issue);
                }

                else {
                    System.out.println("sorry you entered some invalid thing ");
                }

                boolean repeat = true;

                System.out.println("\nif you want to do anything then type  --> |yes|  \nelse type  ---> |no| \n");

                String dec = sc.nextLine();
                if (dec.equals("yes")) {
                    myBool = true;
                    repeat = true;
                    System.out.println("\n");
                } else if (dec.equals("no")) {
                    myBool = false;
                    System.out.println("thanku for connection with us ");
                } else if (dec != "yes" || dec != "no") {

                    System.out.println("\nsorry i can't understand what you type ");

                    System.out.println("you want to retype  then type   -->   |yes|\nelse  type  -->   |no| ");
                    String rep = sc.nextLine();

                    if (rep.equals("yes")) {
                        System.out.println("\n");
                        myBool = true;

                    } else {
                        myBool = false;
                        System.out.println("thanku for connection with us ");
                        break;
                    }

                }

            }
        } else {
            System.out.println("user id and pasword not match  ");
        }
    }
}