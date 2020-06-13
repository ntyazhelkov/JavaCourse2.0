package Task4.Present;

public class Chocolate extends Sweets {
    private String colour;
    public Chocolate(String name, int weight, int price, String colour) {
        super(name, weight, price);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
