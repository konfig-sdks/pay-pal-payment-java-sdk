

# CaptureAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
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



