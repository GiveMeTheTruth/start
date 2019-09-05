import java.util.List;

/**
 * 树节点（链表形式实现）
 */
public class LinkedTreeNode {

    private Object mData; // 存储数据
    private LinkedTreeNode mParent; // 父节点下标
    private List<LinkedTreeNode> mChildTreeNodeList; // 子节点引用

    public LinkedTreeNode(Object data, LinkedTreeNode parent) {
        mData = data;
        mParent = parent;
    }

    public Object getmData() {
        return mData;
    }

    public void setmData(Object mData) {
        this.mData = mData;
    }

    public LinkedTreeNode getmParent() {
        return mParent;
    }

    public void setmParent(LinkedTreeNode mParent) {
        this.mParent = mParent;
    }

    public List<LinkedTreeNode> getmChildTreeNode() {
        return mChildTreeNodeList;
    }

    public void setmChildTreeNode(List<LinkedTreeNode> mChildTreeNodeList) {
        this.mChildTreeNodeList = mChildTreeNodeList;
    }
}
