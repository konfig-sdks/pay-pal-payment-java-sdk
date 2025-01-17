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


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.Authorization2;
import com.konfigthis.client.model.Capture2;
import com.konfigthis.client.model.CaptureRequest;
import com.konfigthis.client.model.Money;
import com.konfigthis.client.model.PaymentInstruction;
import com.konfigthis.client.model.ReauthorizeRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthorizationsApi
 */
@Disabled
public class AuthorizationsApiTest {

    private static AuthorizationsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new AuthorizationsApi(apiClient);
    }

    /**
     * Capture authorized payment
     *
     * Captures an authorized payment, by ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void capturePaymentTest() throws ApiException {
        String authorizationId = null;
        String invoiceId = null;
        String noteToPayer = null;
        Money amount = null;
        Boolean finalCapture = null;
        PaymentInstruction paymentInstruction = null;
        String softDescriptor = null;
        String payPalRequestId = null;
        String prefer = null;
        Capture2 response = api.capturePayment(authorizationId)
                .invoiceId(invoiceId)
                .noteToPayer(noteToPayer)
                .amount(amount)
                .finalCapture(finalCapture)
                .paymentInstruction(paymentInstruction)
                .softDescriptor(softDescriptor)
                .payPalRequestId(payPalRequestId)
                .prefer(prefer)
                .execute();
        // TODO: test validations
    }

    /**
     * Reauthorize authorized payment
     *
     * Reauthorizes an authorized PayPal account payment, by ID. To ensure that funds are still available, reauthorize a payment after its initial three-day honor period expires. Within the 29-day authorization period, you can issue multiple re-authorizations after the honor period expires.&lt;br/&gt;&lt;br/&gt;If 30 days have transpired since the date of the original authorization, you must create an authorized payment instead of reauthorizing the original authorized payment.&lt;br/&gt;&lt;br/&gt;A reauthorized payment itself has a new honor period of three days.&lt;br/&gt;&lt;br/&gt;You can reauthorize an authorized payment from 4 to 29 days after the 3-day honor period. The allowed amount depends on context and geography, for example in US it is up to 115% of the original authorized amount, not to exceed an increase of $75 USD.&lt;br/&gt;&lt;br/&gt;Supports only the &#x60;amount&#x60; request parameter.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; This request is currently not supported for Partner use cases.&lt;/blockquote&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reauthorizePaymentTest() throws ApiException {
        String authorizationId = null;
        Money amount = null;
        String payPalRequestId = null;
        String prefer = null;
        Authorization2 response = api.reauthorizePayment(authorizationId)
                .amount(amount)
                .payPalRequestId(payPalRequestId)
                .prefer(prefer)
                .execute();
        // TODO: test validations
    }

    /**
     * Show details for authorized payment
     *
     * Shows details for an authorized payment, by ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void showDetailsTest() throws ApiException {
        String authorizationId = null;
        Authorization2 response = api.showDetails(authorizationId)
                .execute();
        // TODO: test validations
    }

    /**
     * Void authorized payment
     *
     * Voids, or cancels, an authorized payment, by ID. You cannot void an authorized payment that has been fully captured.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void voidPaymentTest() throws ApiException {
        String authorizationId = null;
        String payPalAuthAssertion = null;
        String prefer = null;
        Authorization2 response = api.voidPayment(authorizationId)
                .payPalAuthAssertion(payPalAuthAssertion)
                .prefer(prefer)
                .execute();
        // TODO: test validations
    }

}
