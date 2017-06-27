/*
 * Original: https://en.wikipedia.org/wiki/Flyweight_pattern
 */
package pattern.structural.flyweight.characters;

public class CharacterApplication {
    public CharacterApplication() {
        CharactersFactory factory = new CharactersFactory();

        int[] characterCodes = {1, 2};
        for (int nextCode : characterCodes) {
            EnglishCharacter character = factory.getCharacter(nextCode);
            character.printCharacter();
        }
    }
}
