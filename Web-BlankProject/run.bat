set projectLocation=Y:\\Drive M\\Git Local Repository\\Local Repo 2\\WEB-BlankProject
cd %projectLocation%
set classpath=%projectLocation%\\bin;%projectLocation%\\libs\\*
java org.testng.TestNG %projectLocation%\\testng.xml
pause