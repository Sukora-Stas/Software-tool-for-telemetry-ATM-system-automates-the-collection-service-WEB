package by.belapb.loader;

import by.academy.it.Services.AutoInsert;
import by.academy.it.db.AtmDao;
import by.academy.it.db.INFDao;
import by.academy.it.db.PersonDao;
import by.academy.it.db.UserDao;
import by.academy.it.db.exceptions.DaoException;
import by.academy.it.pojos.ATM;
import by.academy.it.pojos.INF;
import by.academy.it.pojos.Person;
import by.academy.it.pojos.User;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class MenuLoader {
    private static Logger log = Logger.getLogger(MenuLoader.class);
    public static Boolean needMenu = true;
    private static PersonDao personDao = null;
    private static UserDao userDao = null;
    private static AtmDao atmDao = null;
    private static INFDao infDao = null;

    private static String pathATM = "C:\\Users\\stasi\\Downloads\\www_ATM.xls";
    private static String pathINF = "C:\\Users\\stasi\\Downloads\\www_INF.xls";

    public static String sql = null;

    public static void menu() throws Exception {
        Person person = null;
        User user = null;
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
                    break;
                case 2:
                    person = findPerson();
                    break;
                case 3:
                    person = null;
                    person = createPerson(person);
                    getPersonDao().saveOrUpdate(person);
                    break;
                case 4:
                    person = createPerson(person);
                    getPersonDao().saveOrUpdate(person);
                    break;
                case 5:
                    person = loadPerson();
                    break;
                case 6:
                    flushSession();
                    break;
                case 7:
                    user = findUser();
                    break;
                case 8:
                    user = null;
                    user = createUser(user);
                    getUserDao().saveOrUpdate(user);
                    break;
                case 9:
                    user = createUser(user);
                    getUserDao().saveOrUpdate(user);
                    break;
                case 10:
                    user = loadUser();
                    break;
                case 11:
                    flushSessionUser();
                    break;
                case 12:

                    insert.Insert(pathATM, 1);
                    break;
                case 13:
                    atm = findATM();
                    break;
                case 14:
//                    AutoInsert insert2 = new AutoInsert();
                    insert.Insert(pathINF, 2);
                    break;
                case 15:
                    inf = findINF();
                    break;
            }
            needMenu = true;
        }
    }

    private static void printMenu() {
        System.out.println(" Options:");
        System.out.println("        0. Exit");
        System.out.println("        1. Delete Person");
        System.out.println("        2. Get Person");
        System.out.println("        3. Save Person");
        System.out.println("        4. Update Person");
        System.out.println("        5. Load Person");
        System.out.println("        6. Flush example");
        System.out.println("                         ");
        System.out.println("        7. Get User");
        System.out.println("        8. Save User");
        System.out.println("        9. Update User");
        System.out.println("        10. Load User");
        System.out.println("        11. Flush example User");
        System.out.println();
        System.out.println("        12. auto insert ATM");
        System.out.println("        13. find ATM");
        System.out.println();
        System.out.println("        14. auto insert INF");
        System.out.println("        15. find INF");
    }

    public static Person createPerson(Person person) {
        System.out.println("Please enter person description:");
        System.out.print("Name - ");

        if (person == null) {
            person = new Person();
        }
        Scanner scanner = new Scanner(System.in);
        String parameter = scanner.nextLine();
        person.setName(parameter);
        System.out.print("Surname - ");
        parameter = scanner.nextLine();
        person.setSurname(parameter);
        System.out.print("Age - ");
        person.setAge(scanner.nextInt());
        return person;
    }

    public static User createUser(User user) {
        System.out.println("Please enter person description:");
        System.out.print("Name - ");

        if (user == null) {
            user = new User();
        }
        Scanner scanner = new Scanner(System.in);
        String parameter = scanner.nextLine();
        user.setName(parameter);
        System.out.print("Surname - ");
        parameter = scanner.nextLine();
        user.setSurname(parameter);
        System.out.print("lastname - ");
        parameter = scanner.nextLine();
        user.setLastName(parameter);
        System.out.print("age - ");
        user.setAge(scanner.nextInt());
        return user;
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

    public static Person findPerson() {
        System.out.println("Get by Id. Please enter person id:");
        System.out.print("Id - ");

        Scanner scanner = new Scanner(System.in);
        Person person = null;
        Integer id = scanner.nextInt();
        try {
            person = getPersonDao().get(id);
        } catch (DaoException e) {
            log.error(e, e);
        } catch (NullPointerException e) {
            log.error("Unable find person:", e);
        }
        System.out.print(person);
        return person;
    }

    public static User findUser() {
        System.out.println("Get by Id. Please enter user id:");
        System.out.print("Id - ");
        Scanner scanner = new Scanner(System.in);
        User user = null;

        Integer id = scanner.nextInt();
        try {
            user = getUserDao().get(id);
        } catch (DaoException e) {

            log.error(e, e);
        } catch (NullPointerException e) {
            log.error("Unable find person:", e);
        }
        System.out.print(user);

        return user;

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

    public static Person loadPerson() {
        System.out.println("Load by Id. Please enter person id:");
        System.out.print("Id - ");

        Scanner scanner = new Scanner(System.in);
        Person person = null;
        Integer id = scanner.nextInt();
        try {
            person = getPersonDao().get(id);
        } catch (DaoException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            log.error("Unable find person:", e);
        }
        System.out.print(person);
        return person;
    }

    public static User loadUser() {
        System.out.println("Load by Id. Please enter person id:");
        System.out.print("Id - ");

        Scanner scanner = new Scanner(System.in);
        User user = null;
        Integer id = scanner.nextInt();
        try {
            user = getUserDao().get(id);
        } catch (DaoException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            log.error("Unable find person:", e);
        }
        System.out.println(user);

        return user;
    }

    public static void flushSession() {
        System.out.println("Please enter person id:");
        System.out.print("Id - ");
        Scanner scanner = new Scanner(System.in);
        Person person = null;
        Integer id = scanner.nextInt();
        System.out.println("Please enter new Name:");
        System.out.print("New Name - ");
        scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        try {
            getPersonDao().flush(id, name);
        } catch (DaoException e) {
            log.error("Unable run flush example");
        }
    }

    public static void flushSessionUser() {
        System.out.println("Please enter person id:");
        System.out.print("Id - ");
        Scanner scanner = new Scanner(System.in);
        User user = null;
        Integer id = scanner.nextInt();
        System.out.println("Please enter new Name:");
        System.out.print("New Name - ");
        scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        try {
            getUserDao().flush(id, name);
        } catch (DaoException e) {
            log.error("Unable run flush example");
        }
    }

    public static PersonDao getPersonDao() {
        if (personDao == null) {
            personDao = new PersonDao();
        }
        return personDao;
    }

    public static UserDao getUserDao() {
        if (userDao == null) {
            userDao = new UserDao();
        }
        return userDao;
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
