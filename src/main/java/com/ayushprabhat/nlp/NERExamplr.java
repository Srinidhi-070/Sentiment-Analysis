package com.ayushprabhat.nlp;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class NERExamplr {
    public static void main(String[] args) {
        StanfordCoreNLP stanfordCoreNLP = pipeline.getpipeline();
        String text = "Hey!! my name is Ayush Prabhat and I have a girlfriend her name is Disha." +
                " we both are living in Tumkur ";
        CoreDocument coreDocument = new CoreDocument(text);
        stanfordCoreNLP.annotate(coreDocument);
        List<CoreLabel> coreLabels = coreDocument.tokens();
        for (CoreLabel coreLabel : coreLabels) {
            String ner = coreLabel.get(CoreAnnotations.NamedEntityTagAnnotation.class);
            System.out.println(coreLabel.originalText() + "=" + ner);
        }
    }
}
