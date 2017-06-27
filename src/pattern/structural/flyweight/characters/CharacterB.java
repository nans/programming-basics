/*
 * Original: https://en.wikipedia.org/wiki/Flyweight_pattern
 */
package pattern.structural.flyweight.characters;

public class CharacterB extends EnglishCharacter {
    public CharacterB() {
        symbol = 'B';
        width = 20;
        height = 30;
    }

    @Override
    public void printCharacter() {
        System.out.println("Simbol = " + symbol + " Width = " + width + " Height = " + height);
    }
}
