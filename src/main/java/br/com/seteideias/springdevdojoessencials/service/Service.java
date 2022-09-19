package br.com.seteideias.springdevdojoessencials.service;

import br.com.seteideias.springdevdojoessencials.model.Person;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

@org.springframework.stereotype.Service
public class Service {

    String uri = "http://localhost:3001/teste";


    public Person retornaRestTemplateObject(){

    RestTemplate restTemplate = new RestTemplate();
//    RestTemplate restTemplate = new RestTemplateBuilder().rootUri(uri).build();

        Person forObject = restTemplate.getForObject(uri, Person.class);

        System.out.println(forObject);

        return forObject;
    }

    public void retornaRestTemplateEntity(){

    }

    public void retornaRestTemplateExchange(){

    }

}
