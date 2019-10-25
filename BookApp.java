package CA1;

public class BookApp {
    public static void main(String[] args) {
        //CREATING OBJECTS//
        Book book1 = new Book();
        Book book2 = new Book();

        Book book3 = new Book("The Hobbit",4,true);
        Book book4 = new Book("Treasure Island",10,false);

        //TESTING getCatalogueNo() METHOD (Checking if it increments values properly)//
        System.out.println(book1.getCatalogueNo());
        System.out.println(book3.getCatalogueNo());

        //TESTING increaseQuantity() METHOD//
        System.out.println();
        System.out.println(book4.increaseQuantity(491));
        System.out.println(book4.increaseQuantity(490));
        System.out.println(book1.increaseQuantity(-20));
        System.out.println(book3.increaseQuantity(0));

        //TESTING getNextCatalogueNo() METHOD (Should return an Integers which represents the next CatalogueNo)//
        System.out.println();
        System.out.println(Book.getNextCatalogueNo());

        //TESTING getQuantity() METHOD//
        System.out.println();
        System.out.println(book4.getQuantity());
        System.out.println(book3.getQuantity());
        System.out.println(book1.getQuantity());
        //TESTING setQuantity() METHOD//
        System.out.println();
        System.out.println(book4.setQuantity(20));
        System.out.println(book4.getQuantity());


        //TESTING getTitle() setTitle() METHODS//
        System.out.println();
        System.out.println(book1.setTitle("SetTitleWork"));
        System.out.println(book1.getTitle());

        //TESTING getIsHardBack() setIsHardBack() METHODS//
        System.out.println();
        System.out.println(book1.setIsHardBack(true));
        System.out.println(book1.getIsHardBack());


    }
}
