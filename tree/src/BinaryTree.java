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

    /**
     * 插入左子节点
     * @param child 节点
     */
    public void insertLeftChild(BinaryTreeNode child) {
        checkTreeEmpty();
        mRoot.setLeftNode(child);
    }

    /**
     * 插入右子节点
     * @param child 节点
     */
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

    /**
     * 获取指定节点的父节点
     * @param node 节点
     * @return 父节点
     */
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

    // 遍历
    // 根据不同的场景中，根节点、左右子树遍历的顺序，二叉树的遍历分为三种
    // 1、先序遍历
    // 2、中序遍历
    // 3、后序遍历
    // 这里先序、中序、后序指的是 根节点相对左右子树的遍历顺序。

    // 先序遍历
    // 即根节点在左右子树之前遍历：
    // 先访问根节点
    // 再先序遍历左子树
    // 再先序遍历右子树
    // 退出

    /**
     * 先序遍历
     * @param node 节点
     */
    public void iterateFirstOrder(BinaryTreeNode node) {

        if(node == null) {
            return;
        }

        operate(node);
        iterateFirstOrder(node.getLeftNode());
        iterateFirstOrder(node.getRightNode());
    }

    /**
     * 模拟操作
     * @param node 节点
     */
    private void operate(BinaryTreeNode node) {
        if(node == null) {
            return;
        }

        System.out.println(node.getData());
    }

    // 中序遍历
    // 遍历顺序：
    // 先中序遍历左子树
    // 再访问根节点
    // 再中序遍历右子树
    // 退出

    /**
     * 中序遍历
     * @param node 节点
     */
    public void iterateMediumOrder(BinaryTreeNode node) {
        if(node == null) {
            return;
        }
        iterateMediumOrder(node.getLeftNode());
        operate(node);
        iterateMediumOrder(node.getRightNode());

    }

    // 后序遍历
    // 即根节点在左右子树之后遍历：
    // 先后序遍历左子树
    // 再后序遍历右子树
    // 最后访问根节点
    // 退出

    /**
     * 后序遍历
     * @param node 节点
     */
    public void iterateLastOrder(BinaryTreeNode node) {
        if(node == null) {
            return;
        }

        iterateLastOrder(node.getLeftNode());
        iterateLastOrder(node.getRightNode());
        operate(node);
    }


}
