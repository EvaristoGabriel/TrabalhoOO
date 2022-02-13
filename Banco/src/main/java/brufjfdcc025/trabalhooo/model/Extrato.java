/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brufjfdcc025.trabalhooo.model;

import java.util.Date;

/**
 *
 * @author Mari Richa
 */
public class Extrato {
    private String tipo;
    private float val;
    private Date data;
    
    public Extrato(String tipo, float valor, Date data){
        this.tipo=tipo;
        this.val=valor;
        this.data=data;
    }

    public String getTipo() {
        return tipo;
    }

    public float getVal() {
        return val;
    }

    public Date getData() {
        return data;
    }
    
    
    
    @Override
    public String toString() {
        return ("Tipo: "+tipo+ " Valor: R$"+ val +"  " + data);
    }
    
    
    
}
