package com.idcapture.tennis.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author bargenson
 */
@Entity
@Table(name = "SETS_JEU")
public class SetJeu implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idSet")
    private Set set;

    @ManyToOne
    @JoinColumn(name = "idJeu")
    private Jeu jeu;

    public SetJeu() {

    }

    public SetJeu(Set set, Jeu jeu) {
        this.set = set;
        this.jeu = jeu;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Jeu getJeu() {
        return jeu;
    }

    public void setJeu(Jeu jeu) {
        this.jeu = jeu;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    @Override
    public String toString() {
        return "com.idcapture.tennis.entity.SetJeu[ id=" + id + " ]";
    }

}
