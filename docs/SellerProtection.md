

# SellerProtection

The level of protection offered as defined by [PayPal Seller Protection for Merchants](https://www.paypal.com/us/webapps/mpp/security/seller-protection).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | Indicates whether the transaction is eligible for seller protection. For information, see [PayPal Seller Protection for Merchants](https://www.paypal.com/us/webapps/mpp/security/seller-protection). |  [optional] [readonly] |
|**disputeCategories** | [**List&lt;DisputeCategoriesEnum&gt;**](#List&lt;DisputeCategoriesEnum&gt;) | An array of conditions that are covered for the transaction. |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ELIGIBLE | &quot;ELIGIBLE&quot; |
| PARTIALLY_ELIGIBLE | &quot;PARTIALLY_ELIGIBLE&quot; |
| NOT_ELIGIBLE | &quot;NOT_ELIGIBLE&quot; |



## Enum: List&lt;DisputeCategoriesEnum&gt;

| Name | Value |
|---- | -----|
| ITEM_NOT_RECEIVED | &quot;ITEM_NOT_RECEIVED&quot; |
| UNAUTHORIZED_TRANSACTION | &quot;UNAUTHORIZED_TRANSACTION&quot; |



