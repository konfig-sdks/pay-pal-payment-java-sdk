

# RefundsDetails404Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | [**NameEnum**](#NameEnum) |  |  [optional] |
|**message** | [**MessageEnum**](#MessageEnum) |  |  [optional] |
|**details** | [**List&lt;INVALIDRESOURCEID&gt;**](INVALIDRESOURCEID.md) |  |  [optional] |
|**debugId** | **String** | The PayPal internal ID. Used for correlation purposes. |  [optional] |
|**links** | [**List&lt;ErrorLinkDescription&gt;**](ErrorLinkDescription.md) | An array of request-related [HATEOAS links](https://en.wikipedia.org/wiki/HATEOAS). |  [optional] |



## Enum: NameEnum

| Name | Value |
|---- | -----|
| RESOURCE_NOT_FOUND | &quot;RESOURCE_NOT_FOUND&quot; |



## Enum: MessageEnum

| Name | Value |
|---- | -----|
| THE_SPECIFIED_RESOURCE_DOES_NOT_EXIST_ | &quot;The specified resource does not exist.&quot; |



