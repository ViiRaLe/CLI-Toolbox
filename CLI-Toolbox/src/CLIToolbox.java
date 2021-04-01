public class CLIToolbox
{
    public static void main(String[] args)
    {
        //Launch XXX program
        if (args.length <= 1 || args[0].equals("help"))
        {
            System.out.println("CLI-Toolbox is a collection of packages for smart and fast operations and problem solving via the command-line interface.\n" +
                    "Available packages:\n  - Operations (\"op help\")");
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

            default:
                break;
        }
    }
}
