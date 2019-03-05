package model.items.classes.chains;

import model.items.classes.Item;

/**
 *
 * @author 5
 */
public class DoubleLinkedList extends ChainContainer{
    
    NodeOfDoubleLinkedList nodl;
    NodeOfDoubleLinkedList last = null;

    protected class NodeOfDoubleLinkedList {
        NodeOfDoubleLinkedList next;
        NodeOfDoubleLinkedList prev;
        Item item;

        private NodeOfDoubleLinkedList(Item item) {
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
            NodeOfDoubleLinkedList ptr = nodl;
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
        NodeOfDoubleLinkedList newElem = new NodeOfDoubleLinkedList(item);
        last.next = newElem;
        last = newElem;
    }

    private boolean testFirstElem(int key) {
            if(nodl.item.getKey() == key) {
                if(nodl.next == null)
                {
                    last = null;
                    nodl = null;
                }
                else
                {
                    nodl = nodl.next;
                    nodl.prev = null;
                }
                return true;
            }
        return false;
    }

    private boolean testMidlePart(NodeOfDoubleLinkedList ptr, int key) {
        while (ptr.next != last) {
            if (ptr.next.item.getKey() == key) {
                ptr.next = ptr.next.next;
                ptr.next.prev = ptr;
                return true;
            }
        }
        return false;
    }

    private boolean testLastElem(NodeOfDoubleLinkedList ptr, int key) {
        if (ptr.next.item.getKey() == key) {
            ptr.next = null;
            last = ptr;
            return true;
        }
        return false;
    }
    
    @Override
    public String toString(){
        StringBuffer strBuf = new StringBuffer("");
        NodeOfDoubleLinkedList ptr = nodl.next;
        while (ptr != null)
        {
            strBuf.append(ptr.item.toString());
            ptr = ptr.next;
        }
        return strBuf.toString();
    }
}

