/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ip_cutter;

/**
 *
 * @author Kimo Store
 */
public class Ip_cutter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cutter mycutter = new Cutter();
        int [] result = mycutter.operation("192.168.3.154");
        
        for(int i=0;i<result.length;i++)
        {
            System.out.println(result[i]);
        }
    }
    
}
