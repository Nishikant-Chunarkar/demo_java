/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package text_analyzer;

/**
 *
 * @author nishi
 */

public class Text_Analyzer {
    
    private String inputtedText;
    private int textLength;
    private int wordCount;
    private int lineCount;
    private int tabCount;
    private int spaceCount;

    public Text_Analyzer(String inputtedText) {
        this.inputtedText = inputtedText;
        analyze();
    }

    public int getTextLength() {
        return textLength;
    }

    public int getWordCount() {
        return wordCount;
    }

    public int getLineCount() {
        return lineCount;
    }

    public int getTabCount() {
        return tabCount;
    }

    public int getSpaceCount() {
        return spaceCount;
    }
    
public int getCharCount(char c) {
    int count = 0;
    for (int i = 0; i < inputtedText.length(); i++) {
        if (inputtedText.charAt(i) == c) {
            count++;
        }
    }
    return count;
}
    
    public int getWordCount(String word) {
        if (inputtedText.isEmpty() || word.isEmpty()) {
            return 0;
        }
        
        // Case insensitive comparison
        String text = inputtedText.toLowerCase();
        word = word.toLowerCase();
        
        // Split by any whitespace and punctuation
        String[] words = text.split("[\\s.,;:!?()\\[\\]{}\"]+");
        int count = 0;
        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
        }
        return count;
    }
    
    private void analyze(){
        textLength = inputtedText.length();
        lineCount = inputtedText.isEmpty() ? 0 : inputtedText.split("\n", -1).length;
        spaceCount = inputtedText.isEmpty() ? 0 : inputtedText.split(" ", -1).length - 1;
        tabCount = inputtedText.isEmpty() ? 0 : inputtedText.split("\t", -1).length - 1;
        
        // More accurate word count that handles multiple spaces and punctuation
        if (inputtedText.isEmpty()) {
            wordCount = 0;
        } else {
            String[] words = inputtedText.split("[\\s.,;:!?()\\[\\]{}\"]+");
            wordCount = 0;
            for (String word : words) {
                if (!word.isEmpty()) {
                    wordCount++;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Text Analysis Results:\n" +
               "----------------------\n" +
               "Total Length: " + textLength + " characters\n" +
               "Lines: " + lineCount + "\n" +
               "Words: " + wordCount + "\n" +
               "Tabs: " + tabCount + "\n" +
               "Spaces: " + spaceCount;
    }
}