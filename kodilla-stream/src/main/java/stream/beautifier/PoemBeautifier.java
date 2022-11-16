package stream.beautifier;

public class PoemBeautifier {
   public String beautify(String s, PoemDecorator poemDecorator){
       return poemDecorator.decorate(s);
    }
}
