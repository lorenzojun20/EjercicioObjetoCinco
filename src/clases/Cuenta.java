/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Lorenzo
 */
public class Cuenta {
     private int NumCuenta;
    private int Identificacion;
    private double SaldoAct;
    private double InteresAn;

    public Cuenta(int numcuenta, int identificacion, double saldoact, double interesan) {
        this.NumCuenta = numcuenta;
        this.Identificacion = identificacion;
        this.SaldoAct = saldoact;
        this.InteresAn = interesan;
    }

    public int getNumCuenta() {
        return NumCuenta;
    }

    public void setNumCuenta(int NumCuenta) {
        this.NumCuenta = NumCuenta;
    }

    public int getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(int Identificacion) {
        this.Identificacion = Identificacion;
    }

    public double getSaldoAct() {
        return SaldoAct;
    }

    public void setSaldoAct(double SaldoAct) {
        this.SaldoAct = SaldoAct;
    }

    public double getInteres() {
        return InteresAn;
    }

    public void setInteres(double InteresAn) {
        this.InteresAn = InteresAn;
    }
public double actualizar_saldo(){
    
    double saldo_actualizado, interesdiario,aux;
    
    aux = this.InteresAn/365;
    interesdiario = this.SaldoAct + aux;
    this.SaldoAct = interesdiario;
    saldo_actualizado = this.SaldoAct;
    
    return saldo_actualizado;
    
    
    
    
}
    

   
}

