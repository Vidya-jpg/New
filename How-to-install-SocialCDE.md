This plugin requires Eclipse 3.7 (Indigo) and later, or Aptana studio 3+, with Java 7+ already installed. SocialCDEforEclipse works with GitHub repositories, luckily Eclipse already provides support for it. 

To add SocialCDEforEclipse plugin for Eclipse IDE (simply, a `.jar` file) , you have the following two choices:

1. If you have received an email from the administrator, please follow the instructions provided in the e-mail. After downloading the client, please continue to read this guide from the next step.
2. If you have not received an email from the administrator, please download the last version of the plugin from [here](https://github.com/collab-uniba/socialcde4eclipse/tree/master/it.uniba.di.socialCDEforEclipse/downloadClient).

## Plugin installation
To add SocialCDEforEclipse to Eclipse or Aptana, simply copy the downloaded jar file into the subfolder `dropins/` within your installation directory (e.g, `c:\users\fabio\eclipse` or `/home/fabio/ecplipse`). 
If you don’t find this folder, please control the version of your IDE of choice. If you are a Mac OS X user, make sure to right-click the Eclipse icon and pick from menu the _'Show Package Contents'_ entry to see the folders within.

After moving the jar, run the IDE and, once it has started, enable the plugin by selecting the menu _'Windows -> Show view -> Others'_ and then browsing for _'SocialCDE for Eclipse'_ in the tree view.

![Tree View](https://github.com/collab-uniba/socialcde4eclipse/blob/master/wikiImage/treeview.png)

The plugin is composed by two views:
* SocialCDE for Eclipse View
* SocialCDE for Eclipse Browser

The first is the main view of the plugin. Feel free to position it where you like, although it works best when pinned to either side of the IDE. The browser is meant to manage the authentication procedure for social network accounts through the OAuth protocol and, therefore, it opens up automatically when needed.
When it opens up, make sure to arrange (i.e., drag and drop) the browser in the middle panel, where the source file editor is, so that you have more space.

![Full screenshot](https://github.com/collab-uniba/socialcde4eclipse/blob/master/wikiImage/fullscreenshot.png)

