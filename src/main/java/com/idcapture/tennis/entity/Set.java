package com.idcapture.tennis.entity;

import com.sun.istack.internal.NotNull;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author bargenson
 */
@Entity
@Table(name = "SETS")
public class Set implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(nullable = false)
    private String codeSet;

    @Column(nullable = false)
    private Integer numeroSet;

    public Set() {

    }

    public Set(Long id, String codeSet, Integer numeroSet) {
        this.id = id;
        this.codeSet = codeSet;
        this.numeroSet = numeroSet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodeSet() {
        return codeSet;
    }

    public void setCodeSet(String codeSet) {
        this.codeSet = codeSet;
    }

    public Integer getNumeroSet() {
        return numeroSet;
    }

    public void setNumeroSet(Integer numeroSet) {
        this.numeroSet = numeroSet;
    }

    @Override
    public String toString() {
        return "com.idcapture.tennis.entity.Set[ id=" + id + " ]";
    }

}
