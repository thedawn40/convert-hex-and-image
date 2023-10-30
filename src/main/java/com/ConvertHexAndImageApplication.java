package com;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan; 

@SpringBootApplication
public class ConvertHexAndImageApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConvertHexAndImageApplication.class, args);
		// System.out.println("hello");

		// Convert convert  = new Convert();
		// convert.readImage();

		// try {

        //     File file = new File("C:\\Users\\luthfi alfarisi\\Downloads\\test.jpg");

        //     // read an image from url
        //     BufferedImage image = ImageIO.read(file);

        //     // resize image to 300x150
        //     // Image scaledImage = image.getScaledInstance(300, 150, Image.SCALE_DEFAULT);

        //     // save the resize image aka thumbnail
        //     // ImageIO.write(
        //     //         convertToBufferedImage(scaledImage),
        //     //         "png",
        //     //         new File("C:\\Users\\luthfi alfarisi\\Downloads\\test2.png"));
		// 	byte[] fileContent = Files.readAllBytes(file.toPath());
		// 	try {
		// 		String a = getHexString(fileContent);
		// 		System.out.println(a);
		// 	} catch (Exception e) {
		// 		// TODO Auto-generated catch block
		// 		e.printStackTrace();
		// 	}


        // } catch (MalformedURLException e) {
        //     e.printStackTrace();
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
        // System.out.println("Done");

	}
	// convert Image to BufferedImage
	public static BufferedImage convertToBufferedImage(Image img) {

		if (img instanceof BufferedImage) {
			return (BufferedImage) img;
		}

		// Create a buffered image with transparency
		BufferedImage bi = new BufferedImage(
				img.getWidth(null), img.getHeight(null),
				BufferedImage.TYPE_INT_ARGB);

		Graphics2D graphics2D = bi.createGraphics();
		graphics2D.drawImage(img, 0, 0, null);
		graphics2D.dispose();

		return bi;
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
