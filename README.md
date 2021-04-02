# CLI-Toolbox
CLI-Toolbox is a collection of packages for smart and fast operations via the command-line interface.
<br><br>

Call the program in the CMD / Shell to show an help page showing the Toolbox available packages with their basic functions and calls.
<br><br>
  
  
## Packages

#### Operations *("op help")*
- Basic String concatenation python-like
- Basics Math operations with integers and floats

#### ASCII Art *("ascii help")*
- Generate an ASCII Art from a string with custom font and style

## Usage

You need the Java JDK / JRE installed to run this.<br>
Save the jar file located in ~\CLI-Toolbox\CLI-Toolbox\out\artifacts\CLI_Toolbox_jar where you prefer.<br>

### Windows
To call the program freely from the CMD, create a batch file (commandname.cmd) and put it in a folder in your PATH (the PATH Environment Variable).
<br><br>
Put this in the commandname.cmd file:
```
@echo off
cd /d \path\to\jar
java -jar CLI-Toolbox.jar %*
```
*\path\to\jar is the path of the folder containing the CLI-Toolbox.jar file saved earlier.*
<br><br>
You can now call "*commandname*" from the CMD.

### *nix / MacOS
To call the program freely from the shell, create a shell script (commandname.sh) and put it in a folder in your PATH (/usr/bin for example).
<br><br>
Put this in the commandname.sh script:
```
#!/bin/sh
java -jar path/to/jar/CLI-Toolbox.jar "$*"
```
*path/to/jar/ is the path of the folder containing the CLI-Toolbox.jar file saved earlier.*
<br><br>
You can now call "*commandname*" from the shell.

<br>
<br>
<a rel="license"  target="_blank" href="http://creativecommons.org/licenses/by-nc-sa/4.0/"><img alt="Creative Commons License" style="border-width:0" src="https://i.creativecommons.org/l/by-nc-sa/4.0/88x31.png" /></a>
