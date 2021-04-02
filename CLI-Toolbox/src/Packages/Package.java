package Packages;

import static Toolbox.CLIToolbox.copy;

public abstract class Package
{
    String[] ops;
    String title;

    //Display the Help page
    abstract String Help();

    public abstract String Operate();
}
