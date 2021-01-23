import dataaccess.IDBInitializationDAO;
import dataaccess.factory.IDAOFactory;
import view.Navigator;
import view.main.MainView;
import dataaccess.factory.ConcreteFactory;

public class Main {

    public static void main(String[] args) {

        IDAOFactory factory = ConcreteFactory.getInstance();
        IDBInitializationDAO dbInitializationDAO = factory.initializeDBDAO();
        boolean databaseInitialized = dbInitializationDAO.initializeDB();

        if (databaseInitialized) {
            System.out.println("database initialized");
            Navigator.push(MainView.class, null);
        }
    }
}
