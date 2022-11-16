package stream;

import stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String result = poemBeautifier.beautify("Lalalala", s -> s.toUpperCase());
        System.out.println(result);
        String result2 = poemBeautifier.beautify("Kotki dwa", s -> "ABC "+ s +" ABC");
        System.out.println(result2);
        String result3 = poemBeautifier.beautify("Szarobure", s -> s + s.length());
        System.out.println(result3);
        String result4 = poemBeautifier.beautify("Obydwa", s -> s + ":)");
        System.out.println(result4);
    }

}
