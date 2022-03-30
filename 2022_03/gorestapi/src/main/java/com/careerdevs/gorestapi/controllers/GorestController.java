package com.careerdevs.gorestapi.controllers;

import com.careerdevs.gorestapi.models.GorestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/user")
public class GorestController {
    

    @Autowired
    Environment env;

    @GetMapping("/token")
    public String getToken() {
        return env.getProperty("GO_REST_TOKEN");
    }

    @GetMapping("/firstpage")
    public Object getFirstPage(RestTemplate restTemplate) {
        
        try {
            String url = "https://gorest.co.in/public/v2/users/";

            ResponseEntity<GorestModel[]> firstPage = restTemplate.getForEntity(url, GorestModel[].class);

            GorestModel[] firstPageUsers = firstPage.getBody();

            for (int i = 0; i < firstPageUsers.length; i++) {
                GorestModel tempUser = firstPageUsers[i];

                System.out.println(tempUser.generateReport());
            }
            
            return firstPage;

        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @GetMapping("/{id}")
    public ResponseEntity getOneUser(RestTemplate restTemplate, @PathVariable("id") int userId) {

        try {
            String url = "https://gorest.co.in/public/v2/comments/" + userId;
            return new ResponseEntity<>(restTemplate.getForObject(url, GorestModel.class), HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    


}
