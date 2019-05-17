package node;

/**
 *
 * @author seokhyun
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Node n1 = new Node ("1");
        Node n2 = new Node ("2");
        Node n3 = new Node ("3");
        Node n4 = new Node ("4");
        Node n5 = new Node ("5");
        
        
        List customList = new List(n1);
        customList.addToEndOfList(n2);
        customList.addToEndOfList(n3);
        customList.addToEndOfList(n4);
        customList.addToEndOfList(n5);
        
        customList.printAll();
    }
    
}
