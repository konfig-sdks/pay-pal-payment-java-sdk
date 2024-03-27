# RefundsApi

All URIs are relative to *https://api-m.sandbox.paypal.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**details**](RefundsApi.md#details) | **GET** /v2/payments/refunds/{refund_id} | Show refund details |


<a name="details"></a>
# **details**
> Refund details(refundId).execute();

Show refund details

Shows details for a refund, by ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PayPalPayment;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RefundsApi;
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
    String refundId = "refundId_example"; // The PayPal-generated ID for the refund for which to show details.
    try {
      Refund result = client
              .refunds
              .details(refundId)
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
      System.err.println("Exception when calling RefundsApi#details");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Refund> response = client
              .refunds
              .details(refundId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RefundsApi#details");
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
| **refundId** | **String**| The PayPal-generated ID for the refund for which to show details. | |

### Return type

[**Refund**](Refund.md)

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful request returns the HTTP &lt;code&gt;200 OK&lt;/code&gt; status code and a JSON response body that shows refund details. |  -  |
| **500** | The request failed because an internal server error occurred. |  -  |
| **0** | The default response. |  -  |

