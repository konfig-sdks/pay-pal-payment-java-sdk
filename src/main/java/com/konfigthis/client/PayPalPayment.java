package com.konfigthis.client;

import com.konfigthis.client.api.AuthorizationsApi;
import com.konfigthis.client.api.CapturesApi;
import com.konfigthis.client.api.RefundsApi;

public class PayPalPayment {
    private ApiClient apiClient;
    public final AuthorizationsApi authorizations;
    public final CapturesApi captures;
    public final RefundsApi refunds;

    public PayPalPayment() {
        this(null);
    }

    public PayPalPayment(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.authorizations = new AuthorizationsApi(this.apiClient);
        this.captures = new CapturesApi(this.apiClient);
        this.refunds = new RefundsApi(this.apiClient);
    }

}
