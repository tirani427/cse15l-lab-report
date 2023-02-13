# Lab Report 3
---
## ```grep``` command
What Does ```grep``` Do?
  grep searches for a specific string/element within a path.
  
  It's used in the format:
  
  ``` grep <pattern> <fileName> ``` 

---
## Alternate Ways to Use ```grep```

### Source: [https://www.geeksforgeeks.org/grep-command-in-unixlinux/](https://www.geeksforgeeks.org/grep-command-in-unixlinux/)
For all the following commands, the source where I discovered them is linked above. There was a table that was labelled **Object Description** and I used it to find the commands used.

---
### ```grep -n <pattern> <fileName> ```
This command prints the lines that match the pattern given, as well as their line numbers.
#### Example 1
Command: ```grep -n "Bahamas" skill-demo1-data/written_2/*/*/*.txt ```

Output: 

``` skill-demo1-data/written_2/travel_guides/berlitz1/WhatToFWI.txt:111:        waters off the Bahamas, Puerto Rico, and the Virgin Islands, but the ```

```skill-demo1-data/written_2/travel_guides/berlitz2/Bahamas-History.txt:6:Centuries before the arrival of Columbus, a peaceful Amerindian people who called themselves the Luccucairi had settled in the Bahamas. Originally from South America, they had traveled up through the Caribbean islands, surviving by cultivating modest crops and from what they caught from sea and shore. Nothing in the experience of these gentle people could have prepared them for the arrival of the Pinta, the Niña, and the Santa Maria at San Salvador on 12 October 1492. Columbus believed that he had reached the East Indies and mistakenly called these people Indians. We know them today as the Lucayans. Columbus claimed the island and others in the Bahamas for his royal Spanish patrons, but not finding the gold and other riches he was seeking, he stayed for only two weeks before sailing towards Cuba.```

```skill-demo1-data/written_2/travel_guides/berlitz2/Bahamas-History.txt:7:The Spaniards never bothered to settle in the Bahamas, but the number of shipwrecks attest that their galleons frequently passed through the archipelago en route to and from the Caribbean, Florida, Bermuda, and their home ports. On Eleuthera the explorers dug a fresh-water well — at a spot now known as “Spanish Wells” — which was used to replenish the supplies of water on their ships before they began the long journey back to Europe with their cargoes of South American gold. As for the Lucayans, within 25 years all of them, perhaps some 30,000 people, were removed from the Bahamas to work — and die — in Spanish gold mines and on farms and pearl fisheries on Hispaniola (Haiti), Cuba, and elsewhere in the Caribbean.```

```skill-demo1-data/written_2/travel_guides/berlitz2/Bahamas-History.txt:8:English sea captains also came to know the beautiful but deserted Bahamian islands during the 17th century. England’s first formal move was on 30 October 1629, when Charles I granted the Bahamas and a chunk of the American south to his Attorney General, Sir Robert Health. But nothing came of that, nor of a rival French move in 1633 when Cardinal Richelieu, the 17th-century French statesman, tried claiming the islands for France.```

```skill-demo1-data/written_2/travel_guides/berlitz2/Bahamas-History.txt:10:In 1648 a group of English Puritans from Bermuda, led by William Sayle, sailed to Bahamian waters and established the first permanent European settlement on the island they named Eleutheria (now Eleuthera) after the Greek word for freedom. The 70 colonists called themselves the Eleutherian Adventurers, but life was very difficult and the colony never flourished, though Sayle was long honored for the effort. In 1666 a smaller island (called Sayle’s island) with a fine harbor was settled by Bermudians and renamed New Providence. It was later to become known as Nassau, capital of the Bahamas. ```

---
#### What's Happening:
Basically this command is doing exactly what it's supposed to do, which is look for the pattern ```Bahamas``` inside ```skill-demo1-data/written_2/*/*/*.txt ```. There were many more lines to the output of the command line, which shows that it's useful to find elements within large data sets. However, it also shows that if the command isn't specific enough, then you would be left with too many results to actually be able to cipher through.

---
#### Example 2
Command: ``` grep -n "Amsterdam" skill-demo1-data/written_2/*/*/*.txt ```
Output: 

```skill-demo1-data/written_2/travel_guides/berlitz1/IntroJerusalem.txt:99:        from Tangier, Fez, and Amsterdam to Salonika, Istanbul, and Aleppo ```

``` skill-demo1-data/written_2/travel_guides/berlitz1/WhatToJamaica.txt:583:        as a quirky “Amsterdam street meets Italian piazza” mall. The whole```

```skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-WhatToDo.txt:7:It is said that there are over 40 different performances taking place on every evening of the year in Amsterdam. In other words, you will not be at a loss for things to do here. Concert halls and theaters are found all across the city with ballet, opera, pop performances, and classical orchestras all making regular contributions. There are also plenty of venues for more “risqué” or avant-garde performances.```

```skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-WhatToDo.txt:9:You can book tickets for performances on your arrival but popular acts or plays may sell out quickly. The VVV issues a What’s on in Amsterdam magazine on a monthly basis which lists the performances taking place each day. The easiest way to book tickets for performances before you arrive in town is through the Amsterdam Uit Bureau (AUB-Uitlijn). They produce a publication called Culture in Amsterdam with a listing of major performances. Contact them at Tel. 621 1211 and have your credit cards ready. Tickets can be posted to your home address or will be kept at the AUB office in Leidseplein for you to collect.```

```skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-WhatToDo.txt:10:At any given time there will be temporary art exhibitions at galleries and museums around the city. The Film Museum in Vondelpark also has special showings and film festivals. See What’s on in Amsterdam.```

``` skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-WhatToDo.txt:11:The Holland Festival is a program of art events which take place all over the country throughout June. In Amsterdam the parks and pleins are filled with organized activities, and many galleries and concert halls hold coordinated events. A special ticket line will provide information about the festival activities, and tickets if you pay by credit card (Tel. 627 6566).```

```skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-WhatToDo.txt:12:The Amsterdam Casino at Max Euweplein off Leidseplein offers the opportunity for adults to gamble (Tel. 620 1006). Open every day from 1:30pm.```

```skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-WhatToDo.txt:15:A night cruise along the canals with dinner is a wonderful and romantic way to get a different view of Amsterdam. Many of the bridges and historic buildings are lit at night, and the city is more peaceful. Lovers company (see page 116) has small and large boats and offers wine and cheese cruises or full dinner cruises.For a more private cruise (and one in which you can arrange your own itinerary) you can hire a water taxi in the smaller waterways.```

```skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-WhatToDo.txt:18:The Netherlands are football (soccer) crazy and Ajax is the Amsterdam team, one of the most successful in Europe over the last 30 years. They play at the Amsterdam Arena, a fine modern stadium, which is also used for other sporting events — but unfortunately it is almost impossible to obtain tickets for matches.```

```skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-WhatToDo.txt:19:Amsterdam Parks```

```skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-WhatToDo.txt:20:There are many wooded and park areas around the city where it’s possible to take a simple stroll or enjoy other outdoor activities. Amsterdam Bos (city woodland and recreational area), is the largest and most varied and offers a lake for rowing, bridleways for horse rides, and tracks for cycling — you could hire a bike and spend the day here. Many Amsterdammers go running, frisbeeing, or simply take the dog for a walk. The stables at Amsterdam Bos offer woodland rides, a perfect way to clear the city air from your system (contact Manege de Amsterdamse; Tel. 643 1432).```

```skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-WhatToDo.txt:28:Winter sports have traditionally played a big part in the lives of Amsterdammers and people from North Holland. When the rivers and canals freeze in winter, everyone is out skating — with long distance skating along the coast from town to town on cold, bright Sundays.```

```skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-WhatToDo.txt:31:Amsterdam is a gold mine for those who like to browse. The city has thankfully not yet been taken over by the international chain stores and the narrow streets of the center, the canal rings, and the Jordaan area are home to myriad small, independent boutiques — here you can wander for hours in search of that individual gift. The nearest street you have to “international” shopping, Kalverstraat, is home to the young fashion outlets and department stores.```

```skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-WhatToDo.txt:32:Amsterdammers love to shop for their homes. Although many live in small apartments, what they lack in square footage they make up for in the quality of their environments, and interior design stores, or stores selling pretty household accessories feature in every shopping area.```

```skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-WhatToDo.txt:37:Amsterdam still has a good number of authentic street markets where you can mix with local people and pick up a bargain. Some markets cater to those with a specialist interest and are by no means a place to find inferior or cheap goods.```

```skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-WhatToDo.txt:38:Perhaps the most famous market in Amsterdam is the Bloemenmarkt or flower market, which is held on the Singel everyday. As well as beautiful blooms you can buy bulbs and tubers to take home (if your customs authorities allow this).```

#### What's Happening:
Here, the command is performing the same as it did what the pattern being searched for was ```Bahamas```, except this time its looking for the pattern ```Amsterdam``` in the path ```skill-demo1-data/written_2/*/*/*.txt```. It ends up showing how often the word pops up in the files, however when looking for the individual files themselves, it can get tedious as then one must cipher through the text provided after with the lines the pattern is in. 

---
### ```grep -l <pattern> <file> ```
This command prints out the file names that contain the patterns, and nothing else - such as the lines that contain them.

#### Example 1
Command: ``` grep -nl "Amsterdam" skill-demo1-data/written_2/*/*/*.txt```
Output: 
```skill-demo1-data/written_2/travel_guides/berlitz1/IntroJerusalem.txt
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToJamaica.txt
skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-WhatToDo.txt
skill-demo1-data/written_2/travel_guides/berlitz2/Amsterdam-History.txt
skill-demo1-data/written_2/travel_guides/berlitz2/Amsterdam-Intro.txt
skill-demo1-data/written_2/travel_guides/berlitz2/Amsterdam-WhatToDo.txt
skill-demo1-data/written_2/travel_guides/berlitz2/Amsterdam-WhereToGo.txt
skill-demo1-data/written_2/travel_guides/berlitz2/Canada-WhereToGo.txt
skill-demo1-data/written_2/travel_guides/berlitz2/Paris-WhereToGo.txt
```
---
#### What's Happening:
Something interesting to note is that if the previous command ```grep -n "Amsterdam" skill-demo1-data/written_2/*/*/*.txt``` was changed to ```grep -nl "Amsterdam" skill-demo1-data/written_2/*/*/*.txt ``` the output would also change. Here, instead of printing out every single line that contains the pattern, the command prints out the file names which contain the pattern. It demonstrates that this alternate command argument is useful when searching for specific words without wanting the actual lines or anything other than the file names.

#### Example 2
Command:``` grep -nl "the Italian" skill-demo1-data/written_2/*/*/*.txt```

Output:
```
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryFrance.txt
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryGreek.txt
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryItaly.txt
skill-demo1-data/written_2/travel_guides/berlitz1/IntroItaly.txt
skill-demo1-data/written_2/travel_guides/berlitz1/IntroLasVegas.txt
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToItaly.txt
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToDublin.txt
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToFrance.txt
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToIsrael.txt
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToItaly.txt
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToMadrid.txt
skill-demo1-data/written_2/travel_guides/berlitz2/Athens-Intro.txt
skill-demo1-data/written_2/travel_guides/berlitz2/Bahamas-WhereToGo.txt
skill-demo1-data/written_2/travel_guides/berlitz2/Beijing-WhereToGo.txt
skill-demo1-data/written_2/travel_guides/berlitz2/Berlin-WhereToGo.txt
skill-demo1-data/written_2/travel_guides/berlitz2/Bermuda-WhereToGo.txt
skill-demo1-data/written_2/travel_guides/berlitz2/Boston-WhereToGo.txt
skill-demo1-data/written_2/travel_guides/berlitz2/California-WhereToGo.txt
skill-demo1-data/written_2/travel_guides/berlitz2/Canada-WhereToGo.txt
skill-demo1-data/written_2/travel_guides/berlitz2/Cancun-WhereToGo.txt
```
---
#### What's Happening:
Here, the command was looking for the pattern ```the Italian``` within ```skill-demo1-data/written_2/*/*/*.txt```. Because the pattern is more specific than just a single word, the number of files it returns also decreases. It shows that grep can be used to find more in depth results instead of just one-word responses. So if one knew that a specific element was within a directory, then they could search for that element - whether its a word, phrase, or sentence - and find the file for it. The only downside is that the pattern they search for has to be incredibly precise.

For example, if the pattern searched for above was ``` the italian ```, then there would be no output because that pattern doesn't exist within the files.

---
### ```grep -o <pattern> <fileName> ```
This command is similar to the ```grep -n``` command, except that it only prints the matching parts of the line.
#### Example 1
Command: ```grep -o "the Italian" skill-demo1-data/written_2/*/*/*.txt```

Output:
```
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryFrance.txt:the Italian
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryGreek.txt:the Italian
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryItaly.txt:the Italian
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryItaly.txt:the Italian
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryItaly.txt:the Italian
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryItaly.txt:the Italian
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryItaly.txt:the Italian
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryItaly.txt:the Italian
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryItaly.txt:the Italian
skill-demo1-data/written_2/travel_guides/berlitz1/IntroItaly.txt:the Italian
skill-demo1-data/written_2/travel_guides/berlitz1/IntroItaly.txt:the Italian
skill-demo1-data/written_2/travel_guides/berlitz1/IntroItaly.txt:the Italian
skill-demo1-data/written_2/travel_guides/berlitz1/IntroLasVegas.txt:the Italian
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToItaly.txt:the Italian
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToItaly.txt:the Italian
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToItaly.txt:the Italian
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToItaly.txt:the Italian
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToDublin.txt:the Italian
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToDublin.txt:the Italian
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToFrance.txt:the Italian
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToFrance.txt:the Italian
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToIsrael.txt:the Italian
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToItaly.txt:the Italian
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToItaly.txt:the Italian
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToItaly.txt:the Italian
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToItaly.txt:the Italian
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToItaly.txt:the Italian
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToItaly.txt:the Italian
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToItaly.txt:the Italian
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToItaly.txt:the Italian
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToItaly.txt:the Italian
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToMadrid.txt:the Italian
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToMadrid.txt:the Italian
skill-demo1-data/written_2/travel_guides/berlitz2/Athens-Intro.txt:the Italian
skill-demo1-data/written_2/travel_guides/berlitz2/Bahamas-WhereToGo.txt:the Italian
skill-demo1-data/written_2/travel_guides/berlitz2/Beijing-WhereToGo.txt:the Italian
skill-demo1-data/written_2/travel_guides/berlitz2/Berlin-WhereToGo.txt:the Italian
skill-demo1-data/written_2/travel_guides/berlitz2/Berlin-WhereToGo.txt:the Italian
skill-demo1-data/written_2/travel_guides/berlitz2/Bermuda-WhereToGo.txt:the Italian
skill-demo1-data/written_2/travel_guides/berlitz2/Boston-WhereToGo.txt:the Italian
skill-demo1-data/written_2/travel_guides/berlitz2/California-WhereToGo.txt:the Italian
skill-demo1-data/written_2/travel_guides/berlitz2/Canada-WhereToGo.txt:the Italian
skill-demo1-data/written_2/travel_guides/berlitz2/Cancun-WhereToGo.txt:the Italian
```
#### What's Happening:
Here the command is doing exactly what it's supposed to do, returning the path to the text file which contains the pattern ```the Italian``` and then returning the matching text to the pattern.

#### Example 2
Command: ```grep -o "the Taj Mahal" skill-demo1-data/written_2/*/*/*.txt ```

Output:
```
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToIndia.txt:the Taj Mahal
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToIndia.txt:the Taj Mahal
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToIndia.txt:the Taj Mahal
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToIndia.txt:the Taj Mahal
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToIndia.txt:the Taj Mahal
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToIndia.txt:the Taj Mahal
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToIndia.txt:the Taj Mahal
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToIndia.txt:the Taj Mahal
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToMalaysia.txt:the Taj Mahal
```
#### What's Happening
Here the command basically did the same thing as the one before, where it searched for the pattern ```the Taj Mahal``` within the text files in the ```skill-demo1-data/written_2/*/*/*.txt``` files. Once again, because the pattern is specific, the number of files it returned is less than the number of files that would've returned if the pattern wasn't.

---
### ```grep -c <pattern> <fileName> ```
This command is going to print the number of lines that matches the pattern in every single file.

#### Example 1
Command: ```grep -c "the Taj Mahal" skill-demo1-data/written_2/*/*/*.txt ```
Output:
```
skill-demo1-data/written_2/travel_guides/berlitz1/HandRHawaii.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/HandRHongKong.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/HandRIbiza.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/HandRIsrael.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/HandRIstanbul.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/HandRJamaica.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/HandRJerusalem.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/HandRLakeDistrict.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/HandRLasVegas.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/HandRLisbon.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/HandRLosAngeles.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/HandRMadeira.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/HandRMadrid.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/HandRMallorca.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryDublin.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryEdinburgh.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryEgypt.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryFWI.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryFrance.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryGreek.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryHawaii.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryHongKong.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryIbiza.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryIndia.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryIsrael.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryIstanbul.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryItaly.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryJamaica.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryJapan.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryJerusalem.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryLakeDistrict.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryLasVegas.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryMadeira.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryMadrid.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryMalaysia.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryMallorca.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/IntroDublin.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/IntroEdinburgh.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/IntroEgypt.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/IntroFWI.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/IntroFrance.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/IntroGreek.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/IntroHongKong.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/IntroIbiza.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/IntroIndia.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/IntroIsrael.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/IntroIstanbul.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/IntroItaly.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/IntroJamaica.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/IntroJapan.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/IntroJerusalem.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/IntroLakeDistrict.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/IntroLasVegas.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/IntroLosAngeles.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/IntroMadeira.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/IntroMadrid.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/IntroMalaysia.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/IntroMallorca.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/JungleMalaysia.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToDublin.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToEdinburgh.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToEgypt.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToFWI.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToFrance.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToGreek.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToHawaii.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToHongKong.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToIbiza.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToIndia.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToIsrael.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToIstanbul.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToItaly.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToJamaica.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToJapan.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToLakeDistrict.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToLasVegas.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToLosAngeles.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToMadeira.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToMalaysia.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToMallorca.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToDublin.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToEdinburgh.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToEgypt.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToFWI.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToFrance.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToGreek.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToHawaii.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToHongKong.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToIbiza.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToIndia.txt:8
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToIsrael.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToIstanbul.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToItaly.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToJapan.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToJerusalem.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToLakeDistrict.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToLosAngeles.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToMadeira.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToMadrid.txt:0
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToMalaysia.txt:1
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToMallorca.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-History.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-Intro.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-WhatToDo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-WhereToGo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Amsterdam-History.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Amsterdam-Intro.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Amsterdam-WhatToDo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Amsterdam-WhereToGo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Athens-History.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Athens-Intro.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Athens-WhatToDo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Athens-WhereToGo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Bahamas-History.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Bahamas-Intro.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Bahamas-WhatToDo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Bahamas-WhereToGo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Bali-History.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Bali-WhatToDo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Bali-WhereToGo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Barcelona-History.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Barcelona-WhatToDo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Barcelona-WhereToGo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Beijing-History.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Beijing-WhatToDo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Beijing-WhereToGo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Berlin-History.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Berlin-WhatToDo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Berlin-WhereToGo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Bermuda-WhatToDo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Bermuda-WhereToGo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Bermuda-history.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Boston-WhereToGo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Budapest-History.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Budapest-WhatToDo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Budapest-WhereoGo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/California-History.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/California-WhatToDo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/California-WhereToGo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Canada-History.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Canada-WhereToGo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/CanaryIslands-History.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/CanaryIslands-WhatToDo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/CanaryIslands-WhereToGo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Cancun-History.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Cancun-WhatToDo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Cancun-WhereToGo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/China-History.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/China-WhatToDo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/China-WhereToGo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Costa-History.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Costa-WhatToDo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Costa-WhereToGo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/CostaBlanca-History.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/CostaBlanca-WhatToDo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Crete-History.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Crete-WhatToDo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Crete-WhereToGo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/CstaBlanca-WhereToGo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Cuba-History.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Cuba-WhatToDo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Cuba-WhereToGo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Nepal-History.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Nepal-WhatToDo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Nepal-WhereToGo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/NewOrleans-History.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Paris-WhatToDo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Paris-WhereToGo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Poland-History.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Poland-WhatToDo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Portugal-History.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Portugal-WhatToDo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Portugal-WhereToGo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/PuertoRico-History.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/PuertoRico-WhatToDo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/PuertoRico-WhereToGo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Vallarta-History.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Vallarta-WhatToDo.txt:0
skill-demo1-data/written_2/travel_guides/berlitz2/Vallarta-WhereToGo.txt:0
```
#### What's Happening:
So with this command, it literally prints out the path of every single file no matter if it contains the pattern or not, and then beside the path to the file, it will put the number of times it contains the specific pattern. So, unless there is a consistent element in every single file, then it isn't really a good command to use.

#### Example 2
Command: ``` grep -c "the" skill-demo1-data/written_2/*/*/*.txt ```
Output:
```
skill-demo1-data/written_2/travel_guides/berlitz1/HandRHawaii.txt:64
skill-demo1-data/written_2/travel_guides/berlitz1/HandRHongKong.txt:6
skill-demo1-data/written_2/travel_guides/berlitz1/HandRIbiza.txt:4
skill-demo1-data/written_2/travel_guides/berlitz1/HandRIsrael.txt:113
skill-demo1-data/written_2/travel_guides/berlitz1/HandRIstanbul.txt:4
skill-demo1-data/written_2/travel_guides/berlitz1/HandRJamaica.txt:66
skill-demo1-data/written_2/travel_guides/berlitz1/HandRJerusalem.txt:5
skill-demo1-data/written_2/travel_guides/berlitz1/HandRLakeDistrict.txt:9
skill-demo1-data/written_2/travel_guides/berlitz1/HandRLasVegas.txt:8
skill-demo1-data/written_2/travel_guides/berlitz1/HandRLisbon.txt:5
skill-demo1-data/written_2/travel_guides/berlitz1/HandRLosAngeles.txt:2
skill-demo1-data/written_2/travel_guides/berlitz1/HandRMadeira.txt:10
skill-demo1-data/written_2/travel_guides/berlitz1/HandRMadrid.txt:72
skill-demo1-data/written_2/travel_guides/berlitz1/HandRMallorca.txt:9
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryDublin.txt:141
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryEdinburgh.txt:197
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryEgypt.txt:153
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryFWI.txt:133
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryFrance.txt:349
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryGreek.txt:191
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryHawaii.txt:142
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryHongKong.txt:126
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryIbiza.txt:126
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryIndia.txt:503
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryIsrael.txt:175
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryIstanbul.txt:260
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryItaly.txt:420
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryJamaica.txt:166
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryJapan.txt:374
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryJerusalem.txt:174
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryLakeDistrict.txt:134
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryLasVegas.txt:171
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryMadeira.txt:104
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryMadrid.txt:111
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryMalaysia.txt:332
skill-demo1-data/written_2/travel_guides/berlitz1/HistoryMallorca.txt:127
skill-demo1-data/written_2/travel_guides/berlitz1/IntroDublin.txt:71
skill-demo1-data/written_2/travel_guides/berlitz1/IntroEdinburgh.txt:84
skill-demo1-data/written_2/travel_guides/berlitz1/IntroEgypt.txt:75
skill-demo1-data/written_2/travel_guides/berlitz1/IntroFWI.txt:63
skill-demo1-data/written_2/travel_guides/berlitz1/IntroFrance.txt:102
skill-demo1-data/written_2/travel_guides/berlitz1/IntroGreek.txt:87
skill-demo1-data/written_2/travel_guides/berlitz1/IntroHongKong.txt:44
skill-demo1-data/written_2/travel_guides/berlitz1/IntroIbiza.txt:59
skill-demo1-data/written_2/travel_guides/berlitz1/IntroIndia.txt:216
skill-demo1-data/written_2/travel_guides/berlitz1/IntroIsrael.txt:43
skill-demo1-data/written_2/travel_guides/berlitz1/IntroIstanbul.txt:72
skill-demo1-data/written_2/travel_guides/berlitz1/IntroItaly.txt:116
skill-demo1-data/written_2/travel_guides/berlitz1/IntroJamaica.txt:85
skill-demo1-data/written_2/travel_guides/berlitz1/IntroJapan.txt:156
skill-demo1-data/written_2/travel_guides/berlitz1/IntroJerusalem.txt:86
skill-demo1-data/written_2/travel_guides/berlitz1/IntroLakeDistrict.txt:108
skill-demo1-data/written_2/travel_guides/berlitz1/IntroLasVegas.txt:98
skill-demo1-data/written_2/travel_guides/berlitz1/IntroLosAngeles.txt:48
skill-demo1-data/written_2/travel_guides/berlitz1/IntroMadeira.txt:74
skill-demo1-data/written_2/travel_guides/berlitz1/IntroMadrid.txt:86
skill-demo1-data/written_2/travel_guides/berlitz1/IntroMalaysia.txt:74
skill-demo1-data/written_2/travel_guides/berlitz1/IntroMallorca.txt:74
skill-demo1-data/written_2/travel_guides/berlitz1/JungleMalaysia.txt:61
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToDublin.txt:134
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToEdinburgh.txt:172
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToEgypt.txt:161
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToFWI.txt:181
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToFrance.txt:11
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToGreek.txt:159
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToHawaii.txt:26
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToHongKong.txt:162
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToIbiza.txt:264
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToIndia.txt:157
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToIsrael.txt:159
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToIstanbul.txt:160
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToItaly.txt:167
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToJamaica.txt:784
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToJapan.txt:274
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToLakeDistrict.txt:180
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToLasVegas.txt:350
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToLosAngeles.txt:167
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToMadeira.txt:202
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToMalaysia.txt:167
skill-demo1-data/written_2/travel_guides/berlitz1/WhatToMallorca.txt:119
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToDublin.txt:723
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToEdinburgh.txt:762
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToEgypt.txt:844
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToFWI.txt:525
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToFrance.txt:2348
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToGreek.txt:795
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToHawaii.txt:18
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToHongKong.txt:548
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToIbiza.txt:379
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToIndia.txt:1698
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToIsrael.txt:786
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToIstanbul.txt:873
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToItaly.txt:2684
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToJapan.txt:1647
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToJerusalem.txt:790
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToLakeDistrict.txt:828
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToLosAngeles.txt:645
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToMadeira.txt:558
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToMadrid.txt:665
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToMalaysia.txt:1634
skill-demo1-data/written_2/travel_guides/berlitz1/WhereToMallorca.txt:655
skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-History.txt:32
skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-Intro.txt:21
skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-WhatToDo.txt:43
skill-demo1-data/written_2/travel_guides/berlitz2/Algarve-WhereToGo.txt:147
skill-demo1-data/written_2/travel_guides/berlitz2/Amsterdam-History.txt:37
skill-demo1-data/written_2/travel_guides/berlitz2/Amsterdam-Intro.txt:13
skill-demo1-data/written_2/travel_guides/berlitz2/Amsterdam-WhatToDo.txt:43
skill-demo1-data/written_2/travel_guides/berlitz2/Amsterdam-WhereToGo.txt:120
skill-demo1-data/written_2/travel_guides/berlitz2/Athens-History.txt:44
skill-demo1-data/written_2/travel_guides/berlitz2/Athens-Intro.txt:15
skill-demo1-data/written_2/travel_guides/berlitz2/Athens-WhatToDo.txt:45
skill-demo1-data/written_2/travel_guides/berlitz2/Athens-WhereToGo.txt:126
skill-demo1-data/written_2/travel_guides/berlitz2/Bahamas-History.txt:30
skill-demo1-data/written_2/travel_guides/berlitz2/Bahamas-Intro.txt:17
skill-demo1-data/written_2/travel_guides/berlitz2/Bahamas-WhatToDo.txt:45
skill-demo1-data/written_2/travel_guides/berlitz2/Bahamas-WhereToGo.txt:130
skill-demo1-data/written_2/travel_guides/berlitz2/Bali-History.txt:25
skill-demo1-data/written_2/travel_guides/berlitz2/Bali-WhatToDo.txt:42
skill-demo1-data/written_2/travel_guides/berlitz2/Bali-WhereToGo.txt:165
skill-demo1-data/written_2/travel_guides/berlitz2/Barcelona-History.txt:22
skill-demo1-data/written_2/travel_guides/berlitz2/Barcelona-WhatToDo.txt:33
skill-demo1-data/written_2/travel_guides/berlitz2/Barcelona-WhereToGo.txt:124
skill-demo1-data/written_2/travel_guides/berlitz2/Beijing-History.txt:24
skill-demo1-data/written_2/travel_guides/berlitz2/Beijing-WhatToDo.txt:45
skill-demo1-data/written_2/travel_guides/berlitz2/Beijing-WhereToGo.txt:113
skill-demo1-data/written_2/travel_guides/berlitz2/Berlin-History.txt:45
skill-demo1-data/written_2/travel_guides/berlitz2/Berlin-WhatToDo.txt:40
skill-demo1-data/written_2/travel_guides/berlitz2/Berlin-WhereToGo.txt:168
skill-demo1-data/written_2/travel_guides/berlitz2/Bermuda-WhatToDo.txt:62
skill-demo1-data/written_2/travel_guides/berlitz2/Bermuda-WhereToGo.txt:97
skill-demo1-data/written_2/travel_guides/berlitz2/Bermuda-history.txt:29
skill-demo1-data/written_2/travel_guides/berlitz2/Boston-WhereToGo.txt:149
skill-demo1-data/written_2/travel_guides/berlitz2/Budapest-History.txt:34
skill-demo1-data/written_2/travel_guides/berlitz2/Budapest-WhatToDo.txt:49
skill-demo1-data/written_2/travel_guides/berlitz2/Budapest-WhereoGo.txt:155
skill-demo1-data/written_2/travel_guides/berlitz2/California-History.txt:40
skill-demo1-data/written_2/travel_guides/berlitz2/California-WhatToDo.txt:49
skill-demo1-data/written_2/travel_guides/berlitz2/California-WhereToGo.txt:151
skill-demo1-data/written_2/travel_guides/berlitz2/Canada-History.txt:71
skill-demo1-data/written_2/travel_guides/berlitz2/Canada-WhereToGo.txt:423
skill-demo1-data/written_2/travel_guides/berlitz2/CanaryIslands-History.txt:28
skill-demo1-data/written_2/travel_guides/berlitz2/CanaryIslands-WhatToDo.txt:50
skill-demo1-data/written_2/travel_guides/berlitz2/CanaryIslands-WhereToGo.txt:117
skill-demo1-data/written_2/travel_guides/berlitz2/Cancun-History.txt:21
skill-demo1-data/written_2/travel_guides/berlitz2/Cancun-WhatToDo.txt:44
skill-demo1-data/written_2/travel_guides/berlitz2/Cancun-WhereToGo.txt:110
skill-demo1-data/written_2/travel_guides/berlitz2/China-History.txt:63
skill-demo1-data/written_2/travel_guides/berlitz2/China-WhatToDo.txt:42
skill-demo1-data/written_2/travel_guides/berlitz2/China-WhereToGo.txt:415
skill-demo1-data/written_2/travel_guides/berlitz2/Costa-History.txt:33
skill-demo1-data/written_2/travel_guides/berlitz2/Costa-WhatToDo.txt:42
skill-demo1-data/written_2/travel_guides/berlitz2/Costa-WhereToGo.txt:137
skill-demo1-data/written_2/travel_guides/berlitz2/CostaBlanca-History.txt:27
skill-demo1-data/written_2/travel_guides/berlitz2/CostaBlanca-WhatToDo.txt:75
skill-demo1-data/written_2/travel_guides/berlitz2/Crete-History.txt:33
skill-demo1-data/written_2/travel_guides/berlitz2/Crete-WhatToDo.txt:50
skill-demo1-data/written_2/travel_guides/berlitz2/Crete-WhereToGo.txt:135
skill-demo1-data/written_2/travel_guides/berlitz2/CstaBlanca-WhereToGo.txt:115
skill-demo1-data/written_2/travel_guides/berlitz2/Cuba-History.txt:27
skill-demo1-data/written_2/travel_guides/berlitz2/Cuba-WhatToDo.txt:31
skill-demo1-data/written_2/travel_guides/berlitz2/Cuba-WhereToGo.txt:149
skill-demo1-data/written_2/travel_guides/berlitz2/Nepal-History.txt:36
skill-demo1-data/written_2/travel_guides/berlitz2/Nepal-WhatToDo.txt:81
skill-demo1-data/written_2/travel_guides/berlitz2/Nepal-WhereToGo.txt:104
skill-demo1-data/written_2/travel_guides/berlitz2/NewOrleans-History.txt:43
skill-demo1-data/written_2/travel_guides/berlitz2/Paris-WhatToDo.txt:31
skill-demo1-data/written_2/travel_guides/berlitz2/Paris-WhereToGo.txt:146
skill-demo1-data/written_2/travel_guides/berlitz2/Poland-History.txt:37
skill-demo1-data/written_2/travel_guides/berlitz2/Poland-WhatToDo.txt:36
skill-demo1-data/written_2/travel_guides/berlitz2/Portugal-History.txt:39
skill-demo1-data/written_2/travel_guides/berlitz2/Portugal-WhatToDo.txt:48
skill-demo1-data/written_2/travel_guides/berlitz2/Portugal-WhereToGo.txt:281
skill-demo1-data/written_2/travel_guides/berlitz2/PuertoRico-History.txt:22
skill-demo1-data/written_2/travel_guides/berlitz2/PuertoRico-WhatToDo.txt:57
skill-demo1-data/written_2/travel_guides/berlitz2/PuertoRico-WhereToGo.txt:116
skill-demo1-data/written_2/travel_guides/berlitz2/Vallarta-History.txt:32
skill-demo1-data/written_2/travel_guides/berlitz2/Vallarta-WhatToDo.txt:61
skill-demo1-data/written_2/travel_guides/berlitz2/Vallarta-WhereToGo.txt:111
```
#### What's Happening
So here is an instance of a generic enough pattern ```the``` being searched for in every single file. Here, it shows all the numbers, such as in the one before, but because the value was so generic that it can be used multiple times in a single paragraph (except for this one apparently because it was only used 2 times), the number beside each file name is much greater than the numbers used to search for ```the Taj Mahal```.
