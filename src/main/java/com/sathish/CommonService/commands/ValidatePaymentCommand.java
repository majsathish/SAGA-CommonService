package com.sathish.CommonService.commands;

import com.sathish.CommonService.model.CardDetails;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class ValidatePaymentCommand {
        private String paymentId;
        private String orderId;
        private CardDetails cardDetails;

    }


