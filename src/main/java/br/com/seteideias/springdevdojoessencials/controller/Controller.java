package br.com.seteideias.springdevdojoessencials.controller;

import br.com.seteideias.springdevdojoessencials.model.Person;
import br.com.seteideias.springdevdojoessencials.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Controller.
 */
@RestController
@RequestMapping("/v1")
public class Controller {

    @Autowired
    private Service service;

    @GetMapping("/teste")
    public Person teste() {

//        if (tipo.equals("object")) {
            return service.retornaRestTemplateObject();
//        }
//        if (tipo.equals("entity")) {
//            service.retornaRestTemplateEntity();
//        }
    }

}
