package JavaCore_HomeWork14;

import java.util.Comparator;

public class CommoditySortByTitle implements Comparator<Commodity> {
    private boolean desc;

    public CommoditySortByTitle(boolean desc) {
        this.desc = desc;
    }

    public CommoditySortByTitle() {
    }

    @Override
    public int compare(Commodity o1, Commodity o2) {
        int res = o1.getTitle() == null ? 0 : o1.getTitle().compareToIgnoreCase(o2.getTitle());
        if (res == 0) {
            res = o1.getCode() == null ? res : o1.getCode().compareToIgnoreCase(o2.getCode());
            if (res == 0) {
                res = Double.compare(o1.getPrice(), o2.getPrice());
            }
        }
        return desc ? -res : res;
    }
}
