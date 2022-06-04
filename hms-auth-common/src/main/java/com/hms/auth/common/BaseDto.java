package com.hms.auth.common;

import lombok.Data;

@Data
public class BaseDto implements java.io.Serializable {
    private String userCode;
    private String userName;
    private String orgCode;
}
