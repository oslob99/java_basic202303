package day13;

import static day13.Dish.*;

public class HardDish {

    private final String name;
    private final Type type;

    public HardDish(Dish dish){
        this.name = dish.getName();
        this.type = dish.getType();
    }
    public HardDish(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "HardDish{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
