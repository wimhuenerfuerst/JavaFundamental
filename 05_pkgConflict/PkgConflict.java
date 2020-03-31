import java.util.Random;
import java.sql.*;

public class PkgConflict {
    Date d; // And without? How to prevent?
    
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10));
    }
}
