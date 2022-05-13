package com.prueba.comohogarh2.service;

import com.prueba.comohogarh2.presenter.sk_formato;
import com.prueba.comohogarh2.utils.LoadFile;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ClientServiceTest {


    @Test
    void ShouldReadJsonFileSucsess() throws Exception {
        LoadFile load_json = new LoadFile();

        sk_formato data = load_json.load_json();
        System.out.println("json"+data.toString());


    }

}
