package Pr_4;

public class TShirt extends Clothes implements ManClothing,  WomenClothing{
    @Override
    public void DressMan() {

    }

    @Override
    public void DressWomen() {

    }
    public TShirt(sizes size, int cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }
}
