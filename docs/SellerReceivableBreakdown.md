

# SellerReceivableBreakdown

The detailed breakdown of the capture activity. This is not available for transactions that are in pending state.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**grossAmount** | [**Money**](Money.md) |  |  |
|**paypalFee** | [**Money**](Money.md) |  |  [optional] |
|**paypalFeeInReceivableCurrency** | [**Money**](Money.md) |  |  [optional] |
|**netAmount** | [**Money**](Money.md) |  |  [optional] |
|**receivableAmount** | [**Money**](Money.md) |  |  [optional] |
|**exchangeRate** | [**ExchangeRate**](ExchangeRate.md) |  |  [optional] |
|**platformFees** | [**List&lt;PlatformFee&gt;**](PlatformFee.md) | An array of platform or partner fees, commissions, or brokerage fees that associated with the captured payment. |  [optional] |



