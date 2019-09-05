/**
 * 树节点（数组形式实现）
 */
public class ArrayTreeNode {

    private Object mData;
    private int mParent;

    public ArrayTreeNode(Object data, int parent) {
        mData = data;
        mParent = parent;
    }

    public Object getmData() {
        return mData;
    }

    public void setmData(Object mData) {
        this.mData = mData;
    }

    public int getmParent() {
        return mParent;
    }

    public void setmParent(int mParent) {
        this.mParent = mParent;
    }
}
