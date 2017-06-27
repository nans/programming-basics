/**
 * Author: Derek Banas
 * Original: http://www.newthinktank.com/2012/09/command-design-pattern-tutorial/
 */
package pattern.behavioral.command.device;

public class TVRemote {
    public static ElectronicDevice getDevice(){
        return new Television();
    }
}
