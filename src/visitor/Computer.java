package visitor;


public class Computer {
    //内部结构不在发生改变
    ComputerPart cpu = new CPU();
    ComputerPart memory = new Memory();
    ComputerPart board = new Board();

    //将购买的策略放入
    public void acccept(Visitor v) {
        this.cpu.accept(v);
        this.memory.accept(v);
        this.board.accept(v);
    }
}














