package io.codekaffee.camelfile.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import io.codekaffee.camelfile.processors.FileProcessor;

@Component
public class FileRoute extends RouteBuilder {

    private String path = "/home/israelferreira/Downloads/csvs-curso-camel/";

    @Override
    public void configure() throws Exception {
        from("file://" + path + "input")
            .log("${file:name}")
            .bean("fileComponent")
            .process(new FileProcessor())
            .to("file://" + path + "output");

    }

}
