/*
 * Author: Derek Banas
 * http://www.newthinktank.com/2012/09/facade-design-pattern-tutorial/
 */
package pattern.structural.facade.bank;

public class SecurityCodeCheck {

    private int securityCode = 1234;

    public int getSecurityCode() { return securityCode; }

    public boolean isCodeCorrect(int secCodeToCheck){

        if(secCodeToCheck == getSecurityCode()) {

            return true;

        } else {

            return false;

        }

    }

}