/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CDI;

/**
 *
 * @author itmanager
 */
public class Salario {
    private int salario;
    private String nombre;
    private int horasExtras;
    private int valorHorasExrtras;
    private int comision;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public Salario(int salario, String nombre, int horasExtras, int valorHorasExrtras, int comision) {
        this.salario = salario;
        this.nombre = nombre;
        this.horasExtras = horasExtras;
        this.valorHorasExrtras = valorHorasExrtras;
        this.comision = comision;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public int getValorHorasExrtras() {
        return valorHorasExrtras;
    }

    public void setValorHorasExrtras(int valorHorasExrtras) {
        this.valorHorasExrtras = valorHorasExrtras;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        return "Salario{" + "salario=" + salario + ", nombre=" + nombre + ", horasExtras=" + horasExtras + ", valorHorasExrtras=" + valorHorasExrtras + ", comision=" + comision + '}';
    }
    
    
}
