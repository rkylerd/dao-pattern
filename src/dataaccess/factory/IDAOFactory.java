package dataaccess.factory;

import dataaccess.sqlite.DBInitializationDAO;
import dataaccess.IExpenseDAO;

public interface IDAOFactory {
    public DBInitializationDAO initializeDBDAO();
    public IExpenseDAO createExpenseDAO();
}
