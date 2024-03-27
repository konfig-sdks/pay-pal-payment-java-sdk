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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The card network or brand. Applies to credit, debit, gift, and payment cards.
 */
@JsonAdapter(CardBrand.Adapter.class)public enum CardBrand {
  
  VISA("VISA"),
  
  MASTERCARD("MASTERCARD"),
  
  DISCOVER("DISCOVER"),
  
  AMEX("AMEX"),
  
  SOLO("SOLO"),
  
  JCB("JCB"),
  
  STAR("STAR"),
  
  DELTA("DELTA"),
  
  SWITCH("SWITCH"),
  
  MAESTRO("MAESTRO"),
  
  CB_NATIONALE("CB_NATIONALE"),
  
  CONFIGOGA("CONFIGOGA"),
  
  CONFIDIS("CONFIDIS"),
  
  ELECTRON("ELECTRON"),
  
  CETELEM("CETELEM"),
  
  CHINA_UNION_PAY("CHINA_UNION_PAY");

  private String value;

  CardBrand(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CardBrand fromValue(String value) {
    for (CardBrand b : CardBrand.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CardBrand> {
    @Override
    public void write(final JsonWriter jsonWriter, final CardBrand enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CardBrand read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CardBrand.fromValue(value);
    }
  }
}

