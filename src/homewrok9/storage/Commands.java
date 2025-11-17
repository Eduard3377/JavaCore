package homewrok9.storage;



public interface Commands {
    String EXIT = "0";
    String ADD_BOOK = "1";
    String PRINT_ALL_BOOKS = "2";
    String SEARCH_BOOK_TITLE = "3";
    String PRINT_EXPENSIVE_BOOK = "4";
    String DELETE_BOOK_WITH_ID = "5";
    String SEARCH_BY_PRICE_RANGE = "6";

    public static void printComands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_BOOK + " for ADD BOOK");
        System.out.println("Please input " + PRINT_ALL_BOOKS + " for PRINT ALL BOOKS");
        System.out.println("Please input " + SEARCH_BOOK_TITLE + " for SEARCH BOOK TITLE");
        System.out.println("Please input " + PRINT_EXPENSIVE_BOOK + " for PRINT EXPENSIVE BOOK");
        System.out.println("Please input " + DELETE_BOOK_WITH_ID + "for DELETE BOOK WITH ID");
        System.out.println("Please input " + SEARCH_BY_PRICE_RANGE + " for SEATCH BY PRICE RANGE");


    }

}
