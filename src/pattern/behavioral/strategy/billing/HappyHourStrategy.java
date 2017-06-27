/*
 * Original: https://en.wikipedia.org/wiki/Strategy_pattern
 */
package pattern.behavioral.strategy.billing;

public class HappyHourStrategy implements BillingStrategy {
    public double getActPrice(final double rawPrice) {
        return rawPrice * 0.5;
    }
}
