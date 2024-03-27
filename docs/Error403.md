

# Error403

The client is not authorized to access this resource, although it may have valid credentials. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | [**NameEnum**](#NameEnum) |  |  [optional] |
|**message** | [**MessageEnum**](#MessageEnum) |  |  [optional] |
|**details** | [**List&lt;ErrorDetails&gt;**](ErrorDetails.md) |  |  [optional] |
|**debugId** | **String** | The PayPal internal ID. Used for correlation purposes. |  [optional] |
|**links** | [**List&lt;ErrorLinkDescription&gt;**](ErrorLinkDescription.md) | An array of request-related [HATEOAS links](https://en.wikipedia.org/wiki/HATEOAS). |  [optional] |



## Enum: NameEnum

| Name | Value |
|---- | -----|
| NOT_AUTHORIZED | &quot;NOT_AUTHORIZED&quot; |



## Enum: MessageEnum

| Name | Value |
|---- | -----|
| AUTHORIZATION_FAILED_DUE_TO_INSUFFICIENT_PERMISSIONS_ | &quot;Authorization failed due to insufficient permissions.&quot; |



