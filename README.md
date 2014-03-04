
Listpoint Web Service Client
--------


### What is this?

It's a Java web service client for Listpoint: 

 * [http://www.listpoint.co.uk/webservices/codelist6service.asmx](http://www.listpoint.co.uk/webservices/codelist6service.asmx)
 * [http://www.listpoint.co.uk/webservices/codelist6service.asmx](http://www.listpoint.co.uk/webservices/context6service.asmx)
 * [http://www.listpoint.co.uk/webservices/codelist6service.asmx](http://www.listpoint.co.uk/webservices/contextmap6service.asmx)

The code was generated from:

 * [http://www.listpoint.co.uk/webservices/codelist6service.asmx?wsdl](http://www.listpoint.co.uk/webservices/codelist6service.asmx?wsdl)
 * [http://www.listpoint.co.uk/webservices/codelist6service.asmx?wsdl](http://www.listpoint.co.uk/webservices/context6service.asmx?wsdl)
 * [http://www.listpoint.co.uk/webservices/codelist6service.asmx?wsdl](http://www.listpoint.co.uk/webservices/contextmap6service.asmx?wsdl)
 
Generation was performed using the following commands:

 * wsimport -B-XautoNameResolution -s src/main/java/ -d target -p uk.co.listpoint.codelist -clientjar listpoint-codelist-ws.jar http://www.listpoint.co.uk/webservices/codelist6service.asmx?wsdl
 * wsimport -B-XautoNameResolution -s src/main/java/ -d target -p uk.co.listpoint.context -clientjar listpoint-context-ws.jar http://www.listpoint.co.uk/webservices/context6service.asmx?wsdl
 * wsimport -B-XautoNameResolution -s src/main/java/ -d target -p uk.co.listpoint.contextmap -clientjar listpoint-contextmap-ws.jar http://www.listpoint.co.uk/webservices/contextmap6service.asmx?wsdl



### How do I use it?

See [http://listpoint.co.uk/](http://listpoint.co.uk/) for more information.

David Carboni

[https://github.com/davidcarboni/](https://github.com/davidcarboni/)
