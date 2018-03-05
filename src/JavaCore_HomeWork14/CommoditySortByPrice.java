package JavaCore_HomeWork14;

import java.util.Comparator;

public class CommoditySortByPrice implements Comparator<Commodity> {
    private boolean desc;

    public CommoditySortByPrice(boolean desc) {
        this.desc = desc;
    }

    public CommoditySortByPrice() {
    }

    @Override
    public int compare(Commodity o1, Commodity o2) {
        int res = Double.compare(o1.getPrice(), o2.getPrice());
        if (res == 0) {
            res = o1.getCode() == null ? res : o1.getCode().compareToIgnoreCase(o2.getCode());
            if (res == 0) {
                res = o1.getTitle() == null ? res : o1.getTitle().compareToIgnoreCase(o2.getTitle());
            }
        }
        return desc ? -res : res;
    }
}
