/*
 * This file is generated by jOOQ.
 */
package com.nisarg.database.tables.interfaces;


import java.io.Serializable;

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
public interface IAdrights extends Serializable {

    /**
     * Setter for <code>public.adrights.id</code>.
     */
    public void setId(Integer value);

    /**
     * Getter for <code>public.adrights.id</code>.
     */
    @Id
    @Column(name = "id", unique = true, nullable = false, precision = 32)
    @NotNull
    public Integer getId();

    /**
     * Setter for <code>public.adrights.al_id</code>.
     */
    public void setAlId(String value);

    /**
     * Getter for <code>public.adrights.al_id</code>.
     */
    @Column(name = "al_id", length = 100)
    @Size(max = 100)
    public String getAlId();

    /**
     * Setter for <code>public.adrights.text</code>.
     */
    public void setText(String value);

    /**
     * Getter for <code>public.adrights.text</code>.
     */
    @Column(name = "text", length = 50)
    @Size(max = 50)
    public String getText();

    /**
     * Setter for <code>public.adrights.type</code>.
     */
    public void setType(String value);

    /**
     * Getter for <code>public.adrights.type</code>.
     */
    @Column(name = "type", length = 50)
    @Size(max = 50)
    public String getType();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IAdrights
     */
    public void from(com.nisarg.database.tables.interfaces.IAdrights from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IAdrights
     */
    public <E extends com.nisarg.database.tables.interfaces.IAdrights> E into(E into);
}
