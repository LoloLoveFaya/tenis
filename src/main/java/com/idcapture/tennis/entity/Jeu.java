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
@Table(name = "JEUX")
public class Jeu implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(nullable = false)
    private String codeJeu;

    public Jeu() {

    }

    public Jeu(Long id, String codeJeu) {
        this.id = id;
        this.codeJeu = codeJeu;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodeJeu() {
        return codeJeu;
    }

    public void setCodeJeu(String codeJeu) {
        this.codeJeu = codeJeu;
    }

    @Override
    public String toString() {
        return "com.idcapture.tennis.entity.Jeu[ id=" + id + " ]";
    }

}
