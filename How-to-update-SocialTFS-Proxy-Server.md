This guide assumes you have already downloaded and installed SocialTFS Proxy Server. If not, please read the guide [How to install SocialTFS](https://github.com/collab-uniba/socialcde4eclipse/wiki/How-to-install-SocialTFS-proxy-server).

This guide assumes you remember the SQL Server User Login (SocialTFS) password. If not, please read the guide [How to change connection password after SocialTFS Proxy Server installation](https://github.com/collab-uniba/socialcde4eclipse/wiki/How-to-change-connection-password-after-SocialTFS-Proxy-Server-installation).

When you want to update SocialTFS Proxy Server you must be careful to not erase all stored data.

To update the SocialTFS Proxy Server, download the last version of SocialTFS from http://socialtfs.codeplex.com/releases and unzip the package.
The Proxy Server is in the file SocialTFSProxyServer.zip.

First of all you need to run IIS Manager, select the site (SocialTFS) from the sites folder on the left and start the application import procedure from the menu on the right.

![IIS - Import application - Link](http://i3.codeplex.com/Download?ProjectName=socialtfs&DownloadId=318896)

On the first page of the wizard enter the path to the file SocialTfsProxyServer.zip just unzipped and go to the next page.

![Import application Wizard - Part 1](http://i3.codeplex.com/Download?ProjectName=socialtfs&DownloadId=318897)

The second page of the wizard shows the contents of the package. On this page you need to uncheck the first Deploy SQL database item but do not uncheck the second Deploy SQL database item that called UpdateScript.sql.

![Import application wizard - Part 2](http://i3.codeplex.com/Download?ProjectName=socialtfs&DownloadId=634845)

On the third page of the wizard enter the path to the application (it is preferable to leave it blank).

![Import application wizard - Part 3](http://i3.codeplex.com/Download?ProjectName=socialtfs&DownloadId=318899)

The fourth page of the wizard ask you to delete all the file in the destination folder. These files are related to the web service as data is safe in the database, then select yes and go to the next page.

![Import application wizard - Part 4](http://i3.codeplex.com/Download?ProjectName=socialtfs&DownloadId=318900)

The fifth page of the wizard shows the results of the application import procedure.

![Import application wizard - Part 5](http://i3.codeplex.com/Download?ProjectName=socialtfs&DownloadId=318911)

Now select the folder AdminPanel from the site (SocialTFS) on the left and double click on the Directory Browsing item from the central view.

![IIS - AdminPanel folder - Directory Browsing link](http://i3.codeplex.com/Download?ProjectName=socialtfs&DownloadId=318912)

Enable directory browsing from the menu on the right. This allows access from any browser to the admin panel.

![IIS - AdminPanel folder - Enable](http://i3.codeplex.com/Download?ProjectName=socialtfs&DownloadId=318913)

Now you need to select the site (SocialTFS) from the sites folder on the left and double click on the Connection Strings item from the central view.

![IIS - Connection strings - Link](http://i3.codeplex.com/Download?ProjectName=socialtfs&DownloadId=318918)

Then select the SocialTFSConnectionString connection from central view and edit it via the command in the menu on the right.

![Connection strings - window](http://i3.codeplex.com/Download?ProjectName=socialtfs&DownloadId=318919)

Finally, enter the following connection string:
Data Source=(local);Initial Catalog=SocialTFS;User ID=SocialTFS;Password=
by adding the SQL Server Login User (SocialTFS) password and press Ok.

![Connection strings - edit](http://i3.codeplex.com/Download?ProjectName=socialtfs&DownloadId=318928)

