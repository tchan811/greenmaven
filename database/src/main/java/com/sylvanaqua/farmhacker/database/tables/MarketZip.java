/*
 * This file is generated by jOOQ.
*/
package com.sylvanaqua.farmhacker.database.tables;


import com.sylvanaqua.farmhacker.database.Farmhacker;
import com.sylvanaqua.farmhacker.database.Keys;
import com.sylvanaqua.farmhacker.database.tables.records.MarketZipRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class MarketZip extends TableImpl<MarketZipRecord> {

    private static final long serialVersionUID = 640309055;

    /**
     * The reference instance of <code>farmhacker.market_zip</code>
     */
    public static final MarketZip MARKET_ZIP = new MarketZip();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MarketZipRecord> getRecordType() {
        return MarketZipRecord.class;
    }

    /**
     * The column <code>farmhacker.market_zip.id</code>.
     */
    public final TableField<MarketZipRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>farmhacker.market_zip.market_id</code>.
     */
    public final TableField<MarketZipRecord, Integer> MARKET_ID = createField("market_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>farmhacker.market_zip.postal_code</code>.
     */
    public final TableField<MarketZipRecord, Integer> POSTAL_CODE = createField("postal_code", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>farmhacker.market_zip</code> table reference
     */
    public MarketZip() {
        this("market_zip", null);
    }

    /**
     * Create an aliased <code>farmhacker.market_zip</code> table reference
     */
    public MarketZip(String alias) {
        this(alias, MARKET_ZIP);
    }

    private MarketZip(String alias, Table<MarketZipRecord> aliased) {
        this(alias, aliased, null);
    }

    private MarketZip(String alias, Table<MarketZipRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Farmhacker.FARMHACKER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MarketZipRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MARKET_ZIP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MarketZipRecord> getPrimaryKey() {
        return Keys.KEY_MARKET_ZIP_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MarketZipRecord>> getKeys() {
        return Arrays.<UniqueKey<MarketZipRecord>>asList(Keys.KEY_MARKET_ZIP_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketZip as(String alias) {
        return new MarketZip(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MarketZip rename(String name) {
        return new MarketZip(name, null);
    }
}
