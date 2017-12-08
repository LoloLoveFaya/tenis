package com.idcapture.tennis.entity;

import com.sun.istack.internal.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
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
@Table(name = "MATCHS")
public class Match implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(nullable = false)
    private String codeMatch;

    @Column
    private String lieu;

    @Column
    private String competition;

    @Column
    private String phase;

    @ManyToOne
    @JoinColumn
    private TypeTerrain typeTerrain;

    public Match() {

    }

    public Match(Long id, String codeMatch, String lieu, String competition, String phase, TypeTerrain typeTerrain) {
        this.id = id;
        this.codeMatch = codeMatch;
        this.lieu = lieu;
        this.competition = competition;
        this.phase = phase;
        this.typeTerrain = typeTerrain;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "com.idcapture.tennis.entity.Match[ id=" + id + " ]";
    }

}
