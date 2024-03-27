

# ProcessorResponse

The processor response information for payment requests, such as direct credit card transactions.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**avsCode** | [**AvsCodeEnum**](#AvsCodeEnum) | The address verification code for Visa, Discover, Mastercard, or American Express transactions. |  [optional] [readonly] |
|**cvvCode** | [**CvvCodeEnum**](#CvvCodeEnum) | The card verification value code for for Visa, Discover, Mastercard, or American Express. |  [optional] [readonly] |
|**responseCode** | [**ResponseCodeEnum**](#ResponseCodeEnum) | Processor response code for the non-PayPal payment processor errors. |  [optional] [readonly] |
|**paymentAdviceCode** | [**PaymentAdviceCodeEnum**](#PaymentAdviceCodeEnum) | The declined payment transactions might have payment advice codes. The card networks, like Visa and Mastercard, return payment advice codes. |  [optional] [readonly] |



## Enum: AvsCodeEnum

| Name | Value |
|---- | -----|
| A | &quot;A&quot; |
| B | &quot;B&quot; |
| C | &quot;C&quot; |
| D | &quot;D&quot; |
| E | &quot;E&quot; |
| F | &quot;F&quot; |
| G | &quot;G&quot; |
| I | &quot;I&quot; |
| M | &quot;M&quot; |
| N | &quot;N&quot; |
| P | &quot;P&quot; |
| R | &quot;R&quot; |
| S | &quot;S&quot; |
| U | &quot;U&quot; |
| W | &quot;W&quot; |
| X | &quot;X&quot; |
| Y | &quot;Y&quot; |
| Z | &quot;Z&quot; |
| NULL | &quot;Null&quot; |
| _0 | &quot;0&quot; |
| _1 | &quot;1&quot; |
| _2 | &quot;2&quot; |
| _3 | &quot;3&quot; |
| _4 | &quot;4&quot; |



## Enum: CvvCodeEnum

| Name | Value |
|---- | -----|
| E | &quot;E&quot; |
| I | &quot;I&quot; |
| M | &quot;M&quot; |
| N | &quot;N&quot; |
| P | &quot;P&quot; |
| S | &quot;S&quot; |
| U | &quot;U&quot; |
| X | &quot;X&quot; |
| ALL_OTHERS | &quot;All others&quot; |
| _0 | &quot;0&quot; |
| _1 | &quot;1&quot; |
| _2 | &quot;2&quot; |
| _3 | &quot;3&quot; |
| _4 | &quot;4&quot; |



## Enum: ResponseCodeEnum

| Name | Value |
|---- | -----|
| _0000 | &quot;0000&quot; |
| _00N7 | &quot;00N7&quot; |
| _0100 | &quot;0100&quot; |
| _0390 | &quot;0390&quot; |
| _0500 | &quot;0500&quot; |
| _0580 | &quot;0580&quot; |
| _0800 | &quot;0800&quot; |
| _0880 | &quot;0880&quot; |
| _0890 | &quot;0890&quot; |
| _0960 | &quot;0960&quot; |
| _0R00 | &quot;0R00&quot; |
| _1000 | &quot;1000&quot; |
| _10BR | &quot;10BR&quot; |
| _1300 | &quot;1300&quot; |
| _1310 | &quot;1310&quot; |
| _1312 | &quot;1312&quot; |
| _1317 | &quot;1317&quot; |
| _1320 | &quot;1320&quot; |
| _1330 | &quot;1330&quot; |
| _1335 | &quot;1335&quot; |
| _1340 | &quot;1340&quot; |
| _1350 | &quot;1350&quot; |
| _1352 | &quot;1352&quot; |
| _1360 | &quot;1360&quot; |
| _1370 | &quot;1370&quot; |
| _1380 | &quot;1380&quot; |
| _1382 | &quot;1382&quot; |
| _1384 | &quot;1384&quot; |
| _1390 | &quot;1390&quot; |
| _1393 | &quot;1393&quot; |
| _5100 | &quot;5100&quot; |
| _5110 | &quot;5110&quot; |
| _5120 | &quot;5120&quot; |
| _5130 | &quot;5130&quot; |
| _5135 | &quot;5135&quot; |
| _5140 | &quot;5140&quot; |
| _5150 | &quot;5150&quot; |
| _5160 | &quot;5160&quot; |
| _5170 | &quot;5170&quot; |
| _5180 | &quot;5180&quot; |
| _5190 | &quot;5190&quot; |
| _5200 | &quot;5200&quot; |
| _5210 | &quot;5210&quot; |
| _5400 | &quot;5400&quot; |
| _5500 | &quot;5500&quot; |
| _5650 | &quot;5650&quot; |
| _5700 | &quot;5700&quot; |
| _5710 | &quot;5710&quot; |
| _5800 | &quot;5800&quot; |
| _5900 | &quot;5900&quot; |
| _5910 | &quot;5910&quot; |
| _5920 | &quot;5920&quot; |
| _5930 | &quot;5930&quot; |
| _5950 | &quot;5950&quot; |
| _6300 | &quot;6300&quot; |
| _7600 | &quot;7600&quot; |
| _7700 | &quot;7700&quot; |
| _7710 | &quot;7710&quot; |
| _7800 | &quot;7800&quot; |
| _7900 | &quot;7900&quot; |
| _8000 | &quot;8000&quot; |
| _8010 | &quot;8010&quot; |
| _8020 | &quot;8020&quot; |
| _8030 | &quot;8030&quot; |
| _8100 | &quot;8100&quot; |
| _8110 | &quot;8110&quot; |
| _8220 | &quot;8220&quot; |
| _9100 | &quot;9100&quot; |
| _9500 | &quot;9500&quot; |
| _9510 | &quot;9510&quot; |
| _9520 | &quot;9520&quot; |
| _9530 | &quot;9530&quot; |
| _9540 | &quot;9540&quot; |
| _9600 | &quot;9600&quot; |
| PCNR | &quot;PCNR&quot; |
| PCVV | &quot;PCVV&quot; |
| PP06 | &quot;PP06&quot; |
| PPRN | &quot;PPRN&quot; |
| PPAD | &quot;PPAD&quot; |
| PPAB | &quot;PPAB&quot; |
| PPAE | &quot;PPAE&quot; |
| PPAG | &quot;PPAG&quot; |
| PPAI | &quot;PPAI&quot; |
| PPAR | &quot;PPAR&quot; |
| PPAU | &quot;PPAU&quot; |
| PPAV | &quot;PPAV&quot; |
| PPAX | &quot;PPAX&quot; |
| PPBG | &quot;PPBG&quot; |
| PPC2 | &quot;PPC2&quot; |
| PPCE | &quot;PPCE&quot; |
| PPCO | &quot;PPCO&quot; |
| PPCR | &quot;PPCR&quot; |
| PPCT | &quot;PPCT&quot; |
| PPCU | &quot;PPCU&quot; |
| PPD3 | &quot;PPD3&quot; |
| PPDC | &quot;PPDC&quot; |
| PPDI | &quot;PPDI&quot; |
| PPDV | &quot;PPDV&quot; |
| PPDT | &quot;PPDT&quot; |
| PPEF | &quot;PPEF&quot; |
| PPEL | &quot;PPEL&quot; |
| PPER | &quot;PPER&quot; |
| PPEX | &quot;PPEX&quot; |
| PPFE | &quot;PPFE&quot; |
| PPFI | &quot;PPFI&quot; |
| PPFR | &quot;PPFR&quot; |
| PPFV | &quot;PPFV&quot; |
| PPGR | &quot;PPGR&quot; |
| PPH1 | &quot;PPH1&quot; |
| PPIF | &quot;PPIF&quot; |
| PPII | &quot;PPII&quot; |
| PPIM | &quot;PPIM&quot; |
| PPIT | &quot;PPIT&quot; |
| PPLR | &quot;PPLR&quot; |
| PPLS | &quot;PPLS&quot; |
| PPMB | &quot;PPMB&quot; |
| PPMC | &quot;PPMC&quot; |
| PPMD | &quot;PPMD&quot; |
| PPNC | &quot;PPNC&quot; |
| PPNL | &quot;PPNL&quot; |
| PPNM | &quot;PPNM&quot; |
| PPNT | &quot;PPNT&quot; |
| PPPH | &quot;PPPH&quot; |
| PPPI | &quot;PPPI&quot; |
| PPPM | &quot;PPPM&quot; |
| PPQC | &quot;PPQC&quot; |
| PPRE | &quot;PPRE&quot; |
| PPRF | &quot;PPRF&quot; |
| PPRR | &quot;PPRR&quot; |
| PPS0 | &quot;PPS0&quot; |
| PPS1 | &quot;PPS1&quot; |
| PPS2 | &quot;PPS2&quot; |
| PPS3 | &quot;PPS3&quot; |
| PPS4 | &quot;PPS4&quot; |
| PPS5 | &quot;PPS5&quot; |
| PPS6 | &quot;PPS6&quot; |
| PPSC | &quot;PPSC&quot; |
| PPSD | &quot;PPSD&quot; |
| PPSE | &quot;PPSE&quot; |
| PPTE | &quot;PPTE&quot; |
| PPTF | &quot;PPTF&quot; |
| PPTI | &quot;PPTI&quot; |
| PPTR | &quot;PPTR&quot; |
| PPTT | &quot;PPTT&quot; |
| PPTV | &quot;PPTV&quot; |
| PPUA | &quot;PPUA&quot; |
| PPUC | &quot;PPUC&quot; |
| PPUE | &quot;PPUE&quot; |
| PPUI | &quot;PPUI&quot; |
| PPUP | &quot;PPUP&quot; |
| PPUR | &quot;PPUR&quot; |
| PPVC | &quot;PPVC&quot; |
| PPVE | &quot;PPVE&quot; |
| PPVT | &quot;PPVT&quot; |



## Enum: PaymentAdviceCodeEnum

| Name | Value |
|---- | -----|
| _01 | &quot;01&quot; |
| _02 | &quot;02&quot; |
| _03 | &quot;03&quot; |
| _21 | &quot;21&quot; |



