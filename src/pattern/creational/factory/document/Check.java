package pattern.creational.factory.document;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Check extends Document{
    public Check(){
        setTitle("Check");
        setPriority(3);
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        setDate(dateFormat.format(date));
    }
}
