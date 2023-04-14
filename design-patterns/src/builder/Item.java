package builder;

import builder.Packing;

public interface Item {
    public String name();
    public Packing packing();

    float price();

    float prince();
}
