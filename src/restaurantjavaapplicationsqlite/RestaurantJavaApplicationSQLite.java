/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantjavaapplicationsqlite;
       
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Tylor
 */
public class RestaurantJavaApplicationSQLite {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // main application logic
        LoginFrame lf = new LoginFrame();
        // lf.setDefaultCloseOperation(lf.DO_NOTHING_ON_CLOSE); // this is how we're blocking closing.
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        lf.setSize(screenSize);
        AltTabDenier atd = new AltTabDenier(lf);
        atd.run();
        
        
    }
    
}
