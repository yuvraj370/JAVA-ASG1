/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niit;

import java.util.Scanner;
import sun.security.util.ArrayUtil;

/**
 *
 * @author Yuvraj
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product arr[] = new Product[10];
        int value = 0, p_quanty = 0, count = 0, p_id = 0, i = 0;
        String p_name = null;
        do {
            System.out.println("1.creat a product");
            System.out.println("2.updat a product");
            System.out.println("3.view a product");
            System.out.println("4.remove a product");
            System.out.println("5.to teminate");
            value = sc.nextInt();
            switch (value) {

                case 1: {
                    System.out.println("enter the product name");
                    p_name = sc.next();
                    System.out.println("enter the product id");
                    p_id = sc.nextInt();
                    System.out.println("enter product Quanty");
                    p_quanty = sc.nextInt();
                    Product p = new Product(p_id, p_name, p_quanty);
                    System.out.println("\n");
                    System.out.println("your product detalis");
                    System.out.println("product name:" + p.getName());
                    System.out.println("product Id:" + p.getId());
                    System.out.println("product Quanty" + p.getQuanty());
                    arr[i] = p;
                    i++;
                    break;
                }

                case 2: {
                    int find;
                    System.out.println("enter the id to update the product quanty");
                    find = sc.nextInt();
                    boolean foun = false;
                    for (int a = 0; a < i; a++) {

                        if (arr[a].getId() == find) {
                            System.out.println("your Id:" + arr[a].getId());
                            System.out.println("pervious quanty" + arr[a].getQuanty());
                            System.out.println("enter the quanty to update");
                            p_quanty = sc.nextInt();
                            Product p = new Product(p_id, p_name, p_quanty);
                            arr[a] = p;
                            System.out.println("the product\t" + arr[a].getName() + "\tquanty is been upadted");
                        }
                        if (foun) {
                        } else {
                            System.out.println("not found");
                        }
                    }
                    break;
                }

                case 3: {
                    int find;
                    System.out.println("enter id");
                    find = sc.nextInt();
                    boolean foun = false;
                    for (int a = 0; a < i; a++) {

                        if (arr[a].getId() == find) {
                            System.out.println("your Id:" + arr[a].getId());
                            System.out.println("product name:" + arr[a].getName());
                            System.out.println("product Quanty" + arr[a].getQuanty());
                            foun = true;
                        }
                        if (foun) {
                        } else {
                            System.out.println("not found");
                        }
                    }
                    break;
                }
                case 4: {
                    int find;
                    System.out.println("enter the id to remove the product");
                    find = sc.nextInt();
                    boolean foun = false;
                    for (int a = 0; a < i; a++) {

                        if (arr[a].getId() == find) {
                            System.out.println("your Id:" + arr[a].getId());
                            p_name = " this product is been removed";
                            p_quanty = 0;
                            Product p = new Product(p_id, p_name, p_quanty);
                            arr[a] = p;
                            System.out.println("this product is removed");

                        }
                    }
                    if (foun) {
                    } else {
                        System.out.println("not found");
                    }
                    break;
                }
            }
        } while (value != 5);
    }

}
