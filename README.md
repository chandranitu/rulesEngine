# Getting Started drools with spring

https://docs.drools.org/6.2.0.Final/drools-docs/html/ch20.html
https://www.drools.org/download/download.html

https://medium.com/codex/spring-boot-with-drools-engine-7119774c559f

http://localhost:8080/swagger-ui/index.html

mvn clean install
mvn clean install -U
mvn dependency:tree
mvn spring-boot:run

# Fee calculation
http://localhost:8080/fee/calculation
{
    "accountType": "Business",
    "paymentModel": "Prepaid",
    "tollingType": "Tag",
    "numberOfVehicles": 25,
    "rangePlan": "Silver",
    "tagFee": 50.00,
    "openingFee": 25.00,
    "mailingFee": 10.00,
    "securityDeposit": 0.00,
    "topUpAmount": 0.00,
    "lowBalance": 0.00
}


# working  post method
http://localhost:8080/order/customertype

{
  "age": 51,
  "gender": "M",
  "id": 0,
  "numberOfOrders": 50
}


# post->raw->json
http://localhost:8080/order/discount

{
  "amount": 150
}




Headers tab, add the header:

Content-Type: application/json


Unable to build index of kmodule.xml url=file:/home/chandra/workspace-24/rulesEngine/target/classes/META-INF/kmodule.xml
You're trying to perform a xml related operation without the necessary xml support for drools. Please add the module org.drools:drools-xml-support to your classpath.
