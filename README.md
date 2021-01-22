# Getting started

API for sending and managing payments

## How to Build

The generated code uses a few Maven dependencies e.g., Jackson, UniRest,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on ``` File -> Import ```.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?step=import0&workspaceFolder=PaymentsAPI-Java&workspaceName=PaymentsAPI&projectName=PaymentsAPI&rootNamespace=com.bankanovafx.payments.api)

* In the import dialog, select ``` Existing Java Project ``` and click ``` Next ```.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?step=import1&workspaceFolder=PaymentsAPI-Java&workspaceName=PaymentsAPI&projectName=PaymentsAPI&rootNamespace=com.bankanovafx.payments.api)

* Browse to locate the folder containing the source code. Select the detected location of the project and click ``` Finish ```.

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?step=import2&workspaceFolder=PaymentsAPI-Java&workspaceName=PaymentsAPI&projectName=PaymentsAPI&rootNamespace=com.bankanovafx.payments.api)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?step=import3&workspaceFolder=PaymentsAPI-Java&workspaceName=PaymentsAPI&projectName=PaymentsAPI&rootNamespace=com.bankanovafx.payments.api)

## How to Use

The following section explains how to use the PaymentsAPI library in a new console project.

### 1. Starting a new project

For starting a new project, click the menu command ``` File > New > Project ```.

![Add a new project in Eclipse](https://apidocs.io/illustration/java?step=createNewProject0&workspaceFolder=PaymentsAPI-Java&workspaceName=PaymentsAPI&projectName=PaymentsAPI&rootNamespace=com.bankanovafx.payments.api)

Next, choose ``` Maven > Maven Project ```and click ``` Next ```.

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?step=createNewProject1&workspaceFolder=PaymentsAPI-Java&workspaceName=PaymentsAPI&projectName=PaymentsAPI&rootNamespace=com.bankanovafx.payments.api)

Here, make sure to use the current workspace by choosing ``` Use default Workspace location ```, as shown in the picture below and click ``` Next ```.

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?step=createNewProject2&workspaceFolder=PaymentsAPI-Java&workspaceName=PaymentsAPI&projectName=PaymentsAPI&rootNamespace=com.bankanovafx.payments.api)

Following this, select the *quick start* project type to create a simple project with an existing class and a ``` main ``` method. To do this, choose ``` maven-archetype-quickstart ``` item from the list and click ``` Next ```.

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?step=createNewProject3&workspaceFolder=PaymentsAPI-Java&workspaceName=PaymentsAPI&projectName=PaymentsAPI&rootNamespace=com.bankanovafx.payments.api)

In the last step, provide a ``` Group Id ``` and ``` Artifact Id ``` as shown in the picture below and click ``` Finish ```.

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?step=createNewProject4&workspaceFolder=PaymentsAPI-Java&workspaceName=PaymentsAPI&projectName=PaymentsAPI&rootNamespace=com.bankanovafx.payments.api)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its ``` pom.xml ``` file. In order to add a dependency on the *PaymentsAPI* client library, double click on the ``` pom.xml ``` file in the ``` Package Explorer ```. Opening the ``` pom.xml ``` file will render a graphical view on the cavas. Here, switch to the ``` Dependencies ``` tab and click the ``` Add ``` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?step=testProject0&workspaceFolder=PaymentsAPI-Java&workspaceName=PaymentsAPI&projectName=PaymentsAPI&rootNamespace=com.bankanovafx.payments.api)

Clicking the ``` Add ``` button will open a dialog where you need to specify PaymentsAPI in ``` Group Id ``` and PaymentsAPI in the ``` Artifact Id ``` fields. Once added click ``` OK ```. Save the ``` pom.xml ``` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject1&workspaceFolder=PaymentsAPI-Java&workspaceName=PaymentsAPI&projectName=PaymentsAPI&rootNamespace=com.bankanovafx.payments.api)

### 3. Write sample code

Once the ``` SimpleConsoleApp ``` is created, a file named ``` App.java ``` will be visible in the *Package Explorer* with a ``` main ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject2&workspaceFolder=PaymentsAPI-Java&workspaceName=PaymentsAPI&projectName=PaymentsAPI&rootNamespace=com.bankanovafx.payments.api)

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project *PaymentsAPI* from the package explorer.
2. Select "Run -> Run as -> JUnit Test" or use "Alt + Shift + X" followed by "T" to run the Tests.

## Initialization

### Authentication
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| xApiKey | API Key |



API client can be initialized as following.

```java
// Configuration parameters and credentials
String xApiKey = "xApiKey"; // API Key

PaymentsAPIClient client = new PaymentsAPIClient(xApiKey);
```


# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [PaymentsController](#payments_controller)
* [QuotesController](#quotes_controller)

## <a name="payments_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.bankanovafx.payments.api.controllers.PaymentsController") PaymentsController

### Get singleton instance

The singleton instance of the ``` PaymentsController ``` class can be accessed from the API Client.

```java
PaymentsController payments = client.getPayments();
```

### <a name="create_payment_async"></a>![Method: ](https://apidocs.io/img/method.png "com.bankanovafx.payments.api.controllers.PaymentsController.createPaymentAsync") createPaymentAsync

> Creates a new Payment


```java
void createPaymentAsync(
        final String bankId,
        final Payment body,
        final APICallBack<Payment> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| bankId |  ``` Required ```  | Bank ID (Routing Number) |
| body |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String bankId = "123456789";
    Payment body = new Payment();
    // Invoking the API call with sample inputs
    payments.createPaymentAsync(bankId, body, new APICallBack<Payment>() {
        public void onSuccess(HttpContext context, Payment response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error in Request |
| 403 | Forbidden |
| 500 | System Error |



### <a name="delete_cancel_payment_async"></a>![Method: ](https://apidocs.io/img/method.png "com.bankanovafx.payments.api.controllers.PaymentsController.deleteCancelPaymentAsync") deleteCancelPaymentAsync

> Attempts to cancel a Payment. Does not automatically cancel the linked Quote.


```java
void deleteCancelPaymentAsync(
        final String bankId,
        final int paymentId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| bankId |  ``` Required ```  | Bank ID (Routing Number) |
| paymentId |  ``` Required ```  | ID of payment to cancel |


#### Example Usage

```java
String bankId = "bankId";
int paymentId = 56;
// Invoking the API call with sample inputs
payments.deleteCancelPaymentAsync(bankId, paymentId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error in Request |
| 403 | Forbidden |
| 500 | System Error |



### <a name="create_approve_payment_async"></a>![Method: ](https://apidocs.io/img/method.png "com.bankanovafx.payments.api.controllers.PaymentsController.createApprovePaymentAsync") createApprovePaymentAsync

> Approves a Payment to be sent


```java
void createApprovePaymentAsync(
        final String bankId,
        final int paymentId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| bankId |  ``` Required ```  | Bank ID (Routing Number) |
| paymentId |  ``` Required ```  | ID of payment to approve |


#### Example Usage

```java
String bankId = "bankId";
int paymentId = 56;
// Invoking the API call with sample inputs
payments.createApprovePaymentAsync(bankId, paymentId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error in Request |
| 403 | Forbidden |
| 500 | System Error |



### <a name="get_validate_iban_async"></a>![Method: ](https://apidocs.io/img/method.png "com.bankanovafx.payments.api.controllers.PaymentsController.getValidateIbanAsync") getValidateIbanAsync

> Validates an IBAN and returns the bank account information


```java
void getValidateIbanAsync(
        final String bankId,
        final String iban,
        final APICallBack<BankAccount> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| bankId |  ``` Required ```  | Bank ID (Routing Number) |
| iban |  ``` Required ```  | Currency that is required by the client, sell foreign currency in exchange for local currency |


#### Example Usage

```java
String bankId = "123456789";
String iban = "DE89370400440532013000";
// Invoking the API call with sample inputs
payments.getValidateIbanAsync(bankId, iban, new APICallBack<BankAccount>() {
    public void onSuccess(HttpContext context, BankAccount response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error in Request |
| 403 | Forbidden |
| 500 | System Error |



### <a name="update_payment_async"></a>![Method: ](https://apidocs.io/img/method.png "com.bankanovafx.payments.api.controllers.PaymentsController.updatePaymentAsync") updatePaymentAsync

> Update the data for a Payment before it is approved or sent


```java
void updatePaymentAsync(
        final String bankId,
        final int paymentId,
        final Payment body,
        final APICallBack<Payment> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| bankId |  ``` Required ```  | Bank ID (Routing Number) |
| paymentId |  ``` Required ```  | ID of payment to cancel |
| body |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String bankId = "bankId";
    int paymentId = 56;
    Payment body = new Payment();
    // Invoking the API call with sample inputs
    payments.updatePaymentAsync(bankId, paymentId, body, new APICallBack<Payment>() {
        public void onSuccess(HttpContext context, Payment response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error in Request |
| 403 | Forbidden |
| 500 | System Error |



[Back to List of Controllers](#list_of_controllers)

## <a name="quotes_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.bankanovafx.payments.api.controllers.QuotesController") QuotesController

### Get singleton instance

The singleton instance of the ``` QuotesController ``` class can be accessed from the API Client.

```java
QuotesController quotes = client.getQuotes();
```

### <a name="create_refresh_quote_async"></a>![Method: ](https://apidocs.io/img/method.png "com.bankanovafx.payments.api.controllers.QuotesController.createRefreshQuoteAsync") createRefreshQuoteAsync

> Refresh the rates for an existing Quote


```java
void createRefreshQuoteAsync(
        final String bankId,
        final int quoteId,
        final APICallBack<Quote> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| bankId |  ``` Required ```  | Bank ID (Routing Number) |
| quoteId |  ``` Required ```  | ID of quote to refresh |


#### Example Usage

```java
String bankId = "bankId";
int quoteId = 56;
// Invoking the API call with sample inputs
quotes.createRefreshQuoteAsync(bankId, quoteId, new APICallBack<Quote>() {
    public void onSuccess(HttpContext context, Quote response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error in Request |
| 403 | Forbidden |
| 500 | System Error |



### <a name="delete_cancel_quote_async"></a>![Method: ](https://apidocs.io/img/method.png "com.bankanovafx.payments.api.controllers.QuotesController.deleteCancelQuoteAsync") deleteCancelQuoteAsync

> Attempts to cancel a Quote


```java
void deleteCancelQuoteAsync(
        final String bankId,
        final int quoteId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| bankId |  ``` Required ```  | Bank ID (Routing Number) |
| quoteId |  ``` Required ```  | ID of quote to refresh |


#### Example Usage

```java
String bankId = "bankId";
int quoteId = 56;
// Invoking the API call with sample inputs
quotes.deleteCancelQuoteAsync(bankId, quoteId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error in Request |
| 403 | Forbidden |
| 500 | System Error |



### <a name="create_lock_quote_async"></a>![Method: ](https://apidocs.io/img/method.png "com.bankanovafx.payments.api.controllers.QuotesController.createLockQuoteAsync") createLockQuoteAsync

> Lock the rate for a given Quote


```java
void createLockQuoteAsync(
        final String bankId,
        final int quoteId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| bankId |  ``` Required ```  | Bank ID (Routing Number) |
| quoteId |  ``` Required ```  | ID of quote to lock |


#### Example Usage

```java
String bankId = "bankId";
int quoteId = 56;
// Invoking the API call with sample inputs
quotes.createLockQuoteAsync(bankId, quoteId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error in Request |
| 403 | Forbidden |
| 500 | System Error |



### <a name="create_quote_async"></a>![Method: ](https://apidocs.io/img/method.png "com.bankanovafx.payments.api.controllers.QuotesController.createQuoteAsync") createQuoteAsync

> Create new Quote


```java
void createQuoteAsync(
        final String bankId,
        final Quote body,
        final APICallBack<Quote> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| bankId |  ``` Required ```  | Bank ID (Routing Number) |
| body |  ``` Required ```  | Quote data |


#### Example Usage

```java
try {
    String bankId = "123456789";
    String bodyValue = "{   \"beneficiaryAmount\": 12345.67,   \"beneficiaryCurrency\": \"EUR\" }";
    Quote body = mapper.readValue(bodyValue,new TypeReference<Quote> (){});
    // Invoking the API call with sample inputs
    quotes.createQuoteAsync(bankId, body, new APICallBack<Quote>() {
        public void onSuccess(HttpContext context, Quote response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error in Request |
| 403 | Forbidden |
| 500 | System Error |



[Back to List of Controllers](#list_of_controllers)



