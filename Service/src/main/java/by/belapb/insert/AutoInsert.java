package by.belapb.insert;


import by.belapb.pojos.ATM;
import by.belapb.pojos.INF;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

import static by.belapb.loader.MenuLoader.*;


/**
 * Created by Sukora Stas.
 */
public class AutoInsert {


    public void Insert(String path, int number) throws Exception {
        ATM atm = null;
        INF inf = null;
        Boolean valuta = null;
        try {
            FileInputStream input = new FileInputStream(path);
            POIFSFileSystem fs = new POIFSFileSystem(input);
            Workbook workbook;
            workbook = WorkbookFactory.create(fs);
            Sheet sheet = workbook.getSheetAt(0);
            Row row;
            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                row = (Row) sheet.getRow(i);

                String bik = row.getCell(0).getStringCellValue();

                String namesofdivisions = row.getCell(1).getStringCellValue();

                String reg = row.getCell(2).getStringCellValue();

                String loc = row.getCell(3).getStringCellValue();

                String addr = row.getCell(4).getStringCellValue();

                String pos = row.getCell(5).getStringCellValue();

                String workanme = row.getCell(6).getStringCellValue();

                String s = row.getCell(7).getStringCellValue();

                String terminal = row.getCell(8).getStringCellValue();

                String coord = row.getCell(9).getStringCellValue();
                if (1 == number) {
                    if ("1".equals(s)) {
                        valuta = true;
                    } else if ("0".equals(s)) {
                        valuta = false;
                    }

                    atm = null;
                    atm = createATM(atm, bik, namesofdivisions, reg, loc, addr, pos, workanme, valuta, terminal, coord);
                    getAtmDao().saveOrUpdate(atm);
                }
                if (2 == number) {
                    if ("да".equals(s)) {
                        valuta = true;
                    } else if ("нет".equals(s)) {
                        valuta = false;
                    }
                    inf = null;
                    inf = createINF(inf, bik, namesofdivisions, reg, loc, addr, pos, workanme, valuta, terminal, coord);
                    getInfDao().saveOrUpdate(inf);
                }

                System.out.println("Import rows " + i);
            }
            System.out.println("Success import excel to mysql table");

        } catch (IOException e) {
        }

    }


}
