package dz4;

public class ArrayList<T> {
    private static int startLength = 1;
    private int length;
    private T[] el;

    public ArrayList() {
        this.length = 0;
        this.el = (T[]) new Object[startLength];
    }

    public ArrayList(T[] el) {
        this.length = el.length;
        this.el = el;
    }

    public int getLength() {
        return this.length;
    }

    public T[] getel() {
        return this.el;
    }

    public void printArray() {
        System.out.print("[");
        for (int i = 0; i < this.getLength(); i++) {
            if (i != this.getLength() - 1)
                System.out.print(this.el[i] + ",");
            else
                System.out.print(this.el[i]);
        }
        System.out.print("]\n");
    }

    public void add(T element) {
        if (this.length == this.el.length) {
            addLenth();
        }
        this.el[this.length++] = element;
    }

    private void addLenth() {
        int newlen = this.getLength() + 1;
        T[] newEl = (T[]) new Object[newlen];
        for (int i = 0; i < this.getLength(); i++) {
            newEl[i] = this.el[i];
        }
        this.el = newEl;
    }

    public void removeIndex(int idex) {
        if (idex < 0 || idex > this.getLength()) {
            System.out.println("error");
        } else {
            int newlen = this.getLength() - 1;
            T[] newEl = (T[]) new Object[newlen];
            int i = 0;
            while (i < idex) {
                newEl[i] = this.el[i];
                i++;
            }
            i++;
            while (i < this.getLength()) {
                newEl[i - 1] = this.el[i];
                i++;
            }
            this.el = newEl;
            this.length--;
        }
    }

    public void removeElement(T element) {
        for (int i = 0; i < el.length; i++) {
            if (el[i] == element) {
                removeIndex(i);
                i--;
            }
        }
    }

    public int minEl() {
        int min = (int) this.el[0];
        for (int i = 0; i < el.length; i++) {
            if (min > (int) this.el[i]) {
                min = (int) this.el[i];
            }
        }

        return min;
    }

    public int maxEl() {
        int max = (int) this.el[0];
        for (int i = 0; i < el.length; i++) {
            if (max < (int) this.el[i]) {
                max = (int) this.el[i];
            }
        }

        return max;
    }

    public int sumEl() {
        int result = 0;
        for (int i = 0; i < el.length; i++) {
            result += (int) this.el[i];
        }
        return result;
    }

    public int multEl() {
        int result = 1;
        for (int i = 0; i < el.length; i++) {
            result *= (int) this.el[i];
        }
        return result;
    }

    public int findIndex(T element) {

        int count = 0;
        for (T t : el) {
            if (t == element) {
                return count;
            }
            count++;
        }
        return -1;
    }

    public boolean findEl(T element) {
        for (T t : el) {
            if (t == element) {
                return true;
            }
        }
        return false;
    }

    public void BubbleSort() {
        T tmp = this.el[0];
        if (tmp instanceof Comparable) {
            for (int i = 0; i < this.getLength() - 1; i++) {
                boolean hasSwap = false;

                for (int j = 0; j < this.getLength() - i - 1; j++) {
                    Comparable<T> elem = (Comparable<T>) this.el[j];
                    T nextElem = this.el[j + 1];
                    if (elem.compareTo(nextElem) > 0) {
                        swap(j, j + 1);
                        hasSwap = true;
                    }
                }

                if (!hasSwap) {
                    break;
                }
            }
        }

    }

    private void swap(int i, int j) {
        T tmp = this.el[i];
        this.el[i] = this.el[j];
        this.el[j] = tmp;
    }

}