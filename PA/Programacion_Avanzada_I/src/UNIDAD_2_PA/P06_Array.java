package UNIDAD_2_PA;

/**
 *
 * @author GuillermoToledano
 */
public class P06_Array {

    private final int VSIZE;
    private int COUNT;
    private final int[] DATA;

    /**
     * Constructs an empty array with the specified initial capacity.
     *
     * @param SIZE Number of elements.
     */
    public P06_Array(int SIZE) {
        this.VSIZE = SIZE;
        this.COUNT = 0;
        this.DATA = new int[this.VSIZE];
    }

    /**
     * Checks whether the array has elements.
     *
     * @return True if it contains at least has one element. False otherwise.
     */
    public boolean isEmpty() {
        return (this.COUNT == 0 ? true : false);
    }

    /**
     * Checks whether the array has no more space.
     *
     * @return True if has no more space. False otherwise.
     */
    public boolean isFull() {
        return (this.COUNT == this.VSIZE ? true : false);
    }

    /**
     * Insert the specified element into the array.
     *
     * @param element Element to be added into the array.
     */
    public void add(int element) {
        try {
            if (this.COUNT < this.VSIZE) {
                this.DATA[this.COUNT] = element;
                this.COUNT++;
            } else {
                throw new P06_ArrayExceptions("Sorry, full array!");
            }
        } catch (P06_ArrayExceptions ex) {
            System.err.println(ex);
        }
    }

    /**
     * Modify the element at the specific position.
     *
     * @param index Fixed position to be modified.
     * @param element The new element at the specified index.
     */
    public void set(int index, int element) {
        try {
            if (!isEmpty()) {
                if (index >= 0 && index < this.COUNT) {
                    this.DATA[index] = element;
                } else {
                    throw new P06_ArrayExceptions("Index out of bounds!");
                }
            } else {
                throw new P06_ArrayExceptions("Sorry, empty array!");
            }
        } catch (P06_ArrayExceptions ex) {
            System.err.println(ex);
        }
    }

    /**
     * Search an element at the specified position.
     *
     * @param index Position where the element is located.
     * @return The element at the specified position.
     * @throws UNIDAD_2_PA.P06_ArrayExceptions
     */
    public int get(int index) throws P06_ArrayExceptions {
        if (isEmpty()) {
            throw new P06_ArrayExceptions("Sorry, empty array!");
        }
        if (index < 0 || index >= this.COUNT) {
            throw new P06_ArrayExceptions("Index out of bounds!");
        }
        return this.DATA[index];
    }

    /**
     * Search the index of the specified element.
     *
     * @param element Element to look for.
     * @return The index where the first element occurrence was found.
     * @throws UNIDAD_2_PA.P06_ArrayExceptions
     */
    public int index(int element) throws P06_ArrayExceptions {
        if (isEmpty()) {
            throw new P06_ArrayExceptions("Sorry, empty array!");
        }
        for (int i = 0; i < this.COUNT; i++) {
            if (this.DATA[i] == element) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Removes the element at the specified position.
     *
     * @param index Position of the element to remove.
     * @return The element removed.
     * @throws UNIDAD_2_PA.P06_ArrayExceptions
     */
    public int remove(int index) throws P06_ArrayExceptions {
        if (isEmpty()) {
            throw new P06_ArrayExceptions("Sorry, empty array!");
        }
        if (index < 0 || index >= this.COUNT) {
            throw new P06_ArrayExceptions("Index out of bounds!");
        }
        int e = this.DATA[index];
        for (int i = index; i < this.COUNT - 1; i++) {
            this.DATA[i] = this.DATA[i + 1];
        }
        this.COUNT--;
        return e;
    }

    /**
     * Display how many elements are currently in the array.
     *
     * @return Number of elements in the array.
     */
    public int count() {
        return this.COUNT;
    }

    /**
     * Display the current array capacity.
     *
     * @return Capacity
     */
    public int length() {
        return this.VSIZE;
    }

    /**
     * Displays the current elements in the array.
     */
    public void display() {
        if (!isEmpty()) {
            System.out.print("[ ");
            for (int i = 0; i < this.COUNT; i++) {
                System.out.print(this.DATA[i] + " ");
            }
            System.out.println("]");
        } else {
            System.out.println("Sorry, empty array!");
        }
    }
}
