package com.snsystems.kotlinLang;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DealJavaDTO {

    private Integer dealId;
    private String dealCode;
    private String dealName;
    private String status;

    public DealJavaDTO() { }

    public DealJavaDTO(Integer dealId, String dealCode, String dealName, String status) {
        this.dealId = dealId;
        this.dealCode = dealCode;
        this.dealName = dealName;
        this.status = status;
    }
}
