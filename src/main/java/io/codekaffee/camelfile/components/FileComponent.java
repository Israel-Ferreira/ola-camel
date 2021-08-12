package io.codekaffee.camelfile.components;

import java.io.File;

import org.springframework.stereotype.Component;

@Component
public class FileComponent {
    
    public void process(File file){
        System.out.println("Arquivo FileComponent:  " + file.getName());
    }
}
