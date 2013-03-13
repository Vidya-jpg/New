This plugin requires Eclipse 3.7 (Indigo) or later, or Aptana studio 3, with Java 7+ already installed.
If you want to use Aptana IDE, you need to disable the built-in JRE (ver. 6) included by default in Aptana. This is necessary because the plugin only works with JRE 7+. To disable the built-in JRE: <br/>
1. Go to Aptana folder and find jre folder. Note that the standard path for Aptana folder is _C:\Users\ &lt;user account&gt;\AppData\Local\Aptana Studio 3_. <br/>
2. Rename the _jre_ folder to _jre6_ or anything else different from the default name.
Now, Aptana will use the system default JRE 7 installed on your OS. 

To add SocialCDEforEclipse plug-in for Eclipse IDE, you have the following two choices:

1. If you have received an email from the administrator, please follow the instructions provided in the e-mail. After downloading the client, please continue to read this guide.
2. If you have not received an email from the administrator, please download the last version of SocialTFS (client and server) from http://socialtfs.codeplex.com/releases and unzip the package. The client is in the file _SocialCDEforEclipse&ltversion&gt .jar.

SocialCDEforEclipse works with GitHub repositories, so you need to have git installed on your box. First of all, make sure that you have set correctly the credentials of git. The credentials must match those of your GitHub account. If they are not the same, the plug-in will not work properly. 

## Git configuration

To check the git credentials you must find config file. The location of this file depends of two factors:

1. The version of git that you use.
2. The IDE that you use.

If you use git standalone application, the config file is in user directory (e.g., C:\Users\Floriano) and it is called .gitconfig.    
If you use Eclipse (with e-git), the config file is file on .git folder on your workspace folder (e.g., _C:\workspace \.git\config_). Please note that if you have created that workspace with Eclipse and you reuse that with Aptana, the latter will just ignore this .git folder.
Finally, if you use Aptana the config file (called gitconfig) is in /etc subfolder of the selected workspace, that is _&lt;workspace_location&gt;\.metadata\.plugins\com.aptana.portablegit.win32\etc_ 
Please note that if you have created that workspace with Aptana and you reuse that with Eclipse, the latter will just ignore this .metadata folder.  

Now that you have located your git config gile, open it and look for the followings lines:

_[user]_ <br/>
	_name_ = _your username_ <br/> 
	_email_ = _your email_ <br/>
        _mail_ = _your email_ <br/>

If you don’t find them, just copy and paste the previous lines at the end of file. Remember to enter the same credentials used on GitHub.

## Plugin installation
To add SocialCDEforEclipse to Eclipse or Aptana make sure that you have “dropins” folder in main directory. If you don’t find this folder, please control the version of your IDE of choice. Then, move the SocialCDEforEclipse jar file into the folder before running the IDE. Once the IDE has started, to enable the plugin select the menu _Windows -> Show view -> Others -> SocialCDE for Eclipse -> SocialCDE4Eclipse_
The plugin is composed by two views:
•	SocialCDE4Eclipse
•	SocialCDE4Eclipse Browser
The first view is the main view of the plug-in, while the second one was created to manage the authentication procedure in social network accounts through the OAuth protocol (it opens up automatically, when needed).
If you are using Linux as OS and have experience issues with “SocialCDE4Eclipse Browser” view, please make sure that your system matches all the requirements listed on the following page:
http://www.eclipse.org/swt/faq.php#browserlinux
In particular, for many users of Ubuntu 12.04, the missing component is the library xulrunner.  To install the library, visit this link: https://developer.mozilla.org/en-US/docs/XULRunner_1.9_Release_Notes
After downloading the file, follow these steps: <br/>
1. Drag the file into _/opt_ folder <br/>
2. Open terminal and change directory to _/opt_ <br/>
3. Type _tar -xjf xulrunner-1.9.0.17.en-US.linux-i686.tar.bz2_ <br/>
4. Go into _xulrunner_ folder just created and type _./xulrunner --register-global_ (to install for all users, this must be run as root) or _xulrunner --register-user_ (to install for one user only).