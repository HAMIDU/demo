package designpattern.builder;

public class Samsung extends Company{
    @Override
    public String packing() {
        return "Samsung";
    }

    @Override
    public Integer price() {
        return 20;
    }
}
