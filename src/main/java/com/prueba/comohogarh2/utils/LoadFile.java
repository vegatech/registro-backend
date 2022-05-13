package com.prueba.comohogarh2.utils;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.prueba.comohogarh2.entity.Benefit;
import com.prueba.comohogarh2.presenter.sk_formato;
import org.springframework.util.ResourceUtils;

import java.io.IOException;

public class LoadFile {
    @JsonIgnoreProperties
    ObjectMapper objectMapper = new ObjectMapper();
    private String JSON_FILE_NAME = "classpath:static/sk_formato.json";



    public sk_formato load_json() throws IOException {
        sk_formato sk_formato =
                objectMapper.readValue(ResourceUtils.getFile(JSON_FILE_NAME), sk_formato.class);
        return  sk_formato;
    }


}
