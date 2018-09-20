/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author User
 */
public class A {
    private int a;
    public void setA (int nilai){
        a = nilai;
    }
    public int get(){
        return a;
    }
    public void tampilkanNilai(){
        System.out.println("Nilai a : "+getA());
    }

    private String getA() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
