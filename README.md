
Listpoint Web Service Client
--------


### What is this?

It's a Java web service client for Listpoint: 

 * [http://www.listpoint.co.uk/webservices/codelist6service.asmx](http://www.listpoint.co.uk/webservices/codelist6service.asmx)
 * [http://www.listpoint.co.uk/webservices/context6service.asmx](http://www.listpoint.co.uk/webservices/context6service.asmx)
 * [http://www.listpoint.co.uk/webservices/contextmap6service.asmx](http://www.listpoint.co.uk/webservices/contextmap6service.asmx)

The code was generated from:

 * [http://www.listpoint.co.uk/webservices/codelist6service.asmx?wsdl](http://www.listpoint.co.uk/webservices/codelist6service.asmx?wsdl)
 * [http://www.listpoint.co.uk/webservices/context6service.asmx?wsdl](http://www.listpoint.co.uk/webservices/context6service.asmx?wsdl)
 * [http://www.listpoint.co.uk/webservices/contextmap6service.asmx?wsdl](http://www.listpoint.co.uk/webservices/contextmap6service.asmx?wsdl)
 
Generation was performed using the following commands:

 * wsimport -B-XautoNameResolution -s src/main/java/ -d target -p uk.co.listpoint.codelist http://www.listpoint.co.uk/webservices/codelist6service.asmx?wsdl
 * wsimport -B-XautoNameResolution -s src/main/java/ -d target -p uk.co.listpoint.context http://www.listpoint.co.uk/webservices/context6service.asmx?wsdl
 * wsimport -B-XautoNameResolution -s src/main/java/ -d target -p uk.co.listpoint.contextmap http://www.listpoint.co.uk/webservices/contextmap6service.asmx?wsdl

If you would like to generate just one of these client jars directly, you can use the following commands. NB by default these all end up in the uk.co.listpoint package, so there will be conflicts if you don't use a custom package to separate generated code:

 * wsimport -s src/main/java/ -d target -clientjar listpoint-codelist-ws.jar http://www.listpoint.co.uk/webservices/codelist6service.asmx?wsdl
 * wsimport -s src/main/java/ -d target -clientjar listpoint-context-ws.jar http://www.listpoint.co.uk/webservices/context6service.asmx?wsdl
 * wsimport -s src/main/java/ -d target -clientjar listpoint-contextmap-ws.jar http://www.listpoint.co.uk/webservices/contextmap6service.asmx?wsdl


### How do I use it?

Please contact the Listpoint team to request web services access.
See [http://listpoint.co.uk/](http://listpoint.co.uk/) for more information.

		
David Carboni

[https://github.com/davidcarboni/](https://github.com/davidcarboni/)

This project is based on the Maven Central Releaser project: [https://github.com/davidcarboni/releaser](https://github.com/davidcarboni/releaser)
