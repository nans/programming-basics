/*
 * Original: https://en.wikipedia.org/wiki/Flyweight_pattern
 */
package pattern.structural.flyweight.characters;

public abstract class EnglishCharacter {
    protected char symbol;

    protected int width;

    protected int height;

    public abstract void printCharacter();
}
