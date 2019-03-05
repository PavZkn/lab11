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
public class Array extends ArrayContainer{
    
    Item[] arr ={};
    
    Array()
    {
        
    }
    
    Array(Item arr[]){
        array = arr;
    }
    
    
    @Override
    public void add(Item item)
    {
        int s = this.size();
        ArrayBuf = new Item[s+1];
        System.arraycopy(array, 0, ArrayBuf, 0, s);
        ArrayBuf[s] = item;
        array = ArrayBuf;
        sizeOfArray++;
    }
    
    @Override
    public void del(int n)
    {
        if (this.size()==0)
        {
            System.out.println("Void Array");
        }
        else
        {
            int s = this.size();
            boolean fl = false;
            for(int i = 0;i<s;i++)
            {
                if(array[i].getKey() == n){
                    ArrayBuf = new Item[s];
                    System.arraycopy(array, 0, ArrayBuf, 0, n-1);
                    System.arraycopy(array, n, ArrayBuf, n-1, s+1-n);
                    array = ArrayBuf;
                    sizeOfArray--;
                    System.out.println("Success");
                    fl = true;
                    break;
                }
            }
            if(fl){System.out.println("Item not found");}           
        }
    }

    boolean isEqual(Array copy) {
        if (size() == copy.size()){
            int len = size();
            for(int i = 0;i<len;i++)
            {
                if(array[i]!=copy.array[i]){
                    return false;
                }
            }
        }
        return true;
    } 
}
