package com.prueba.comohogarh2.controller;

import com.prueba.comohogarh2.presenter.ClientPresenter;
import com.prueba.comohogarh2.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ClientController {
    @Autowired
    private  ClientService clientService;

    @GetMapping("/findAllCLients")
    public List<ClientPresenter>  getAllClients(){
        return clientService.getAllClient();
    }

}
