/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "musica")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Musica.findAll", query = "SELECT m FROM Musica m"),
    @NamedQuery(name = "Musica.findByIdMusica", query = "SELECT m FROM Musica m WHERE m.idMusica = :idMusica"),
    @NamedQuery(name = "Musica.findByTitulo", query = "SELECT m FROM Musica m WHERE m.titulo = :titulo"),
    @NamedQuery(name = "Musica.findByArtista", query = "SELECT m FROM Musica m WHERE m.artista = :artista"),
    @NamedQuery(name = "Musica.findByAlbum", query = "SELECT m FROM Musica m WHERE m.album = :album"),
    @NamedQuery(name = "Musica.findByYear", query = "SELECT m FROM Musica m WHERE m.year = :year")})
public class Musica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_musica")
    private Integer idMusica;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "titulo")
    private String titulo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "artista")
    private String artista;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "album")
    private String album;
    @Basic(optional = false)
    @NotNull
    @Column(name = "year")
    private int year;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMusica")
    private Collection<Lista> listaCollection;

    public Musica() {
    }

    public Musica(Integer idMusica) {
        this.idMusica = idMusica;
    }

    public Musica(Integer idMusica, String titulo, String artista, String album, int year) {
        this.idMusica = idMusica;
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.year = year;
    }

    public Integer getIdMusica() {
        return idMusica;
    }

    public void setIdMusica(Integer idMusica) {
        this.idMusica = idMusica;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @XmlTransient
    public Collection<Lista> getListaCollection() {
        return listaCollection;
    }

    public void setListaCollection(Collection<Lista> listaCollection) {
        this.listaCollection = listaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMusica != null ? idMusica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Musica)) {
            return false;
        }
        Musica other = (Musica) object;
        if ((this.idMusica == null && other.idMusica != null) || (this.idMusica != null && !this.idMusica.equals(other.idMusica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.demo.model.Musica[ idMusica=" + idMusica + " ]";
    }
    
}
