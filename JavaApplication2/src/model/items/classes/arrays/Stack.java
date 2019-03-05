/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.items.classes.arrays;

import model.items.classes.Item;

/**
 *
 * @author 5
 */
public class Stack extends ArrayContainer{
    
    @Override
    public void add(Item tile)
    {
        int s = this.size();
        ArrayBuf = new Item[s+1];
        System.arraycopy(array, 0, ArrayBuf, 1, s);
        ArrayBuf[0] = tile;
        array = ArrayBuf;
        sizeOfArray++;
    }
    
    @Override
    public void del(int n)
    {
        int s = this.size();
        s--;
        ArrayBuf = new Item[s];
        System.arraycopy(array, 1, ArrayBuf, 0, s);        
        array = ArrayBuf;
        sizeOfArray--;
    }
        
}
