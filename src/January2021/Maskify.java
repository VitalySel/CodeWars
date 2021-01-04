package January2021;

//Your task is to write a function maskify, which changes all but the last four characters into '#'.
public class Maskify {
    //my
    public static String maskify(String value) {
        char [] sym = value.toCharArray();
        for (int i = 0; i < sym.length - 4; i++) {
            sym[i] = '#';
        }
        return new String(sym);
    }

    //best
    public static String maskifyBest(String str) {
        return str.replaceAll(".(?=.{4})", "#");
    }
}
