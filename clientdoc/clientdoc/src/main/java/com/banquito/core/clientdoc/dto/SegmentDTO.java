package com.banquito.core.clientdoc.dto;

public class SegmentDTO {

    private String code;
    private String name;
    private String clientType;
    private String description;
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getClientType() {
        return clientType;
    }
    public void setClientType(String clientType) {
        this.clientType = clientType;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String toString() {
        return "SegmentDTO [code=" + code + ", name=" + name + ", clientType=" + clientType + ", description="
                + description + "]";
    }
    

    

}
