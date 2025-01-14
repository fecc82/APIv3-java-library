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
import sibModel.GetSendersListIps;

/**
 * GetSendersListSenders
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-02T23:12:13.151+05:30")
public class GetSendersListSenders {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("ips")
  private List<GetSendersListIps> ips = null;

  public GetSendersListSenders id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Id of the sender
   * @return id
  **/
  @ApiModelProperty(example = "0", required = true, value = "Id of the sender")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GetSendersListSenders name(String name) {
    this.name = name;
    return this;
  }

   /**
   * From Name associated to the sender
   * @return name
  **/
  @ApiModelProperty(example = "Marketing", required = true, value = "From Name associated to the sender")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetSendersListSenders email(String email) {
    this.email = email;
    return this;
  }

   /**
   * From Email associated to the sender
   * @return email
  **/
  @ApiModelProperty(example = "marketing@mycompany.com", required = true, value = "From Email associated to the sender")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public GetSendersListSenders active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Status of sender (true&#x3D;activated, false&#x3D;deactivated)
   * @return active
  **/
  @ApiModelProperty(example = "false", required = true, value = "Status of sender (true=activated, false=deactivated)")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public GetSendersListSenders ips(List<GetSendersListIps> ips) {
    this.ips = ips;
    return this;
  }

  public GetSendersListSenders addIpsItem(GetSendersListIps ipsItem) {
    if (this.ips == null) {
      this.ips = new ArrayList<GetSendersListIps>();
    }
    this.ips.add(ipsItem);
    return this;
  }

   /**
   * List of dedicated IP(s) available in the account. This data is displayed only for dedicated IPs
   * @return ips
  **/
  @ApiModelProperty(value = "List of dedicated IP(s) available in the account. This data is displayed only for dedicated IPs")
  public List<GetSendersListIps> getIps() {
    return ips;
  }

  public void setIps(List<GetSendersListIps> ips) {
    this.ips = ips;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSendersListSenders getSendersListSenders = (GetSendersListSenders) o;
    return Objects.equals(this.id, getSendersListSenders.id) &&
        Objects.equals(this.name, getSendersListSenders.name) &&
        Objects.equals(this.email, getSendersListSenders.email) &&
        Objects.equals(this.active, getSendersListSenders.active) &&
        Objects.equals(this.ips, getSendersListSenders.ips);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, email, active, ips);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSendersListSenders {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    ips: ").append(toIndentedString(ips)).append("\n");
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

