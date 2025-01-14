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
import sibModel.GetAccountMarketingAutomation;
import sibModel.GetAccountPlan;
import sibModel.GetAccountRelay;
import sibModel.GetExtendedClient;
import sibModel.GetExtendedClientAddress;

/**
 * GetAccount
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-02T23:12:13.151+05:30")
public class GetAccount extends GetExtendedClient {
  @SerializedName("plan")
  private List<GetAccountPlan> plan = new ArrayList<GetAccountPlan>();

  @SerializedName("relay")
  private GetAccountRelay relay = null;

  @SerializedName("marketingAutomation")
  private GetAccountMarketingAutomation marketingAutomation = null;

  public GetAccount plan(List<GetAccountPlan> plan) {
    this.plan = plan;
    return this;
  }

  public GetAccount addPlanItem(GetAccountPlan planItem) {
    this.plan.add(planItem);
    return this;
  }

   /**
   * Information about your plans and credits
   * @return plan
  **/
  @ApiModelProperty(required = true, value = "Information about your plans and credits")
  public List<GetAccountPlan> getPlan() {
    return plan;
  }

  public void setPlan(List<GetAccountPlan> plan) {
    this.plan = plan;
  }

  public GetAccount relay(GetAccountRelay relay) {
    this.relay = relay;
    return this;
  }

   /**
   * Get relay
   * @return relay
  **/
  @ApiModelProperty(required = true, value = "")
  public GetAccountRelay getRelay() {
    return relay;
  }

  public void setRelay(GetAccountRelay relay) {
    this.relay = relay;
  }

  public GetAccount marketingAutomation(GetAccountMarketingAutomation marketingAutomation) {
    this.marketingAutomation = marketingAutomation;
    return this;
  }

   /**
   * Get marketingAutomation
   * @return marketingAutomation
  **/
  @ApiModelProperty(value = "")
  public GetAccountMarketingAutomation getMarketingAutomation() {
    return marketingAutomation;
  }

  public void setMarketingAutomation(GetAccountMarketingAutomation marketingAutomation) {
    this.marketingAutomation = marketingAutomation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAccount getAccount = (GetAccount) o;
    return Objects.equals(this.plan, getAccount.plan) &&
        Objects.equals(this.relay, getAccount.relay) &&
        Objects.equals(this.marketingAutomation, getAccount.marketingAutomation) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plan, relay, marketingAutomation, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccount {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    relay: ").append(toIndentedString(relay)).append("\n");
    sb.append("    marketingAutomation: ").append(toIndentedString(marketingAutomation)).append("\n");
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

