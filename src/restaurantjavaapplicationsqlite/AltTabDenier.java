/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantjavaapplicationsqlite;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

/**
 *
 * @author Tylor
 */
public class AltTabDenier implements Runnable
{
     private boolean working = true;
     private JFrame frame;

     public AltTabDenier(JFrame frame)
     {
          this.frame = frame;
     }

     public void stop()
     {
          working = false;
     }

     public static AltTabDenier create(JFrame frame)
     {
         AltTabDenier blocker = new AltTabDenier(frame);
         new Thread(blocker, "Alt-Tab Denier").start();
         return blocker;
     }

     public void run()
     {
         try
         {
             Robot robot = new Robot();
             while (working)
             {
                  robot.keyRelease(KeyEvent.VK_ALT);
                  robot.keyRelease(KeyEvent.VK_TAB);
                  frame.requestFocus();
                  try { Thread.sleep(10); } catch(Exception e) {}
             }
         } catch (Exception e) { e.printStackTrace(); System.exit(-1); }
     }
}