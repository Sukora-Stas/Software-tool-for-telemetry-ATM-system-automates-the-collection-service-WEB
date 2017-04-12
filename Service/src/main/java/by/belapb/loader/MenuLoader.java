package by.belapb.loader;


import by.belapb.dao.AtmDao;
import by.belapb.dao.INFDao;
import by.belapb.dao.exceptions.DaoException;
import by.belapb.insert.AutoInsert;
import by.belapb.pojos.ATM;
import by.belapb.pojos.INF;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class MenuLoader {
    private static Logger log = Logger.getLogger(MenuLoader.class);
    public static Boolean needMenu = true;
    private static AtmDao atmDao = null;
    private static INFDao infDao = null;

    private static String pathATM = "C:\\Users\\stasi\\Downloads\\www_ATM.xls";
    private static String pathINF = "C:\\Users\\stasi\\Downloads\\www_INF.xls";


    public static void menu() throws Exception {
        ATM atm = null;
        INF inf = null;
        AutoInsert insert = new AutoInsert();
        while (needMenu) {
            printMenu();
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    insert.Insert(pathATM, 1);
                    break;
                case 2:
                    atm = findATM();
                    break;
                case 3:
                    insert.Insert(pathINF, 2);
                    break;
                case 4:
                    inf = findINF();
                    break;
                case 5:
                    insert.Insert(pathATM, 1);
                    insert.Insert(pathINF, 2);
                    System.exit(0);
                    break;
            }
            needMenu = true;
        }
    }

    private static void printMenu() {
        System.out.println(" Options:");
        System.out.println("        0. Exit");

        System.out.println("        1. auto insert ATM");
        System.out.println("        2. find ATM");
        System.out.println();
        System.out.println("        3. auto insert INF");
        System.out.println("        4. find INF");
        System.out.println();
        System.out.println("        5.FULL INSERT and stop application");
    }


    public static INF createINF(INF inf,
                                String BIK,
                                String names_of_divisions,
                                String region,
                                String locality,
                                String addres,
                                String position,
                                String workingTime,
                                Boolean issuance_of_currency,
                                String terminal_ID,
                                String coordinats
    ) throws Exception {
        if (inf == null) {
            inf = new INF();
        }
        inf.setBIK(Integer.valueOf(BIK));

        inf.setNames_of_divisions(names_of_divisions);

        inf.setRegion(region);

        inf.setLocality(locality);

        inf.setAddres(addres);

        inf.setPosition(position);

        inf.setWorkingTime(workingTime);

        inf.setCash_in(issuance_of_currency);

        inf.setTerminal_ID(terminal_ID);

        inf.setCoordinats(coordinats);

        return inf;
    }

    public static ATM createATM(ATM atm,
                                String BIK,
                                String names_of_divisions,
                                String region,
                                String locality,
                                String addres,
                                String position,
                                String workingTime,
                                Boolean issuance_of_currency,
                                String terminal_ID,
                                String coordinats
    ) throws Exception {

        if (atm == null) {
            atm = new ATM();
        }
        atm.setBIK(Integer.valueOf(BIK));

        atm.setNames_of_divisions(names_of_divisions);

        atm.setRegion(region);

        atm.setLocality(locality);

        atm.setAddres(addres);

        atm.setPosition(position);

        atm.setWorkingTime(workingTime);

        atm.setIssuance_of_currency(issuance_of_currency);

        atm.setTerminal_ID(terminal_ID);

        atm.setCoordinats(coordinats);


        return atm;
    }


    public static ATM findATM() {
        System.out.println("Get by Id. Please enter user id:");
        System.out.print("Id - ");
        Scanner scanner = new Scanner(System.in);

        ATM atm = new ATM();

        Integer id = scanner.nextInt();
        try {
            atm = getAtmDao().get(id);
        } catch (DaoException e) {

            log.error(e, e);
        } catch (NullPointerException e) {
            log.error("Unable find person:", e);
        }
        System.out.print(atm);
        return atm;
    }

    public static ATM findATM(Integer id) {
        ATM atm = new ATM();

        try {
            atm = getAtmDao().get(id);
        } catch (DaoException e) {

            log.error(e, e);
        } catch (NullPointerException e) {
            log.error("Unable find person:", e);
        }
        System.out.print(atm);
        return atm;
    }

    public static INF findINF() {
        System.out.println("Get by Id. Please enter user id:");
        System.out.print("Id - ");
        Scanner scanner = new Scanner(System.in);

        INF inf = new INF();

        Integer id = scanner.nextInt();
        try {
            inf = getInfDao().get(id);
        } catch (DaoException e) {

            log.error(e, e);
        } catch (NullPointerException e) {
            log.error("Unable find person:", e);
        }
        System.out.print(inf);

        return inf;
    }

    public static AtmDao getAtmDao() {
        if (atmDao == null) {
            atmDao = new AtmDao();
        }
        return atmDao;
    }

    public static INFDao getInfDao() {
        if (infDao == null) {
            infDao = new INFDao();
        }
        return infDao;
    }
}
