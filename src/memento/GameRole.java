package memento;

/**
 * 这是游戏角色
 */
public class GameRole {
    private int vit;
    private int def;

    /**
     * 返回一个的备忘录对象，并将当前状态传入
     * @return
     */
    public Memento createMemento() {
        return new Memento(vit, def);
    }

    /**
     * 使用备忘录对象，将当前对象的数据覆盖
     * @param memento
     */
    public void recoverGameRoleFromMemento(Memento memento) {
        this.vit = memento.getVit();
        this.def = memento.getDef();
    }

    public void display() {
        System.out.println("当前的血量" + this.vit + " 当前的防御力: " + this.def);
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
