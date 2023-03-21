package dz4;

public class Program {
    public static void main(String[] args) {
        ArrayList<Integer> ArrayList = new ArrayList<>();
        ArrayList.add(10);
        ArrayList.add(12);
        ArrayList.add(99);
        ArrayList.add(55);
        ArrayList.add(88);
        ArrayList.add(13);
        ArrayList.removeIndex(2);
        ArrayList.removeElement(12);
        ArrayList.findIndex(2);
        ArrayList.getLength();
        ArrayList.maxEl();
        ArrayList.maxEl();
        ArrayList.multEl();
        ArrayList.BubbleSort();
        ArrayList.printArray();

        ArrayList<String> StringList = new ArrayList<>();   
        StringList.add("Cat");
        StringList.add("Dog");
        StringList.add("Mouse");
        StringList.removeIndex(1);
        StringList.printArray();



    }
}