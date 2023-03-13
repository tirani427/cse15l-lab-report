# Lab Report 5 
---
## ```find``` command

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
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Costa-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Amsterdam-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Costa-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Amsterdam-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/CostaBlanca-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Barcelona-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Portugal-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Boston-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Poland-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/California-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Cuba-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Berlin-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bahamas-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Cancun-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bali-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Crete-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Athens-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Berlin-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Canada-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bali-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Budapest-WhereoGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Barcelona-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Athens-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Paris-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/China-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bermuda-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/California-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Vallarta-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Budapest-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Cancun-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/PuertoRico-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Vallarta-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bali-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/CostaBlanca-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/CstaBlanca-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/NewOrleans-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/PuertoRico-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-Intro.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Nepal-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/China-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Canada-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Crete-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Portugal-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bahamas-Intro.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Amsterdam-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bahamas-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Barcelona-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/PuertoRico-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Cuba-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Costa-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Beijing-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Nepal-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/CanaryIslands-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bermuda-history.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/CanaryIslands-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Amsterdam-Intro.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Crete-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Athens-Intro.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Poland-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Beijing-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/CanaryIslands-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/California-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Budapest-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/China-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Athens-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Nepal-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bermuda-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Paris-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Cuba-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Vallarta-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bahamas-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Beijing-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Cancun-WhereToGo.txt
```
This command actually combines another option that can be used with the find command, which is the ```-name``` option. What this does is that it specifies that the expression being searched for is in the name of the file.

So here, the command showed all the text files within the file ```berlitz2```, which would be useful when someone wants to know the specific text files present in a folder.

#### Example 2: ``` find find -L skill-demo1-server/skill-demo1-data/written_2/*/* -name "*.txt" ```

#### Output:

```
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Berk/ch2.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Berk/ch1.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Berk/CH4.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Berk/ch7.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Abernathy/ch2.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Abernathy/ch3.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Abernathy/ch1.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Abernathy/ch7.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Abernathy/ch6.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Abernathy/ch8.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Abernathy/ch9.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Abernathy/ch15.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Abernathy/ch14.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Rybczynski/ch2.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Rybczynski/ch3.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Rybczynski/ch1.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Kauffman/ch3.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Kauffman/ch1.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Kauffman/ch4.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Kauffman/ch5.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Kauffman/ch7.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Kauffman/ch6.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Kauffman/ch8.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Kauffman/ch9.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Kauffman/ch10.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Fletcher/ch2.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Fletcher/ch1.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Fletcher/ch5.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Fletcher/ch6.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Fletcher/ch9.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Fletcher/ch10.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chR.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chP.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chQ.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chB.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chC.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chA.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chV.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chW.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chM.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chZ.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chL.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chN.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chY.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chO.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HandRLasVegas.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryJapan.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroMalaysia.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HandRIstanbul.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryJamaica.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HandRJamaica.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HandRHongKong.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryEgypt.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroEdinburgh.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryIsrael.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroDublin.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryIndia.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroFrance.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroMadeira.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToLakeDistrict.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroIbiza.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryItaly.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToGreek.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToLakeDistrict.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryDublin.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroIsrael.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToIbiza.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryFrance.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToHawaii.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryMallorca.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryJerusalem.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HandRLisbon.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToIndia.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryMadrid.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryHongKong.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroMadrid.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroLosAngeles.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryIstanbul.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToItaly.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryLasVegas.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryGreek.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HandRMallorca.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/JungleMalaysia.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToMadeira.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToFWI.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToMalaysia.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToMalaysia.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToDublin.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToJapan.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryHawaii.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToFrance.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToEgypt.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToEdinburgh.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToIsrael.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HandRLosAngeles.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryMadeira.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroJerusalem.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HandRMadeira.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToIsrael.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HandRIbiza.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToFrance.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToDublin.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroLasVegas.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroIstanbul.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToMallorca.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToMallorca.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroHongKong.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroFWI.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroJamaica.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroGreek.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HandRIsrael.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToEdinburgh.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToMadeira.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToGreek.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HandRLakeDistrict.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToIbiza.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToHawaii.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HandRMadrid.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryMalaysia.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroItaly.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToIndia.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToLosAngeles.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HandRJerusalem.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryIbiza.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryEdinburgh.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryFWI.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroIndia.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToItaly.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryLakeDistrict.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToMadrid.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToJerusalem.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroEgypt.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HandRHawaii.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToJapan.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToJamaica.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroLakeDistrict.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroMallorca.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToHongKong.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToEgypt.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToHongKong.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToFWI.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToIstanbul.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToIstanbul.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroJapan.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToLasVegas.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToLosAngeles.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Portugal-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Berlin-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Costa-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Amsterdam-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Costa-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Amsterdam-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/CostaBlanca-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Barcelona-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Portugal-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Boston-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Poland-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/California-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Cuba-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Berlin-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bahamas-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Cancun-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bali-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Crete-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Athens-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Berlin-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Canada-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bali-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Budapest-WhereoGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Barcelona-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Athens-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Paris-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/China-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bermuda-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/California-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Vallarta-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Budapest-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Cancun-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/PuertoRico-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Vallarta-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bali-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/CostaBlanca-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/CstaBlanca-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/NewOrleans-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/PuertoRico-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-Intro.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Nepal-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/China-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Canada-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Crete-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Portugal-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bahamas-Intro.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Amsterdam-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bahamas-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Barcelona-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/PuertoRico-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Cuba-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Costa-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Beijing-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Nepal-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/CanaryIslands-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bermuda-history.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/CanaryIslands-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Amsterdam-Intro.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Crete-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Athens-Intro.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Poland-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Beijing-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/CanaryIslands-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/California-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Budapest-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/China-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Athens-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Nepal-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bermuda-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Paris-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Cuba-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Vallarta-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bahamas-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Beijing-WhatToDo.txt
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
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryEdinburgh.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryJerusalem.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToLasVegas.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToDublin.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToEdinburgh.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToEgypt.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToHongKong.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToIbiza.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToIndia.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToIsrael.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToIstanbul.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToItaly.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToJapan.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToJerusalem.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToMadeira.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToMadrid.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToMalaysia.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bahamas-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Barcelona-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Beijing-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Budapest-WhereoGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Canada-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/CanaryIslands-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Cancun-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Costa-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Costa-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Nepal-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Nepal-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Portugal-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/PuertoRico-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Vallarta-WhereToGo.txt
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
monarchy
monarchy
monarchy
monarchy
monarchy
monarchy
monarchy
monarchy
monarchy
monarchy
monarchy
monarchy
monarchy
monarchy
monarchy
monarchy
monarchy
monarchy
monarchy
monarchy
monarchy
monarchy
monarchy
monarchy
monarchy
monarchy
monarchy
monarchy
monarchy
monarchy
monarchy
monarchy
monarchy
monarchy
monarchy
monarchy
```

Being completely honest, for my second example I was going to show what would happen when the above command was used without ```-rl``` after ```grep```, but after seeing the output, I decided it would be better to show the other result that ```-exec grep 'monarchy'``` could show, which is **just** the part of the lines that matches the pattern.

The same occurs as before where the ```find -type f ...``` command is concerned. It's still looking for the ```.txt``` files within all the folders inside the ```skill-demo1-server/skill-demo1-data/written_2/*/*/*.txt``` path.

Since the pattern is different this time, the files which contain the pattern are:
```
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryFrance.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryHawaii.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryItaly.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryMadrid.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryMalaysia.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToJamaica.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToEdinburgh.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToFrance.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Athens-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Barcelona-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Berlin-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Berlin-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Canada-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/CanaryIslands-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/China-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Costa-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/CostaBlanca-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Nepal-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Paris-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Poland-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Portugal-History.txt
```
(this output was gained by switching ```grep -o``` to ```grep -rl```.

However, something to be noted is the fact that the results are strictly limited to paths with the ```travel_guides``` folder. This is because the ```find``` command is pretty specific in where it searches for the files. For example, the ```non-fiction``` folder that is also within ```written_2``` doesn't hold its information in the same way that ```travel_guides```, so in order to expand the search into ```non-fiction``` as well, you need to edit the path that you're searching in. 

Keeping the grep command the same, by changing the command to: ```find skill-demo1-server/skill-demo1-data/written_2/*/* -type f -name "*.txt" -exec grep -rl 'monarchy'  {} \;```, you get the resulting output of:

```
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Fletcher/ch2.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Fletcher/ch1.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Fletcher/ch5.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryItaly.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryFrance.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryMadrid.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryHawaii.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToEdinburgh.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToFrance.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryMalaysia.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToJamaica.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Portugal-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Berlin-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Costa-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Barcelona-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Berlin-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Athens-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Canada-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Paris-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/CostaBlanca-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Nepal-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/China-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/CanaryIslands-History.txt
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
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Rybczynski
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Kauffman
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
skill-demo1-server/skill-demo1-data/.git/objects/pack
skill-demo1-server/skill-demo1-data/.git/objects/info
skill-demo1-server/skill-demo1-data/.git/info
skill-demo1-server/skill-demo1-data/.git/logs
skill-demo1-server/skill-demo1-data/.git/logs/refs
skill-demo1-server/skill-demo1-data/.git/logs/refs/heads
skill-demo1-server/skill-demo1-data/.git/logs/refs/remotes
skill-demo1-server/skill-demo1-data/.git/logs/refs/remotes/origin
skill-demo1-server/skill-demo1-data/.git/hooks
skill-demo1-server/skill-demo1-data/.git/refs
skill-demo1-server/skill-demo1-data/.git/refs/heads
skill-demo1-server/skill-demo1-data/.git/refs/tags
skill-demo1-server/skill-demo1-data/.git/refs/remotes
skill-demo1-server/skill-demo1-data/.git/refs/remotes/origin
skill-demo1-server/skill-demo1-data/written_2
skill-demo1-server/skill-demo1-data/written_2/non-fiction
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Berk
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Abernathy
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Rybczynski
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Kauffman
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Fletcher
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
skill-demo1-server/skill-demo1-data/.git/objects/pack/pack-b98cb6a4ca64cc7b2944f0fa07d3e03927d66064.pack
skill-demo1-server/skill-demo1-data/.git/objects/pack/pack-b98cb6a4ca64cc7b2944f0fa07d3e03927d66064.idx
skill-demo1-server/skill-demo1-data/.git/HEAD
skill-demo1-server/skill-demo1-data/.git/info/exclude
skill-demo1-server/skill-demo1-data/.git/logs/HEAD
skill-demo1-server/skill-demo1-data/.git/logs/refs/heads/main
skill-demo1-server/skill-demo1-data/.git/logs/refs/remotes/origin/HEAD
skill-demo1-server/skill-demo1-data/.git/description
skill-demo1-server/skill-demo1-data/.git/hooks/commit-msg.sample
skill-demo1-server/skill-demo1-data/.git/hooks/pre-rebase.sample
skill-demo1-server/skill-demo1-data/.git/hooks/pre-commit.sample
skill-demo1-server/skill-demo1-data/.git/hooks/applypatch-msg.sample
skill-demo1-server/skill-demo1-data/.git/hooks/fsmonitor-watchman.sample
skill-demo1-server/skill-demo1-data/.git/hooks/pre-receive.sample
skill-demo1-server/skill-demo1-data/.git/hooks/prepare-commit-msg.sample
skill-demo1-server/skill-demo1-data/.git/hooks/post-update.sample
skill-demo1-server/skill-demo1-data/.git/hooks/pre-merge-commit.sample
skill-demo1-server/skill-demo1-data/.git/hooks/pre-applypatch.sample
skill-demo1-server/skill-demo1-data/.git/hooks/pre-push.sample
skill-demo1-server/skill-demo1-data/.git/hooks/update.sample
skill-demo1-server/skill-demo1-data/.git/hooks/push-to-checkout.sample
skill-demo1-server/skill-demo1-data/.git/refs/heads/main
skill-demo1-server/skill-demo1-data/.git/refs/remotes/origin/HEAD
skill-demo1-server/skill-demo1-data/.git/index
skill-demo1-server/skill-demo1-data/.git/packed-refs
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Berk/ch2.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Berk/ch1.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Berk/CH4.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Berk/ch7.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Abernathy/ch2.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Abernathy/ch3.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Abernathy/ch1.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Abernathy/ch7.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Abernathy/ch6.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Abernathy/ch8.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Abernathy/ch9.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Abernathy/ch15.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Abernathy/ch14.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Rybczynski/ch2.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Rybczynski/ch3.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Rybczynski/ch1.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Kauffman/ch3.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Kauffman/ch1.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Kauffman/ch4.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Kauffman/ch5.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Kauffman/ch7.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Kauffman/ch6.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Kauffman/ch8.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Kauffman/ch9.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Kauffman/ch10.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Fletcher/ch2.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Fletcher/ch1.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Fletcher/ch5.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Fletcher/ch6.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Fletcher/ch9.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Fletcher/ch10.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chR.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chP.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chQ.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chB.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chC.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chA.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chV.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chW.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chM.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chZ.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chL.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chN.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chY.txt
skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chO.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HandRLasVegas.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryJapan.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroMalaysia.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HandRIstanbul.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryJamaica.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HandRJamaica.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HandRHongKong.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryEgypt.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroEdinburgh.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryIsrael.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroDublin.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryIndia.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroFrance.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroMadeira.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToLakeDistrict.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroIbiza.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryItaly.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToGreek.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToLakeDistrict.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryDublin.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroIsrael.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToIbiza.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryFrance.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToHawaii.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryMallorca.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryJerusalem.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HandRLisbon.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToIndia.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryMadrid.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryHongKong.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroMadrid.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroLosAngeles.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryIstanbul.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToItaly.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryLasVegas.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryGreek.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HandRMallorca.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/JungleMalaysia.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToMadeira.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToFWI.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToMalaysia.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToMalaysia.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToDublin.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToJapan.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryHawaii.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToFrance.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToEgypt.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToEdinburgh.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToIsrael.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HandRLosAngeles.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryMadeira.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroJerusalem.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HandRMadeira.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToIsrael.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HandRIbiza.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToFrance.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToDublin.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroLasVegas.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroIstanbul.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToMallorca.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToMallorca.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroHongKong.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroFWI.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroJamaica.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroGreek.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HandRIsrael.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToEdinburgh.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToMadeira.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToGreek.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HandRLakeDistrict.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToIbiza.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToHawaii.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HandRMadrid.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryMalaysia.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroItaly.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToIndia.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToLosAngeles.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HandRJerusalem.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryIbiza.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryEdinburgh.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryFWI.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroIndia.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToItaly.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryLakeDistrict.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToMadrid.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToJerusalem.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroEgypt.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HandRHawaii.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToJapan.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToJamaica.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroLakeDistrict.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroMallorca.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToHongKong.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToEgypt.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToHongKong.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToFWI.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToIstanbul.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToIstanbul.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroJapan.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToLasVegas.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToLosAngeles.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Portugal-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Berlin-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Costa-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Amsterdam-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Costa-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Amsterdam-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/CostaBlanca-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Barcelona-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Portugal-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Boston-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Poland-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/California-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Cuba-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Berlin-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bahamas-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Cancun-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bali-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Crete-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Athens-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Berlin-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Canada-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bali-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Budapest-WhereoGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Barcelona-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Athens-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Paris-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/China-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bermuda-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/California-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Vallarta-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Budapest-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Cancun-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/PuertoRico-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Vallarta-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bali-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/CostaBlanca-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/CstaBlanca-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/NewOrleans-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/PuertoRico-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-Intro.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Nepal-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/China-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Canada-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Crete-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Portugal-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bahamas-Intro.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Amsterdam-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bahamas-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Barcelona-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/PuertoRico-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Cuba-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Costa-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Beijing-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Nepal-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/CanaryIslands-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bermuda-history.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/CanaryIslands-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Amsterdam-Intro.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Crete-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Athens-Intro.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Poland-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Beijing-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/CanaryIslands-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/California-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Budapest-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/China-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Athens-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Nepal-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bermuda-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Paris-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Cuba-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Vallarta-WhereToGo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bahamas-History.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Beijing-WhatToDo.txt
skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Cancun-WhereToGo.txt
skill-demo1-server/test-data/abc.txt
skill-demo1-server/test-data/another-file.txt
skill-demo1-server/test-data/abcdef.txt
```
This command did the same as the one before it, except this time it looked for every single file in ```skill-demo1-server/*``` directory. Overall, this command could be kind of useful if you were going to search for a specific file name within this result, but otherwise it's just a little excessive.

The difference between this command and the command used in Example 2 for the ```find -L skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2 -name "*.txt"``` command, is in the fact that while they both return the paths for a lot of .txt files, this command is not looking for **just** the .txt files but instead is also returning files of different types. 

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
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Berk/ch1.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Berk/CH4.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Berk/ch7.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Abernathy
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Abernathy/ch2.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Abernathy/ch3.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Abernathy/ch1.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Abernathy/ch7.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Abernathy/ch6.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Abernathy/ch8.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Abernathy/ch9.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Abernathy/ch15.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Abernathy/ch14.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Rybczynski
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Rybczynski/ch2.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Rybczynski/ch3.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Rybczynski/ch1.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Kauffman
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Kauffman/ch3.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Kauffman/ch1.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Kauffman/ch4.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Kauffman/ch5.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Kauffman/ch7.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Kauffman/ch6.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Kauffman/ch8.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Kauffman/ch9.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Kauffman/ch10.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Fletcher
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Fletcher/ch2.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Fletcher/ch1.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Fletcher/ch5.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Fletcher/ch6.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Fletcher/ch9.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Fletcher/ch10.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chR.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chP.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chQ.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chB.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chC.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chA.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chV.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chW.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chM.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chZ.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chL.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chN.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chY.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/non-fiction/OUP/Castro/chO.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HandRLasVegas.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryJapan.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroMalaysia.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HandRIstanbul.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryJamaica.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HandRJamaica.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HandRHongKong.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryEgypt.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroEdinburgh.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryIsrael.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroDublin.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryIndia.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroFrance.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroMadeira.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToLakeDistrict.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroIbiza.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryItaly.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToGreek.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToLakeDistrict.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryDublin.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroIsrael.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToIbiza.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryFrance.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToHawaii.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryMallorca.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryJerusalem.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HandRLisbon.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToIndia.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryMadrid.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryHongKong.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroMadrid.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroLosAngeles.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryIstanbul.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToItaly.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryLasVegas.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryGreek.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HandRMallorca.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/JungleMalaysia.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToMadeira.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToFWI.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToMalaysia.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToMalaysia.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToDublin.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToJapan.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryHawaii.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToFrance.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToEgypt.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToEdinburgh.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToIsrael.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HandRLosAngeles.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryMadeira.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroJerusalem.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HandRMadeira.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToIsrael.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HandRIbiza.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToFrance.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToDublin.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroLasVegas.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroIstanbul.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToMallorca.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToMallorca.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroHongKong.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroFWI.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroJamaica.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroGreek.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HandRIsrael.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToEdinburgh.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToMadeira.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToGreek.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HandRLakeDistrict.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToIbiza.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToHawaii.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HandRMadrid.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryMalaysia.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroItaly.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToIndia.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToLosAngeles.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HandRJerusalem.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryIbiza.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryEdinburgh.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryFWI.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroIndia.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToItaly.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HistoryLakeDistrict.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToMadrid.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToJerusalem.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroEgypt.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/HandRHawaii.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToJapan.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToJamaica.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroLakeDistrict.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroMallorca.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToHongKong.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToEgypt.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToHongKong.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToFWI.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToIstanbul.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhereToIstanbul.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/IntroJapan.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToLasVegas.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz1/WhatToLosAngeles.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Portugal-History.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Berlin-WhereToGo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Costa-History.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Amsterdam-WhereToGo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Costa-WhereToGo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Amsterdam-WhatToDo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/CostaBlanca-WhatToDo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Barcelona-History.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Portugal-WhereToGo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Boston-WhereToGo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Poland-WhatToDo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/California-WhereToGo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Cuba-WhatToDo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Berlin-History.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bahamas-WhereToGo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Cancun-WhatToDo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bali-History.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Crete-WhereToGo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Athens-History.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Berlin-WhatToDo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Canada-WhereToGo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bali-WhereToGo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Budapest-WhereoGo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Barcelona-WhereToGo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Athens-WhereToGo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Paris-WhereToGo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/China-WhereToGo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bermuda-WhatToDo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/California-History.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Vallarta-History.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Budapest-WhatToDo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Cancun-History.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/PuertoRico-WhatToDo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Vallarta-WhatToDo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bali-WhatToDo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/CostaBlanca-History.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/CstaBlanca-WhereToGo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/NewOrleans-History.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/PuertoRico-History.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-Intro.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Nepal-History.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/China-History.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Canada-History.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Crete-History.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Portugal-WhatToDo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bahamas-Intro.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Amsterdam-History.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bahamas-WhatToDo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Barcelona-WhatToDo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-WhatToDo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/PuertoRico-WhereToGo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Cuba-WhereToGo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Costa-WhatToDo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Beijing-History.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Nepal-WhereToGo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/CanaryIslands-WhereToGo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bermuda-history.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/CanaryIslands-History.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Amsterdam-Intro.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Crete-WhatToDo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-WhereToGo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Athens-Intro.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-History.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Poland-History.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Beijing-WhereToGo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/CanaryIslands-WhatToDo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/California-WhatToDo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Budapest-History.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/China-WhatToDo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Athens-WhatToDo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Nepal-WhatToDo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bermuda-WhereToGo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Paris-WhatToDo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Cuba-History.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Vallarta-WhereToGo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bahamas-History.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Beijing-WhatToDo.txt
<number>    <number2> -rwxr-xr-x  1 <user>  staff   <number> Mar 13 11:15 skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Cancun-WhereToGo.txt
```

I do not recommend you do this ever in your life unless you're specifically looking for something that can be given in the above columns. Because I didn't know what the numbers meant, I censored that as well as the user because I am using my personal computer to do this assignment. As such, this pretty much lists the path as well as all relevant information to the path.

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
