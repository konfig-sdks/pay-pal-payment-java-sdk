

# NetworkTransactionReference

Reference values used by the card network to identify a transaction.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Transaction reference id returned by the scheme. For Visa and Amex, this is the \&quot;Tran id\&quot; field in response. For MasterCard, this is the \&quot;BankNet reference id\&quot; field in response. For Discover, this is the \&quot;NRID\&quot; field in response. The pattern we expect for this field from Visa/Amex/CB/Discover is numeric, Mastercard/BNPP is alphanumeric and Paysecure is alphanumeric with special character -. |  |
|**date** | **String** | The date that the transaction was authorized by the scheme. This field may not be returned for all networks. MasterCard refers to this field as \&quot;BankNet reference date. |  [optional] |
|**network** | **CardBrand** |  |  [optional] |
|**acquirerReferenceNumber** | **String** | Reference ID issued for the card transaction. This ID can be used to track the transaction across processors, card brands and issuing banks. |  [optional] |



