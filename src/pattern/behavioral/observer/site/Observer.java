package pattern.behavioral.observer.site;

import java.util.List;

public interface Observer {
    void handleEvent(List<String> vacancies);
}
