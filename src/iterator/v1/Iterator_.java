package iterator.v1;

/**
 * 定义迭代器的接口
 */
public interface Iterator_<E> { //Element //Type //K //Value V Tank

    boolean hasNext();

    E next(); //Tank next() Iterator_<Tank> it = ... Tank t = it.next();
}
