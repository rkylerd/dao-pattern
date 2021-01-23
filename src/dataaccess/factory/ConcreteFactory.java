package dataaccess.factory;

import dataaccess.sqlite.DBInitializationDAO;
import dataaccess.sqlite.ExpenseDAO;
import dataaccess.IExpenseDAO;

public class ConcreteFactory implements IDAOFactory {

    private static ConcreteFactory instance;

    public static ConcreteFactory getInstance() {
        if (instance == null) {
            instance = new ConcreteFactory();
        }
        return instance;
    }

    @Override
    public DBInitializationDAO initializeDBDAO() {
        return new DBInitializationDAO();
    }

    @Override
    public IExpenseDAO createExpenseDAO() {
        return new ExpenseDAO();
    }
}
