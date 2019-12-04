package visitor;

/**
 * 实现来访者的接口
 * 个人来访者
 */
class PersonelVisitor implements Visitor {
    double totalPrice = 0.0;

    /**
     * 策略杀价
     * @param cpu
     */
    @Override
    public void visitCpu(CPU cpu) {
        totalPrice += cpu.getPrice()*0.9;
    }

    @Override
    public void visitMemory(Memory memory) {
        totalPrice += memory.getPrice()*0.85;
    }

    @Override
    public void visitBoard(Board board) {
        totalPrice += board.getPrice()*0.95;
    }
}
