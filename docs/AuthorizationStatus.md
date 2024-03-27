

# AuthorizationStatus

The status fields for an authorized payment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | The status for the authorized payment. |  [optional] [readonly] |
|**statusDetails** | [**AuthorizationStatusDetails**](AuthorizationStatusDetails.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;CREATED&quot; |
| CAPTURED | &quot;CAPTURED&quot; |
| DENIED | &quot;DENIED&quot; |
| PARTIALLY_CAPTURED | &quot;PARTIALLY_CAPTURED&quot; |
| VOIDED | &quot;VOIDED&quot; |
| PENDING | &quot;PENDING&quot; |



