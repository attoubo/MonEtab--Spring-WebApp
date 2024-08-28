package ci.digitalacademy.monetab.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequiredArgsConstructor
@Slf4j
@Controller
@RequestMapping("/home")
public class HomeController {


    @GetMapping
    public String home(){

        return "home/dashboard";
    }



}

// DOIT GERER LE DASHBOARD,LE RENDRE DYNAMIQUE
// GERER LE BUTTON SUPPRIMER
// FAIRE MA VIDEO CE MATIN.