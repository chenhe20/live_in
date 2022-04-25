package liv.ac.uk.live_in.page;

import java.io.Serializable;


public class Page implements Serializable {
    private static final long serialVersionUID = 5831919842362872419L;

    public static final int DEFAULT_ITEMS_PER_PAGE = 10;


    public static final int DEFAULT_SLIDER_SIZE = 7;


    public static final int UNKNOWN_ITEMS = Integer.MAX_VALUE;


    private int currentPage;
    private int items;
    private int itemsPerPage;


    public Page() {
        this(0);
    }


    public Page(int itemsPerPage) {
        this(itemsPerPage, UNKNOWN_ITEMS);
    }


    public Page(int itemsPerPage, int items) {
        this.items = (items >= 0) ? items
                : 0;
        this.itemsPerPage = (itemsPerPage > 0) ? itemsPerPage
                : DEFAULT_ITEMS_PER_PAGE;
        this.currentPage = calcPage(0);
    }


    public int getPages() {
        return (int) Math.ceil((double) items / itemsPerPage);
    }


    public int getCurrentPage() {
        return currentPage;
    }

    public int setPage(int page) {
        return (this.currentPage = calcPage(page));
    }

    public int getItems() {
        return items;
    }


    public int setItems(int items) {
        this.items = (items >= 0) ? items: 0;
        setPage(currentPage);
        return this.items;
    }

    public int getItemsPerPage() {
        return itemsPerPage;
    }

    public int setItemsPerPage(int itemsPerPage) {
        int tmp = this.itemsPerPage;

        this.itemsPerPage = (itemsPerPage > 0) ? itemsPerPage
                : DEFAULT_ITEMS_PER_PAGE;

        if (currentPage > 0) {
            setPage((int) (((double) (currentPage - 1) * tmp) / this.itemsPerPage) + 1);
        }

        return this.itemsPerPage;
    }

    public int getOffset() {
        return (currentPage > 0) ? (itemsPerPage * (currentPage - 1))
                : 0;
    }

    public int getLength() {
        if (currentPage > 0) {
            return Math.min(itemsPerPage * currentPage, items) - (itemsPerPage * (currentPage - 1));
        } else {
            return 0;
        }
    }

    public int getDbBeginIndex() {
        if (currentPage > 0) {
            return itemsPerPage * (currentPage - 1);
        } else {
            return 0;
        }
    }

    public int getDbEndIndex() {
        if (currentPage > 0) {
            return Math.min(itemsPerPage * currentPage, items);
        } else {
            return 0;
        }
    }

    public int getBeginIndex() {
        if (currentPage > 0) {
            return (itemsPerPage * (currentPage - 1)) + 1;
        } else {
            return 0;
        }
    }

    public int getEndIndex() {
        if (currentPage > 0) {
            return Math.min(itemsPerPage * currentPage, items);
        } else {
            return 0;
        }
    }


    public int setItem(int itemOffset) {
        return setPage((itemOffset / itemsPerPage) + 1);
    }


    public int getFirstPage() {
        return calcPage(1);
    }


    public int getLastPage() {
        return calcPage(getPages());
    }


    public int getPreviousPage() {
        return calcPage(currentPage - 1);
    }


    public int getPreviousPage(int n) {
        return calcPage(currentPage - n);
    }

    public int getNextPage() {
        return calcPage(currentPage + 1);
    }

    public int getNextPage(int n) {
        return calcPage(currentPage + n);
    }

    public boolean isDisabledPage(int page) {
        return ((page < 1) || (page > getPages()) || (page == this.currentPage));
    }

    public int[] getSlider() {
        return getSlider(DEFAULT_SLIDER_SIZE);
    }

    public int[] getSlider(int width) {
        int pages = getPages();

        if ((pages < 1) || (width < 1)) {
            return new int[0];
        } else {
            if (width > pages) {
                width = pages;
            }

            int[] slider = new int[width];
            int first = currentPage - ((width - 1) / 2);

            if (first < 1) {
                first = 1;
            }

            if (((first + width) - 1) > pages) {
                first = pages - width + 1;
            }

            for (int i = 0; i < width; i++) {
                slider[i] = first + i;
            }

            return slider;
        }
    }

    protected int calcPage(int page) {
        int pages = getPages();

        if (pages > 0) {
            return (page < 1) ? 1
                    : ((page > pages) ? pages
                    : page);
        }

        return 0;
    }

}
