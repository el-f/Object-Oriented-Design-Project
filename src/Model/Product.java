package Model;

public class Product {

    public final String name;
    private final String serialNum;
    private int storePrice;
    private int customerPrice;
    private Customer purchasingCustomer;

    public Product(String _name, String _serialNum, int _storePrice, int _customerPrice) {
        name = _name;
        serialNum = _serialNum;
        storePrice = _storePrice;
        customerPrice = _customerPrice;
    }
}
