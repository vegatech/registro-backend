package com.prueba.comohogarh2.service;

import com.prueba.comohogarh2.presenter.BenefitPresenter;
import com.prueba.comohogarh2.presenter.BenefitsPresenter;
import com.prueba.comohogarh2.utils.LoadFile;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ClientServiceTest {


    @Test
    void ShouldReadJsonFileSucsess() throws Exception {
        LoadFile load_json = new LoadFile();

        BenefitPresenter data = load_json.load_json();
        System.out.println("json"+data.toString());


    }

    @Test
    void ShouldReadXmlFileSucsess() throws Exception {
        LoadFile load_xml = new LoadFile();

        BenefitsPresenter data = load_xml.load_xml();
        System.out.println("xml"+data.toString());


    }

}
