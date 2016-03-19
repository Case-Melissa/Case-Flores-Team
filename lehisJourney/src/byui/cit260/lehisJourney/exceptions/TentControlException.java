/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.exceptions;

/**
 *
 * @author AllenMac
 */
public class TentControlException extends Exception {

    public TentControlException() {
    }

    public TentControlException(String message) {
        super(message);
    }

    public TentControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public TentControlException(Throwable cause) {
        super(cause);
    }

    public TentControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
