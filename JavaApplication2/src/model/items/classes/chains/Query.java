
package model.items.classes.chains;

import model.items.classes.Item;

/**
 *
 * @author 5
 */
public class Query extends ChainContainer {
    Node last = null;
    Node n;
    
    private class Node{
        Node next;
        Item item;

        Node(Item item) {
            this.item = item;
        }
    }    
    
    @Override
    public void del(int key) {
        if (isEmpty()) {
            System.out.println("Void container!");
        } 
        else 
        {
            boolean flag = false;
            Node ptr = n;
            flag = (testFirstElem(key));
            if (!flag) {
                flag = testMidlePart(ptr, key);
            }
            if (!flag) {
                flag = testLastElem(ptr, key);
            }
            if (!flag) {
                System.out.println("Element not found");
            }
        }
    }

    @Override
    public void add(Item item) {
        Node newElem = new Node(item);
        last.next = newElem;
        last = newElem;
    }

    private boolean testFirstElem(int key) {
            if(n.item.getKey() == key) {
                if(n.next == null)
                {
                    last = null;
                    n = null;
                }
                else
                {
                    n = n.next;
                }
                return true;
            }
        return false;
    }

    private boolean testMidlePart(Node ptr, int key) {
        while (ptr.next != last) {
            if (ptr.next.item.getKey() == key) {
                ptr.next = ptr.next.next;
                return true;
            }
        }
        return false;
    }

    private boolean testLastElem(Node ptr, int key) {
        if (ptr.next.item.getKey() == key) {
            ptr.next = null;
            last = ptr;
            return true;
        }
        return false;
    }
    
    @Override
    public String toString(){
        StringBuilder strBuf = new StringBuilder("");
        Node ptr = n.next;
        while (ptr != null)
        {
            strBuf.append(ptr.item.toString());
        }
        return strBuf.toString();
    }
}
