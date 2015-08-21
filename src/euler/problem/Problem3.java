/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler.problem;

/**
 *
 * @author mashuk
 */
public class Problem3 {

    public static void main(String[] args) {
        int lg = 0;

        for (int i = 999; i >= 100; i--) {
            for (int j = 999; j >= 100; j--) {
                String pl = String.valueOf(i * j);
                String rpl = new StringBuilder(pl).reverse().toString();
                if (pl.equals(rpl)) {
                    if (lg < Integer.parseInt(pl)) {
                        lg = Integer.parseInt(pl);
                    }
                }
            }
        }
        System.out.println("lg = " + lg);
    }
}
