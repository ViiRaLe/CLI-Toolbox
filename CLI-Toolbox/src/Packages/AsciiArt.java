package Packages;

import Toolbox.CLIToolbox;

import java.awt.*;
import java.awt.image.BufferedImage;

public class AsciiArt extends Package
{
    public AsciiArt(String[] ops)
    {
        if (ops == null || ops.length <= 1) System.out.println("Type \"ascii help\" to display the man page.");
        this.ops = ops;

        title = "                                                                         \n" +
                "      ██      ▄█▀▀▀█▄█ ▄▄█▀▀▀█▄█████▀████▀         ██               ██   \n" +
                "     ▄██▄    ▄██    ▀███▀     ▀█ ██   ██          ▄██▄              ██   \n" +
                "    ▄█▀██▄   ▀███▄   ██▀       ▀ ██   ██         ▄█▀██▄   ▀███▄█████████ \n" +
                "   ▄█  ▀██     ▀█████▄█          ██   ██        ▄█  ▀██     ██▀ ▀▀  ██   \n" +
                "   ████████  ▄     ▀███▄         ██   ██        ████████    ██      ██   \n" +
                "  █▀      ██ ██     ████▄     ▄▀ ██   ██       █▀      ██   ██      ██   \n" +
                "▄███▄   ▄████▄▀█████▀  ▀▀█████▀▄████▄████▄   ▄███▄   ▄████▄████▄    ▀████\n" +
                "                                                                         \n" +
                "                                                                         \n";
    }

    @Override
    public String Operate()
    {
        try
        {
            if (ops[1].equals("help")) return Help();
            else if (ops[1].matches("(-\\w+)") && ops[2].matches("(-[012])") && ops[3].matches("(\\w+)"))
            {
                GenerateArt();
                return "";
            }

        }
        catch(IndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }

        return "Error. Type \"ascii help\" to display the man page.";
    }

    @Override
    String Help()
    {
        String help = "\n\n" + title + "\n\nThe ASCII Art package is an algorithm to generate ASCII Art from a string\n\nCurrent operations available:\n\n";
        help += ("Print the string as an ASCII Art with font fontName and style Style (0 = normal, 1 = Bold, 2 = Italic):\n   \"ascii -fontName -Style string\"\n\n");
        help+= CLIToolbox.copy;

        return help;
    }

    private void GenerateArt()
    {
        ops[2] = ops[2].substring(1);
        int style = Integer.parseInt(ops[2]);
        String font = ops[1].substring(1);

        ops[3] = ops[3].toUpperCase();

        BufferedImage image = new BufferedImage(256, 32, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        g.setFont(new Font(font, style, 24));
        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics.drawString(ops[3], 6, 24);

        for (int y = 0; y < 32; y++) {
            StringBuilder sb = new StringBuilder();
            for (int x = 0; x < 256; x++)
                sb.append(image.getRGB(x, y) == -16777216 ? " " : image.getRGB(x, y) == -1 ? "#" : "*");
            if (sb.toString().trim().isEmpty()) continue;
            System.out.println(sb);
        }
    }
}