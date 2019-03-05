/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.items.classes.arrays;

import model.items.classes.ContainerOfItems;
import model.items.classes.Item;

/**
 *
 * @author 5
 */
public abstract class ArrayContainer extends ContainerOfItems{
    
    int sizeOfArray = 0;
    Item[]array = null;
    Item[]ArrayBuf = null;
  
    @Override
    public int size()
    {
        return sizeOfArray;
    }
    
    @Override
    public boolean isEmpty()
    {
       return size()==0;
    }
    
    @Override
    public abstract void add(Item i);
    
    public abstract void del(int n);
    
}
