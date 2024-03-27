

# CaptureRequestAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | [**Money**](Money.md) |  |  [optional] |
|**invoiceId** | **String** | The API caller-provided external invoice number for this order. Appears in both the payer&#39;s transaction history and the emails that the payer receives. |  [optional] |
|**finalCapture** | **Boolean** | Indicates whether you can make additional captures against the authorized payment. Set to &#x60;true&#x60; if you do not intend to capture additional payments against the authorization. Set to &#x60;false&#x60; if you intend to capture additional payments against the authorization. |  [optional] |
|**paymentInstruction** | [**PaymentInstruction**](PaymentInstruction.md) |  |  [optional] |
|**noteToPayer** | **String** | An informational note about this settlement. Appears in both the payer&#39;s transaction history and the emails that the payer receives. |  [optional] |
|**softDescriptor** | **String** | The payment descriptor on the payer&#39;s account statement. |  [optional] |



