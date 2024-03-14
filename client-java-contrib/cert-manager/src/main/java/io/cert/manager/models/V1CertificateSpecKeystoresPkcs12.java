/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.21.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.cert.manager.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.cert.manager.models.V1CertificateSpecKeystoresPkcs12PasswordSecretRef;
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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * PKCS12 configures options for storing a PKCS12 keystore in the &#x60;spec.secretName&#x60; Secret resource.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-01T07:00:20.132973Z[Etc/UTC]")
public class V1CertificateSpecKeystoresPkcs12 {
  public static final String SERIALIZED_NAME_CREATE = "create";
  @SerializedName(SERIALIZED_NAME_CREATE)
  private Boolean create;

  public static final String SERIALIZED_NAME_PASSWORD_SECRET_REF = "passwordSecretRef";
  @SerializedName(SERIALIZED_NAME_PASSWORD_SECRET_REF)
  private V1CertificateSpecKeystoresPkcs12PasswordSecretRef passwordSecretRef;

  public V1CertificateSpecKeystoresPkcs12() {
  }

  public V1CertificateSpecKeystoresPkcs12 create(Boolean create) {
    
    this.create = create;
    return this;
  }

   /**
   * Create enables PKCS12 keystore creation for the Certificate. If true, a file named &#x60;keystore.p12&#x60; will be created in the target Secret resource, encrypted using the password stored in &#x60;passwordSecretRef&#x60;. The keystore file will be updated immediately. If the issuer provided a CA certificate, a file named &#x60;truststore.p12&#x60; will also be created in the target Secret resource, encrypted using the password stored in &#x60;passwordSecretRef&#x60; containing the issuing Certificate Authority
   * @return create
  **/
  @jakarta.annotation.Nonnull
  public Boolean getCreate() {
    return create;
  }


  public void setCreate(Boolean create) {
    this.create = create;
  }


  public V1CertificateSpecKeystoresPkcs12 passwordSecretRef(V1CertificateSpecKeystoresPkcs12PasswordSecretRef passwordSecretRef) {
    
    this.passwordSecretRef = passwordSecretRef;
    return this;
  }

   /**
   * Get passwordSecretRef
   * @return passwordSecretRef
  **/
  @jakarta.annotation.Nonnull
  public V1CertificateSpecKeystoresPkcs12PasswordSecretRef getPasswordSecretRef() {
    return passwordSecretRef;
  }


  public void setPasswordSecretRef(V1CertificateSpecKeystoresPkcs12PasswordSecretRef passwordSecretRef) {
    this.passwordSecretRef = passwordSecretRef;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CertificateSpecKeystoresPkcs12 v1CertificateSpecKeystoresPkcs12 = (V1CertificateSpecKeystoresPkcs12) o;
    return Objects.equals(this.create, v1CertificateSpecKeystoresPkcs12.create) &&
        Objects.equals(this.passwordSecretRef, v1CertificateSpecKeystoresPkcs12.passwordSecretRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(create, passwordSecretRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CertificateSpecKeystoresPkcs12 {\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    passwordSecretRef: ").append(toIndentedString(passwordSecretRef)).append("\n");
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
    openapiFields.add("create");
    openapiFields.add("passwordSecretRef");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("create");
    openapiRequiredFields.add("passwordSecretRef");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1CertificateSpecKeystoresPkcs12
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1CertificateSpecKeystoresPkcs12.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1CertificateSpecKeystoresPkcs12 is not found in the empty JSON string", V1CertificateSpecKeystoresPkcs12.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1CertificateSpecKeystoresPkcs12.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1CertificateSpecKeystoresPkcs12` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1CertificateSpecKeystoresPkcs12.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `passwordSecretRef`
      V1CertificateSpecKeystoresPkcs12PasswordSecretRef.validateJsonObject(jsonObj.getAsJsonObject("passwordSecretRef"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1CertificateSpecKeystoresPkcs12.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1CertificateSpecKeystoresPkcs12' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1CertificateSpecKeystoresPkcs12> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1CertificateSpecKeystoresPkcs12.class));

       return (TypeAdapter<T>) new TypeAdapter<V1CertificateSpecKeystoresPkcs12>() {
           @Override
           public void write(JsonWriter out, V1CertificateSpecKeystoresPkcs12 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1CertificateSpecKeystoresPkcs12 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1CertificateSpecKeystoresPkcs12 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1CertificateSpecKeystoresPkcs12
  * @throws IOException if the JSON string is invalid with respect to V1CertificateSpecKeystoresPkcs12
  */
  public static V1CertificateSpecKeystoresPkcs12 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1CertificateSpecKeystoresPkcs12.class);
  }

 /**
  * Convert an instance of V1CertificateSpecKeystoresPkcs12 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
