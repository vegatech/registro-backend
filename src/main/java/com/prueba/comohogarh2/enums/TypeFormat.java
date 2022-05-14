package com.prueba.comohogarh2.enums;

import lombok.Getter;

@Getter
public enum TypeFormat {

    json_format("SK"),
    xml_format("TH");
    private String name;

    TypeFormat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {return   this.name; }
}
