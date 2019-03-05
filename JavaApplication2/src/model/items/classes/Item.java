/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.items.classes;

/**
 *
 * @author 5
 */
public class Item {
    static int number = 0;
    int key;
    int inf;
    
    public Item()
    {
        inf = 1;
        key = number;
        number++;
    }
    
    public Item(int inf){
        this();
        this.inf = inf;
    }
    
    public Item(Item item)
    {
        this();
        inf = item.inf;
    }
    public int getInf()
    {
        return inf;
    }; 

    public int getKey() {
        return key;
    }
}
