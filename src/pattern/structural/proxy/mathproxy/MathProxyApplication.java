/*
 * Original: https://en.wikipedia.org/wiki/Proxy_pattern
 */
package pattern.structural.proxy.mathproxy;

public class MathProxyApplication {
    public MathProxyApplication(){
        IMath p = new MathProxy();

        // Do the math
        System.out.println("4 + 2 = " + p.add(4, 2));
        System.out.println("4 - 2 = " + p.sub(4, 2));
        System.out.println("4 * 2 = " + p.mul(4, 2));
        System.out.println("4 / 2 = " + p.div(4, 2));
    }
}
