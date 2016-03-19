/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.exceptions;

/**
 *
 * @author Sylvia
 */
public class CollectionControllerException extends Exception {

    public CollectionControllerException() {
    }

    public CollectionControllerException(String message) {
        super(message);
    }

    public CollectionControllerException(String message, Throwable cause) {
        super(message, cause);
    }

    public CollectionControllerException(Throwable cause) {
        super(cause);
    }

    public CollectionControllerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
