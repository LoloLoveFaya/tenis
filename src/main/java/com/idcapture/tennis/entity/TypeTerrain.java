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
@Table(name = "TYPES_TERRAIN")
public class TypeTerrain implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(nullable = false)
    private String codeTypeTerrain;

    public TypeTerrain() {

    }

    public TypeTerrain(Long id, String codeTypeTerrain) {
        this.id = id;
        this.codeTypeTerrain = codeTypeTerrain;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodeTypeTerrain() {
        return codeTypeTerrain;
    }

    public void setCodeTypeTerrain(String codeTypeTerrain) {
        this.codeTypeTerrain = codeTypeTerrain;
    }

    @Override
    public String toString() {
        return "com.idcapture.tennis.entity.TypeTerrain[ id=" + id + " ]";
    }

}
