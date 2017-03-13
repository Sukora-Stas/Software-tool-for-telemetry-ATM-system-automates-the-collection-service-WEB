package by.belapb;

import org.junit.Assert;
import org.junit.Test;


/**
 * Created by Sukora Stas.
 */
public class mainTest {
    @Test
    public void testEmptyHex() {
        String line = "";
        String res = main.findAllJavaHexNumbers(line);
        Assert.assertTrue(res.length() == 0);
    }

    @Test
    public void testOneHex() {
        String line = "0xAfd";
        String res = main.findAllJavaHexNumbers(line);
        Assert.assertTrue(res.contains(line));
    }

    @Test
    public void testNoHex() {
        String line = "0xAfds";
        String res = main.findAllJavaHexNumbers(line);
        Assert.assertTrue(!res.contains(line));
    }

    @Test
    public void testSomeHex() {
        String[] hex = {"0xAB", "0X1111", "0xfffff"};
        String line = hex[0] + " asd 0AB " + hex[1] + " " + hex[2] + " ABC";
        String res = main.findAllJavaHexNumbers(line);
        for (String h: hex) {
            Assert.assertTrue(res.contains(h));
        }
    }

    @Test
    public void testAllHex() {
        String[] hex = {"0xAB", "0X1111", "0xfffff"};
        StringBuilder line = new StringBuilder("");
        for (String h: hex) line.append(h).append(" ");
        String res = main.findAllJavaHexNumbers(line.toString());
        for (String h: hex) {
            Assert.assertTrue(res.contains(h));
        }
    }
}