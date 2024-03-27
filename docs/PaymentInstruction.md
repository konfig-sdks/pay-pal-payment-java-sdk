

# PaymentInstruction

Any additional payment instructions to be consider during payment processing. This processing instruction is applicable for Capturing an order or Authorizing an Order.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**platformFees** | [**List&lt;PlatformFee&gt;**](PlatformFee.md) | An array of various fees, commissions, tips, or donations. This field is only applicable to merchants that been enabled for PayPal Commerce Platform for Marketplaces and Platforms capability. |  [optional] |
|**disbursementMode** | **DisbursementMode** |  |  [optional] |
|**payeePricingTierId** | **String** | This field is only enabled for selected merchants/partners to use and provides the ability to trigger a specific pricing rate/plan for a payment transaction. The list of eligible &#39;payee_pricing_tier_id&#39; would be provided to you by your Account Manager. Specifying values other than the one provided to you by your account manager would result in an error. |  [optional] |
|**payeeReceivableFxRateId** | **String** | FX identifier generated returned by PayPal to be used for payment processing in order to honor FX rate (for eligible integrations) to be used when amount is settled/received into the payee account. |  [optional] |



