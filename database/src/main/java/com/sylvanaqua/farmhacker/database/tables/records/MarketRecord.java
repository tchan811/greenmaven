/*
 * This file is generated by jOOQ.
*/
package com.sylvanaqua.farmhacker.database.tables.records;


import com.sylvanaqua.farmhacker.database.tables.Market;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MarketRecord extends UpdatableRecordImpl<MarketRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = -1154095054;

    /**
     * Setter for <code>farmhacker.market.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>farmhacker.market.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>farmhacker.market.market_name</code>.
     */
    public void setMarketName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>farmhacker.market.market_name</code>.
     */
    public String getMarketName() {
        return (String) get(1);
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
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Market.MARKET.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Market.MARKET.MARKET_NAME;
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
        return getMarketName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketRecord value2(String value) {
        setMarketName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MarketRecord
     */
    public MarketRecord() {
        super(Market.MARKET);
    }

    /**
     * Create a detached, initialised MarketRecord
     */
    public MarketRecord(Integer id, String marketName) {
        super(Market.MARKET);

        set(0, id);
        set(1, marketName);
    }
}
