package com.ayushprabhat.nlp;

import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import java.util.List;

public class SentimentAnalysis {
    public static void main(String[] args){
        StanfordCoreNLP stanfordCoreNLP = pipeline.getpipeline();
        String text = "Hello my name is Ayush. I don't like this place. I am not hungry.";
        CoreDocument coreDocument = new CoreDocument(text);
        stanfordCoreNLP.annotate(coreDocument);
        List<CoreSentence> sentences = coreDocument.sentences();
        for(CoreSentence sentence : sentences){
            String sentiment = sentence.sentiment();
            System.out.println(sentiment + "\t" + sentence);
        }
    }
}
