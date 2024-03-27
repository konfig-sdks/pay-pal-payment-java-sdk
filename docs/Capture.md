

# Capture

A captured payment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | The status of the captured payment. |  [optional] [readonly] |
|**statusDetails** | [**CaptureStatusDetails**](CaptureStatusDetails.md) |  |  [optional] |
|**id** | **String** | The PayPal-generated ID for the captured payment. |  [optional] [readonly] |
|**amount** | [**Money**](Money.md) |  |  [optional] |
|**invoiceId** | **String** | The API caller-provided external invoice number for this order. Appears in both the payer&#39;s transaction history and the emails that the payer receives. |  [optional] [readonly] |
|**customId** | **String** | The API caller-provided external ID. Used to reconcile API caller-initiated transactions with PayPal transactions. Appears in transaction and settlement reports. |  [optional] |
|**networkTransactionReference** | [**NetworkTransactionReference**](NetworkTransactionReference.md) |  |  [optional] |
|**sellerProtection** | [**SellerProtection**](SellerProtection.md) |  |  [optional] |
|**finalCapture** | **Boolean** | Indicates whether you can make additional captures against the authorized payment. Set to &#x60;true&#x60; if you do not intend to capture additional payments against the authorization. Set to &#x60;false&#x60; if you intend to capture additional payments against the authorization. |  [optional] [readonly] |
|**sellerReceivableBreakdown** | [**SellerReceivableBreakdown**](SellerReceivableBreakdown.md) |  |  [optional] |
|**disbursementMode** | **DisbursementMode** |  |  [optional] |
|**links** | [**List&lt;LinkDescription&gt;**](LinkDescription.md) | An array of related [HATEOAS links](/docs/api/reference/api-responses/#hateoas-links). |  [optional] [readonly] |
|**processorResponse** | [**ProcessorResponse**](ProcessorResponse.md) |  |  [optional] |
|**createTime** | **String** | The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The regular expression provides guidance but does not reject all invalid dates.&lt;/blockquote&gt; |  [optional] |
|**updateTime** | **String** | The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The regular expression provides guidance but does not reject all invalid dates.&lt;/blockquote&gt; |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| COMPLETED | &quot;COMPLETED&quot; |
| DECLINED | &quot;DECLINED&quot; |
| PARTIALLY_REFUNDED | &quot;PARTIALLY_REFUNDED&quot; |
| PENDING | &quot;PENDING&quot; |
| REFUNDED | &quot;REFUNDED&quot; |
| FAILED | &quot;FAILED&quot; |



