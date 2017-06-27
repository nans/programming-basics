package pattern.behavioral.templateMethod.blog;

public class PostPage extends BlogTemplate{

    @Override
    public void showPageContent() {
        System.out.println("Post content.");
    }
}
