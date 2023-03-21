package dz4;

public class Program {
    public static void main(String[] args) {
        ArrayList<Integer> ArrayList = new ArrayList<>();
        ArrayList.add(10);
        ArrayList.add(12);
        ArrayList.add(99);
        ArrayList.add(55);
        ArrayList.removeIndex(2);
        ArrayList.removeElement(12);
        ArrayList.removeElement(88);
        ArrayList.BubbleSort();


        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Cat");
        stringList.add("Dog");
        stringList.add("Mouse");
        stringList.removeIndex(1);
        

    }
}