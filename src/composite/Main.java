package composite;

import java.util.ArrayList;
import java.util.List;

abstract class Node {
    abstract public void p();
}

class LeafNode extends Node {
    String content;
    public LeafNode(String content) {this.content = content;}

    @Override
    public void p() {
        System.out.println(content);
    }
}

class BranchNode extends Node {
    List<Node> nodes = new ArrayList<>();

    String name;
    public BranchNode(String name) {this.name = name;}

    @Override
    public void p() {
        System.out.println(name);
    }

    public void add(Node n) {
        nodes.add(n);
    }
}


/**
 * 组合模式：将对象组合成树形结构以表示“部分-整体”的层次结构，使得用户对单个对象和组合对象的使用具有一致性
 */
public class Main {
    public static void main(String[] args) {

        BranchNode root = new BranchNode("root");
        BranchNode chapter1 = new BranchNode("chapter1");
        BranchNode chapter2 = new BranchNode("chapter2");
        Node r1 = new LeafNode("r1");
        Node c11 = new LeafNode("c11");
        Node c12 = new LeafNode("c12");
        BranchNode b21 = new BranchNode("section21");
        Node c211 = new LeafNode("c211");
        Node c212 = new LeafNode("c212");

        root.add(chapter1);
        root.add(chapter2);
        root.add(r1);
        chapter1.add(c11);
        chapter1.add(c12);
        chapter2.add(b21);
        b21.add(c211);
        b21.add(c212);

        tree(root, 0);

    }
    //通过递归的方式输出
    static void tree(Node b, int depth) {
        //深度增加1时多加两个--
        for(int i=0; i<depth; i++) System.out.print("--");
        b.p();
        //判断是否是分支
        if(b instanceof BranchNode) {
            for (Node n : ((BranchNode)b).nodes) {
                tree(n, depth + 1);
            }
        }
    }
}