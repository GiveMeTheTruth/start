/**
 * 二叉树节点
 */
public class BinaryTreeNode {

    // 一个二叉树包括 数据、左右孩子 三部分
    private int data;
    private BinaryTreeNode leftNode; // 左孩子节点引用
    private BinaryTreeNode rightNode; // 右孩子节点引用

    public BinaryTreeNode(int data, BinaryTreeNode leftNode, BinaryTreeNode rightNode) {
        this.data = data;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BinaryTreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BinaryTreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public BinaryTreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(BinaryTreeNode rightNode) {
        this.rightNode = rightNode;
    }
}
