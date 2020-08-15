/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package niit;

/**
 *
 * @author Yuvraj
 */
public class Product {
    private int id;
    private String name;
    private int Quanty;
    
    public Product (int id ,String name, int Quanty)
    {
        this.id=id;
        this.name=name;
        this.Quanty=Quanty;
    }

    
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuanty() {
        return Quanty;
    }

  
    
}
