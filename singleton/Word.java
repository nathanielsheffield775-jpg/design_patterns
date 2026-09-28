package singleton;

import java.util.ArrayList;
import java.util.List;

public class Word {
    private String word;
    private String type;
    private String definition;
    private String sentence;

    private static final String BLUE = "\u001B[34m";
    private static final String PURPLE = "\u001B[35m";
    private static final String RESET = "\u001B[0m";
    private static final int MAX_CONTENT_WIDTH = 60;

    /**
     * Constructs a new word instance with the specified parameters.
     *
     * @param word word
     * @param type type
     * @param definition definition
     * @param sentence sentence
     */
    public Word(String word, String type, String definition, String sentence) {
        this.word = word;
        this.type = type;
        this.definition = definition;
        this.sentence = sentence;
    }
    /**
     * Returns the flash card front.
     *
     * @return the resulting string
     */
    public String getFlashCardFront() {
        List<String> content = new ArrayList<>();
        content.add(word + " (" + type + ")");
        return buildCard(content, BLUE);
    }

    /**
     * Returns the flash card back.
     *
     * @return the resulting string
     */
    public String getFlashCardBack() {
        List<String> content = new ArrayList<>();
        content.addAll(wrapText("Definition: " + definition, MAX_CONTENT_WIDTH));
        content.add("");
        content.addAll(wrapText("Example: " + sentence, MAX_CONTENT_WIDTH));
        return buildCard(content, PURPLE);
    }

    /**
     * Wrap texts.
     *
     * @param text text
     * @param maxWidth max width
     * @return list containing strings
     */
    private List<String> wrapText(String text, int maxWidth) {
        List<String> lines = new ArrayList<>();
        String[] words = text.split(" ");
        StringBuilder current = new StringBuilder();

        for (String w : words) {
            int extra = current.length() == 0 ? 0 : 1;
            if (current.length() + extra + w.length() > maxWidth) {
                lines.add(current.toString());
                current = new StringBuilder();
            }
            if (current.length() > 0) {
                current.append(" ");
            }
            current.append(w);
        }
        if (current.length() > 0) {
            lines.add(current.toString());
        }
        return lines;
    }

    /**
     * Builds the card.
     *
     * @param content content
     * @param textColor text color
     * @return the resulting string
     */
    private String buildCard(List<String> content, String textColor) {
        int width = 0;
        for (String line : content) {
            width = Math.max(width, line.length());
        }

        StringBuilder sb = new StringBuilder();
        sb.append(BLUE);
        sb.append("+").append("-".repeat(width + 2)).append("+\n");

        for (String line : content) {
            sb.append(BLUE).append("|").append(RESET).append(textColor);
            sb.append(" ").append(line).append(" ".repeat(width - line.length()));
            sb.append(" ").append(RESET).append(BLUE).append("|\n");
        }

        sb.append("+").append("-".repeat(width + 2)).append("+");
        sb.append(RESET);
        return sb.toString();
    }
}