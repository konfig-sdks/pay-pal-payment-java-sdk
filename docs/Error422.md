

# Error422

The requested action cannot be performed and may require interaction with APIs or processes outside of the current request. This is distinct from a 500 response in that there are no systemic problems limiting the API from performing the request.

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
| UNPROCESSABLE_ENTITY | &quot;UNPROCESSABLE_ENTITY&quot; |



## Enum: MessageEnum

| Name | Value |
|---- | -----|
| THE_REQUESTED_ACTION_COULD_NOT_BE_PERFORMED_SEMANTICALLY_INCORRECT_OR_FAILED_BUSINESS_VALIDATION_ | &quot;The requested action could not be performed, semantically incorrect, or failed business validation.&quot; |



