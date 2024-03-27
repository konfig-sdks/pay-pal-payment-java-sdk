# AuthorizationsApi

All URIs are relative to *https://api-m.sandbox.paypal.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**capturePayment**](AuthorizationsApi.md#capturePayment) | **POST** /v2/payments/authorizations/{authorization_id}/capture | Capture authorized payment |
| [**reauthorizePayment**](AuthorizationsApi.md#reauthorizePayment) | **POST** /v2/payments/authorizations/{authorization_id}/reauthorize | Reauthorize authorized payment |
| [**showDetails**](AuthorizationsApi.md#showDetails) | **GET** /v2/payments/authorizations/{authorization_id} | Show details for authorized payment |
| [**voidPayment**](AuthorizationsApi.md#voidPayment) | **POST** /v2/payments/authorizations/{authorization_id}/void | Void authorized payment |


<a name="capturePayment"></a>
# **capturePayment**
> Capture2 capturePayment(authorizationId).payPalRequestId(payPalRequestId).prefer(prefer).captureRequest(captureRequest).execute();

Capture authorized payment

Captures an authorized payment, by ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PayPalPayment;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthorizationsApi;
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
    String authorizationId = "authorizationId_example"; // The PayPal-generated ID for the authorized payment to void.
    String invoiceId = "invoiceId_example"; // The API caller-provided external invoice number for this order. Appears in both the payer's transaction history and the emails that the payer receives.
    String noteToPayer = "noteToPayer_example"; // An informational note about this settlement. Appears in both the payer's transaction history and the emails that the payer receives.
    Money amount = new Money();
    Boolean finalCapture = false; // Indicates whether you can make additional captures against the authorized payment. Set to `true` if you do not intend to capture additional payments against the authorization. Set to `false` if you intend to capture additional payments against the authorization.
    PaymentInstruction paymentInstruction = new PaymentInstruction();
    String softDescriptor = "softDescriptor_example"; // The payment descriptor on the payer's account statement.
    String payPalRequestId = "payPalRequestId_example"; // The server stores keys for 45 days.
    String prefer = "return=minimal"; // The preferred server response upon successful completion of the request. Value is:<ul><li><code>return=minimal</code>. The server returns a minimal response to optimize communication between the API caller and the server. A minimal response includes the <code>id</code>, <code>status</code> and HATEOAS links.</li><li><code>return=representation</code>. The server returns a complete resource representation, including the current state of the resource.</li></ul>
    try {
      Capture2 result = client
              .authorizations
              .capturePayment(authorizationId)
              .invoiceId(invoiceId)
              .noteToPayer(noteToPayer)
              .amount(amount)
              .finalCapture(finalCapture)
              .paymentInstruction(paymentInstruction)
              .softDescriptor(softDescriptor)
              .payPalRequestId(payPalRequestId)
              .prefer(prefer)
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
      System.err.println("Exception when calling AuthorizationsApi#capturePayment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Capture2> response = client
              .authorizations
              .capturePayment(authorizationId)
              .invoiceId(invoiceId)
              .noteToPayer(noteToPayer)
              .amount(amount)
              .finalCapture(finalCapture)
              .paymentInstruction(paymentInstruction)
              .softDescriptor(softDescriptor)
              .payPalRequestId(payPalRequestId)
              .prefer(prefer)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationsApi#capturePayment");
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
| **authorizationId** | **String**| The PayPal-generated ID for the authorized payment to void. | |
| **payPalRequestId** | **String**| The server stores keys for 45 days. | [optional] |
| **prefer** | **String**| The preferred server response upon successful completion of the request. Value is:&lt;ul&gt;&lt;li&gt;&lt;code&gt;return&#x3D;minimal&lt;/code&gt;. The server returns a minimal response to optimize communication between the API caller and the server. A minimal response includes the &lt;code&gt;id&lt;/code&gt;, &lt;code&gt;status&lt;/code&gt; and HATEOAS links.&lt;/li&gt;&lt;li&gt;&lt;code&gt;return&#x3D;representation&lt;/code&gt;. The server returns a complete resource representation, including the current state of the resource.&lt;/li&gt;&lt;/ul&gt; | [optional] [default to return&#x3D;minimal] |
| **captureRequest** | [**CaptureRequest**](CaptureRequest.md)|  | [optional] |

### Return type

[**Capture2**](Capture2.md)

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A successful request returns the HTTP &lt;code&gt;201 Created&lt;/code&gt; status code and a JSON response body that shows captured payment details. |  -  |
| **500** | The request failed because an internal server error occurred. |  -  |
| **0** | The default response. |  -  |

<a name="reauthorizePayment"></a>
# **reauthorizePayment**
> Authorization2 reauthorizePayment(authorizationId).payPalRequestId(payPalRequestId).prefer(prefer).reauthorizeRequest(reauthorizeRequest).execute();

Reauthorize authorized payment

Reauthorizes an authorized PayPal account payment, by ID. To ensure that funds are still available, reauthorize a payment after its initial three-day honor period expires. Within the 29-day authorization period, you can issue multiple re-authorizations after the honor period expires.&lt;br/&gt;&lt;br/&gt;If 30 days have transpired since the date of the original authorization, you must create an authorized payment instead of reauthorizing the original authorized payment.&lt;br/&gt;&lt;br/&gt;A reauthorized payment itself has a new honor period of three days.&lt;br/&gt;&lt;br/&gt;You can reauthorize an authorized payment from 4 to 29 days after the 3-day honor period. The allowed amount depends on context and geography, for example in US it is up to 115% of the original authorized amount, not to exceed an increase of $75 USD.&lt;br/&gt;&lt;br/&gt;Supports only the &#x60;amount&#x60; request parameter.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; This request is currently not supported for Partner use cases.&lt;/blockquote&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PayPalPayment;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthorizationsApi;
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
    String authorizationId = "authorizationId_example"; // The PayPal-generated ID for the authorized payment to void.
    Money amount = new Money();
    String payPalRequestId = "payPalRequestId_example"; // The server stores keys for 45 days.
    String prefer = "return=minimal"; // The preferred server response upon successful completion of the request. Value is:<ul><li><code>return=minimal</code>. The server returns a minimal response to optimize communication between the API caller and the server. A minimal response includes the <code>id</code>, <code>status</code> and HATEOAS links.</li><li><code>return=representation</code>. The server returns a complete resource representation, including the current state of the resource.</li></ul>
    try {
      Authorization2 result = client
              .authorizations
              .reauthorizePayment(authorizationId)
              .amount(amount)
              .payPalRequestId(payPalRequestId)
              .prefer(prefer)
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
      System.out.println(result.getExpirationTime());
      System.out.println(result.getLinks());
      System.out.println(result.getCreateTime());
      System.out.println(result.getUpdateTime());
      System.out.println(result.getSupplementaryData());
      System.out.println(result.getPayee());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationsApi#reauthorizePayment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Authorization2> response = client
              .authorizations
              .reauthorizePayment(authorizationId)
              .amount(amount)
              .payPalRequestId(payPalRequestId)
              .prefer(prefer)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationsApi#reauthorizePayment");
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
| **authorizationId** | **String**| The PayPal-generated ID for the authorized payment to void. | |
| **payPalRequestId** | **String**| The server stores keys for 45 days. | [optional] |
| **prefer** | **String**| The preferred server response upon successful completion of the request. Value is:&lt;ul&gt;&lt;li&gt;&lt;code&gt;return&#x3D;minimal&lt;/code&gt;. The server returns a minimal response to optimize communication between the API caller and the server. A minimal response includes the &lt;code&gt;id&lt;/code&gt;, &lt;code&gt;status&lt;/code&gt; and HATEOAS links.&lt;/li&gt;&lt;li&gt;&lt;code&gt;return&#x3D;representation&lt;/code&gt;. The server returns a complete resource representation, including the current state of the resource.&lt;/li&gt;&lt;/ul&gt; | [optional] [default to return&#x3D;minimal] |
| **reauthorizeRequest** | [**ReauthorizeRequest**](ReauthorizeRequest.md)|  | [optional] |

### Return type

[**Authorization2**](Authorization2.md)

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A successful request returns the HTTP &lt;code&gt;201 Created&lt;/code&gt; status code and a JSON response body that shows the reauthorized payment details. |  -  |
| **500** | The request failed because an internal server error occurred. |  -  |
| **0** | The default response. |  -  |

<a name="showDetails"></a>
# **showDetails**
> Authorization2 showDetails(authorizationId).execute();

Show details for authorized payment

Shows details for an authorized payment, by ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PayPalPayment;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthorizationsApi;
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
    String authorizationId = "authorizationId_example"; // The PayPal-generated ID for the authorized payment to void.
    try {
      Authorization2 result = client
              .authorizations
              .showDetails(authorizationId)
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
      System.out.println(result.getExpirationTime());
      System.out.println(result.getLinks());
      System.out.println(result.getCreateTime());
      System.out.println(result.getUpdateTime());
      System.out.println(result.getSupplementaryData());
      System.out.println(result.getPayee());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationsApi#showDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Authorization2> response = client
              .authorizations
              .showDetails(authorizationId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationsApi#showDetails");
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
| **authorizationId** | **String**| The PayPal-generated ID for the authorized payment to void. | |

### Return type

[**Authorization2**](Authorization2.md)

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful request returns the HTTP &lt;code&gt;200 OK&lt;/code&gt; status code and a JSON response body that shows authorization details. |  -  |
| **500** | The request failed because an internal server error occurred. |  -  |
| **0** | The default response. |  -  |

<a name="voidPayment"></a>
# **voidPayment**
> Authorization2 voidPayment(authorizationId).payPalAuthAssertion(payPalAuthAssertion).prefer(prefer).execute();

Void authorized payment

Voids, or cancels, an authorized payment, by ID. You cannot void an authorized payment that has been fully captured.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PayPalPayment;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthorizationsApi;
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
    String authorizationId = "authorizationId_example"; // The PayPal-generated ID for the authorized payment to void.
    String payPalAuthAssertion = "payPalAuthAssertion_example"; // An API-caller-provided JSON Web Token (JWT) assertion that identifies the merchant. For details, see [PayPal-Auth-Assertion](/docs/api/reference/api-requests/#paypal-auth-assertion).<blockquote><strong>Note:</strong>For three party transactions in which a partner is managing the API calls on behalf of a merchant, the partner must identify the merchant using either a PayPal-Auth-Assertion header or an access token with target_subject.</blockquote>
    String prefer = "return=minimal"; // The preferred server response upon successful completion of the request. Value is:<ul><li><code>return=minimal</code>. The server returns a minimal response to optimize communication between the API caller and the server. A minimal response includes the <code>id</code>, <code>status</code> and HATEOAS links.</li><li><code>return=representation</code>. The server returns a complete resource representation, including the current state of the resource.</li></ul>
    try {
      Authorization2 result = client
              .authorizations
              .voidPayment(authorizationId)
              .payPalAuthAssertion(payPalAuthAssertion)
              .prefer(prefer)
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
      System.out.println(result.getExpirationTime());
      System.out.println(result.getLinks());
      System.out.println(result.getCreateTime());
      System.out.println(result.getUpdateTime());
      System.out.println(result.getSupplementaryData());
      System.out.println(result.getPayee());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationsApi#voidPayment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Authorization2> response = client
              .authorizations
              .voidPayment(authorizationId)
              .payPalAuthAssertion(payPalAuthAssertion)
              .prefer(prefer)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationsApi#voidPayment");
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
| **authorizationId** | **String**| The PayPal-generated ID for the authorized payment to void. | |
| **payPalAuthAssertion** | **String**| An API-caller-provided JSON Web Token (JWT) assertion that identifies the merchant. For details, see [PayPal-Auth-Assertion](/docs/api/reference/api-requests/#paypal-auth-assertion).&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt;For three party transactions in which a partner is managing the API calls on behalf of a merchant, the partner must identify the merchant using either a PayPal-Auth-Assertion header or an access token with target_subject.&lt;/blockquote&gt; | [optional] |
| **prefer** | **String**| The preferred server response upon successful completion of the request. Value is:&lt;ul&gt;&lt;li&gt;&lt;code&gt;return&#x3D;minimal&lt;/code&gt;. The server returns a minimal response to optimize communication between the API caller and the server. A minimal response includes the &lt;code&gt;id&lt;/code&gt;, &lt;code&gt;status&lt;/code&gt; and HATEOAS links.&lt;/li&gt;&lt;li&gt;&lt;code&gt;return&#x3D;representation&lt;/code&gt;. The server returns a complete resource representation, including the current state of the resource.&lt;/li&gt;&lt;/ul&gt; | [optional] [default to return&#x3D;minimal] |

### Return type

[**Authorization2**](Authorization2.md)

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful request returns the HTTP &lt;code&gt;200 OK&lt;/code&gt; status code and a JSON response body that shows authorization details. This response is returned when the Prefer header is set to return&#x3D;representation. |  -  |
| **204** | A successful request returns the HTTP &lt;code&gt;204 No Content&lt;/code&gt; status code with no JSON response body. This response is returned when the Prefer header is set to return&#x3D;minimal. |  -  |
| **500** | The request failed because an internal server error occurred. |  -  |
| **0** | The default response. |  -  |

