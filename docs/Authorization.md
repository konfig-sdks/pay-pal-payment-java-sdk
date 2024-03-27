

# Authorization

The authorized payment transaction.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | The status for the authorized payment. |  [optional] [readonly] |
|**statusDetails** | [**AuthorizationStatusDetails**](AuthorizationStatusDetails.md) |  |  [optional] |
|**id** | **String** | The PayPal-generated ID for the authorized payment. |  [optional] [readonly] |
|**amount** | [**Money**](Money.md) |  |  [optional] |
|**invoiceId** | **String** | The API caller-provided external invoice number for this order. Appears in both the payer&#39;s transaction history and the emails that the payer receives. |  [optional] [readonly] |
|**customId** | **String** | The API caller-provided external ID. Used to reconcile API caller-initiated transactions with PayPal transactions. Appears in transaction and settlement reports. |  [optional] |
|**networkTransactionReference** | [**NetworkTransactionReference**](NetworkTransactionReference.md) |  |  [optional] |
|**sellerProtection** | [**SellerProtection**](SellerProtection.md) |  |  [optional] |
|**expirationTime** | **String** | The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The regular expression provides guidance but does not reject all invalid dates.&lt;/blockquote&gt; |  [optional] |
|**links** | [**List&lt;LinkDescription&gt;**](LinkDescription.md) | An array of related [HATEOAS links](/docs/api/reference/api-responses/#hateoas-links). |  [optional] [readonly] |
|**createTime** | **String** | The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The regular expression provides guidance but does not reject all invalid dates.&lt;/blockquote&gt; |  [optional] |
|**updateTime** | **String** | The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The regular expression provides guidance but does not reject all invalid dates.&lt;/blockquote&gt; |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;CREATED&quot; |
| CAPTURED | &quot;CAPTURED&quot; |
| DENIED | &quot;DENIED&quot; |
| PARTIALLY_CAPTURED | &quot;PARTIALLY_CAPTURED&quot; |
| VOIDED | &quot;VOIDED&quot; |
| PENDING | &quot;PENDING&quot; |



