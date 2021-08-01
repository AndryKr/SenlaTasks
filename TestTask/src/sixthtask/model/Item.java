package sixthtask.model;

public class Item {
    private String name;
    private int volume;
    private int price;

    public Item(String name, int volume, int price) {
        this.name = name;
        this.volume = volume;
        this.price = price;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Item item = (Item) o;
//
//        if (volume != item.volume) return false;
//        if (price != item.price) return false;
//        return name != null ? name.equals(item.name) : item.name == null;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = name != null ? name.hashCode() : 0;
//        result = 31 * result + volume;
//        result = 31 * result + price;
//        return result;
//    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public int getPrice() {
        return price;
    }
}
