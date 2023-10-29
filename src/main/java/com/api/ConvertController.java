package com.api;

import java.io.File;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api")
public class ConvertController {

    @PostMapping(value = "/convertToHex")
    public String convert(@RequestBody Map<String,Object> file){

        System.out.println(file.get(0));

        return "test";

    }
    
}
