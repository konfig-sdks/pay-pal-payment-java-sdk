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
import com.konfigthis.client.model.Money;
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
 * Reauthorizes an authorized PayPal account payment, by ID. To ensure that funds are still available, reauthorize a payment after its initial three-day honor period expires. You can reauthorize a payment only once from days four to 29.&lt;br/&gt;&lt;br/&gt;If 30 days have transpired since the date of the original authorization, you must create an authorized payment instead of reauthorizing the original authorized payment.&lt;br/&gt;&lt;br/&gt;A reauthorized payment itself has a new honor period of three days.&lt;br/&gt;&lt;br/&gt;You can reauthorize an authorized payment once. The allowed amount depends on context and geography, for example in US it is up to 115% of the original authorized amount, not to exceed an increase of $75 USD.&lt;br/&gt;&lt;br/&gt;Supports only the &#x60;amount&#x60; request parameter.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; This request is currently not supported for Partner use cases.&lt;/blockquote&gt;
 */
@ApiModel(description = "Reauthorizes an authorized PayPal account payment, by ID. To ensure that funds are still available, reauthorize a payment after its initial three-day honor period expires. You can reauthorize a payment only once from days four to 29.<br/><br/>If 30 days have transpired since the date of the original authorization, you must create an authorized payment instead of reauthorizing the original authorized payment.<br/><br/>A reauthorized payment itself has a new honor period of three days.<br/><br/>You can reauthorize an authorized payment once. The allowed amount depends on context and geography, for example in US it is up to 115% of the original authorized amount, not to exceed an increase of $75 USD.<br/><br/>Supports only the `amount` request parameter.<blockquote><strong>Note:</strong> This request is currently not supported for Partner use cases.</blockquote>")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ReauthorizeRequest {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Money amount;

  public ReauthorizeRequest() {
  }

  public ReauthorizeRequest amount(Money amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Money getAmount() {
    return amount;
  }


  public void setAmount(Money amount) {
    
    
    
    this.amount = amount;
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
   * @return the ReauthorizeRequest instance itself
   */
  public ReauthorizeRequest putAdditionalProperty(String key, Object value) {
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
    ReauthorizeRequest reauthorizeRequest = (ReauthorizeRequest) o;
    return Objects.equals(this.amount, reauthorizeRequest.amount)&&
        Objects.equals(this.additionalProperties, reauthorizeRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReauthorizeRequest {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
    openapiFields.add("amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReauthorizeRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReauthorizeRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReauthorizeRequest is not found in the empty JSON string", ReauthorizeRequest.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `amount`
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonNull()) {
        Money.validateJsonObject(jsonObj.getAsJsonObject("amount"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReauthorizeRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReauthorizeRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReauthorizeRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReauthorizeRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ReauthorizeRequest>() {
           @Override
           public void write(JsonWriter out, ReauthorizeRequest value) throws IOException {
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
           public ReauthorizeRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ReauthorizeRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ReauthorizeRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReauthorizeRequest
  * @throws IOException if the JSON string is invalid with respect to ReauthorizeRequest
  */
  public static ReauthorizeRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReauthorizeRequest.class);
  }

 /**
  * Convert an instance of ReauthorizeRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

