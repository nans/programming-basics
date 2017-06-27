package pattern.behavioral.observer.site;

import java.util.ArrayList;
import java.util.List;

public class Site implements Observed {
    List<String> vacancies = new ArrayList<>();
    List<Observer> developers = new ArrayList<>();


    public void addVacancy(String vacancy) {
        vacancies.add(vacancy);
        notifyObserver();
    }

    public void removeVacancy(String vacancy) {
        vacancies.remove(vacancy);
        notifyObserver();
    }

    @Override
    public void addObserver(Observer observer) {
        developers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        developers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : developers) {
            observer.handleEvent(vacancies);
        }
    }
}
