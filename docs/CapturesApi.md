# CapturesApi

All URIs are relative to *https://api-m.sandbox.paypal.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**refundPayment**](CapturesApi.md#refundPayment) | **POST** /v2/payments/captures/{capture_id}/refund | Refund captured payment |
| [**showDetails**](CapturesApi.md#showDetails) | **GET** /v2/payments/captures/{capture_id} | Show captured payment details |


<a name="refundPayment"></a>
# **refundPayment**
> Refund refundPayment(captureId).payPalRequestId(payPalRequestId).prefer(prefer).payPalAuthAssertion(payPalAuthAssertion).refundRequest(refundRequest).execute();

Refund captured payment

Refunds a captured payment, by ID. For a full refund, include an empty payload in the JSON request body. For a partial refund, include an &lt;code&gt;amount&lt;/code&gt; object in the JSON request body.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PayPalPayment;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CapturesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-m.sandbox.paypal.com";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    PayPalPayment client = new PayPalPayment(configuration);
    String captureId = "captureId_example"; // The PayPal-generated ID for the captured payment to refund.
    Money amount = new Money();
    String customId = "customId_example"; // The API caller-provided external ID. Used to reconcile API caller-initiated transactions with PayPal transactions. Appears in transaction and settlement reports. The pattern is defined by an external party and supports Unicode.
    String invoiceId = "invoiceId_example"; // The API caller-provided external invoice ID for this order. The pattern is defined by an external party and supports Unicode.
    String noteToPayer = "noteToPayer_example"; // The reason for the refund. Appears in both the payer's transaction history and the emails that the payer receives. The pattern is defined by an external party and supports Unicode.
    PaymentInstruction2 paymentInstruction = new PaymentInstruction2();
    String payPalRequestId = "payPalRequestId_example"; // The server stores keys for 45 days.
    String prefer = "return=minimal"; // The preferred server response upon successful completion of the request. Value is:<ul><li><code>return=minimal</code>. The server returns a minimal response to optimize communication between the API caller and the server. A minimal response includes the <code>id</code>, <code>status</code> and HATEOAS links.</li><li><code>return=representation</code>. The server returns a complete resource representation, including the current state of the resource.</li></ul>
    String payPalAuthAssertion = "payPalAuthAssertion_example"; // An API-caller-provided JSON Web Token (JWT) assertion that identifies the merchant. For details, see [PayPal-Auth-Assertion](/docs/api/reference/api-requests/#paypal-auth-assertion).<blockquote><strong>Note:</strong>For three party transactions in which a partner is managing the API calls on behalf of a merchant, the partner must identify the merchant using either a PayPal-Auth-Assertion header or an access token with target_subject.</blockquote>
    try {
      Refund result = client
              .captures
              .refundPayment(captureId)
              .amount(amount)
              .customId(customId)
              .invoiceId(invoiceId)
              .noteToPayer(noteToPayer)
              .paymentInstruction(paymentInstruction)
              .payPalRequestId(payPalRequestId)
              .prefer(prefer)
              .payPalAuthAssertion(payPalAuthAssertion)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getStatusDetails());
      System.out.println(result.getId());
      System.out.println(result.getAmount());
      System.out.println(result.getInvoiceId());
      System.out.println(result.getCustomId());
      System.out.println(result.getAcquirerReferenceNumber());
      System.out.println(result.getNoteToPayer());
      System.out.println(result.getSellerPayableBreakdown());
      System.out.println(result.getPayer());
      System.out.println(result.getLinks());
      System.out.println(result.getCreateTime());
      System.out.println(result.getUpdateTime());
    } catch (ApiException e) {
      System.err.println("Exception when calling CapturesApi#refundPayment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Refund> response = client
              .captures
              .refundPayment(captureId)
              .amount(amount)
              .customId(customId)
              .invoiceId(invoiceId)
              .noteToPayer(noteToPayer)
              .paymentInstruction(paymentInstruction)
              .payPalRequestId(payPalRequestId)
              .prefer(prefer)
              .payPalAuthAssertion(payPalAuthAssertion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CapturesApi#refundPayment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **captureId** | **String**| The PayPal-generated ID for the captured payment to refund. | |
| **payPalRequestId** | **String**| The server stores keys for 45 days. | [optional] |
| **prefer** | **String**| The preferred server response upon successful completion of the request. Value is:&lt;ul&gt;&lt;li&gt;&lt;code&gt;return&#x3D;minimal&lt;/code&gt;. The server returns a minimal response to optimize communication between the API caller and the server. A minimal response includes the &lt;code&gt;id&lt;/code&gt;, &lt;code&gt;status&lt;/code&gt; and HATEOAS links.&lt;/li&gt;&lt;li&gt;&lt;code&gt;return&#x3D;representation&lt;/code&gt;. The server returns a complete resource representation, including the current state of the resource.&lt;/li&gt;&lt;/ul&gt; | [optional] [default to return&#x3D;minimal] |
| **payPalAuthAssertion** | **String**| An API-caller-provided JSON Web Token (JWT) assertion that identifies the merchant. For details, see [PayPal-Auth-Assertion](/docs/api/reference/api-requests/#paypal-auth-assertion).&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt;For three party transactions in which a partner is managing the API calls on behalf of a merchant, the partner must identify the merchant using either a PayPal-Auth-Assertion header or an access token with target_subject.&lt;/blockquote&gt; | [optional] |
| **refundRequest** | [**RefundRequest**](RefundRequest.md)|  | [optional] |

### Return type

[**Refund**](Refund.md)

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A successful request returns the HTTP &lt;code&gt;201 Created&lt;/code&gt; status code and a JSON response body that shows refund details. |  -  |
| **500** | The request failed because an internal server error occurred. |  -  |
| **0** | The default response. |  -  |

<a name="showDetails"></a>
# **showDetails**
> Capture2 showDetails(captureId).execute();

Show captured payment details

Shows details for a captured payment, by ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PayPalPayment;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CapturesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-m.sandbox.paypal.com";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    PayPalPayment client = new PayPalPayment(configuration);
    String captureId = "captureId_example"; // The PayPal-generated ID for the captured payment to refund.
    try {
      Capture2 result = client
              .captures
              .showDetails(captureId)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getStatusDetails());
      System.out.println(result.getId());
      System.out.println(result.getAmount());
      System.out.println(result.getInvoiceId());
      System.out.println(result.getCustomId());
      System.out.println(result.getNetworkTransactionReference());
      System.out.println(result.getSellerProtection());
      System.out.println(result.getFinalCapture());
      System.out.println(result.getSellerReceivableBreakdown());
      System.out.println(result.getDisbursementMode());
      System.out.println(result.getLinks());
      System.out.println(result.getProcessorResponse());
      System.out.println(result.getCreateTime());
      System.out.println(result.getUpdateTime());
      System.out.println(result.getSupplementaryData());
      System.out.println(result.getPayee());
    } catch (ApiException e) {
      System.err.println("Exception when calling CapturesApi#showDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Capture2> response = client
              .captures
              .showDetails(captureId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CapturesApi#showDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **captureId** | **String**| The PayPal-generated ID for the captured payment to refund. | |

### Return type

[**Capture2**](Capture2.md)

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful request returns the HTTP &lt;code&gt;200 OK&lt;/code&gt; status code and a JSON response body that shows captured payment details. |  -  |
| **500** | The request failed because an internal server error occurred. |  -  |
| **0** | The default response. |  -  |

