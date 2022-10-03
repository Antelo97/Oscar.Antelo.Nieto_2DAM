import jdk.nashorn.internal.runtime.regexp.RegExp;
import jdk.nashorn.internal.runtime.regexp.RegExpMatcher;

import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;

public class Tests {

    public static void main(String[] args) {

        String a = "hola";
        Pattern b = Pattern.compile("____[-]|[+*/]");
        System.out.println(b.matcher(a).find());


    }
    }