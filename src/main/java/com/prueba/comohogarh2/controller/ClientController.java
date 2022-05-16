package com.prueba.comohogarh2.controller;

import com.prueba.comohogarh2.entity.Benefit;
import com.prueba.comohogarh2.entity.Client;
import com.prueba.comohogarh2.presenter.BenefitPresenter;
import com.prueba.comohogarh2.presenter.BenefitsPresenter;
import com.prueba.comohogarh2.presenter.ClientPresenter;
import com.prueba.comohogarh2.service.ClientService;
import com.prueba.comohogarh2.utils.LoadFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ClientController {
    @Autowired
    private ClientService clientService;
    private BenefitPresenter th_formato_json = new BenefitPresenter();
    private BenefitsPresenter sk_formato_xml = new BenefitsPresenter();

    @GetMapping("/signup")
    public String showSignUpForm(Client client) {
        return "add-client";
    }

    public ClientController() {
        LoadFile loadFile = new LoadFile();
        try {
            th_formato_json = loadFile.load_json();
            sk_formato_xml = loadFile.load_xml();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @GetMapping("/index")
    public String showUserList(Model model) {
        model.addAttribute("users", clientService.getAllClient());
        return "index";
    }

    @PostMapping("/addclient")
    public String addUser(@Validated Client client, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-client";
        }
        if (client.getGroupId().equalsIgnoreCase("xml")) {
            List<ClientPresenter> clients = clientService.getAllClient();
            Benefit benefit = new Benefit();
            sk_formato_xml.getBeneficios().forEach(benefitPresenter -> {
                clients.stream().filter(clientPresenter -> !benefitPresenter.getBeneficio().equalsIgnoreCase(clientPresenter.getBenefitPresent().getBeneficio())).forEach(clientPresenter -> {

                });
            });
            for (BenefitPresenter benefitPresenter : sk_formato_xml.getBeneficios()) {
                boolean existe = false;
                for (ClientPresenter clientPresenter : clients) {
                    if (benefitPresenter.getBeneficio().equalsIgnoreCase(clientPresenter.getBenefitPresent().getBeneficio())) {
                        existe = true;
                        break;
                    }
                }
                if (!existe) {
                    benefit.setBeneficio(benefitPresenter.getBeneficio());
                    break;
                }
            }
            client.setBenefit(benefit);
            client = clientService.save(client);

        } else {
            //th_formato_json
        }

        client = clientService.save(client);
        Benefit benefit = new Benefit();


        return "redirect:/index";
    }
}
