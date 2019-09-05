/**
 * 动态数组
 */
public class Array {

    private int[] data;
    private int size;

    /**
     * 构造函数，传入数组的容量capacity构造array
     * @param capacity
     */
    public Array(int capacity) {
        size = 0;
        data = new int[capacity];
    }

    /**
     * 无参数构造函数，默认的数组容量capacity=10
     */
    public Array() {
        this(10);
    }

    /**
     * 获取数组中元素的个数
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * 获取数组array的容量
     * @return
     */
    public int getCapacity() {
        return data.length;
    }

    /**
     * 返回数组是否为空
     * @return bool
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 在所有元素后添加一个元素e
     * @param e 元素
     */
    public void addLast(int e) {
        add(size, e);
    }

    /**
     * 在所有元素之前添加元素e
     * @param e
     */
    public void addFirst(int e) {
        add(0, e);
    }

    /**
     * 向指定索引位置添加元素
     * @param index
     * @param e
     */
    public void add(int index, int e) {

        if(index < 0 || index > size) {
            throw new IllegalArgumentException("add is failed index < 0 or index > size");
        }

        if(size == data.length) {
            resize(2 * data.length);
        }
        for (int i = size - 1; i >= index; i--) {
            data[i] = data[i+1];
        }
        data[index] = e;
        size++;
    }

    private void resize(int newCapacity) {
        int[] newData = new int[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

}
