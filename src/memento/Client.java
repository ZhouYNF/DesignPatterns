package memento;

/**
 * 备忘录（Memento）模式的定义：在不破坏封装性的前提下，捕获一个对象的内部状态，
 * 并在该对象之外保存这个状态，以便以后当需要时能将该对象恢复到原先保存的状态。该模式又叫快照模式。
 *
 * 就是说将你当前的数据找一个新的类保存起来，当你想要使用时在，翻盖当前状态
 */
public class Client {
    public static void main(String[] args) {
        //创建一个游戏人物
        GameRole gameRole = new GameRole();
        //赋值当前状态
        gameRole.setVit(100);
        gameRole.setDef(100);

        System.out.println("与boss大战前的血量");
        gameRole.display();


        //创建一个备忘录类
        Caretaker caretaker = new Caretaker();
        //将一个新的游戏人物将当前状态赋值过去，作为存档
        caretaker.setMemento(gameRole.createMemento());

        System.out.println("与boss大战后的血量");
        gameRole.setDef(30);
        gameRole.setVit(30);

        gameRole.display();

        System.out.println("大战后使用血瓶回血，直接回到大战前的血量");

        //这里就可以存档覆盖当前状态
        gameRole.recoverGameRoleFromMemento(caretaker.getMemento());
        System.out.println("血量瞬间恢复");
        gameRole.display();
    }
}
