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
import sibModel.SubAccountDetailsResponsePlanInfo;

/**
 * SubAccountDetailsResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-02T23:12:13.151+05:30")
public class SubAccountDetailsResponse {
  @SerializedName("name")
  private String name = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("companyName")
  private String companyName = null;

  @SerializedName("planInfo")
  private SubAccountDetailsResponsePlanInfo planInfo = null;

  public SubAccountDetailsResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the sub-account user
   * @return name
  **/
  @ApiModelProperty(value = "Name of the sub-account user")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SubAccountDetailsResponse email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email id of the sub-account organization
   * @return email
  **/
  @ApiModelProperty(value = "Email id of the sub-account organization")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public SubAccountDetailsResponse companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Sub-account company name
   * @return companyName
  **/
  @ApiModelProperty(value = "Sub-account company name")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public SubAccountDetailsResponse planInfo(SubAccountDetailsResponsePlanInfo planInfo) {
    this.planInfo = planInfo;
    return this;
  }

   /**
   * Get planInfo
   * @return planInfo
  **/
  @ApiModelProperty(value = "")
  public SubAccountDetailsResponsePlanInfo getPlanInfo() {
    return planInfo;
  }

  public void setPlanInfo(SubAccountDetailsResponsePlanInfo planInfo) {
    this.planInfo = planInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubAccountDetailsResponse subAccountDetailsResponse = (SubAccountDetailsResponse) o;
    return Objects.equals(this.name, subAccountDetailsResponse.name) &&
        Objects.equals(this.email, subAccountDetailsResponse.email) &&
        Objects.equals(this.companyName, subAccountDetailsResponse.companyName) &&
        Objects.equals(this.planInfo, subAccountDetailsResponse.planInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, email, companyName, planInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubAccountDetailsResponse {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    planInfo: ").append(toIndentedString(planInfo)).append("\n");
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
