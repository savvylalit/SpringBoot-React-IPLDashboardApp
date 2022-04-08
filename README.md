# SpringBoot-React-IPLDashboardApp
IPL-Indian Premier League is a 20-20 over Cricket tournament hosted by Cricket-Board of India. 
It is a Franchise modeled leagur, in which players from India and around the world participate to showcase their skills.
This application is a hobby project to track the team performances across years 2008 to 2020.

# Technologies
- Spring Boot : To create APIs
- Spring Batch: To load the dataset into in-memory db
- Java Persistence API, Repositories and JPQL
- HSQL DB: In memory DB
- React JS: Frontend technology
- AWS BeanStalk: To deploy (http://ipldashboard-env.eba-nnhxi4ja.ap-south-1.elasticbeanstalk.com/#/)

Data Set Used
https://www.kaggle.com/patrickb1912/ipl-complete-dataset-20082020/metadata

Reference: Java brains:
https://youtube.com/playlist?list=PLqq-6Pq4lTTa8V613TZhGq4o8hSgkMGQ0

# About App:
- *Frontend:* This folder contains the ReactJs code for User Interface.
- *Ipl-Dashboard:* This folder contains SpringBoot application.

To Build and deploy on server. Create 'build' folder for frontend and deploy it along with the backend api app.
-----------------To build the Front-End App-----------------
To build react app
> npm run-script build

check errors/warnings. solve them and rebuild using the same command. A 'build' folder will be created after build.

-----------------To build the Back-End App-----------------
> mvn clean install -DskipTests
OR
You can directly build from eclipse by: Right click project > Run As > Maven Build (Goals: clean install, select 'skip test') > Build

-----------------To deploy-----------------
Copy contents from the 'build' folder o the Frontend app to 'src/main/resources/public' folder of the Backend app and rebuild the backend app.

Deploy the *"Ipl-Dashboard-0.0.1-SNAPSHOT.jar"* file to server.
