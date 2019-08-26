/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Kenneth Mogopodi
 */
public class InterestBearing extends Account implements Withdraw, PayInterest{
    
    public InterestBearing(int accNumber, String accHolder, double balance, String branch) {
        super(accNumber, accHolder, balance, branch);
    }

    @Override
    public void withdraw(double amount) {
        this.balance= balance - amount;
    }

    @Override
    public void payInterest(double rate) {
        this.balance = balance*rate;
    }
    
    
}
