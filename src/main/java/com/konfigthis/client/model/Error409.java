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
import com.konfigthis.client.model.ErrorDetails;
import com.konfigthis.client.model.ErrorLinkDescription;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * The server has detected a conflict while processing this request.
 */
@ApiModel(description = "The server has detected a conflict while processing this request.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Error409 {
  /**
   * Gets or Sets name
   */
  @JsonAdapter(NameEnum.Adapter.class)
 public enum NameEnum {
    RESOURCE_CONFLICT("RESOURCE_CONFLICT");

    private String value;

    NameEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NameEnum fromValue(String value) {
      for (NameEnum b : NameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NameEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NameEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NameEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private NameEnum name;

  /**
   * Gets or Sets message
   */
  @JsonAdapter(MessageEnum.Adapter.class)
 public enum MessageEnum {
    THE_SERVER_HAS_DETECTED_A_CONFLICT_WHILE_PROCESSING_THIS_REQUEST_("The server has detected a conflict while processing this request.");

    private String value;

    MessageEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MessageEnum fromValue(String value) {
      for (MessageEnum b : MessageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MessageEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MessageEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MessageEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MessageEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private MessageEnum message;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private List<ErrorDetails> details = null;

  public static final String SERIALIZED_NAME_DEBUG_ID = "debug_id";
  @SerializedName(SERIALIZED_NAME_DEBUG_ID)
  private String debugId;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<ErrorLinkDescription> links = null;

  public Error409() {
  }

  public Error409 name(NameEnum name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NameEnum getName() {
    return name;
  }


  public void setName(NameEnum name) {
    
    
    
    this.name = name;
  }


  public Error409 message(MessageEnum message) {
    
    
    
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MessageEnum getMessage() {
    return message;
  }


  public void setMessage(MessageEnum message) {
    
    
    
    this.message = message;
  }


  public Error409 details(List<ErrorDetails> details) {
    
    
    
    
    this.details = details;
    return this;
  }

  public Error409 addDetailsItem(ErrorDetails detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ErrorDetails> getDetails() {
    return details;
  }


  public void setDetails(List<ErrorDetails> details) {
    
    
    
    this.details = details;
  }


  public Error409 debugId(String debugId) {
    
    
    
    
    this.debugId = debugId;
    return this;
  }

   /**
   * The PayPal internal ID. Used for correlation purposes.
   * @return debugId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The PayPal internal ID. Used for correlation purposes.")

  public String getDebugId() {
    return debugId;
  }


  public void setDebugId(String debugId) {
    
    
    
    this.debugId = debugId;
  }


  public Error409 links(List<ErrorLinkDescription> links) {
    
    
    
    
    this.links = links;
    return this;
  }

  public Error409 addLinksItem(ErrorLinkDescription linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * An array of request-related [HATEOAS links](https://en.wikipedia.org/wiki/HATEOAS).
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of request-related [HATEOAS links](https://en.wikipedia.org/wiki/HATEOAS).")

  public List<ErrorLinkDescription> getLinks() {
    return links;
  }


  public void setLinks(List<ErrorLinkDescription> links) {
    
    
    
    this.links = links;
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
   * @return the Error409 instance itself
   */
  public Error409 putAdditionalProperty(String key, Object value) {
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
    Error409 error409 = (Error409) o;
    return Objects.equals(this.name, error409.name) &&
        Objects.equals(this.message, error409.message) &&
        Objects.equals(this.details, error409.details) &&
        Objects.equals(this.debugId, error409.debugId) &&
        Objects.equals(this.links, error409.links)&&
        Objects.equals(this.additionalProperties, error409.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, message, details, debugId, links, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error409 {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    debugId: ").append(toIndentedString(debugId)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("message");
    openapiFields.add("details");
    openapiFields.add("debug_id");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Error409
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Error409.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Error409 is not found in the empty JSON string", Error409.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if (jsonObj.get("details") != null && !jsonObj.get("details").isJsonNull()) {
        JsonArray jsonArraydetails = jsonObj.getAsJsonArray("details");
        if (jsonArraydetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("details").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `details` to be an array in the JSON string but got `%s`", jsonObj.get("details").toString()));
          }

          // validate the optional field `details` (array)
          for (int i = 0; i < jsonArraydetails.size(); i++) {
            ErrorDetails.validateJsonObject(jsonArraydetails.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("debug_id") != null && !jsonObj.get("debug_id").isJsonNull()) && !jsonObj.get("debug_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `debug_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("debug_id").toString()));
      }
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonNull()) {
        JsonArray jsonArraylinks = jsonObj.getAsJsonArray("links");
        if (jsonArraylinks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("links").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `links` to be an array in the JSON string but got `%s`", jsonObj.get("links").toString()));
          }

          // validate the optional field `links` (array)
          for (int i = 0; i < jsonArraylinks.size(); i++) {
            ErrorLinkDescription.validateJsonObject(jsonArraylinks.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Error409.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Error409' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Error409> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Error409.class));

       return (TypeAdapter<T>) new TypeAdapter<Error409>() {
           @Override
           public void write(JsonWriter out, Error409 value) throws IOException {
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
           public Error409 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Error409 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Error409 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Error409
  * @throws IOException if the JSON string is invalid with respect to Error409
  */
  public static Error409 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Error409.class);
  }

 /**
  * Convert an instance of Error409 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

