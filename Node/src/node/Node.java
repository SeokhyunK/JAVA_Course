package node;

/**
 *
 * @author seokhyun
 */
public class Node {
    private String value;
    private Node nextNode;
    
    public String getVal() {
        return this.value;
    }
    public void setVal(String value) {
        this.value=value;
    }
    public Node getNextNode() {
        return nextNode;
    }
    public void setNextNode(Node nextNode) {
        this.nextNode=nextNode;
    }
    public Node(String value) {
        this.value=value;
        nextNode=null;
    }
    public Node(String value, Node nextNode) {
        this.value=value;
        this.nextNode=nextNode;
    }
}
