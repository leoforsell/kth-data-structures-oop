package se.kth.prep.structures;

public final class ListDemo {
    private ListDemo() {
    }

    public static void main(String[] args) {
        CustomList<String> list = new CustomArrayList<>();
        list.add("A");
        list.add("C");
        list.add(1, "B");
        list.add("D");
        for (String element : list) {
            System.out.println(element);
        }
        System.out.println("Storlek: " + list.size());
    }
}
