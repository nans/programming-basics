/*
 * Author: Derek Banas
 * http://www.newthinktank.com/2012/09/singleton-design-pattern-tutorial/
 */
package pattern.creational.singleton.scrabbleTest;

public class ScrabbleTestThreads{

    public ScrabbleTestThreads(){

        // Create a new Thread created using the Runnable interface
        // Execute the code in run after 10 seconds

        Runnable getTiles = new GetTheTiles();

        Runnable getTilesAgain = new GetTheTiles();

        // Call for the code in the method run to execute

        new Thread(getTiles).start();
        new Thread(getTilesAgain).start();

    }

}
