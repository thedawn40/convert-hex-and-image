package com.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.util.HexConvert;

@RestController
@RequestMapping("/api")
public class ConvertController {

    @PostMapping(value = "/convertToHex", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String convert(@RequestPart(name = "file") MultipartFile file){
        String a = "";
        try {
            byte [] byteArr=file.getBytes();
            a = HexConvert.byteToHex(byteArr);        
        } catch (Exception e) {
            // TODO: handle exception
        }

        return a;

    }
    
}
