/*
 * Author: Derek Banas
 * http://www.newthinktank.com/2012/09/facade-design-pattern-tutorial/
 */
package pattern.structural.facade.bank;

public class AccountNumberCheck{

    private int accountNumber = 12345678;

    public int getAccountNumber() { return accountNumber; }

    public boolean accountActive(int acctNumToCheck){

        if(acctNumToCheck == getAccountNumber()) {

            return true;

        } else {

            return false;

        }

    }

}