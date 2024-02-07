package com.ayushprabhat.nlp;

import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.Properties;

public class pipeline {
    private static Properties properties;
    private static String propertiesname = "tokenize,ssplit,pos,lemma,ner,parse,sentiment";
    private static StanfordCoreNLP stanfordCoreNLP;

    private pipeline() {

    }
    static {
        properties = new Properties();
        properties.setProperty("annotators",propertiesname);
    }
    public static StanfordCoreNLP getpipeline(){
        if(stanfordCoreNLP == null) {
            stanfordCoreNLP = new StanfordCoreNLP(properties);
        }
        return stanfordCoreNLP;
    }
}
