package Toolbox;

import Packages.*;

public class CLIToolbox
{
    static final String version = "0.1 alpha";
    public static final String copy = "\n\n\n\nMattia Pagani© https://viirale.github.io\n\nGithub Repo: https://github.com/ViiRaLe/CLI-Toolbox\n\nVersion: " + version + "\n";

    static String title = "                                                                                                          \n" +
            "  ▄▄█▀▀▀█▄█████▀   ▀████▀      ███▀▀██▀▀███ ▄▄█▀▀██▄   ▄▄█▀▀██▄ ▀████▀   ▀███▀▀▀██▄ ▄▄█▀▀██▄ ▀███▀   ▀██▀ \n" +
            "▄██▀     ▀█ ██       ██        █▀   ██   ▀███▀    ▀██▄██▀    ▀██▄ ██       ██    ████▀    ▀██▄ ███▄  ▄█   \n" +
            "██▀       ▀ ██       ██             ██    ██▀      ▀███▀      ▀██ ██       ██    ███▀      ▀██  ▀██▄█▀    \n" +
            "██          ██       ██             ██    ██        ███        ██ ██       ██▀▀▀█▄▄█        ██    ███     \n" +
            "██▄         ██     ▄ ██   █████     ██    ██▄      ▄███▄      ▄██ ██     ▄ ██    ▀██▄      ▄██  ▄█▀▀██▄   \n" +
            "▀██▄     ▄▀ ██    ▄█ ██             ██    ▀██▄    ▄██▀██▄    ▄██▀ ██    ▄█ ██    ▄███▄    ▄██▀ ▄█   ▀██▄  \n" +
            "  ▀▀█████▀██████████████▄         ▄████▄    ▀▀████▀▀   ▀▀████▀▀ ██████████████████  ▀▀████▀▀ ▄██▄▄  ▄▄███▄\n" +
            "                                                                                                          \n" +
            "                                                                                                          ";

    public static void main(String[] args)
    {
        //Launch XXX program
        if (args.length <= 1 || args[0].equals("help"))
        {
            System.out.println("\n\n" + title + "\n\nCLI-Toolbox is a collection of packages for smart and fast operations via the command-line interface.\n\n" +
                    "Available packages:\n  - Operations (\"op help\") { Math and String functions }\n  - ASCII Art (\"ascii help\") { ASCII Art text }" +
                    copy);
            return;
        }


        //SHOW ARGS
        /*int counter = 0;
        for (String s : args)
        {
            System.out.println(counter + " " + s);
            counter++;
        }*/

        switch (args[0])
        {
            case "op":
                System.out.println(new Operations(args).Operate());
                break;

            case "ascii":
                System.out.println(new AsciiArt(args).Operate());
                break;

            default:
                break;
        }
    }
}


//Operations
//Byte related (endianess, 32/64)
//Numeric Systems
//ASCII Art Generator
//Password Creator