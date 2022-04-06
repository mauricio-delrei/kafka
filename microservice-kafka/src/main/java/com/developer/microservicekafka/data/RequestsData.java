package com.developer.microservicekafka.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class RequestsData implements Serializable {


    private static final long serialVersionUID = -8528852163687738580L;
    private String code;
    private String productName;
    private BigDecimal value;
}
