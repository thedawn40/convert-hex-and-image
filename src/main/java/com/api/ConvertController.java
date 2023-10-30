package com.api;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api")
public class ConvertController {

    @PostMapping(value = "/convertToHex", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String convert(@RequestPart(name = "file") MultipartFile file){
        String a = "";
        try {
            byte [] byteArr=file.getBytes();
            a = getHexString(byteArr);        
        } catch (Exception e) {
            // TODO: handle exception
        }

        return a;

    }

    public static String getHexString(byte[] b) throws Exception {
		String result = "";
		for (int i=0; i < b.length; i++) {
		  result +=
				Integer.toString( ( b[i] & 0xff ) + 0x100, 16).substring( 1 );
		}
		return result;
	  }
    
}
