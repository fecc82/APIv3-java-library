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
 * GetContactDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-02T23:12:13.151+05:30")
public class GetContactDetails {
  @SerializedName("email")
  private String email = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("emailBlacklisted")
  private Boolean emailBlacklisted = null;

  @SerializedName("smsBlacklisted")
  private Boolean smsBlacklisted = null;

  @SerializedName("createdAt")
  private String createdAt = null;

  @SerializedName("modifiedAt")
  private String modifiedAt = null;

  @SerializedName("listIds")
  private List<Long> listIds = new ArrayList<Long>();

  @SerializedName("listUnsubscribed")
  private List<Long> listUnsubscribed = null;

  @SerializedName("attributes")
  private Object attributes = null;

  public GetContactDetails email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email address of the contact for which you requested the details
   * @return email
  **/
  @ApiModelProperty(example = "john.smith@example.com", required = true, value = "Email address of the contact for which you requested the details")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public GetContactDetails id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the contact for which you requested the details
   * @return id
  **/
  @ApiModelProperty(example = "32", required = true, value = "ID of the contact for which you requested the details")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GetContactDetails emailBlacklisted(Boolean emailBlacklisted) {
    this.emailBlacklisted = emailBlacklisted;
    return this;
  }

   /**
   * Blacklist status for email campaigns (true&#x3D;blacklisted, false&#x3D;not blacklisted)
   * @return emailBlacklisted
  **/
  @ApiModelProperty(example = "false", required = true, value = "Blacklist status for email campaigns (true=blacklisted, false=not blacklisted)")
  public Boolean isEmailBlacklisted() {
    return emailBlacklisted;
  }

  public void setEmailBlacklisted(Boolean emailBlacklisted) {
    this.emailBlacklisted = emailBlacklisted;
  }

  public GetContactDetails smsBlacklisted(Boolean smsBlacklisted) {
    this.smsBlacklisted = smsBlacklisted;
    return this;
  }

   /**
   * Blacklist status for SMS campaigns (true&#x3D;blacklisted, false&#x3D;not blacklisted)
   * @return smsBlacklisted
  **/
  @ApiModelProperty(example = "true", required = true, value = "Blacklist status for SMS campaigns (true=blacklisted, false=not blacklisted)")
  public Boolean isSmsBlacklisted() {
    return smsBlacklisted;
  }

  public void setSmsBlacklisted(Boolean smsBlacklisted) {
    this.smsBlacklisted = smsBlacklisted;
  }

  public GetContactDetails createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Creation UTC date-time of the contact (YYYY-MM-DDTHH:mm:ss.SSSZ)
   * @return createdAt
  **/
  @ApiModelProperty(example = "2017-05-12T12:30:00Z", required = true, value = "Creation UTC date-time of the contact (YYYY-MM-DDTHH:mm:ss.SSSZ)")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public GetContactDetails modifiedAt(String modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

   /**
   * Last modification UTC date-time of the contact (YYYY-MM-DDTHH:mm:ss.SSSZ)
   * @return modifiedAt
  **/
  @ApiModelProperty(example = "2017-05-12T12:30:00Z", required = true, value = "Last modification UTC date-time of the contact (YYYY-MM-DDTHH:mm:ss.SSSZ)")
  public String getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(String modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public GetContactDetails listIds(List<Long> listIds) {
    this.listIds = listIds;
    return this;
  }

  public GetContactDetails addListIdsItem(Long listIdsItem) {
    this.listIds.add(listIdsItem);
    return this;
  }

   /**
   * Get listIds
   * @return listIds
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Long> getListIds() {
    return listIds;
  }

  public void setListIds(List<Long> listIds) {
    this.listIds = listIds;
  }

  public GetContactDetails listUnsubscribed(List<Long> listUnsubscribed) {
    this.listUnsubscribed = listUnsubscribed;
    return this;
  }

  public GetContactDetails addListUnsubscribedItem(Long listUnsubscribedItem) {
    if (this.listUnsubscribed == null) {
      this.listUnsubscribed = new ArrayList<Long>();
    }
    this.listUnsubscribed.add(listUnsubscribedItem);
    return this;
  }

   /**
   * Get listUnsubscribed
   * @return listUnsubscribed
  **/
  @ApiModelProperty(value = "")
  public List<Long> getListUnsubscribed() {
    return listUnsubscribed;
  }

  public void setListUnsubscribed(List<Long> listUnsubscribed) {
    this.listUnsubscribed = listUnsubscribed;
  }

  public GetContactDetails attributes(Object attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Set of attributes of the contact
   * @return attributes
  **/
  @ApiModelProperty(example = "{\"name\":\"Joe\",\"email\":\"joe@example.com\"}", required = true, value = "Set of attributes of the contact")
  public Object getAttributes() {
    return attributes;
  }

  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetContactDetails getContactDetails = (GetContactDetails) o;
    return Objects.equals(this.email, getContactDetails.email) &&
        Objects.equals(this.id, getContactDetails.id) &&
        Objects.equals(this.emailBlacklisted, getContactDetails.emailBlacklisted) &&
        Objects.equals(this.smsBlacklisted, getContactDetails.smsBlacklisted) &&
        Objects.equals(this.createdAt, getContactDetails.createdAt) &&
        Objects.equals(this.modifiedAt, getContactDetails.modifiedAt) &&
        Objects.equals(this.listIds, getContactDetails.listIds) &&
        Objects.equals(this.listUnsubscribed, getContactDetails.listUnsubscribed) &&
        Objects.equals(this.attributes, getContactDetails.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, id, emailBlacklisted, smsBlacklisted, createdAt, modifiedAt, listIds, listUnsubscribed, attributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetContactDetails {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    emailBlacklisted: ").append(toIndentedString(emailBlacklisted)).append("\n");
    sb.append("    smsBlacklisted: ").append(toIndentedString(smsBlacklisted)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    listIds: ").append(toIndentedString(listIds)).append("\n");
    sb.append("    listUnsubscribed: ").append(toIndentedString(listUnsubscribed)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

