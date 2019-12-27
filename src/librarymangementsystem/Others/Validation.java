/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package librarymangementsystem.Others;

import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class Validation {
    
    
    
    public static void enableTypingOnlyCurrencies(JTextField jCuJTextField) {
        try {
            Integer.parseInt(jCuJTextField.getText());
        } catch (NumberFormatException ex) {
            jCuJTextField.setText("");
        }
    }
}
