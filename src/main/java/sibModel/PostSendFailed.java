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
 * PostSendFailed
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-02T23:12:13.151+05:30")
public class PostSendFailed {
  @SerializedName("code")
  private Long code = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("unexistingEmails")
  private List<String> unexistingEmails = null;

  @SerializedName("withoutListEmails")
  private List<String> withoutListEmails = null;

  @SerializedName("blackListedEmails")
  private List<String> blackListedEmails = null;

  public PostSendFailed code(Long code) {
    this.code = code;
    return this;
  }

   /**
   * Response code
   * @return code
  **/
  @ApiModelProperty(example = "invalid_parameter", required = true, value = "Response code")
  public Long getCode() {
    return code;
  }

  public void setCode(Long code) {
    this.code = code;
  }

  public PostSendFailed message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Response message
   * @return message
  **/
  @ApiModelProperty(example = "The email could not be sent to all recipients", required = true, value = "Response message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public PostSendFailed unexistingEmails(List<String> unexistingEmails) {
    this.unexistingEmails = unexistingEmails;
    return this;
  }

  public PostSendFailed addUnexistingEmailsItem(String unexistingEmailsItem) {
    if (this.unexistingEmails == null) {
      this.unexistingEmails = new ArrayList<String>();
    }
    this.unexistingEmails.add(unexistingEmailsItem);
    return this;
  }

   /**
   * Get unexistingEmails
   * @return unexistingEmails
  **/
  @ApiModelProperty(value = "")
  public List<String> getUnexistingEmails() {
    return unexistingEmails;
  }

  public void setUnexistingEmails(List<String> unexistingEmails) {
    this.unexistingEmails = unexistingEmails;
  }

  public PostSendFailed withoutListEmails(List<String> withoutListEmails) {
    this.withoutListEmails = withoutListEmails;
    return this;
  }

  public PostSendFailed addWithoutListEmailsItem(String withoutListEmailsItem) {
    if (this.withoutListEmails == null) {
      this.withoutListEmails = new ArrayList<String>();
    }
    this.withoutListEmails.add(withoutListEmailsItem);
    return this;
  }

   /**
   * Get withoutListEmails
   * @return withoutListEmails
  **/
  @ApiModelProperty(value = "")
  public List<String> getWithoutListEmails() {
    return withoutListEmails;
  }

  public void setWithoutListEmails(List<String> withoutListEmails) {
    this.withoutListEmails = withoutListEmails;
  }

  public PostSendFailed blackListedEmails(List<String> blackListedEmails) {
    this.blackListedEmails = blackListedEmails;
    return this;
  }

  public PostSendFailed addBlackListedEmailsItem(String blackListedEmailsItem) {
    if (this.blackListedEmails == null) {
      this.blackListedEmails = new ArrayList<String>();
    }
    this.blackListedEmails.add(blackListedEmailsItem);
    return this;
  }

   /**
   * Get blackListedEmails
   * @return blackListedEmails
  **/
  @ApiModelProperty(value = "")
  public List<String> getBlackListedEmails() {
    return blackListedEmails;
  }

  public void setBlackListedEmails(List<String> blackListedEmails) {
    this.blackListedEmails = blackListedEmails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostSendFailed postSendFailed = (PostSendFailed) o;
    return Objects.equals(this.code, postSendFailed.code) &&
        Objects.equals(this.message, postSendFailed.message) &&
        Objects.equals(this.unexistingEmails, postSendFailed.unexistingEmails) &&
        Objects.equals(this.withoutListEmails, postSendFailed.withoutListEmails) &&
        Objects.equals(this.blackListedEmails, postSendFailed.blackListedEmails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, unexistingEmails, withoutListEmails, blackListedEmails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostSendFailed {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    unexistingEmails: ").append(toIndentedString(unexistingEmails)).append("\n");
    sb.append("    withoutListEmails: ").append(toIndentedString(withoutListEmails)).append("\n");
    sb.append("    blackListedEmails: ").append(toIndentedString(blackListedEmails)).append("\n");
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

