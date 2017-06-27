/*
 * Original: https://en.wikipedia.org/wiki/Flyweight_pattern
 */
package pattern.structural.flyweight.characters;

public class CharacterA extends EnglishCharacter {
    public CharacterA(){
        symbol = 'A';
        width = 10;
        height = 20;
    }

    @Override
    public void printCharacter() {
        System.out.println("Simbol = " + symbol + " Width = " + width + " Height = " + height);
    }
}
