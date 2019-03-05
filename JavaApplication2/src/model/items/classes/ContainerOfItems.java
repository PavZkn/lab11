/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.items.classes;

import model.items.interfaces.DelItem;
import model.items.interfaces.GiveSize;
import model.items.interfaces.IsEmpty;
import model.items.interfaces.AddItem;

public abstract class ContainerOfItems implements AddItem,DelItem,GiveSize,IsEmpty{
    
    @Override
    public abstract boolean isEmpty();
    
    @Override
    public abstract void add(Item item);
    
    @Override
    public abstract void del(int i);
    
    @Override
    public abstract int size();
    
}
