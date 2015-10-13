This plugin requires Eclipse 3.7 (Indigo) and later, or Aptana studio 3+, with Java 7+ already installed. SocialCDEforEclipse works with GitHub repositories, luckily Eclipse already provides support for it. 

To add SocialCDEforEclipse plugin for Eclipse IDE (simply, a `.jar` file) , you have the following two choices:

1. If you have received an email from the administrator, please follow the instructions provided in the e-mail. After downloading the client, please continue to read this guide from the next step.
2. If you have not received an email from the administrator, please download the last version of the plugin from [here](https://github.com/collab-uniba/socialcde4eclipse/tree/master/it.uniba.di.socialCDEforEclipse/downloadClient).

## Plugin installation
To add SocialCDEforEclipse to Eclipse or Aptana, simply copy the downloaded jar file into the subfolder `dropins/` within your installation directory (e.g, `c:\users\fabio\eclipse` or `/home/fabio/ecplipse`). 
If you don’t find this folder, please control the version of your IDE of choice. After moving the jar, run the IDE and, once it has started, enable the plugin by selecting the menu _Windows -> Show view -> Others -> SocialCDE for Eclipse -> SocialCDE4Eclipse_

The plugin is composed by two views:
* SocialCDE4Eclipse
* SocialCDE4Eclipse Browser

The first view is the main view of the plug-in, while the second one was created to manage the authentication procedure in social network accounts through the OAuth protocol (it opens up automatically, when needed).
If you are using Linux as OS and have experience issues with “SocialCDE4Eclipse Browser” view, please make sure that your system matches all the requirements listed on the following page:
http://www.eclipse.org/swt/faq.php#browserlinux
In particular, for many users of Ubuntu 12.04, the missing component is the library xulrunner.  To install the library, visit this link: https://developer.mozilla.org/en-US/docs/XULRunner_1.9_Release_Notes
After downloading the file, follow these steps: <br/>
1. Drag the file into _/opt_ folder <br/>
2. Open terminal and change directory to _/opt_ <br/>
3. Type _tar -xjf xulrunner-1.9.0.17.en-US.linux-i686.tar.bz2_ <br/>
4. Go into _xulrunner_ folder just created and type _./xulrunner --register-global_ (to install for all users, this must be run as root) or _xulrunner --register-user_ (to install for one user only).
