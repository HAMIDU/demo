package designpattern.builder;

public class Sony extends Company{
    @Override
    public String packing() {
        return "Sony";
    }

    @Override
    public Integer price() {
        return 50;
    }
}
