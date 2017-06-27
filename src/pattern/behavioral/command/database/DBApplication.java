package pattern.behavioral.command.database;

public class DBApplication {
    public DBApplication() {
        Database db = new Database();
        Service dbService = new Service(db);
        db.select();
        db.insert();
        db.delete();
        db.update();

    }
}
