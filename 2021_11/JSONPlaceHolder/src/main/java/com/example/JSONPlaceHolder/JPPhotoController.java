package com.example.JSONPlaceHolder;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class JPPhotoController {
    
    @GetMapping("/photos")
    public JPPhoto[] jpPhotoInfo(RestTemplate restTemplate) {
        String URL = "https://jsonplaceholder.typicode.com/albums/1/photos";

        JPPhoto[] jpPhotos = restTemplate.getForObject(URL, JPPhoto[].class);

        return jpPhotos;
    }

/*     @GetMapping("/photo/{albumId}")
    public JPPhoto jpPhotoInfo2(RestTemplate restTemplate, @PathVariable String albumId) {
        String URL2 = "https://jsonplaceholder.typicode.com/albums/" + albumId + "/photos";

        JPPhoto jpPhoto = restTemplate.getForObject(URL2, JPPhoto.class);

        return jpPhoto;
    }
 */

}
