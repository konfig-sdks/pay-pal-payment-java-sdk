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
import com.konfigthis.client.model.CaptureStatusDetails;
import com.konfigthis.client.model.DisbursementMode;
import com.konfigthis.client.model.LinkDescription;
import com.konfigthis.client.model.Money;
import com.konfigthis.client.model.NetworkTransactionReference;
import com.konfigthis.client.model.ProcessorResponse;
import com.konfigthis.client.model.SellerProtection;
import com.konfigthis.client.model.SellerReceivableBreakdown;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Model tests for Capture
 */
public class CaptureTest {
    private final Capture model = new Capture();

    /**
     * Model tests for Capture
     */
    @Test
    public void testCapture() {
        // TODO: test Capture
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        // TODO: test status
    }

    /**
     * Test the property 'statusDetails'
     */
    @Test
    public void statusDetailsTest() {
        // TODO: test statusDetails
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'amount'
     */
    @Test
    public void amountTest() {
        // TODO: test amount
    }

    /**
     * Test the property 'invoiceId'
     */
    @Test
    public void invoiceIdTest() {
        // TODO: test invoiceId
    }

    /**
     * Test the property 'customId'
     */
    @Test
    public void customIdTest() {
        // TODO: test customId
    }

    /**
     * Test the property 'networkTransactionReference'
     */
    @Test
    public void networkTransactionReferenceTest() {
        // TODO: test networkTransactionReference
    }

    /**
     * Test the property 'sellerProtection'
     */
    @Test
    public void sellerProtectionTest() {
        // TODO: test sellerProtection
    }

    /**
     * Test the property 'finalCapture'
     */
    @Test
    public void finalCaptureTest() {
        // TODO: test finalCapture
    }

    /**
     * Test the property 'sellerReceivableBreakdown'
     */
    @Test
    public void sellerReceivableBreakdownTest() {
        // TODO: test sellerReceivableBreakdown
    }

    /**
     * Test the property 'disbursementMode'
     */
    @Test
    public void disbursementModeTest() {
        // TODO: test disbursementMode
    }

    /**
     * Test the property 'links'
     */
    @Test
    public void linksTest() {
        // TODO: test links
    }

    /**
     * Test the property 'processorResponse'
     */
    @Test
    public void processorResponseTest() {
        // TODO: test processorResponse
    }

    /**
     * Test the property 'createTime'
     */
    @Test
    public void createTimeTest() {
        // TODO: test createTime
    }

    /**
     * Test the property 'updateTime'
     */
    @Test
    public void updateTimeTest() {
        // TODO: test updateTime
    }

}
