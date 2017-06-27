/*
 * Original: https://en.wikipedia.org/wiki/Proxy_pattern
 */
package pattern.structural.proxy.mathproxy;

/**
 * "Subject"
 */

public interface IMath {

    public double add(double x, double y);

    public double sub(double x, double y);

    public double mul(double x, double y);

    public double div(double x, double y);
}
