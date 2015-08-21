/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler.problem;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mashuk
 */
public class Test {
 static int c = 0;
    public static void run() {
       
        if (c < 60) {
            try {
                c++;
                Thread.sleep(10);
                run();
            } catch (InterruptedException ex) {
                Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void main(String[] args) {
        run();
    }
}
