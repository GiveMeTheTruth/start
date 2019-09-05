/**
 * 二叉树节点（数组实现）
 */
public class BinaryTreeArrayNode {

    // 数组实现，保存的不是 左右子树的引用，而是数组下标
    private int data;
    private int lChild;
    private int rChild;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getlChild() {
        return lChild;
    }

    public void setlChild(int lChild) {
        this.lChild = lChild;
    }

    public int getrChild() {
        return rChild;
    }

    public void setrChild(int rChild) {
        this.rChild = rChild;
    }
}
