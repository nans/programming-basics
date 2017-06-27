/*
 * Original: https://en.wikipedia.org/wiki/Flyweight_pattern
 */
package pattern.structural.flyweight.characters;

import java.util.HashMap;

public class CharactersFactory {
    private HashMap<Integer, EnglishCharacter> characters = new HashMap<Integer, EnglishCharacter>();

    public EnglishCharacter getCharacter(int code) {
        EnglishCharacter character = characters.get(code);
        if (character == null) {
            switch (code) {
                case 1:
                    character = new CharacterA();
                    break;
                case 2:
                    character = new CharacterB();
                    break;
            }
            characters.put(code, character);
        }
        return character;
    }
}
