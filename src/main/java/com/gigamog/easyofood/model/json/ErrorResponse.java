package com.gigamog.easyofood.model.json;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ErrorResponse {
    private String responseMessage;
    private String responseCode;
}
