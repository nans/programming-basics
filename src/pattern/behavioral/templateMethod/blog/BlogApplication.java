package pattern.behavioral.templateMethod.blog;

public class BlogApplication {
    public BlogApplication() {
        BlogTemplate  mainPage = new MainPage();
        BlogTemplate  postPage = new PostPage();

        mainPage.showPage();
        postPage.showPage();
    }
}
