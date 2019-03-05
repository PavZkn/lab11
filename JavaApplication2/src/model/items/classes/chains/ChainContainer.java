/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.items.classes.chains;

import model.items.classes.ContainerOfItems;
import model.items.classes.Item;

/**
 *
 * @author 5
 */
public abstract class ChainContainer extends ContainerOfItems{
    private Node n;
    
    private class Node{
        Node next;
        Item item;

        Node(Item item) {
            this.item = item;
        }
    }    
    
    @Override 
    public abstract void add(Item item);
    
    @Override
    public abstract void del(int key);
    
    @Override
    public int size(){
        Node ptr = n;
        int len = 0;
        while(ptr != null){
            ptr = ptr.next;
            len++;
        }
        return len;
    }
    
    @Override
    public boolean isEmpty()
    {
        return n == null;
    }
    
}
