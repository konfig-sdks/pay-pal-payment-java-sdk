

# MerchantPayableBreakdown

The breakdown of the refund.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**grossAmount** | [**Money**](Money.md) |  |  [optional] |
|**paypalFee** | [**Money**](Money.md) |  |  [optional] |
|**paypalFeeInReceivableCurrency** | [**Money**](Money.md) |  |  [optional] |
|**netAmount** | [**Money**](Money.md) |  |  [optional] |
|**netAmountInReceivableCurrency** | [**Money**](Money.md) |  |  [optional] |
|**platformFees** | [**List&lt;PlatformFee&gt;**](PlatformFee.md) | An array of platform or partner fees, commissions, or brokerage fees for the refund. |  [optional] |
|**netAmountBreakdown** | [**List&lt;NetAmountBreakdownItem&gt;**](NetAmountBreakdownItem.md) | An array of breakdown values for the net amount. Returned when the currency of the refund is different from the currency of the PayPal account where the payee holds their funds. |  [optional] [readonly] |
|**totalRefundedAmount** | [**Money**](Money.md) |  |  [optional] |



