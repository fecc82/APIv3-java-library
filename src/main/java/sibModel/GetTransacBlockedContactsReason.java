/*
 * SendinBlue API
 * SendinBlue provide a RESTFul API that can be used with any languages. With this API, you will be able to :   - Manage your campaigns and get the statistics   - Manage your contacts   - Send transactional Emails and SMS   - and much more...  You can download our wrappers at https://github.com/orgs/sendinblue  **Possible responses**   | Code | Message |   | :-------------: | ------------- |   | 200  | OK. Successful Request  |   | 201  | OK. Successful Creation |   | 202  | OK. Request accepted |   | 204  | OK. Successful Update/Deletion  |   | 400  | Error. Bad Request  |   | 401  | Error. Authentication Needed  |   | 402  | Error. Not enough credit, plan upgrade needed  |   | 403  | Error. Permission denied  |   | 404  | Error. Object does not exist |   | 405  | Error. Method not allowed  |   | 406  | Error. Not Acceptable  | 
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
 * Reason for blocking / unsubscribing
 */
@ApiModel(description = "Reason for blocking / unsubscribing")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-23T17:54:09.105+05:30")
public class GetTransacBlockedContactsReason {
  /**
   * Reason code for blocking / unsubscribing (This code is safe for comparison)
   */
  @JsonAdapter(CodeEnum.Adapter.class)
  public enum CodeEnum {
    UNSUBSCRIBEDVIAMA("unsubscribedViaMA"),
    
    UNSUBSCRIBEDVIAEMAIL("unsubscribedViaEmail"),
    
    ADMINBLOCKED("adminBlocked"),
    
    UNSUBSCRIBEDVIAAPI("unsubscribedViaApi"),
    
    HARDBOUNCE("hardBounce"),
    
    CONTACTFLAGGEDASSPAM("contactFlaggedAsSpam");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CodeEnum fromValue(String text) {
      for (CodeEnum b : CodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CodeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CodeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("code")
  private CodeEnum code = null;

  @SerializedName("message")
  private String message = null;

  public GetTransacBlockedContactsReason code(CodeEnum code) {
    this.code = code;
    return this;
  }

   /**
   * Reason code for blocking / unsubscribing (This code is safe for comparison)
   * @return code
  **/
  @ApiModelProperty(example = "AdminBlocked", value = "Reason code for blocking / unsubscribing (This code is safe for comparison)")
  public CodeEnum getCode() {
    return code;
  }

  public void setCode(CodeEnum code) {
    this.code = code;
  }

  public GetTransacBlockedContactsReason message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Reason for blocking / unsubscribing (This string is not safe for comparison)
   * @return message
  **/
  @ApiModelProperty(example = "Admin blocked", value = "Reason for blocking / unsubscribing (This string is not safe for comparison)")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    GetTransacBlockedContactsReason getTransacBlockedContactsReason = (GetTransacBlockedContactsReason) o;
    return ObjectUtils.equals(this.code, getTransacBlockedContactsReason.code) &&
    ObjectUtils.equals(this.message, getTransacBlockedContactsReason.message);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(code, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTransacBlockedContactsReason {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
