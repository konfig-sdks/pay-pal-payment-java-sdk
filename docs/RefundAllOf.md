

# RefundAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The PayPal-generated ID for the refund. |  [optional] [readonly] |
|**amount** | [**Money**](Money.md) |  |  [optional] |
|**invoiceId** | **String** | The API caller-provided external invoice number for this order. Appears in both the payer&#39;s transaction history and the emails that the payer receives. |  [optional] [readonly] |
|**customId** | **String** | The API caller-provided external ID. Used to reconcile API caller-initiated transactions with PayPal transactions. Appears in transaction and settlement reports. |  [optional] |
|**acquirerReferenceNumber** | **String** | Reference ID issued for the card transaction. This ID can be used to track the transaction across processors, card brands and issuing banks. |  [optional] |
|**noteToPayer** | **String** | The reason for the refund. Appears in both the payer&#39;s transaction history and the emails that the payer receives. |  [optional] [readonly] |
|**sellerPayableBreakdown** | [**MerchantPayableBreakdown**](MerchantPayableBreakdown.md) |  |  [optional] |
|**payer** | [**PayeeBase**](PayeeBase.md) |  |  [optional] |
|**links** | [**List&lt;LinkDescription&gt;**](LinkDescription.md) | An array of related [HATEOAS links](/docs/api/reference/api-responses/#hateoas-links). |  [optional] [readonly] |



