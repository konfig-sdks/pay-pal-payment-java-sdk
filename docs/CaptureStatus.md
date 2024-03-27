

# CaptureStatus

The status of a captured payment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | The status of the captured payment. |  [optional] [readonly] |
|**statusDetails** | [**CaptureStatusDetails**](CaptureStatusDetails.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| COMPLETED | &quot;COMPLETED&quot; |
| DECLINED | &quot;DECLINED&quot; |
| PARTIALLY_REFUNDED | &quot;PARTIALLY_REFUNDED&quot; |
| PENDING | &quot;PENDING&quot; |
| REFUNDED | &quot;REFUNDED&quot; |
| FAILED | &quot;FAILED&quot; |



