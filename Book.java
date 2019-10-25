package CA1;

public class Book {

    //CLASS VARIABLES//
    private String m_title;
    private int m_quantity;
    private boolean m_isHardBack;
    private static int m_catalogueNo = 1200;
    private int catalogueNo;


    //CONSTRUCTORS//
    public Book () {
        m_title = "A Book";
        m_quantity = 1;
        m_isHardBack = false;
        //Setting CatalogueNo//
        catalogueNo = m_catalogueNo;
        m_catalogueNo = catalogueNo + 1;
    }

    public Book (String title, int quantity, boolean isHardBack) {
        m_title = title;
        m_quantity = quantity;
        m_isHardBack = isHardBack;
        //Setting CatalogueNo//
        catalogueNo = m_catalogueNo;
        m_catalogueNo = catalogueNo + 1;
    }

    //CLASS METHODS//

    //Getters...
    public String getTitle () {
        return m_title;
    }
    public int getQuantity () {
        return m_quantity;
    }
    public boolean getIsHardBack () {
        return m_isHardBack;
    }
    public int getCatalogueNo () {
        return catalogueNo;
    }
    public static int getNextCatalogueNo () {
        System.out.println("Next CatalogueNo Value");
        return m_catalogueNo;
    }

    //Setters...
    public boolean setTitle (String title) {
        m_title = title;
        return true;
    }
    public boolean setQuantity (int Quantity) {
        if(Quantity <= 0 || Quantity > 500) return false;
        else {
            m_quantity = Quantity;
            return true;
        }
    }
    public boolean setIsHardBack (boolean isHardBack) {
        m_isHardBack = isHardBack;
        return true;
    }

    //Mutator...
    public boolean increaseQuantity (int nQuantity) {
        if(nQuantity <= 0 || nQuantity > 500) {
            System.out.println("Quantity Entered Greater than 500 or is Less than or Equals to 0");
            return false;
        }
        else {
            if (nQuantity + m_quantity > 500) {
                System.out.println("Quantity that Already Exists Together with Quantity Entered is greater than 500");
                return false;
        }
            else {
                m_quantity = m_quantity + nQuantity;
                System.out.println("Quantity Increased");
                return true;
            }
        }
    }



}
