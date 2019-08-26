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
public class Savings extends Account implements PayInterest{
    
    public Savings(int accNumber, String accHolder, double balance, String branch) {
        super(accNumber, accHolder, balance, branch);
    }
    
    @Override
    public void payInterest(double rate){
        this.balance+=balance*rate;
    }
    
}
