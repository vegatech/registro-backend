package com.prueba.comohogarh2.utils;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.prueba.comohogarh2.presenter.BenefitPresenter;
import com.prueba.comohogarh2.presenter.BenefitsPresenter;
import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class LoadFile {
    @JsonIgnoreProperties
    ObjectMapper objectMapper = new ObjectMapper();
    private String JSON_FILE_NAME = "classpath:static/sk_formato.json";
    private String JSON_XML_NAME = "classpath:static/th_formato.xml";


    public BenefitPresenter load_json() throws IOException {
        BenefitPresenter sk_format =
                objectMapper.readValue(ResourceUtils.getFile(JSON_FILE_NAME), BenefitPresenter.class);
        return  sk_format;
    }

    public BenefitsPresenter load_xml() throws FileNotFoundException ,IOException{
        XmlMapper xmlMapper = new XmlMapper();
        BenefitsPresenter th_format
                = xmlMapper.readValue(ResourceUtils.getFile(JSON_XML_NAME), BenefitsPresenter.class);
    return th_format;
    }


}
