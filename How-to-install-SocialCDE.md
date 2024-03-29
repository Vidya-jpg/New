This plugin requires Eclipse 3.7 (Indigo) and later, or Aptana studio 3+, with Java 7+ already installed. SocialCDEforEclipse works with GitHub repositories, luckily Eclipse already provides support for handling GitHub code, but not GitHub issues, that is, the database where you create tickets for managing your development. 

#### Note about Aptana Studio
You need to install Aptanta Studio as an Eclipse plugin, not as standalone app. So first download Eclipse from [eclipse.org/downloads](http://www.eclipse.org/downloads/), then follow [these simple steps](http://download.aptana.com/studio3/plugin/install) to install Aptana Studio plugins in your Eclipse installation.

## Plugin Download
To download SocialCDEforEclipse plugin for Eclipse IDE (simply, a `.jar` file), you have the following two choices:
* If you have received an email from the administrator, please follow the instructions provided in the e-mail. After downloading the client, please continue to read this guide from the next step.
* If you have not received an email from the administrator, please download the last version of the plugin from [here](https://github.com/collab-uniba/socialcde4eclipse/blob/master/it.uniba.di.socialCDEforEclipse/downloadClient/SocialCDEforEclipse.jar?raw=true).

## Plugin Installation
To add SocialCDEforEclipse to Eclipse or Aptana, simply copy the downloaded jar file into the subfolder `dropins/` within your installation directory (e.g, `c:\users\fabio\eclipse` or `/home/fabio/ecplipse`). 
If you don’t find this folder, please control the version of your IDE of choice. If you are a Mac OS X user, make sure to right-click the Eclipse icon and pick from menu the _'Show Package Contents'_ entry to see the folders within.

After moving the jar, run the IDE and, once it has started, enable the plugin by selecting the menu _'Windows -> Show view -> Others'_ and then browsing for _'SocialCDE for Eclipse'_ in the tree view.

![Tree View](https://github.com/collab-uniba/socialcde4eclipse/blob/master/wikiImage/treeview.png)

The plugin is composed by two views:
* SocialCDEforEclipse View
* SocialCDEforEclipse Browser

The first is the main view of the plugin. Feel free to position it where you like, although it works best when pinned to either side of the IDE. The browser is meant to manage the authentication procedure for social network accounts through the OAuth protocol and, therefore, it opens up automatically when needed.
When it opens up, make sure to arrange (i.e., drag and drop) the browser in the middle panel, where the source file editor is, so that you have more space.

![Full screenshot](https://github.com/collab-uniba/socialcde4eclipse/blob/master/wikiImage/fullscreenshot.png)

## GitHub Issue Connector installation
In order to let SocialCDEforEclipse works at it bests, you need to add the GitHub issue connector. The task is simple. Go to 'Help -> Install new Software' menu.

From the next form, select edit the field as shown in the figure below. Then click next and follow the on-screen instructions.

![GitHub Connector](https://github.com/collab-uniba/socialcde4eclipse/blob/master/wikiImage/github_connector.png)

After reboot, on the right-hand side of the IDE, you will see a _'Task list'_ panel, as shown in the picture below. Click on the + icon to add the issue repository from one of your GitHub projects.

![Add repo](https://github.com/collab-uniba/socialcde4eclipse/blob/master/wikiImage/add%20issue%20repo.png)

A wizard will drive you through the process. Select _'GitHub Issues'_, then click next and edit the field in the next screen as shown below. In particular, copy and paste the url of the chosen project in the _'Server'_ field and the field _'Label'_ will be populated automatically. As per _'User ID'_ and _'Password'_, enter your GitHub credentials (make sure to also check _'Save Passwords'_ or you will have to authenticate every time Eclipse is started).

![Add repo wizard](https://github.com/collab-uniba/socialcde4eclipse/blob/master/wikiImage/add%20issue%20repo%202.png)

Click _'Finish'_. When asked to add a new query, say no, we will create a query in a moment. Go back and click the + button in the _'Task list'_ panel, as in the picture below. Let's create a new query to list some of the issues already entered in GitHub. Click on _'New query'_, then select the repository for your project.

![New query](https://github.com/collab-uniba/socialcde4eclipse/blob/master/wikiImage/new%20query.png)

Let's try and select all the issues that are open in the current sprint (or milestone, in the GitHub lingo) that have been assigned to me. Try to fill configure your own query taking inspiration from the figure below.

![New query setup](https://github.com/collab-uniba/socialcde4eclipse/blob/master/wikiImage/new%20query_2.png)

And below is the result of the query just created. Double-clicking on an issue, will open a form editor, where you can modify the content, comment, etc. as you do on GitHub. Clicking _'Submit'_ will save all the changes locally and on GitHub too. 

![Query results](https://github.com/collab-uniba/socialcde4eclipse/blob/master/wikiImage/query%20result.png)

To create a new issue, click on the + button and select _'New task'_, then select what GitHub issue repo you are contributing to, and fill out the form. Click on _'Submit'_ and the issue will be uploaded on your GitHub project space.

![New issue](https://github.com/collab-uniba/socialcde4eclipse/blob/master/wikiImage/new%20issue.png)