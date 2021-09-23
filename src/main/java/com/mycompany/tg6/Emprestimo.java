/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tg6;

/**
 *
 * @author grupo Ranger Verde
 */
public class Emprestimo {
    public boolean LiberaSaldo(int saldo,boolean bomPagador,boolean especial){
        if(especial == true) {
            return true;
        } else if(bomPagador == true) {
            return true;
        } else if(saldo >= 1000) {
            return true;
        } else {
            return false;
        }
    }
}
