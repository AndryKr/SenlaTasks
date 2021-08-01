package sixthtask;

import sixthtask.dao.ItemsDao;
import sixthtask.model.Item;
import sixthtask.model.SafeBox;
import thirdtask.PrimeFactors;

import java.util.List;

public class SafeBoxOptimization {

    private static SafeBoxOptimization safeBoxOptimization;

    private SafeBoxOptimization() {
    }

    public static SafeBoxOptimization getInstance() {
        if (safeBoxOptimization == null) {
            safeBoxOptimization = new SafeBoxOptimization();
        }
        return safeBoxOptimization;
    }

    public void start() {
        List<Item> itemsSet = new ItemsDao().getItemsSet();

        SafeBox safeBox = new SafeBox(5);
        safeBox.calcBestSet(itemsSet);

        itemsSet = safeBox.getBestSet();


        for (int i = 0; i < itemsSet.size(); i++) {
            System.out.println(itemsSet.get(i).getName() + " " + itemsSet.get(i).getPrice());
        }

        System.out.println("Итоговая сумма " + safeBox.getBestPrice());

    }
}