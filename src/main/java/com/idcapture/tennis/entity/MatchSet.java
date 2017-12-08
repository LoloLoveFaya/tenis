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
@Table(name = "MATCHS_SET")
public class MatchSet implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idMatch")
    private Match match;

    @ManyToOne
    @JoinColumn(name = "idSet")
    private Set set;

    public MatchSet() {

    }

    public MatchSet(Match match, Set set) {
        this.match = match;
        this.set = set;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    

    @Override
    public String toString() {
        return "com.idcapture.tennis.entity.MatchSet[ id=" + id + " ]";
    }

}
