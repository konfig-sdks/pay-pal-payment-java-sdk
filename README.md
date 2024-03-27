<div align="left">

[![Visit Paypal](./header.png)](https://www.paypal.com&#x2F;)

# [Paypal](https://www.paypal.com&#x2F;)

Call the Payments API to authorize payments, capture authorized payments, refund payments that have already been captured, and show payment information. Use the Payments API in conjunction with the <a href="/docs/api/orders/v2/">Orders API</a>. For more information, see the <a href="/docs/checkout/">PayPal Checkout Overview</a>.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=PayPal&serviceName=Payment&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>pay-pal-payment-java-sdk</artifactId>
  <version>2.5</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:pay-pal-payment-java-sdk:2.5"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/pay-pal-payment-java-sdk-2.5.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://api-m.sandbox.paypal.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthorizationsApi* | [**capturePayment**](docs/AuthorizationsApi.md#capturePayment) | **POST** /v2/payments/authorizations/{authorization_id}/capture | Capture authorized payment
*AuthorizationsApi* | [**reauthorizePayment**](docs/AuthorizationsApi.md#reauthorizePayment) | **POST** /v2/payments/authorizations/{authorization_id}/reauthorize | Reauthorize authorized payment
*AuthorizationsApi* | [**showDetails**](docs/AuthorizationsApi.md#showDetails) | **GET** /v2/payments/authorizations/{authorization_id} | Show details for authorized payment
*AuthorizationsApi* | [**voidPayment**](docs/AuthorizationsApi.md#voidPayment) | **POST** /v2/payments/authorizations/{authorization_id}/void | Void authorized payment
*CapturesApi* | [**refundPayment**](docs/CapturesApi.md#refundPayment) | **POST** /v2/payments/captures/{capture_id}/refund | Refund captured payment
*CapturesApi* | [**showDetails**](docs/CapturesApi.md#showDetails) | **GET** /v2/payments/captures/{capture_id} | Show captured payment details
*RefundsApi* | [**details**](docs/RefundsApi.md#details) | **GET** /v2/payments/refunds/{refund_id} | Show refund details


## Documentation for Models

 - [ActivityTimestamps](docs/ActivityTimestamps.md)
 - [Authorization](docs/Authorization.md)
 - [Authorization2](docs/Authorization2.md)
 - [Authorization2AllOf](docs/Authorization2AllOf.md)
 - [AuthorizationAllOf](docs/AuthorizationAllOf.md)
 - [AuthorizationStatus](docs/AuthorizationStatus.md)
 - [AuthorizationStatusDetails](docs/AuthorizationStatusDetails.md)
 - [AuthorizationsCapturePayment403Response](docs/AuthorizationsCapturePayment403Response.md)
 - [AuthorizationsCapturePayment404Response](docs/AuthorizationsCapturePayment404Response.md)
 - [AuthorizationsCapturePayment422Response](docs/AuthorizationsCapturePayment422Response.md)
 - [AuthorizationsCapturePaymentResponse](docs/AuthorizationsCapturePaymentResponse.md)
 - [AuthorizationsReauthorize400](docs/AuthorizationsReauthorize400.md)
 - [AuthorizationsReauthorize422](docs/AuthorizationsReauthorize422.md)
 - [AuthorizationsReauthorizePayment403Response](docs/AuthorizationsReauthorizePayment403Response.md)
 - [AuthorizationsReauthorizePayment404Response](docs/AuthorizationsReauthorizePayment404Response.md)
 - [AuthorizationsReauthorizePayment422Response](docs/AuthorizationsReauthorizePayment422Response.md)
 - [AuthorizationsReauthorizePaymentResponse](docs/AuthorizationsReauthorizePaymentResponse.md)
 - [AuthorizationsShowDetails404Response](docs/AuthorizationsShowDetails404Response.md)
 - [AuthorizationsShowDetailsResponse](docs/AuthorizationsShowDetailsResponse.md)
 - [AuthorizationsVoid422](docs/AuthorizationsVoid422.md)
 - [AuthorizationsVoidPayment403Response](docs/AuthorizationsVoidPayment403Response.md)
 - [AuthorizationsVoidPayment404Response](docs/AuthorizationsVoidPayment404Response.md)
 - [AuthorizationsVoidPayment409Response](docs/AuthorizationsVoidPayment409Response.md)
 - [AuthorizationsVoidPayment422Response](docs/AuthorizationsVoidPayment422Response.md)
 - [AuthorizationsVoidPaymentResponse](docs/AuthorizationsVoidPaymentResponse.md)
 - [Capture](docs/Capture.md)
 - [Capture2](docs/Capture2.md)
 - [CaptureAllOf](docs/CaptureAllOf.md)
 - [CaptureRequest](docs/CaptureRequest.md)
 - [CaptureRequestAllOf](docs/CaptureRequestAllOf.md)
 - [CaptureStatus](docs/CaptureStatus.md)
 - [CaptureStatusDetails](docs/CaptureStatusDetails.md)
 - [CapturesRefund400](docs/CapturesRefund400.md)
 - [CapturesRefund422](docs/CapturesRefund422.md)
 - [CapturesRefundPayment401Response](docs/CapturesRefundPayment401Response.md)
 - [CapturesRefundPayment403Response](docs/CapturesRefundPayment403Response.md)
 - [CapturesRefundPayment404Response](docs/CapturesRefundPayment404Response.md)
 - [CapturesRefundPayment409Response](docs/CapturesRefundPayment409Response.md)
 - [CapturesRefundPayment422Response](docs/CapturesRefundPayment422Response.md)
 - [CapturesRefundPaymentResponse](docs/CapturesRefundPaymentResponse.md)
 - [CapturesShowDetails404Response](docs/CapturesShowDetails404Response.md)
 - [CapturesShowDetailsResponse](docs/CapturesShowDetailsResponse.md)
 - [CardBrand](docs/CardBrand.md)
 - [DisbursementMode](docs/DisbursementMode.md)
 - [Error403](docs/Error403.md)
 - [Error404](docs/Error404.md)
 - [Error409](docs/Error409.md)
 - [Error415](docs/Error415.md)
 - [Error422](docs/Error422.md)
 - [Error500](docs/Error500.md)
 - [Error503](docs/Error503.md)
 - [ErrorDetails](docs/ErrorDetails.md)
 - [ErrorLinkDescription](docs/ErrorLinkDescription.md)
 - [ErrorLocation](docs/ErrorLocation.md)
 - [ExchangeRate](docs/ExchangeRate.md)
 - [INVALIDACCOUNTSTATUS](docs/INVALIDACCOUNTSTATUS.md)
 - [INVALIDRESOURCEID](docs/INVALIDRESOURCEID.md)
 - [LinkDescription](docs/LinkDescription.md)
 - [MerchantPayableBreakdown](docs/MerchantPayableBreakdown.md)
 - [Model400](docs/Model400.md)
 - [Model401](docs/Model401.md)
 - [Model403](docs/Model403.md)
 - [Model404](docs/Model404.md)
 - [Model409](docs/Model409.md)
 - [Model422](docs/Model422.md)
 - [Money](docs/Money.md)
 - [NetAmountBreakdownItem](docs/NetAmountBreakdownItem.md)
 - [NetworkTransactionReference](docs/NetworkTransactionReference.md)
 - [PERMISSIONDENIED](docs/PERMISSIONDENIED.md)
 - [PREVIOUSREQUESTINPROGRESS](docs/PREVIOUSREQUESTINPROGRESS.md)
 - [PayeeBase](docs/PayeeBase.md)
 - [PaymentInstruction](docs/PaymentInstruction.md)
 - [PaymentInstruction2](docs/PaymentInstruction2.md)
 - [PlatformFee](docs/PlatformFee.md)
 - [ProcessorResponse](docs/ProcessorResponse.md)
 - [ReauthorizeRequest](docs/ReauthorizeRequest.md)
 - [Refund](docs/Refund.md)
 - [RefundAllOf](docs/RefundAllOf.md)
 - [RefundRequest](docs/RefundRequest.md)
 - [RefundStatus](docs/RefundStatus.md)
 - [RefundStatusDetails](docs/RefundStatusDetails.md)
 - [RefundsDetails403Response](docs/RefundsDetails403Response.md)
 - [RefundsDetails404Response](docs/RefundsDetails404Response.md)
 - [RefundsDetailsResponse](docs/RefundsDetailsResponse.md)
 - [RelatedIds](docs/RelatedIds.md)
 - [SellerProtection](docs/SellerProtection.md)
 - [SellerReceivableBreakdown](docs/SellerReceivableBreakdown.md)
 - [SupplementaryData](docs/SupplementaryData.md)
 - [SupplementaryPurchaseData](docs/SupplementaryPurchaseData.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
