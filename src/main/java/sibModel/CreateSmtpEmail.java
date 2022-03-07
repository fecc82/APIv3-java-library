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
import java.util.ArrayList;
import java.util.List;

/**
 * CreateSmtpEmail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-02T23:12:13.151+05:30")
public class CreateSmtpEmail {
  @SerializedName("messageId")
  private String messageId = null;

  @SerializedName("messageIds")
  private List<String> messageIds = null;

  public CreateSmtpEmail messageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

   /**
   * Message ID of the transactional email sent
   * @return messageId
  **/
  @ApiModelProperty(example = "<201798300811.5787683@relay.domain.com>", value = "Message ID of the transactional email sent")
  public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public CreateSmtpEmail messageIds(List<String> messageIds) {
    this.messageIds = messageIds;
    return this;
  }

  public CreateSmtpEmail addMessageIdsItem(String messageIdsItem) {
    if (this.messageIds == null) {
      this.messageIds = new ArrayList<String>();
    }
    this.messageIds.add(messageIdsItem);
    return this;
  }

   /**
   * Get messageIds
   * @return messageIds
  **/
  @ApiModelProperty(value = "")
  public List<String> getMessageIds() {
    return messageIds;
  }

  public void setMessageIds(List<String> messageIds) {
    this.messageIds = messageIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSmtpEmail createSmtpEmail = (CreateSmtpEmail) o;
    return Objects.equals(this.messageId, createSmtpEmail.messageId) &&
        Objects.equals(this.messageIds, createSmtpEmail.messageIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageId, messageIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSmtpEmail {\n");
    
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    messageIds: ").append(toIndentedString(messageIds)).append("\n");
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

