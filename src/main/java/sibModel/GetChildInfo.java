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
import sibModel.GetChildInfoApiKeys;
import sibModel.GetChildInfoCredits;
import sibModel.GetChildInfoStatistics;
import sibModel.GetClient;

/**
 * GetChildInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-02T23:12:13.151+05:30")
public class GetChildInfo extends GetClient {
  @SerializedName("credits")
  private GetChildInfoCredits credits = null;

  @SerializedName("statistics")
  private GetChildInfoStatistics statistics = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("ips")
  private List<String> ips = null;

  @SerializedName("apiKeys")
  private GetChildInfoApiKeys apiKeys = null;

  public GetChildInfo credits(GetChildInfoCredits credits) {
    this.credits = credits;
    return this;
  }

   /**
   * Get credits
   * @return credits
  **/
  @ApiModelProperty(value = "")
  public GetChildInfoCredits getCredits() {
    return credits;
  }

  public void setCredits(GetChildInfoCredits credits) {
    this.credits = credits;
  }

  public GetChildInfo statistics(GetChildInfoStatistics statistics) {
    this.statistics = statistics;
    return this;
  }

   /**
   * Get statistics
   * @return statistics
  **/
  @ApiModelProperty(value = "")
  public GetChildInfoStatistics getStatistics() {
    return statistics;
  }

  public void setStatistics(GetChildInfoStatistics statistics) {
    this.statistics = statistics;
  }

  public GetChildInfo password(String password) {
    this.password = password;
    return this;
  }

   /**
   * The encrypted password of child account
   * @return password
  **/
  @ApiModelProperty(example = "abC01De2fGHI3jkL", required = true, value = "The encrypted password of child account")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public GetChildInfo ips(List<String> ips) {
    this.ips = ips;
    return this;
  }

  public GetChildInfo addIpsItem(String ipsItem) {
    if (this.ips == null) {
      this.ips = new ArrayList<String>();
    }
    this.ips.add(ipsItem);
    return this;
  }

   /**
   * IP(s) associated to a child account user
   * @return ips
  **/
  @ApiModelProperty(value = "IP(s) associated to a child account user")
  public List<String> getIps() {
    return ips;
  }

  public void setIps(List<String> ips) {
    this.ips = ips;
  }

  public GetChildInfo apiKeys(GetChildInfoApiKeys apiKeys) {
    this.apiKeys = apiKeys;
    return this;
  }

   /**
   * Get apiKeys
   * @return apiKeys
  **/
  @ApiModelProperty(value = "")
  public GetChildInfoApiKeys getApiKeys() {
    return apiKeys;
  }

  public void setApiKeys(GetChildInfoApiKeys apiKeys) {
    this.apiKeys = apiKeys;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetChildInfo getChildInfo = (GetChildInfo) o;
    return Objects.equals(this.credits, getChildInfo.credits) &&
        Objects.equals(this.statistics, getChildInfo.statistics) &&
        Objects.equals(this.password, getChildInfo.password) &&
        Objects.equals(this.ips, getChildInfo.ips) &&
        Objects.equals(this.apiKeys, getChildInfo.apiKeys) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credits, statistics, password, ips, apiKeys, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetChildInfo {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    credits: ").append(toIndentedString(credits)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    ips: ").append(toIndentedString(ips)).append("\n");
    sb.append("    apiKeys: ").append(toIndentedString(apiKeys)).append("\n");
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

