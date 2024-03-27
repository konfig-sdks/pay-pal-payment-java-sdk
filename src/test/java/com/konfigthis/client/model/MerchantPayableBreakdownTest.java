/*
 * Payments
 * Call the Payments API to authorize payments, capture authorized payments, refund payments that have already been captured, and show payment information. Use the Payments API in conjunction with the <a href=\"/docs/api/orders/v2/\">Orders API</a>. For more information, see the <a href=\"/docs/checkout/\">PayPal Checkout Overview</a>.
 *
 * The version of the OpenAPI document: 2.5
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.Money;
import com.konfigthis.client.model.NetAmountBreakdownItem;
import com.konfigthis.client.model.PlatformFee;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Model tests for MerchantPayableBreakdown
 */
public class MerchantPayableBreakdownTest {
    private final MerchantPayableBreakdown model = new MerchantPayableBreakdown();

    /**
     * Model tests for MerchantPayableBreakdown
     */
    @Test
    public void testMerchantPayableBreakdown() {
        // TODO: test MerchantPayableBreakdown
    }

    /**
     * Test the property 'grossAmount'
     */
    @Test
    public void grossAmountTest() {
        // TODO: test grossAmount
    }

    /**
     * Test the property 'paypalFee'
     */
    @Test
    public void paypalFeeTest() {
        // TODO: test paypalFee
    }

    /**
     * Test the property 'paypalFeeInReceivableCurrency'
     */
    @Test
    public void paypalFeeInReceivableCurrencyTest() {
        // TODO: test paypalFeeInReceivableCurrency
    }

    /**
     * Test the property 'netAmount'
     */
    @Test
    public void netAmountTest() {
        // TODO: test netAmount
    }

    /**
     * Test the property 'netAmountInReceivableCurrency'
     */
    @Test
    public void netAmountInReceivableCurrencyTest() {
        // TODO: test netAmountInReceivableCurrency
    }

    /**
     * Test the property 'platformFees'
     */
    @Test
    public void platformFeesTest() {
        // TODO: test platformFees
    }

    /**
     * Test the property 'netAmountBreakdown'
     */
    @Test
    public void netAmountBreakdownTest() {
        // TODO: test netAmountBreakdown
    }

    /**
     * Test the property 'totalRefundedAmount'
     */
    @Test
    public void totalRefundedAmountTest() {
        // TODO: test totalRefundedAmount
    }

}