# CLI-Toolbox
CLI-Toolbox is a collection of packages for smart and fast operations via the command-line interface.
<br><br>
Call the program in the CLI to show an help page showing the Toolbox available packages with their basic functions and calls.
<br><br>
## Packages

#### Operations *("op help")*
- Basic String concatenation python-like
- Basics Math operations with integers and floats

#### ASCII Art *("ascii help")*
- Generate an ASCII Art from a string with custom font and style

## Usage
You need the Java JDK / JRE installed to run this.<br>
Save the jar file located in ~\CLI-Toolbox\CLI-Toolbox\out\artifacts\CLI_Toolbox_jar where you prefer.<br><br>
You can call the program via CLI by calling: "*java -jar path/to/jar/CLI-Toolbox.jar {arguments}*"

### Windows
To call the program freely from the CMD, create a batch file (commandname.cmd) and put it in a folder in your PATH (the PATH Environment Variable).
<br>
<br>
Put this in the commandname.cmd file:
```
@echo off
java -jar \path\to\jar\CLI-Toolbox.jar %*
```
*\path\to\jar is the path of the folder containing the CLI-Toolbox.jar file saved earlier.*
<br><br>
You can now call "*commandname*" from the CMD.

### *nix / MacOS
To call the program freely from the shell, create a script (commandname) and put it in a folder in your PATH (/usr/local/bin for example).
<br>
<br>
Put this in the commandname script:
```
java -jar path/to/jar/CLI-Toolbox.jar "$@"
```
*path/to/jar/ is the path of the folder containing the CLI-Toolbox.jar file saved earlier.*
<br><br>
Now give executable privileges to the script via:
```
chmod a+x /path/to/commandname
```
*path/to/commandname is the path of the script created earlier.*
<br><br>
You can now call "*commandname*" from the shell.

<br>
<br>
<a rel="license"  target="_blank" href="http://creativecommons.org/licenses/by-nc-sa/4.0/"><img alt="Creative Commons License" style="border-width:0" src="https://i.creativecommons.org/l/by-nc-sa/4.0/88x31.png" /></a>
