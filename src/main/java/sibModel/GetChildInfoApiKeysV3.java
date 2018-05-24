/*
 * SendinBlue API
 * SendinBlue provide a RESTFul API that can be used with any languages. With this API, you will be able to :   - Manage your campaigns and get the statistics   - Manage your contacts   - Send transactional Emails and SMS   - and much more...  You can download our wrappers at https://github.com/orgs/sendinblue  **Possible responses**   | Code | Message |   | :-------------: | ------------- |   | 200  | OK. Successful Request  |   | 201  | OK. Successful Creation |   | 202  | OK. Request accepted |   | 204  | OK. Successful Update/Deletion  |   | 400  | Error. Bad Request  |   | 401  | Error. Authentication Needed  |   | 402  | Error. Not enough credit, plan upgrade needed  |   | 403  | Error. Permission denied  |   | 404  | Error. Object does not exist |   | 405  | Error. Method not allowed  | 
 *
 * OpenAPI spec version: 3.0.0
 * Contact: contact@sendinblue.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package sibModel;

import org.apache.commons.lang3.ObjectUtils;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GetChildInfoApiKeysV3
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-24T12:07:09.251+05:30")
public class GetChildInfoApiKeysV3 {
  @SerializedName("name")
  private String name = null;

  @SerializedName("key")
  private String key = null;

  public GetChildInfoApiKeysV3 name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the key for version 3
   * @return name
  **/
  @ApiModelProperty(example = "N˚3", required = true, value = "Name of the key for version 3")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetChildInfoApiKeysV3 key(String key) {
    this.key = key;
    return this;
  }

   /**
   * API Key for version 3
   * @return key
  **/
  @ApiModelProperty(example = "xkeysib-21881axxxxxcc92e04-mIrexxxx7z", required = true, value = "API Key for version 3")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    GetChildInfoApiKeysV3 getChildInfoApiKeysV3 = (GetChildInfoApiKeysV3) o;
    return ObjectUtils.equals(this.name, getChildInfoApiKeysV3.name) &&
    ObjectUtils.equals(this.key, getChildInfoApiKeysV3.key);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(name, key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetChildInfoApiKeysV3 {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

