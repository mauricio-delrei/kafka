package com.developer.microservicekafka.data.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class RequestsDataDTO implements Serializable {

    private static final long serialVersionUID = -8528852163687738580L;
    private UUID id;
    private String code;
    private String productName;
    private BigDecimal value;
}
