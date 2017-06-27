/*
 * Author: Derek Banas
 * http://www.newthinktank.com/2012/09/facade-design-pattern-tutorial/
 */
package pattern.structural.facade.bank;

public class TestBankAccount {

    public static void main(String[] args){

        BankAccountFacade accessingBank = new BankAccountFacade(12345678, 1234);

        accessingBank.withdrawCash(50.00);

        accessingBank.withdrawCash(990.00);

    }

}
