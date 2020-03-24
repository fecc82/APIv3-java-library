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
 * GetExtendedCampaignOverviewSender
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-23T17:54:09.105+05:30")
public class GetExtendedCampaignOverviewSender {
  @SerializedName("name")
  private String name = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("id")
  private String id = null;

  public GetExtendedCampaignOverviewSender name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Sender name of the campaign
   * @return name
  **/
  @ApiModelProperty(example = "Marketing", value = "Sender name of the campaign")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetExtendedCampaignOverviewSender email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Sender email of the campaign
   * @return email
  **/
  @ApiModelProperty(example = "marketing@mycompany.com", value = "Sender email of the campaign")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public GetExtendedCampaignOverviewSender id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Sender id of the campaign
   * @return id
  **/
  @ApiModelProperty(example = "43", value = "Sender id of the campaign")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    GetExtendedCampaignOverviewSender getExtendedCampaignOverviewSender = (GetExtendedCampaignOverviewSender) o;
    return ObjectUtils.equals(this.name, getExtendedCampaignOverviewSender.name) &&
    ObjectUtils.equals(this.email, getExtendedCampaignOverviewSender.email) &&
    ObjectUtils.equals(this.id, getExtendedCampaignOverviewSender.id);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(name, email, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetExtendedCampaignOverviewSender {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

