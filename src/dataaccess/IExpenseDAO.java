package dataaccess;

import model.Expense;

import java.util.List;

public interface IExpenseDAO {
    public boolean insert(Expense expense);
    public boolean update(Expense expense);
    public boolean delete(String id);
    public List<Expense> get(String budgetId);
}
