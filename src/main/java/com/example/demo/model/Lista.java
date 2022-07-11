/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "lista")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lista.findAll", query = "SELECT l FROM Lista l"),
    @NamedQuery(name = "Lista.findByIdLista", query = "SELECT l FROM Lista l WHERE l.idLista = :idLista"),
    @NamedQuery(name = "Lista.findByNombre", query = "SELECT l FROM Lista l WHERE l.nombre = :nombre"),
    @NamedQuery(name = "Lista.findByDescripcion", query = "SELECT l FROM Lista l WHERE l.descripcion = :descripcion")})
public class Lista implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_lista")
    private Integer idLista;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "descripcion")
    private String descripcion;
    @JoinColumn(name = "id_musica", referencedColumnName = "id_musica")
    @ManyToOne(optional = false)
    private Musica idMusica;

    public Lista() {
    }

    public Lista(Integer idLista) {
        this.idLista = idLista;
    }

    public Lista(Integer idLista, String nombre, String descripcion) {
        this.idLista = idLista;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Integer getIdLista() {
        return idLista;
    }

    public void setIdLista(Integer idLista) {
        this.idLista = idLista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Musica getIdMusica() {
        return idMusica;
    }

    public void setIdMusica(Musica idMusica) {
        this.idMusica = idMusica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLista != null ? idLista.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lista)) {
            return false;
        }
        Lista other = (Lista) object;
        if ((this.idLista == null && other.idLista != null) || (this.idLista != null && !this.idLista.equals(other.idLista))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.demo.model.Lista[ idLista=" + idLista + " ]";
    }
    
}
