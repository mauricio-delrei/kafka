package com.developer.restkafka.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestsData implements Serializable {

    private static final long serialVersionUID = -8528852163687738580L;
    private String code;
    private String productName;
    private BigDecimal value;
}
