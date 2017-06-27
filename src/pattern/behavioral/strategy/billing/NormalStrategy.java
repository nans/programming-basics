/*
 * Original: https://en.wikipedia.org/wiki/Strategy_pattern
 */
package pattern.behavioral.strategy.billing;

public class NormalStrategy implements BillingStrategy {
    public double getActPrice(final double rawPrice) {
        return rawPrice;
    }
}
