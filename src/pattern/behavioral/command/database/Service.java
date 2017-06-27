package pattern.behavioral.command.database;

public class Service {
    Database database;
    InsertCommand insert;
    UpdateCommand update;
    DeleteCommand delete;
    SelectCommand select;

    public Service(Database database) {
        this.database = database;
    }

    public void insertRecord(){
        insert.execute();
    }

    public void deleteRecord(){
        delete.execute();
    }

    public void updateRecord(){
        update.execute();
    }

    public void selectRecord(){
        select.execute();
    }
}
