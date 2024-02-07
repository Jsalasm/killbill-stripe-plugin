/*
 * This file is generated by jOOQ.
 */
package org.killbill.billing.plugin.stripe.dao.gen;


import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;
import org.killbill.billing.plugin.stripe.dao.gen.tables.StripeHppRequests;
import org.killbill.billing.plugin.stripe.dao.gen.tables.StripePaymentMethods;
import org.killbill.billing.plugin.stripe.dao.gen.tables.StripeResponses;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Killbill extends SchemaImpl {

    private static final long serialVersionUID = 1067516550;

    /**
     * The reference instance of <code>killbill</code>
     */
    public static final Killbill KILLBILL = new Killbill();

    /**
     * The table <code>killbill.stripe_hpp_requests</code>.
     */
    public final StripeHppRequests STRIPE_HPP_REQUESTS = StripeHppRequests.STRIPE_HPP_REQUESTS;

    /**
     * The table <code>killbill.stripe_payment_methods</code>.
     */
    public final StripePaymentMethods STRIPE_PAYMENT_METHODS = StripePaymentMethods.STRIPE_PAYMENT_METHODS;

    /**
     * The table <code>killbill.stripe_responses</code>.
     */
    public final StripeResponses STRIPE_RESPONSES = StripeResponses.STRIPE_RESPONSES;

    /**
     * No further instances allowed
     */
    private Killbill() {
        super("killbill", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            StripeHppRequests.STRIPE_HPP_REQUESTS,
            StripePaymentMethods.STRIPE_PAYMENT_METHODS,
            StripeResponses.STRIPE_RESPONSES);
    }
}