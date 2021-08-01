package sixthtask.model;

import java.util.ArrayList;
import java.util.List;

public class SafeBox {

    private int maxVolume;
    private int bestPrice;
    private List<Item> bestItems = null;

    public SafeBox(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    private int calcVolume(List<Item> items) {
        int sumVolume = 0;
        for (Item item : items) {
            sumVolume += item.getVolume();
        }
        return sumVolume;
    }

    private int calcPrice(List<Item> items) {
        int sumPrice = 0;
        for (Item item : items) {
            sumPrice += item.getPrice();
        }
        return sumPrice;
    }

    private void bestSet(List<Item> items) {
        if (bestItems == null) {
            if (calcVolume(items) <= maxVolume) {
                bestItems = items;
                bestPrice = calcPrice(items);
            }
        } else {
            if (calcVolume(items) <= maxVolume && calcPrice(items) > bestPrice) {
                bestItems = items;
                bestPrice = calcPrice(items);
            }
        }
    }

    public void calcBestSet(List<Item> items) {
        if (items.size() > 0) {
            bestSet(items);
        }

        for (int i = 0; i < items.size(); i++) {
            List<Item> list = new ArrayList<>(items);
            list.remove(i);
            calcBestSet(list);
        }
    }

    public List<Item> getBestSet() {
        return bestItems;
    }

    public int getBestPrice() {
        return bestPrice;
    }
}
