package designpattern.builder;

import java.util.ArrayList;

public class CDType {

    private ArrayList<Packing> packings = new ArrayList<Packing>();

    public void addItem(Packing packing) {
        packings.add(packing);
    }

    public void getCost() {
        for (Packing packing : packings) {
            System.out.print("CD name : " + packing.packing());
            System.out.println(", Price : " + packing.price());
        }
    }

    public void showItems() {
        for (Packing packing : packings) {
            System.out.print("CD name : " + packing.packing());
            System.out.println(", Price : " + packing.price());
        }
    }
}
