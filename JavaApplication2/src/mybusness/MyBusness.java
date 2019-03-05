/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybusness;

import model.items.classes.TreeContainer;
import java.util.Random;
import model.items.classes.Item;

/**
 *
 * @author 5
 */
public class MyBusness {

    public static void main(String[] args) {
        
        Random rand = new Random();
        int inf;

        TreeContainer tree = new TreeContainer();
        for (int i = 0; i < 16; i++) {
           inf = rand.nextInt(200);
           Item item = new Item(inf);
           tree.add(item);
        }
        
        System.out.println(tree.LeftToString());
        System.out.println("\n");
        System.out.println(tree.RightToString());
        
    }

}
