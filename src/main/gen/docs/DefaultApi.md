# DefaultApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**procesarTextoPost**](DefaultApi.md#procesarTextoPost) | **POST** /procesarTexto | Procesa el texto de entrada y devuelve el resultado formateado. |


<a name="procesarTextoPost"></a>
# **procesarTextoPost**
> List&lt;ProcesarTextoPost200ResponseInner&gt; procesarTextoPost(procesarTextoPostRequest)

Procesa el texto de entrada y devuelve el resultado formateado.

Recibe un texto con líneas de números y frases, procesa y devuelve las frases en minúsculas y con un booleano que indica si la cantidad de palabras coincide con el número dado.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    ProcesarTextoPostRequest procesarTextoPostRequest = new ProcesarTextoPostRequest(); // ProcesarTextoPostRequest | 
    try {
      List<ProcesarTextoPost200ResponseInner> result = apiInstance.procesarTextoPost(procesarTextoPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#procesarTextoPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **procesarTextoPostRequest** | [**ProcesarTextoPostRequest**](ProcesarTextoPostRequest.md)|  | |

### Return type

[**List&lt;ProcesarTextoPost200ResponseInner&gt;**](ProcesarTextoPost200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Procesamiento exitoso del texto |  -  |
| **400** | Solicitud mal formada o con formato incorrecto |  -  |

