public class Library {
    private LibraryItem[] list;
    private int size;
    private int count;
    public Library(int size) {
        this.size = size;
        list = new LibraryItem[size];
        count = 0;
    }

    public void addItem(LibraryItem item) {
        list[count] = item;
        count++;
    }

    public void removeitem(LibraryItem term) {

        for(int i = 0; i < list.length; i++) {
            LibraryItem item = list[i];
            if(item.getTitle().equals(term.getTitle())) {
                removeItemFromIndex(i);
            }
        }
        count--;
    }

    public void removeItemFromIndex(int index) {
        int i = count;
        while(i >= index) {
            list[i-1] = list[i];
            i--;
        }
    }

    public void displayItems() {
        for(int i = 0; i < count; i++) {
            System.out.println();
        }
    }
}
