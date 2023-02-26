# Lab Report 4
---
## Competition Steps:
These begin at Step 4 as the first three steps are primarily set up, such as removing any already existing clones of my fork of the repository and setting up a timer.

---
### 4.. Log into ieng6
#### Command Used: ```ssh cs15lwi23avl@ieng6.ucsd.edu <enter> ```

#### Screenshot:

![Image](https://user-images.githubusercontent.com/111078165/221395041-9a64c4e7-d821-46bc-923a-501640678558.png)

#### What Does ```ssh cs15lwi23avl@ieng6.ucsd.edu <enter> ``` Do?

The specific command ```ssh``` is used to connect your physical computer to a remote computer in another location. So by typing out ```ssh cs15lwi23avl@ieng6.ucsd.edu ```, you're indicating to the terminal - which in this case is VSCode - that you're connecting to a remote server using that login.

After that, pressing the ``` <enter> ``` key just runs the command in the terminal.

Due to an extra set up provided in the lab, I didn't have to input my password and the terminal just logged me into my ieng6 account.

--- 
### 5. Clone your fork of the repository from your Github account
#### Commands Used: ``` git clone git@github.com:tirani427/lab7.git <enter> cd lab7 <enter> ```

#### Screenshot:

![Image](https://user-images.githubusercontent.com/111078165/221395431-88b6ecf0-e548-4f78-bfca-8d2f5d3dff6a.png)

#### What Does ``` git clone git@github.com:tirani427/lab7.git <enter> cd lab7 <enter> ``` Do?

This "command" is broken into two lines - ``` git clone git@github.com:tirani427/lab7.git <enter> ``` and ``` cd lab7 <enter> ```.

**``` git clone git@github.com:tirani427/lab7.git <enter> ```** tells the terminal to clone ( ``` git clone ``` ) the repository given by the ssh url 
(``` git@github.com:tirani427/lab7.git ```). By pressing the ```<enter>``` key, the terminal just runs the command and clones the repository.

**``` cd lab7 <enter> ```** is once again a command to the terminal that is saying that the user wants to change the current working directory to the file given - which in this case is lab7. The ```<enter>``` key is used to run the command.

The reason this command is run is to make the following steps easier, as the tasks of running the JUnit tests and modifying the buggy file are significantly easier if you don't have to constantly type the path to said files with the file name as well.

AKA (not in file) ``` javac -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar lab7/*.java ``` 
vs 
(in file) ``` javac -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar *.java ```

---
### 6. Run the tests, demonstrating that they fail
#### Commands Run: ``` javac -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar *.java <enter> java -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar org.junit.runner.JUnitCore ListExamplesTests <enter>```

#### Screenshot:

![Image](https://user-images.githubusercontent.com/111078165/221395766-dc8c389c-cb71-4ae2-ad64-4b93776abc41.png)

#### What Does ``` javac -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar *.java <enter> java -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar org.junit.runner.JUnitCore ListExamplesTests <enter>``` Do?

##### Compiling the Code: ``` javac -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar *.java <enter> ```
This segment of the command is basically telling the terminal to compile the Java code within the java files in the current working directory lab7. The files are specified as being java files by the ```*.java``` line. Once again, ```<enter>``` runs the command on the terminal. 

##### Running the Java Code: ```java -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar org.junit.runner.JUnitCore ListExamplesTests <enter>```
This code tells the terminal to actually run the files specified by the file names listed after ```...org.junit.runner.JUnitCore```. It's this segment of the command line that actually produces the results demonstrated in the screenshot - where the two errors in the JUnit tests are shown. The ```<enter>``` key runs the command.

#### Side Note on Proper Work Habits
Looking back at this, I just realized I need to specify. I actually typed these lines out since I didn't think to actually look for the previously typed lines in the terminal. If I did I would have done pressed the up arrow as many times as needed to get to the appropriate commands and then pressed enter. Don't be like me. Actually look for the lines if you know you've written them before. Be smart.

---
### 7. Edit the code file to fix the failing test
#### Commands Used:
##### To Get Into the Java File: ``` nano ListExamples.java ```
###### Screenshot:

![Image](https://user-images.githubusercontent.com/111078165/221396277-3a1708e8-1e27-4f1a-8fcb-b61eb0b9623d.png)

###### What Does ``` nano ListExamples.java ``` Do?
```nano``` is an editing software that is normally downloaded on a computer's powershell (windows) or terminal (mac). According to the professor and the professor's satellite-working friend, nano is infinitely better and easier to use than the other editing software available called ```vim```. As such, the command above basically says to open the specific file ```ListExamples.java``` in nano. I also did not _want_ to get a headache from trying to use vim so that is another reason to use this command instead of ```vim ListExamples.java```. 

##### To Find the Right Line: ``` <Ctrl>W while(index2 < list2.size()) <enter> ```
###### Screenshot:

![Image](https://user-images.githubusercontent.com/111078165/221396431-c07c0b2a-65a6-4e28-a0df-7e2b2e411086.png)

###### What Does ``` <Ctrl>W while(index2 < list2.size()) <enter> ``` Do?
So, because we had completed these steps during lab on Thursday, I knew where the errored line was within the code. As such, I looked for the the lines before it using the ```<Ctrl>W``` command. It then created a line highlighted with white as seen in the bottom part of the screenshot, to which I typed in the line I was looking for which was ```while(index2 < list2.size())```. After pressing enter, the cursor would move to the first character in the line I looked for, which was ```w```. That being said, the actual line showing the line being looked for would have disappeared after I pressed enter, so I decided to take the screenshot before I actually pressed enter.

##### To Get to the Right Place: ``` <down> <right> <right> <down> <right> <right> <right> <right> <right> <right> ```
There is no screenshot for this step because it would involve 10 different pictures showing where the cursor was at each moment and it is not preferred. By pressing the ```<down> ``` and ``` <right>``` keys, I was just manuvering the cursor into the place I needed it to be in order to fix the bugged line.

##### To Correct the Mistake: ``` <backspace> 2 ```
###### Screenshot:
![Image](https://user-images.githubusercontent.com/111078165/221396728-90a497af-dda5-48cf-86a9-16dbd5144997.png)

###### What Does ``` <backspace> 2 ``` Do?
This command is actually editing the ```ListExamples.java``` file that was opened in previous steps. It simply does as it says and deletes the previous character in the line and then types 2 instead.

##### To Save the Editted File: ``` <Ctrl>O <enter> ```
###### Screenshot:
![Image](https://user-images.githubusercontent.com/111078165/221396787-f1e82524-7657-4e4d-ac7c-47e984cdcfd5.png)

###### What Does ``` <Ctrl>O <enter> ``` Do?
The command ``` <Ctrl>O ``` is actually something that ```nano``` has which saves the file editted without actually exiting from the program. You could also just type ```<Ctrl>X``` and then be prompted to either save the file's edits or revert back to the original, but either way, the function of this command would be called in the end. To save some peace of mind on if the file was actually saved or not, this command is a good one to keep in mind when editing a file using ```nano```. It's also easier to remember than ```vim```'s save command - which is 

##### To Exit Out of the Editor: ``` <Ctrl><X> ```
Once again, there is no screenshot for this command since once its typed the file will immediately exit out back into the terminal.

---
### 8. Run the tests, demonstrating that they now succeed
#### Commands Used: ```<up> <up> <up> <enter> <up> <up> <up> <up> <enter>```

#### Screenshot:
![Image](https://user-images.githubusercontent.com/111078165/221397059-f147cdda-7ab3-46ac-b89f-378b9f57b542.png)

#### What Does ```<up> <up> <up> <enter> <up> <up> <up> <up> <enter>``` Do?
Basically the number one lesson in efficient coding is to not do more work than needed. That being said, I had previously typed in the commands needed in order to compile and run the Java files, so why would I retype those commands in again? And even though I did edit the file ```ListExamples.java``` used, since the file name remained the same, I could use the same commands (if I needed to specifically compile/run that file by name at least. In this case, it isn't really necessary or relevant).

The first set of ```<up> <up> <up> <enter> ``` gets me back to the original ```javac -cp ...``` command and then the ```<enter>``` makes me run it again.

The second set of ```<up> <up> <up> <up> <enter>``` gets me back to the original ```java -cp...``` command and then the ```<enter>``` runs the JUnit tests and has the results returned in the terminal as shown.

---
### 9. Commit and push the resulting change to your Github account (you can pick any commit message!)
#### Commands Used: ``` git add ListExamples.java <enter> git commit -m "File has been fixed" <enter> git push <enter> ```

#### Screenshot:
![Image](https://user-images.githubusercontent.com/111078165/221397278-48e157ed-adb3-48c6-b9ca-2949f00106df.png)

#### What Does ``` git add ListExamples.java <enter> git commit -m "File has been fixed" <enter> git push <enter> ``` Do?
``` git add ListExamples.java <enter> ``` basically adds the changed file ```ListExamples.java``` to the next commit. It's a specification saying that the user wants this specific file to be updated in the repository. When ```<enter>``` is pressed, there isn't a visible change shown in the terminal.

``` git commit -m "File has been fixed" <enter> ``` takes the changes made to the files listed in the ```git add``` command and basically sets them up to be pushed to the remote repository. The ```-m``` part of the command states that the following string (```"File has been fixed"```) is a message for this specific commit.

```git push <enter> ``` actually pushes the files listed in ```git add``` and ```git commit``` to the repository.



