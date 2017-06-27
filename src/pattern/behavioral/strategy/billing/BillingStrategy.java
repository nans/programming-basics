/*
 * Original: https://en.wikipedia.org/wiki/Strategy_pattern
 */
package pattern.behavioral.strategy.billing;

public interface BillingStrategy {
    public double getActPrice(final double rawPrice);
}
