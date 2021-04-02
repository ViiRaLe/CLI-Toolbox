package Packages;

import Toolbox.CLIToolbox;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Operations extends Package
{
    //Gets args, parse them and execute the operations written.
    //Support basic math functions + float ops
    //Print python-like
    //TBD

    public Operations(String[] ops)
    {
        super();
        if (ops == null || ops.length <= 1) System.out.println("Type \"op help\" to display the man page.");
        this.ops = ops;

        title = "                                                     ▄▄                             \n" +
                "  ▄▄█▀▀██▄                                     ██    ██                             \n" +
                "▄██▀    ▀██▄                                   ██                                   \n" +
                "██▀      ▀██████████▄  ▄▄█▀██▀███▄███ ▄█▀██▄ ██████▀███   ▄██▀██▄▀████████▄  ▄██▀███\n" +
                "██        ██ ██   ▀██ ▄█▀   ██ ██▀ ▀▀██   ██   ██    ██  ██▀   ▀██ ██    ██  ██   ▀▀\n" +
                "██▄      ▄██ ██    ██ ██▀▀▀▀▀▀ ██     ▄█████   ██    ██  ██     ██ ██    ██  ▀█████▄\n" +
                "▀██▄    ▄██▀ ██   ▄██ ██▄    ▄ ██    ██   ██   ██    ██  ██▄   ▄██ ██    ██  █▄   ██\n" +
                "  ▀▀████▀▀   ██████▀   ▀█████▀████▄  ▀████▀██▄ ▀████████▄ ▀█████▀▄████  ████▄██████▀\n" +
                "             ██                                                                     \n" +
                "           ▄████▄                                                                   \n";
    }

    @Override
    public String Operate()
    {
        try
        {
            if (ops[1].equals("help")) return Help();
            else if (ops[1].matches("(\'(\\w+)\'\\*\\d+)")) return PrintOperation();
            else if (ops[1].matches("(\\d)+!")) return FactorialOperation();
            else if (ops[1].matches("(\\d)+[\\+\\-\\*\\/\\%\\?](\\d)+")) return MathOperation();
            else if (ops[1].matches("(\\-f\\d)") && ops[2].matches("(\\d+(.\\d+)?)[\\+\\-\\*\\/\\%\\?](\\d+(.\\d+)?)")) return MathFloatOperation();
        }
        catch(IndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }

        return "Error. Type \"op help\" to display the man page.";
    }

    @Override
    String Help()
    {
        String help = "\n\n" + title + "\n\nThe Operations package is a collection of String and Math operations.\n\nCurrent operations available:\n\n";
        help += ("Print the repetition of a string X times:\n   \"op 'string'*X\"\n\n");
        help += ("Print the result of a factorial operation:\n   \"op int!\"\n\n");
        help += ("Print the result of a integer operation:\n   \"op int+-*/%?int\"\n\n");
        help += ("Print the result of a float operation with X decimals as result:\n   \"op -fX int.int+-*/%?int.int\"");
        help+= CLIToolbox.copy;

        return help;
    }

    //(\d)+[\+\-\*\/\^](\d)+
    //Math operations
    private String MathOperation()
    {
        String result = "";

        String[] s = ops[1].split("[\\+\\-\\*\\/\\%\\?]");
        String str = ops[1];
        String extract = str.replaceAll("[^\\+\\-\\*\\/\\%\\?]+", "");
        char op = extract.charAt(0);

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int r = 0;

        switch (op)
        {
            case '+':
                r = a+b;
                break;

            case '-':
                r = a-b;
                break;

            case '*':
                r = a*b;
                break;

            case '/':
                if (b == 0) return "Cannot divide by 0.";
                r = a/b;
                break;

            case '%':
                r = a%b;
                break;

            case '?':
                r = (int)(Math.pow(a, b));
                break;

            default:
                System.out.println("FAIL");
                break;

        }

        result = "" + r;

        return result;
    }

    //(\-f\d)          (\d+(.\d+)?)[\+\-\*\/\^](\d+(.\d+)?)
    //Math operations with float numbers
    private String MathFloatOperation()
    {
        String result = "";

        String[] s = ops[2].split("[\\+\\-\\*\\/\\%\\?]");
        String str = ops[2];
        String extract = str.replaceAll("[^\\+\\-\\*\\/\\%\\?]+", "");
        char op = extract.charAt(0);

        str = ops[1];
        extract = str.replaceAll("[^\\d]+", "");
        int decimals = Integer.parseInt(extract);

        float a = Float.parseFloat(s[0]);
        float b = Float.parseFloat(s[1]);
        float r = 0f;

        switch (op)
        {
            case '+':
                r = a+b;
                break;

            case '-':
                r = a-b;
                break;

            case '*':
                r = a*b;
                break;

            case '/':
                if (b == 0) return "Cannot divide by 0.";
                r = a/b;
                break;

            case '%':
                r = a%b;
                break;

            case '?':
                r = (float)Math.pow(a, b);
                break;

            default:
                System.out.println("FAIL");
                break;

        }

        BigDecimal bd_num = new BigDecimal(Float.toString(r));
        bd_num = bd_num.setScale(decimals, RoundingMode.DOWN);

        result = "" + bd_num;

        return result;
    }

    //(\d)+!
    //Factorial operation
    private String FactorialOperation()
    {
        int result = 1;

        String n = ops[1].replaceAll("[^\\d]+", "");
        int number = Integer.parseInt(n);

        if (number == 0) return "1";

        for (int i = number; 0 < i; i--) result *= i;

        return "" + result;
    }

    //(\'(\w+)\'\*\d+)
    //String operations
    private String PrintOperation()
    {
        String finalString = "";

        String[] s = ops[1].split("\\*");
        s[0] = s[0].substring(1, s[0].length()-1);

        int rep = Integer.parseInt(s[1]);

        for (int i = 0; i < rep; i++) finalString += s[0];

        return finalString;
    }
}
