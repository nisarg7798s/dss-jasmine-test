/*
 * This file is generated by jOOQ.
 */
package com.nisarg.database.tables.pojos;


import com.nisarg.database.tables.interfaces.IAdrights;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(name = "adrights", schema = "public", indexes = {
    @Index(name = "adrights_pkey", unique = true, columnList = "id ASC")
})
public class Adrights implements IAdrights {

    private static final long serialVersionUID = 344117109;

    private Integer id;
    private String  alId;
    private String  text;
    private String  type;

    public Adrights() {}

    public Adrights(IAdrights value) {
        this.id = value.getId();
        this.alId = value.getAlId();
        this.text = value.getText();
        this.type = value.getType();
    }

    public Adrights(
        Integer id,
        String  alId,
        String  text,
        String  type
    ) {
        this.id = id;
        this.alId = alId;
        this.text = text;
        this.type = type;
    }

    @Id
    @Column(name = "id", unique = true, nullable = false, precision = 32)
    @NotNull
    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "al_id", length = 100)
    @Size(max = 100)
    @Override
    public String getAlId() {
        return this.alId;
    }

    @Override
    public void setAlId(String alId) {
        this.alId = alId;
    }

    @Column(name = "text", length = 50)
    @Size(max = 50)
    @Override
    public String getText() {
        return this.text;
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Column(name = "type", length = 50)
    @Size(max = 50)
    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Adrights (");

        sb.append(id);
        sb.append(", ").append(alId);
        sb.append(", ").append(text);
        sb.append(", ").append(type);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IAdrights from) {
        setId(from.getId());
        setAlId(from.getAlId());
        setText(from.getText());
        setType(from.getType());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IAdrights> E into(E into) {
        into.from(this);
        return into;
    }
}
