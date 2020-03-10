package ru.ctimas.clean.architecture.adapter.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Модель счета")
public class AccountRestModel {

    @JsonProperty("id")
    @ApiModelProperty("Идентификатор счета")
    private Long id;

    @JsonProperty("accountNumber")
    @ApiModelProperty("Номер счета")
    private String accountNumber;

    @JsonProperty("label")
    @ApiModelProperty("Имя счета")
    private String label;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
