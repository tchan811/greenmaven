/*
 * This file is generated by jOOQ.
*/
package com.sylvanaqua.farmhacker.database;


import com.sylvanaqua.farmhacker.database.tables.Catalog;
import com.sylvanaqua.farmhacker.database.tables.CatalogCategoryVw;
import com.sylvanaqua.farmhacker.database.tables.FarmhackerUser;
import com.sylvanaqua.farmhacker.database.tables.Inventory;
import com.sylvanaqua.farmhacker.database.tables.InventoryValue;
import com.sylvanaqua.farmhacker.database.tables.Market;
import com.sylvanaqua.farmhacker.database.tables.MarketZip;
import com.sylvanaqua.farmhacker.database.tables.SchemaVersion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Farmhacker extends SchemaImpl {

    private static final long serialVersionUID = 124889809;

    /**
     * The reference instance of <code>farmhacker</code>
     */
    public static final Farmhacker FARMHACKER = new Farmhacker();

    /**
     * The table <code>farmhacker.catalog</code>.
     */
    public final Catalog CATALOG = com.sylvanaqua.farmhacker.database.tables.Catalog.CATALOG;

    /**
     * VIEW
     */
    public final CatalogCategoryVw CATALOG_CATEGORY_VW = com.sylvanaqua.farmhacker.database.tables.CatalogCategoryVw.CATALOG_CATEGORY_VW;

    /**
     * The table <code>farmhacker.farmhacker_user</code>.
     */
    public final FarmhackerUser FARMHACKER_USER = com.sylvanaqua.farmhacker.database.tables.FarmhackerUser.FARMHACKER_USER;

    /**
     * The table <code>farmhacker.inventory</code>.
     */
    public final Inventory INVENTORY = com.sylvanaqua.farmhacker.database.tables.Inventory.INVENTORY;

    /**
     * VIEW
     */
    public final InventoryValue INVENTORY_VALUE = com.sylvanaqua.farmhacker.database.tables.InventoryValue.INVENTORY_VALUE;

    /**
     * The table <code>farmhacker.market</code>.
     */
    public final Market MARKET = com.sylvanaqua.farmhacker.database.tables.Market.MARKET;

    /**
     * The table <code>farmhacker.market_zip</code>.
     */
    public final MarketZip MARKET_ZIP = com.sylvanaqua.farmhacker.database.tables.MarketZip.MARKET_ZIP;

    /**
     * The table <code>farmhacker.schema_version</code>.
     */
    public final SchemaVersion SCHEMA_VERSION = com.sylvanaqua.farmhacker.database.tables.SchemaVersion.SCHEMA_VERSION;

    /**
     * No further instances allowed
     */
    private Farmhacker() {
        super("farmhacker", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Catalog.CATALOG,
            CatalogCategoryVw.CATALOG_CATEGORY_VW,
            FarmhackerUser.FARMHACKER_USER,
            Inventory.INVENTORY,
            InventoryValue.INVENTORY_VALUE,
            Market.MARKET,
            MarketZip.MARKET_ZIP,
            SchemaVersion.SCHEMA_VERSION);
    }
}
