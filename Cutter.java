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
public class Cutter {
    String myString;

    public String getMyString() {
        return myString;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }
    
    public static int []operation (String s)
    {
        String[] splited = s.split("\\.");
        int [] nums = new int [splited.length];

        
    
        for (int i=0;i<splited.length;i++)
        {
            nums[i] = Integer.parseInt(splited[i]);
        }
        return nums;
                
    }
            
}
