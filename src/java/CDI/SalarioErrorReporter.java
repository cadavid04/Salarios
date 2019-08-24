/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CDI;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 *
 * @author itmanager
 */
public class SalarioErrorReporter implements SalarioErrorHandler{

    @Override
    public void handlerSalario(Salario salario) {
    System.out.println("El salario no válido " + salario + " por favor verificar los campos");}
    
    @PostConstruct
    public void init(){
        System.out.println("Creando archivo de reporte error");
    }
    
    @PreDestroy
    public void release(){
        System.out.println("Cerrando archivo de reporte error");
    }
    
}
