This guide assumes you have already downloaded and installed SocialTFS Proxy Server. If not, please read the guide [How to install SocialTFS](https://github.com/collab-uniba/socialcde4eclipse/wiki/How-to-install-SocialTFS-proxy-server).

When you are installing SocialTFS Proxy Server, the local SQL Server creates a User Login (SocialTFS) and makes it the database (SocialTFS) owner. This user has a default password which is the same for all installations of SocialTFS Proxy Server, for this we strongly recommend you to change the connection password to the database after SocialTFS Proxy Server installation.
To do this you must change the password of the User Login (SocialTFS) and the web service connection string to the database.

First of all you must run SQL Server Management Studio, log in via Windows Authentication with an administrator account and open the Login Properties from the context menu of the SocialTFS User in the Object Explorer pane on the left.

![SQL Server Management Studio - Link to properties of SocialTFS user](http://i3.codeplex.com/Download?ProjectName=socialtfs&DownloadId=318828)

Then you can change the SocialTFS User password, confirm it, press Ok and close SQL Server Management Studio. We recommend using [the Windows password policy mechanisms.](http://msdn.microsoft.com/en-us/library/ms161959.aspx).

![SQL Server - SocialTFS user - Properties](http://i3.codeplex.com/Download?ProjectName=socialtfs&DownloadId=318829)

Now you need to run IIS Manager, select the site you previously created (SocialTFS) from the sites folder on the left and double click on the Connection Strings item from the central view.

![IIS - connection strings - Link](http://i3.codeplex.com/Download?ProjectName=socialtfs&DownloadId=318830)

Then select the SocialTFSConnectionString connection from central view and edit it via the command in the menu on the right.

![IIS - connection strings - Window](http://i3.codeplex.com/Download?ProjectName=socialtfs&DownloadId=318926)

Finally, replace the black points in the connection string with the password you chose earlier and press Ok.

![IIS - connection strings - edit ](http://i3.codeplex.com/Download?ProjectName=socialtfs&DownloadId=318927)

**Note:** It's important to remember the chosen password because it could be used when upgrading SocialTFS Proxy Server.