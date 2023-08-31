package com.jz.finance.model.rest.response;

import jdk.internal.joptsimple.internal.Messages;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UtilityPaymentResponse {
    private String message;
    private String transactionId;


}