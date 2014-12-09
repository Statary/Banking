package beans;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.Database;

public class AccountManager {

    private List<Account> accountList = new ArrayList<Account>();

    public List<Account> getAllAccountList() {
        Statement stmt = null;
        ResultSet rs = null;
        Connection conn = null;
        try {
            conn = Database.getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM ACCOUNT");
            while (rs.next()) {
                Account account = new Account();
                account.setID(rs.getInt("ID"));
                account.setFio(rs.getString("FIO"));
                account.setDoc(rs.getString("DOC"));
                account.setBalance(rs.getInt("BALANCE"));
                accountList.add(account);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (rs != null) {
                    rs.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(AccountManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return accountList;
    }

    private int updateTable(String sql) throws SQLException {
        int res = 0;
        Statement stmt = null;
        Connection conn = null;
        try {
            conn = Database.getConnection();
            stmt = conn.createStatement();

            res = stmt.executeUpdate(sql);
            if (res == 0) {
                throw new SQLException("Execute Query was not executed.");
            }
//        } catch (SQLException ex) {
//            Logger.getLogger(AccountManager.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (NumberFormatException ex) {
//            Logger.getLogger(AccountManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(AccountManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return res;
    }

    public void createAccount(String fio, String doc) throws SQLException {
        String sql = "INSERT INTO `ACCOUNT`(`FIO`, `DOC`) VALUES (\"" + fio + "\",\"" + doc + "\");";
        updateTable(sql);
    }

    public void removeAccountById(String strId) throws SQLException, NumberFormatException {
        Integer.parseInt(strId);
        String sql = "DELETE FROM `Banking`.`ACCOUNT` WHERE `ACCOUNT`.`ID` = " + strId + ";";
        updateTable(sql);
    }

    public void AddMoney(String strId, String strMoney) throws SQLException, NumberFormatException {
        AddOrSubMoney(strId, strMoney, "+");
    }

    public void SubMoney(String strId, String strMoney) throws SQLException, NumberFormatException {
        AddOrSubMoney(strId, strMoney, "-");
    }

    private void AddOrSubMoney(String strId, String strMoney, String sign) throws SQLException, NumberFormatException {
        Integer.parseInt(strId);
        Integer.parseInt(strMoney);
        String sql = "UPDATE `Banking`.`ACCOUNT` SET `BALANCE` = `BALANCE` "
                + sign + " '" + strMoney + "' WHERE `ACCOUNT`.`ID` = " + strId + ";";
        updateTable(sql);
    }

//    private boolean getBalance(String strId) {
//
//    }
//
//    private boolean checkBalance(String strId, ) {
//
//    }
}
