/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Model.*;
/**
 *
 * @author Jorge
 */
public class BancoSwingOO {
	
    /**
     * @param args the command line arguments
     */
	
    public static void main(String[] args) {
        
        Menu m = new Menu();
        m.setTitle("*** MENU DE OPÇÕES ***");
        m.setLocationRelativeTo(null);
        m.setVisible(true);
        
    }
    
    public static Banco banco = new Banco();
    
}
