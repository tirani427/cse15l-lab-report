# Lab Report 5 
---
## ```find``` command

#### Note:
The outputs of these commands can be immense, so the output I paste here in the code block is shortened with an ```...``` dictating the files I took out. The file wouldn't download with the full outputs for every single command, so they have been shortened, but the output remaining is true to what was returned by the command when it was run in the terminal.


### What Does ```find``` Do?

The ```find``` command allows you to search for a specific file(s) with multiple different inputs - whether it's the file name or something else.

It's normally set up in the format of ``` find <options> <path name> <expression> ```
1. ``` options ``` are the different commands that you can use with the ```find``` command in order to narrow down the search results.
2. ```path``` is the directory you want to search in.
3. ```expression``` is the key that ```find``` is looking for in the path's files. Without the expression, the find command wouldn't work. 

## Source

For the following commands, the source(s) that I found them is:
1. How To Find Files in Linux Using Command Line: [https://linuxize.com/post/how-to-find-files-in-linux-using-the-command-line/](https://linuxize.com/post/how-to-find-files-in-linux-using-the-command-line/).
2. ```find``` Command in Linux with Examples: [https://www.geeksforgeeks.org/find-command-in-linux-with-examples/](https://www.geeksforgeeks.org/find-command-in-linux-with-examples/)
3. RedHat Examples for How To Use ```find``` command: [https://www.redhat.com/sysadmin/linux-find-command](https://www.redhat.com/sysadmin/linux-find-command)


## 1. ``` find -L <path> <expression> ```
---
This command searches within the path for a recurring pattern given by the expression. What tells the ```find``` command to look for this pattern is the ```-L``` command.

#### Example 1: ```find -L skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2 -name "*.txt" ```

#### Output:
```
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Portugal-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Berlin-WhereToGo.txt
...
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Cuba-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Vallarta-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Cancun-WhereToGo.txt
```
This command actually combines another option that can be used with the find command, which is the ```-name``` option. What this does is that it specifies that the expression being searched for is in the name of the file.

So here, the command showed all the text files within the file ```berlitz2```, which would be useful when someone wants to know the specific text files present in a folder.

#### Example 2: ``` find find -L skill-demo1-server/skill-demo1-data/written_2/*/* -name "*.txt" ```

#### Output:

```
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Berk/ch2.txt
...
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Berk/ch7.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Abernathy/ch2.txt
...
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Abernathy/ch14.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Rybczynski/ch2.txt
...
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Rybczynski/ch1.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Kauffman/ch3.txt
...
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Kauffman/ch10.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Fletcher/ch2.txt
...
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Fletcher/ch10.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chR.txt
...
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chO.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroMalaysia.txt
...
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToLosAngeles.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Portugal-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Costa-History.txt
...
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Cancun-WhereToGo.txt
```

This command is mainly used to show what would happen if your path wasn't specific enough. 

In the previous command, the path was ```skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2``` which was specific enough that the find command was restricted to only files within that command. 

Once you switch the path to include ```*``` in place of the file names, the find command can expand to the folders accessed by that pattern. As such, even if the ```skill-demo1-server/skill-demo1-data/written_2/travel_guides/*``` was used instead, there would still be a lot of files printed since it would be accessing the ```.txt``` files in ```berlitz1``` and ```berlitz2``` directories. 

---

## 2. ``` find <path> -type <insert char> <expression> -exec grep <option> <pattern> {} \;```

This command now looks for a specific file type depending on the character you input after the ```-type``` command. The characters that can be used is limited, however, to;
* ```f``` to specify it's a **file** being searched for
* ```d``` to specify its a **directory** being searched for
* ```l``` which is a **symbolic link** or in other words is a link to another file in the current working directory.
* ```c``` for **character devices**
as well as many others. For the purpose of understanding what I'm doing, this is mainly going to focus on the first two options of ```f``` and ```d```.

#### Example 1: ``` find skill-demo1-server/skill-demo1-data/written_2/*/*/*.txt -type f -name "*.txt" -exec grep -rl  'dedicated to the'  {} \; ```

#### Output:
```
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryJerusalem.txt
...
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToMadrid.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Barcelona-WhereToGo.txt
...
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/PuertoRico-WhereToGo.txt
```
What this command did is that it first searched for all the ```.txt``` files within the given path ```skill-demo1-server/skill-demo1-data/written_2/*/*/*.txt```. 

Because the specific folder names weren't specified like they were in ```skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2```, the command actually searched through all the folders within ```skill-demo1-server/skill-demo1-data/written_2``` and brought out every .txt file. 

Then, using the ```grep -rl``` command, I looked for the files that contained the pattern ```"dedicated to the"```. The reason why the command is framed as ```-exec grep -rl 'dedicated to the' {} \;``` is because I was technically running a program line that would return 0 for a successful command execution. 

So here, it returned all the files containing that pattern of ```"dedicated to the"```.

#### Example 2: ``` find skill-demo1-server/skill-demo1-data/written_2/*/*/*.txt -type f -name "*.txt" -exec grep -o 'monarchy'  {} \; ```

#### Output:
```
monarchy
monarchy
monarchy
...
monarchy
monarchy
monarchy
```

Being completely honest, for my second example I was going to show what would happen when the above command was used without ```-rl``` after ```grep```, but after seeing the output, I decided it would be better to show the other result that ```-exec grep 'monarchy'``` could show, which is **just** the part of the lines that matches the pattern.

The same occurs as before where the ```find -type f ...``` command is concerned. It's still looking for the ```.txt``` files within all the folders inside the ```skill-demo1-server/skill-demo1-data/written_2/*/*/*.txt``` path.

Since the pattern is different this time, the files which contain the pattern are:
```
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryHawaii.txt
...
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToJamaica.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Berlin-History.txt
...
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Portugal-History.txt
```
(this output was gained by switching ```grep -o``` to ```grep -rl```.

However, something to be noted is the fact that the results are strictly limited to paths with the ```travel_guides``` folder. This is because the ```find``` command is pretty specific in where it searches for the files. For example, the ```non-fiction``` folder that is also within ```written_2``` doesn't hold its information in the same way that ```travel_guides```, so in order to expand the search into ```non-fiction``` as well, you need to edit the path that you're searching in. 

Keeping the grep command the same, by changing the command to: ```find skill-demo1-server/skill-demo1-data/written_2/*/* -type f -name "*.txt" -exec grep -rl 'monarchy'  {} \;```, you get the resulting output of:

```
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Fletcher/ch2.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Fletcher/ch5.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryItaly.txt
...
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToJamaica.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Portugal-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Berlin-WhereToGo.txt
...
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Poland-History.txt
```
And as you can see, now the files being searched includes the files within ```non-fiction``` too.

---

## 3. ```find <path name> -type <option> ```

This command does something similar to the option above, except here it lists out the all the data in the given path that matches the given type.

#### Example 1: ```find skill-demo1-server/skill-demo1-data/written_2/* -type d```

#### Output:
```
skill-demo1-server/skill-demo1-data/written_2/non-fiction
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Berk
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Abernathy
...
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Fletcher
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro
skill-demo1-server/skill-demo1-data/written_2/travel_guides
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2
```

Here, the command is listing out all the valid directory paths within the path ``` skill-demo1-server/skill-demo1-data/written_2/* ```. This can be especially useful when someone wants to see if the directory they need is actually available within their current path. And if not, then they can broaden the search field by changing the path to ``` skill-demo1-server/*```, which would result in the following output:

```
skill-demo1-server/lib
skill-demo1-server/skill-demo1-data
skill-demo1-server/skill-demo1-data/.git
skill-demo1-server/skill-demo1-data/.git/objects
...
skill-demo1-server/skill-demo1-data/.git/logs/refs/remotes
skill-demo1-server/skill-demo1-data/.git/logs/refs/remotes/origin
skill-demo1-server/skill-demo1-data/.git/hooks
skill-demo1-server/skill-demo1-data/.git/refs
...
skill-demo1-server/skill-demo1-data/.git/refs/remotes
skill-demo1-server/skill-demo1-data/.git/refs/remotes/origin
skill-demo1-server/skill-demo1-data/written_2
skill-demo1-server/skill-demo1-data/written_2/non-fiction
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP
...
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro
skill-demo1-server/skill-demo1-data/written_2/travel_guides
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2
skill-demo1-server/test-data
```

#### Example 2: ```find skill-demo1-server/* -type f ```

#### Output:
```
skill-demo1-server/FileServer.java
skill-demo1-server/FileServerTests.java
skill-demo1-server/Server.java
skill-demo1-server/lib/junit-4.13.2.jar
skill-demo1-server/lib/hamcrest-core-1.3.jar
skill-demo1-server/skill-demo1-data/.git/config
...
skill-demo1-server/skill-demo1-data/.git/HEAD
skill-demo1-server/skill-demo1-data/.git/info/exclude
skill-demo1-server/skill-demo1-data/.git/logs/HEAD
...
skill-demo1-server/skill-demo1-data/.git/logs/refs/remotes/origin/HEAD
skill-demo1-server/skill-demo1-data/.git/description
skill-demo1-server/skill-demo1-data/.git/hooks/commit-msg.sample
...
skill-demo1-server/skill-demo1-data/.git/hooks/push-to-checkout.sample
skill-demo1-server/skill-demo1-data/.git/refs/heads/main
...
skill-demo1-server/skill-demo1-data/.git/index
skill-demo1-server/skill-demo1-data/.git/packed-refs
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Berk/ch2.txt
...
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Berk/ch7.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Abernathy/ch2.txt
...
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Abernathy/ch14.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Rybczynski/ch2.txt
...
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Rybczynski/ch1.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Kauffman/ch3.txt
...
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Kauffman/ch10.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Fletcher/ch2.txt
...
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Fletcher/ch10.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chR.txt
...
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chO.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HandRLasVegas.txt
...
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToLosAngeles.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Portugal-History.txt
...
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Cancun-WhereToGo.txt
skill-demo1-server/test-data/abc.txt
skill-demo1-server/test-data/another-file.txt
skill-demo1-server/test-data/abcdef.txt
```
This command did the same as the one before it, except this time it looked for every single file in ```skill-demo1-server/*``` directory. Overall, this command could be kind of useful if you were going to search for a specific file name within this result, but otherwise it's just a little excessive.

The difference between this command and the command used in Example 2 for the ```find -L skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2 -name "*.txt"``` command, is in the fact that while they both return the paths for a lot of .txt files, this command is not looking for **just** the .txt files but instead is also returning files of different types. 

**NOTICE:** The actual output is much longer than what is presented and the ```...``` represents the files I deleted when pasting the output in order to minimize the amount of pages needed for this report.

---
## 4. ``` find <path name> -ls ```

This command basically returns **everything** within the given path. I don't know the meanings of all the columns provided but it does include:

```
<a sequence of numbers that means something> <another number that ranges from 0-3 digits long>{variation of -rw-rw-r--} {user} {staff} <another number> {last accessed MM/DD Time}{path}
```

#### Example 1: ``` find skill-demo1-server/skill-demo1-data/written_2/* -ls ```

#### Output:
```
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Berk
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Berk/ch2.txt
...
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Berk/ch7.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Abernathy
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Abernathy/ch2.txt
...
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Abernathy/ch14.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Rybczynski
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Rybczynski/ch2.txt
...
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Rybczynski/ch1.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Kauffman
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Kauffman/ch3.txt
...
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Kauffman/ch10.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Fletcher
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Fletcher/ch2.txt
...
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Fletcher/ch10.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chR.txt
...
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chO.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HandRLasVegas.txt
...
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToLosAngeles.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Portugal-History.txt
...
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Cancun-WhereToGo.txt
```

I do not recommend you do this ever in your life unless you're specifically looking for something that can be given in the above columns. Because I didn't know what the numbers meant, I censored that as well as the user because I am using my personal computer to do this assignment. As such, this pretty much lists the path as well as all relevant information to the path.

Also, the sheer number of paths that was returned was so long that it lengthened the document by at least a dozen pages so all the ```...``` in the output is actual a range of 2 - 50 files that I cut out to minimize the page amount. Twenty-five pages was not downloading so believe me when I say it's for your beneift.

With that in mind, the actual output of the command with a very broad path is immense. So this command is best used when the results can be limited to a specific range/can be limited in some way.

#### Example 2: ``` find skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Berk -ls ```

#### Output:
```
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Berk
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Berk/ch2.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Berk/ch1.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Berk/CH4.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Berk/ch7.txt
```

As you can see, when this command is applied to a very specific path, it can be somewhat useful since the amount of information being returned is a lot more specific to what the user is actively looking for. Again, because I don't know what every value returned means, the result has been censored to protect some privacy. 

And the actual output returned is what is listed above. As such, use this command when your path is **incredibly** specific. 
