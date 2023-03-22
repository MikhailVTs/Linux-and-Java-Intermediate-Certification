
/**
 * Toys
 */

public class Toys {

    private int id_toy;
    private String name_toy;
    private int count_toy;
    private int falling_out_toys;

    public Toys(int id_toy, String name_toy, int count_toy, int falling_out_toys) {
        this.id_toy = id_toy;
        this.name_toy = name_toy;
        this.count_toy = count_toy;
        this.falling_out_toys = falling_out_toys;
    }

    public int getId_toy() {
        return id_toy;
    }

    public void setId_toy(int id_toy) {
        this.id_toy = id_toy;
    }

    public String getName_toy() {
        return name_toy;
    }

    public void setName_toy(String name_toy) {
        this.name_toy = name_toy;
    }

    public int getCount_toy() {
        return count_toy;
    }

    public void setCount_toy(int count_toy) {
        this.count_toy = 90;
    }

    public int getFalling_out_toys() {
        return falling_out_toys;
    }

    public void setFalling_out_toys(int falling_out_toys) {
        this.falling_out_toys = falling_out_toys;
    }

}