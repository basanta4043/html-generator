package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
public static String open(String tag){

    return ("<"+tag+">");
}
    public static String close(String tag){

        return ("</"+tag+">");
    }
    public static void main(String[] args) throws IOException {
    htmlTag tagHtml=new htmlTag();

        File file= new File("index.html");
        file.createNewFile();
        String getHtml=open("html")+open("head")+tagHtml.getTitle("Hello")+close("head")+open("body")+tagHtml.getLabel("Feedback")+tagHtml.getInput()+tagHtml.getSubmitButton()+close("body")+ close("html");
        Path path= Paths.get("index.html");
        Files.writeString(path,getHtml);

    }
}
