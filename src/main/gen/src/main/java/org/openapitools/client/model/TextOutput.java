/*
 * API de Procesamiento de Texto
 * API para procesar texto con la lógica de los requerimientos definidos.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: tu.email@dominio.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * TextOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-28T20:42:23.045300-05:00[America/Bogota]")
public class TextOutput {
  public static final String SERIALIZED_NAME_PROCESSED_TEXT = "processedText";
  @SerializedName(SERIALIZED_NAME_PROCESSED_TEXT)
  private String processedText;

  public static final String SERIALIZED_NAME_IS_WORD_COUNT_MATCH = "isWordCountMatch";
  @SerializedName(SERIALIZED_NAME_IS_WORD_COUNT_MATCH)
  private Boolean isWordCountMatch;

  public TextOutput() {
  }

  public TextOutput processedText(String processedText) {
    
    this.processedText = processedText;
    return this;
  }

   /**
   * La frase procesada
   * @return processedText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "La frase procesada")

  public String getProcessedText() {
    return processedText;
  }


  public void setProcessedText(String processedText) {
    this.processedText = processedText;
  }


  public TextOutput isWordCountMatch(Boolean isWordCountMatch) {
    
    this.isWordCountMatch = isWordCountMatch;
    return this;
  }

   /**
   * Indica si el número de palabras coincide con el número dado en la entrada
   * @return isWordCountMatch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indica si el número de palabras coincide con el número dado en la entrada")

  public Boolean getIsWordCountMatch() {
    return isWordCountMatch;
  }


  public void setIsWordCountMatch(Boolean isWordCountMatch) {
    this.isWordCountMatch = isWordCountMatch;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextOutput textOutput = (TextOutput) o;
    return Objects.equals(this.processedText, textOutput.processedText) &&
        Objects.equals(this.isWordCountMatch, textOutput.isWordCountMatch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processedText, isWordCountMatch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextOutput {\n");
    sb.append("    processedText: ").append(toIndentedString(processedText)).append("\n");
    sb.append("    isWordCountMatch: ").append(toIndentedString(isWordCountMatch)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("processedText");
    openapiFields.add("isWordCountMatch");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TextOutput
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TextOutput.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TextOutput is not found in the empty JSON string", TextOutput.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TextOutput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TextOutput` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("processedText") != null && !jsonObj.get("processedText").isJsonNull()) && !jsonObj.get("processedText").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `processedText` to be a primitive type in the JSON string but got `%s`", jsonObj.get("processedText").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TextOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TextOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TextOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TextOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<TextOutput>() {
           @Override
           public void write(JsonWriter out, TextOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TextOutput read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TextOutput given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TextOutput
  * @throws IOException if the JSON string is invalid with respect to TextOutput
  */
  public static TextOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TextOutput.class);
  }

 /**
  * Convert an instance of TextOutput to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

