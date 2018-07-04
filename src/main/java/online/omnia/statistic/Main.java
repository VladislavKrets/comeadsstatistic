package online.omnia.statistic;

import java.util.List;

/**
 * Created by lollipop on 12.04.2018.
 */
public class Main {
    public static int days;
    public static long deltaTime = 24 * 60 * 60 * 1000;

    public static void main(String[] args) {
        if (args.length != 1) {
            return;
        }
        if (!args[0].matches("\\d+")) return;
        if (Integer.parseInt(args[0]) == 0) {
            deltaTime = 0;
        }
        days = Integer.parseInt(args[0]);
        List<AccountsEntity> accountsEntities = MySQLDaoImpl.getInstance().getAccountsEntities("comeads");
        for (AccountsEntity accountsEntity : accountsEntities) {

        }
        MySQLDaoImpl.getSessionFactory().close();
    }
}
