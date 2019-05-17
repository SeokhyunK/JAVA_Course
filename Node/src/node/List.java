package node;

/**
 *
 * @author seokhyun
 */
public class List {
    private Node start;
    
    public Node getStart() {
        return start;
    }
    public void setStart(Node start) {
        this.start=start;
    }
    public List(Node n) {
        this.start=n;
    }
    public void addToEndOfList(Node n) {
        Node trackNext=start;
        
        while(trackNext.getNextNode()!=null) {
            trackNext=trackNext.getNextNode();
        }
        trackNext.setNextNode(n);
    }
    public void printAll() {
        Node trackNext=start;
        System.out.println(trackNext.getVal());
        
        while(trackNext.getNextNode()!=null) {
            trackNext=trackNext.getNextNode();
            System.out.println(trackNext.getVal());
        }
        
    }
}
