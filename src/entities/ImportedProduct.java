package entities;

public class ImportedProduct extends Product {

    private Double customsFees;

    public ImportedProduct(){
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFees) {
        super(name, price);
        this.customsFees = customsFees;
    }

    public Double getCustomsFees() {
        return customsFees;
    }

    public void setCustomsFees(Double customsFees) {
        this.customsFees = customsFees;
    }

    @Override
    public String priceTag() {
        return name + " $ " + String.format("%.2f", totalPrice())
                + " (Customs fee: $"
                + String.format("%.2f", customsFees) + ")s";
    }

    public Double totalPrice(){
        return price + customsFees;
    }

}
