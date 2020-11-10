/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

/**
 *
 * @author papon
 */
public class CheckEmpty {
    
    
    public static boolean checkEmpty(String str){
        int len = str.length();
        if(str.equals("")){
            return true;
        }
        else{
            if(len > 0){
                for(int i=0; i<len; i++){
                    if(!(str.charAt(i) == ' ')) {
                    return false;
                
                    }
                }
                return true;
            }
            
        }
            return false;
    }
    
}
