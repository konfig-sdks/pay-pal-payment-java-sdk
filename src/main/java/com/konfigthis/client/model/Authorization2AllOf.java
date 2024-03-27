/*
 * Payments
 * Call the Payments API to authorize payments, capture authorized payments, refund payments that have already been captured, and show payment information. Use the Payments API in conjunction with the <a href=\"/docs/api/orders/v2/\">Orders API</a>. For more information, see the <a href=\"/docs/checkout/\">PayPal Checkout Overview</a>.
 *
 * The version of the OpenAPI document: 2.5
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.PayeeBase;
import com.konfigthis.client.model.SupplementaryData;
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
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * Authorization2AllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Authorization2AllOf {
  public static final String SERIALIZED_NAME_SUPPLEMENTARY_DATA = "supplementary_data";
  @SerializedName(SERIALIZED_NAME_SUPPLEMENTARY_DATA)
  private SupplementaryData supplementaryData;

  public static final String SERIALIZED_NAME_PAYEE = "payee";
  @SerializedName(SERIALIZED_NAME_PAYEE)
  private PayeeBase payee;

  public Authorization2AllOf() {
  }

  public Authorization2AllOf supplementaryData(SupplementaryData supplementaryData) {
    
    
    
    
    this.supplementaryData = supplementaryData;
    return this;
  }

   /**
   * Get supplementaryData
   * @return supplementaryData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SupplementaryData getSupplementaryData() {
    return supplementaryData;
  }


  public void setSupplementaryData(SupplementaryData supplementaryData) {
    
    
    
    this.supplementaryData = supplementaryData;
  }


  public Authorization2AllOf payee(PayeeBase payee) {
    
    
    
    
    this.payee = payee;
    return this;
  }

   /**
   * Get payee
   * @return payee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PayeeBase getPayee() {
    return payee;
  }


  public void setPayee(PayeeBase payee) {
    
    
    
    this.payee = payee;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the Authorization2AllOf instance itself
   */
  public Authorization2AllOf putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Authorization2AllOf authorization2AllOf = (Authorization2AllOf) o;
    return Objects.equals(this.supplementaryData, authorization2AllOf.supplementaryData) &&
        Objects.equals(this.payee, authorization2AllOf.payee)&&
        Objects.equals(this.additionalProperties, authorization2AllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supplementaryData, payee, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Authorization2AllOf {\n");
    sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
    sb.append("    payee: ").append(toIndentedString(payee)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("supplementary_data");
    openapiFields.add("payee");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Authorization2AllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Authorization2AllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Authorization2AllOf is not found in the empty JSON string", Authorization2AllOf.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `supplementary_data`
      if (jsonObj.get("supplementary_data") != null && !jsonObj.get("supplementary_data").isJsonNull()) {
        SupplementaryData.validateJsonObject(jsonObj.getAsJsonObject("supplementary_data"));
      }
      // validate the optional field `payee`
      if (jsonObj.get("payee") != null && !jsonObj.get("payee").isJsonNull()) {
        PayeeBase.validateJsonObject(jsonObj.getAsJsonObject("payee"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Authorization2AllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Authorization2AllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Authorization2AllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Authorization2AllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<Authorization2AllOf>() {
           @Override
           public void write(JsonWriter out, Authorization2AllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public Authorization2AllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Authorization2AllOf instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Authorization2AllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Authorization2AllOf
  * @throws IOException if the JSON string is invalid with respect to Authorization2AllOf
  */
  public static Authorization2AllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Authorization2AllOf.class);
  }

 /**
  * Convert an instance of Authorization2AllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

