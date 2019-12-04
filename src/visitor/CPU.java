package visitor;

class CPU extends ComputerPart {


    /**
     * 把自己聚合到购买的策略中，
     * @param v
     */
    @Override
    void accept(Visitor v) {
        v.visitCpu(this);
    }

    @Override
    double getPrice() {
        return 500;
    }
}
