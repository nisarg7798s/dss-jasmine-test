/*
 * This file is generated by jOOQ.
 */
package com.nisarg.database.tables.records;


import com.nisarg.database.tables.Adrights;
import com.nisarg.database.tables.interfaces.IAdrights;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


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
public class AdrightsRecord extends UpdatableRecordImpl<AdrightsRecord> implements Record4<Integer, String, String, String>, IAdrights {

    private static final long serialVersionUID = 1250365719;

    /**
     * Setter for <code>public.adrights.id</code>.
     */
    @Override
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.adrights.id</code>.
     */
    @Id
    @Column(name = "id", unique = true, nullable = false, precision = 32)
    @NotNull
    @Override
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.adrights.al_id</code>.
     */
    @Override
    public void setAlId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.adrights.al_id</code>.
     */
    @Column(name = "al_id", length = 100)
    @Size(max = 100)
    @Override
    public String getAlId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.adrights.text</code>.
     */
    @Override
    public void setText(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.adrights.text</code>.
     */
    @Column(name = "text", length = 50)
    @Size(max = 50)
    @Override
    public String getText() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.adrights.type</code>.
     */
    @Override
    public void setType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.adrights.type</code>.
     */
    @Column(name = "type", length = 50)
    @Size(max = 50)
    @Override
    public String getType() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Adrights.ADRIGHTS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Adrights.ADRIGHTS.AL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Adrights.ADRIGHTS.TEXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Adrights.ADRIGHTS.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getAlId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getAlId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdrightsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdrightsRecord value2(String value) {
        setAlId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdrightsRecord value3(String value) {
        setText(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdrightsRecord value4(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdrightsRecord values(Integer value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
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

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AdrightsRecord
     */
    public AdrightsRecord() {
        super(Adrights.ADRIGHTS);
    }

    /**
     * Create a detached, initialised AdrightsRecord
     */
    public AdrightsRecord(Integer id, String alId, String text, String type) {
        super(Adrights.ADRIGHTS);

        set(0, id);
        set(1, alId);
        set(2, text);
        set(3, type);
    }
}
