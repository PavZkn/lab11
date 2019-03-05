package model.items.classes;

public class TreeContainer extends ContainerOfItems{

    Node root;

    private class Node {

        Item item;
        Node p;
        Node l;
        Node r;

        public Node(Item item, Node p) {
            this.item = item;
            this.p = p;
        }

    }

    private Node add(Node n, Node p, Item item) {
        if (n == null) {
            n = new Node(item, p);
        } else {
            if (item.getInf() >= n.item.getInf()) {
                n.r = add(n.r, n, item);
            } else {
                n.l = add(n.l, n, item);
            }
        }
        return n;
    }
    
    @Override
    public void add(Item item) {
        root = add(root, null, item);
    }

    private String makeStringL(Node n) {
        if (n != null) {
            return makeStringL(n.l) + n.item.getInf() + "\t" + makeStringL(n.r);
        } else {
            return "";
        }
    }

    private String makeStringR(Node n) {
        if (n != null) {
            return makeStringR(n.r) + n.item.getInf()+ "\t" + makeStringR(n.l);
        } else {
            return "";
        }
    }

    @Override
    public String toString() {
        return makeStringL(root);
    }

    public String LeftToString() {
        return makeStringL(root);
    }

    public String RightToString() {
        return makeStringR(root);
    }

    private int size(Node n) {
        if (n == null) {
            return 0;
        } else {
            return size(n.l) + 1 + size(n.r);
        }
    }
    
    @Override
    public int size() {
        return size(root);
    }

    @Override
    public boolean isEmpty() {
        return size(root) == 0;
    }
    
    @Override
    public void del(int i){
    };
    
}

