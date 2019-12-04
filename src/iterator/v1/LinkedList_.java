package iterator.v1;

import java.util.NoSuchElementException;

/**
 * 相比数组，这个容器不用考虑边界问题，可以动态扩展
 */
class LinkedList_<E> implements Collection_<E> {
    // head标记为链表头
    Node head = null;
    // tail标记为链表尾
    Node tail = null;
    //目前容器中有多少个元素
    private int size = 0;

    /**
     * 创建添加节点的方法
     *
     * @param o
     */
    public void add(E o) {
        // 实例化一个节点
        Node n = new Node(o);
        n.next = null;
        // 如果是头节点没空，则头和尾都指向n
        if (head == null) {
            head = n;
            tail = n;
        }
        // 这里修改上一个对象的next,尾巴向后移动
        tail.next = n;
        tail = n;
        size++;
    }

    /**
     * 创建节点类
     */
    private class Node {
        //data记录数据值
        private E o;
        //next记录下一个节点的引用
        Node next;

        public Node(E o) {
            this.o = o;
        }
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator_ iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator<E> implements Iterator_<E> {

        private int nextIndex = 0;

        @Override
        public boolean hasNext() {
            if (nextIndex >= size) return false;
            return true;
        }

        @Override
        public E next() {
            if (!hasNext()) throw new NoSuchElementException();

            if (nextIndex > 0) head = head.next;

            nextIndex++;

            return (E) head.o;
        }

    }
}
