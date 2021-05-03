package com.company;

import org.jetbrains.annotations.NotNull;

public class htmlTag extends component {

    public static @NotNull
    String getInput(){
      String inputHtmlTag= open("textarea") +" write Feedback here"+close("textarea");
      return inputHtmlTag;
    }
public static String getTitle(String title){
      String titleHtmlTag= open("Title") +title+close("Title");
      return titleHtmlTag;
}
public static String getSubmitButton(){
        String submitHtmlTag=open("input" + " "+"type= submit"+" "+ "value=save")+close("input");
        return submitHtmlTag;
}
public static String getLabel(String label){
        String labelHtmlTag=open("h1") + label +close("h1");
        return labelHtmlTag;
}
}
