

# Refund

The refund information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | The status of the refund. |  [optional] [readonly] |
|**statusDetails** | [**RefundStatusDetails**](RefundStatusDetails.md) |  |  [optional] |
|**id** | **String** | The PayPal-generated ID for the refund. |  [optional] [readonly] |
|**amount** | [**Money**](Money.md) |  |  [optional] |
|**invoiceId** | **String** | The API caller-provided external invoice number for this order. Appears in both the payer&#39;s transaction history and the emails that the payer receives. |  [optional] [readonly] |
|**customId** | **String** | The API caller-provided external ID. Used to reconcile API caller-initiated transactions with PayPal transactions. Appears in transaction and settlement reports. |  [optional] |
|**acquirerReferenceNumber** | **String** | Reference ID issued for the card transaction. This ID can be used to track the transaction across processors, card brands and issuing banks. |  [optional] |
|**noteToPayer** | **String** | The reason for the refund. Appears in both the payer&#39;s transaction history and the emails that the payer receives. |  [optional] [readonly] |
|**sellerPayableBreakdown** | [**MerchantPayableBreakdown**](MerchantPayableBreakdown.md) |  |  [optional] |
|**payer** | [**PayeeBase**](PayeeBase.md) |  |  [optional] |
|**links** | [**List&lt;LinkDescription&gt;**](LinkDescription.md) | An array of related [HATEOAS links](/docs/api/reference/api-responses/#hateoas-links). |  [optional] [readonly] |
|**createTime** | **String** | The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The regular expression provides guidance but does not reject all invalid dates.&lt;/blockquote&gt; |  [optional] |
|**updateTime** | **String** | The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The regular expression provides guidance but does not reject all invalid dates.&lt;/blockquote&gt; |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CANCELLED | &quot;CANCELLED&quot; |
| FAILED | &quot;FAILED&quot; |
| PENDING | &quot;PENDING&quot; |
| COMPLETED | &quot;COMPLETED&quot; |



