/**
 * 二叉树
 */
public class BinaryTree {

    private BinaryTreeNode mRoot; // 根节点

    public BinaryTree(BinaryTreeNode mRoot) {
        this.mRoot = mRoot;
    }

    public BinaryTreeNode getRoot() {
        return mRoot;
    }

    public void setRoot(BinaryTreeNode root) {
        this.mRoot = root;
    }

    public void insertLeftChild(BinaryTreeNode child) {
        checkTreeEmpty();
        mRoot.setLeftNode(child);
    }

    public void insertRightChild(BinaryTreeNode child) {
        checkTreeEmpty();
        mRoot.setRightNode(child);
    }

    private void checkTreeEmpty() {
        if(mRoot == null) {
            throw new IllegalStateException("Can't insert to a null tree!");
        }
    }

    // 删除元素
    public void deleteNode(BinaryTreeNode node) {
        checkTreeEmpty();
        if(node == null) {
            return;
        }
        deleteNode(node.getLeftNode());
        deleteNode(node.getRightNode());
        node = null;
    }

    // 清空二叉树
    public void clear() {
        if(mRoot != null) {
            deleteNode(mRoot);
        }
    }

    // 获取树的高度
    public int getTreeHeight() {
        return this.getHeight(mRoot);
    }

    // 获取指定节点的度
    public int getHeight(BinaryTreeNode node) {
        // 递归出口
        if(node == null) {
            return 0;
        }

        int leftHeight = getHeight(node.getLeftNode());
        int rightHeight = getHeight(node.getRightNode());

        int max = Math.max(leftHeight, rightHeight);

        return max + 1; // 加上自己的高度1
    }

    // 获取节点数
    public int getTreeSize() {
        return this.getSize(mRoot);
    }

    // 获取指定子节点下的节点数
    public int getSize(BinaryTreeNode node) {
        if(node == null) {
            return 0;
        }

        int leftSize = getSize(node.getLeftNode());
        int rightSize = getSize(node.getRightNode());

        return leftSize + rightSize + 1;
    }

    public BinaryTreeNode getParent(BinaryTreeNode node) {

        if(node == mRoot || node == null) {
            return null;
        }else{
            return getParent(mRoot, node);
        }
    }

    /**
     * 递归对比 节点的孩子节点 与 指定节点 是否一致
     * @param subNode 子二叉树根节点
     * @param node 指定节点
     * @return 父节点
     */
    private BinaryTreeNode getParent(BinaryTreeNode subNode, BinaryTreeNode node) {
        if(subNode == null) {
            return null;
        }
        // 正好这个根节点的左右孩子之一与目标节点一致
        if(subNode.getLeftNode() == node || subNode.getRightNode() == node) {
            return subNode;
        }

        BinaryTreeNode parent = getParent(subNode.getLeftNode(), node);

        // 左子树节点就是指定节点
        if(parent != null) {
            return parent;
        }else{
            return getParent(subNode.getRightNode(), node);
        }
    }

}
