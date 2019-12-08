package memento;

/**
 * 备忘录的存放类
 *
 * 如果要使用多个备份，可将memento将为list
 */
public class Caretaker {

    private Memento  memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
