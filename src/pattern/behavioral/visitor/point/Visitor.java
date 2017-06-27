/**
 * Original: https://ru.wikipedia.org/wiki/
 */
package pattern.behavioral.visitor.point;

public interface Visitor {
    public void visit ( Point2d p );
    public void visit ( Point3d p );
}
