package pattern.behavioral.templateMethod.blog;

public abstract class BlogTemplate {
    public void showPage() {
        System.out.println("Header");
        showPageContent();
        System.out.println("Footer");
    }

    public abstract void showPageContent();
}
