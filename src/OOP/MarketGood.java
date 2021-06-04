package OOP;

public class MarketGood {
    private String name;
    private int retailPrice;
    private int discountRate;

    public MarketGood(String name, int retailPrice, int discountRate){
        if (discountRate < 0 || discountRate > 100) discountRate = 0;
        this.name = name;
        this.retailPrice = retailPrice;
        this.discountRate = discountRate;
    }

    public MarketGood(String name, int retailPrice){
        this(name, retailPrice, 0);
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public String getName(){
        return name;
    }

    public int getRetailPrice(){
        return retailPrice;
    }

    public void setDiscountRate(int discountRate){
        this.discountRate = discountRate;
    }

    public void setRetailPrice(int retailPrice){
        this.retailPrice = retailPrice;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getDiscountedPrice(){
        return (int) (retailPrice * (1 - discountRate / 100.0));
    }
}
