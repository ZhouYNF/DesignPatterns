package iterator.v1;

/**
 * 相比数组，这个容器不用考虑边界问题，可以动态扩展
 */
class ArrayList_<E> implements Collection_<E> {
    E[] objects = (E[])new Object[10];
    //objects中下一个空的位置在哪儿,或者说，目前容器中有多少个元素
    private int index = 0;

    /**
     * 创建添加元素的方法
     * @param o
     */
    public void add(E o) {
        if(index == objects.length) {
            // 如果添加对象元素时超过了数组的最大值，则新创建一个数组，新创建的数组的长度是旧数组2倍
            E[] newObjects = (E[])new Object[objects.length*2];
            // 将旧数组中数据复制到新数组中
            System.arraycopy(objects, 0, newObjects, 0, objects.length);
            // 将新数组的引用传递给旧数组
            objects = newObjects;
        }

        objects[index] = o;
        index ++;
    }

    /**
     * @return 创建返回集合大小的方法
     */
    public int size() {
        return index;
    }

    /**
     * @return 创建返回迭代器的方法
     */
    @Override
    public Iterator_<E> iterator() {
        return new ArrayListIterator();
    }

    /**
     * @param <E> 创建迭代器的内部类
     */
    private class ArrayListIterator<E> implements Iterator_<E> {

        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            if(currentIndex >= index) return false;
            return true;
        }

        @Override
        public E next() {
            E o = (E)objects[currentIndex];
            currentIndex ++;
            return o;
        }
    }


}