/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CDI;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author itmanager
 */
@Entity
@Table(name = "Salario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Salario_1.findAll", query = "SELECT s FROM Salario_1 s")
    , @NamedQuery(name = "Salario_1.findBySalario", query = "SELECT s FROM Salario_1 s WHERE s.salario = :salario")
    , @NamedQuery(name = "Salario_1.findByNombre", query = "SELECT s FROM Salario_1 s WHERE s.nombre = :nombre")
    , @NamedQuery(name = "Salario_1.findByHorasExtras", query = "SELECT s FROM Salario_1 s WHERE s.horasExtras = :horasExtras")
    , @NamedQuery(name = "Salario_1.findByValorHorasExrtras", query = "SELECT s FROM Salario_1 s WHERE s.valorHorasExrtras = :valorHorasExrtras")
    , @NamedQuery(name = "Salario_1.findByComision", query = "SELECT s FROM Salario_1 s WHERE s.comision = :comision")
    , @NamedQuery(name = "Salario_1.findByPk", query = "SELECT s FROM Salario_1 s WHERE s.pk = :pk")})
public class SalarioE implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "salario")
    private Integer salario;
    @Size(max = 15)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "horasExtras")
    private Integer horasExtras;
    @Column(name = "valorHorasExrtras")
    private Integer valorHorasExrtras;
    @Column(name = "comision")
    private Integer comision;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pk")
    private Integer pk;

    public SalarioE() {
    }

    public SalarioE(Integer pk) {
        this.pk = pk;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(Integer horasExtras) {
        this.horasExtras = horasExtras;
    }

    public Integer getValorHorasExrtras() {
        return valorHorasExrtras;
    }

    public void setValorHorasExrtras(Integer valorHorasExrtras) {
        this.valorHorasExrtras = valorHorasExrtras;
    }

    public Integer getComision() {
        return comision;
    }

    public void setComision(Integer comision) {
        this.comision = comision;
    }

    public Integer getPk() {
        return pk;
    }

    public void setPk(Integer pk) {
        this.pk = pk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pk != null ? pk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalarioE)) {
            return false;
        }
        SalarioE other = (SalarioE) object;
        if ((this.pk == null && other.pk != null) || (this.pk != null && !this.pk.equals(other.pk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CDI.Salario_1[ pk=" + pk + " ]";
    }
    
    
    
}
