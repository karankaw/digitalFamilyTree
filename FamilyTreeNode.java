import java.util.ArrayList;
import java.util.List;

public class FamilyTreeNode<T>{
    private T data = null;
    private List<FamilyTreeNode> children = new ArrayList<>();
    private FamilyTreeNode parent = null;

    public FamilyTreeNode(T data) {
        this.data = data;
    }

    public void addChild(FamilyTreeNode child) {
        child.setParent(this);
        this.children.add(child);
    }

    public void addChild(T data) {
        FamilyTreeNode<T> newChild = new FamilyTreeNode<>(data);
        newChild.setParent(this);
        children.add(newChild);
    }

    public void addChildren(List<FamilyTreeNode> children) {
        for(FamilyTreeNode t : children) {
            t.setParent(this);
        }
        this.children.addAll(children);
    }

    public List<FamilyTreeNode> getChildren() {
        return children;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private void setParent(FamilyTreeNode parent) {
        this.parent = parent;
    }

    public FamilyTreeNode getParent() {
        return parent;
    }

    public String toString(){
       return null; 
    }

}