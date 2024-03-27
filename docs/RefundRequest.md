

# RefundRequest

Refunds a captured payment, by ID. For a full refund, include an empty request body. For a partial refund, include an <code>amount</code> object in the request body.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | [**Money**](Money.md) |  |  [optional] |
|**customId** | **String** | The API caller-provided external ID. Used to reconcile API caller-initiated transactions with PayPal transactions. Appears in transaction and settlement reports. The pattern is defined by an external party and supports Unicode. |  [optional] |
|**invoiceId** | **String** | The API caller-provided external invoice ID for this order. The pattern is defined by an external party and supports Unicode. |  [optional] |
|**noteToPayer** | **String** | The reason for the refund. Appears in both the payer&#39;s transaction history and the emails that the payer receives. The pattern is defined by an external party and supports Unicode. |  [optional] |
|**paymentInstruction** | [**PaymentInstruction2**](PaymentInstruction2.md) |  |  [optional] |



