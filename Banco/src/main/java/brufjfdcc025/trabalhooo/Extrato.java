/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brufjfdcc025.trabalhooo;
/**
 *
 * @author Mari Richa
 */
public class Extrato {
    private String tipo;
    private float val;
    //data
    
    public Extrato(String tipo, float valor){
        this.tipo=tipo;
        this.val=valor;
    }
    
    public String imprime(){
        return ("Tipo: "+tipo+ " Valor: R$"+ val);
    }
    
    @Override
    public String toString() {
        return ("Tipo: "+tipo+ " Valor: R$"+ val);
    }
    
    
    
}
