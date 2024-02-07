package com.ayushprabhat.nlp;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import java.util.List;

public class SentenceRecognizer {
    public static void main(String[] args){
        StanfordCoreNLP stanfordCoreNLP = pipeline.getpipeline();
        String text = "Hey!! I am Ayush Prabhat. I am a student at MSRIT.";
        CoreDocument coreDocument = new CoreDocument(text);
        stanfordCoreNLP.annotate(coreDocument);
        List<CoreSentence> sentences = coreDocument.sentences();
        for(CoreSentence sentence : sentences){
            System.out.println(sentence.toString());
        }
    }
}
