/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CDI;

import java.util.List;
import javax.faces.bean.RequestScoped;

import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author itmanager
 */

@Named
@RequestScoped
public class SalarioProcessor {
    
   @Inject
    private SalarioValidator salarioValidator;
    
   @Inject
    private SalarioDAO salarioDAO;

   @Inject
    private SalarioErrorHandler salarioErrorHandler;
    
   
   
  
    public void execute (){
         List<Salario> salarios = salarioDAO.fetchSalarios();
        for (Salario salario : salarios){
            System.out.print("************************************************************"+" \n"
                    + "El Salario de  " + salario.getNombre() + ":"+" \n"+
                    "Salario base: " + salario.getSalario()+ " \n"+
                    "Horas extras: " + salario.getHorasExtras()+ " horas " + "*" +" valor hora extra: "+ salario.getValorHorasExrtras()+ " Total por horas extras: "+ (salario.getHorasExtras()*salario.getValorHorasExrtras())+ "\n"+
                     "Comisiones: " + salario.getComision()+ " \n"+" \n"+
                     "TOTAL SALARIO: "+ (salario.getSalario()+salario.getComision()+(salario.getHorasExtras()*salario.getValorHorasExrtras())) +" \n"+"************************************************************"
                      +" (Valid) = "+ salarioValidator.IsValido(salario));
            if ( !salarioValidator.IsValido(salario))
               {salarioErrorHandler.handlerSalario(salario);} 
        }
    }
    
    public void ingresar (int salario, String nombre, int horasExtras, int valorHorasExrtras, int comision){
        salarioDAO.ingresarSalario(salario, nombre, horasExtras, valorHorasExrtras, comision);
        System.out.println("Salario Ingresado correctamente: "+ " \n"
                +"Nombre: " + nombre + " \n"+
                "Salario Base: " + salario + " \n"+
                "Horas extras: " + horasExtras + " \n"+
                "valor horas extras: " + valorHorasExrtras + " \n"+
                "Comision: " + comision + " \n" 
                );
        
        
        
        
    }
}
