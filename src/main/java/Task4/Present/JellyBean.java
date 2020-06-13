package Task4.Present;

public class JellyBean extends Sweets {
    private String taste;


    public JellyBean(String name, int weight, int price, String taste) {
        super(name, weight, price);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
}
