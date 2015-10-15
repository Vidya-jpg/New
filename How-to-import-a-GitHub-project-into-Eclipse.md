Assuming you have created a project in GitHub, these are the steps to import it into Eclipse.
First, you have to add the git repository to Eclipse. To do so, first make the git repository view visible in Eclipse from the menu _'Window > Show views > Other > Git > Git Repositories'_

![add git repo 1](https://github.com/collab-uniba/socialcde4eclipse/blob/master/wikiImage/add%20git%20repo%201.png)


Eclipse will show the view somewhere. Click on _'Clone a Git repository'_ to begin the process.

![clone git repo 1](https://github.com/collab-uniba/socialcde4eclipse/blob/master/wikiImage/clone%20git%20repo%201.png)

Make sure to select GitHub as repository source.

![clone git repo 2](https://github.com/collab-uniba/socialcde4eclipse/blob/master/wikiImage/clone%20git%20repo%202.png)

To add your project, enter the name of the project (select the language, if you set one) and press search. Your project repository will show up. Select it and press _'Next'_.

![clone git repo 3](https://github.com/collab-uniba/socialcde4eclipse/blob/master/wikiImage/clone%20git%20repo%203.png)

Now, select the local path on your computer where Eclipse will store the project. In my case, I'm OK with the default path, that is, within the `git/` subfolder in my home dir (i.e., `C:\Users\Fabio\git\socialcde-demo`).
Please, make sure to check the box _'Import all existing Eclipse project after clone finishes'_. This is very important if the project on GitHub is not empty. Then, press _'Finish'_.

![clone git repo 4](https://github.com/collab-uniba/socialcde4eclipse/blob/master/wikiImage/clone%20git%20repo%204.png)

**In the rest of this guide, I'm assuming that your GitHub project is empty and has just been created.**
In order to make it visible within the Eclipse IDE, complete these steps. From the toolbar, click on _'New > Project...'_. In the example, I show the case of a Java project, but the steps are the same for every Eclipse project.

![clone git repo 5](https://github.com/collab-uniba/socialcde4eclipse/blob/master/wikiImage/clone%20git%20repo%205.png)

Uncheck the box _'Use default location'_. Then, click on _'Browse'_ and use the treeviewer to browse the folder where you checked out the GitHub repository (`C:\Users\Fabio\git\socialcde-demo` in this case).

![clone git repo 6](https://github.com/collab-uniba/socialcde4eclipse/blob/master/wikiImage/clone%20git%20repo%206.png)

As a confirmation that everything worked fine in the _'Package Explorer'_ view, you should see the project folder (`socialcde-demo`) displayed with a little orange cylinder, which indicates that the project is shared on GitHub. 
Finally, **make sure that your projects contains a `src/` subfolders where to store your source file**. It is a **best practice for software developers and SocialCDE relies on that**.

![clone git repo 7](https://github.com/collab-uniba/socialcde4eclipse/blob/master/wikiImage/clone%20git%20repo%207.png)