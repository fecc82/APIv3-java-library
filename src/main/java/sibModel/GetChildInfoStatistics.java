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
 * Statistics about your child account activity
 */
@ApiModel(description = "Statistics about your child account activity")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-30T14:43:00.395+05:30")
public class GetChildInfoStatistics {
  @SerializedName("previousMonthTotalSent")
  private Long previousMonthTotalSent = null;

  @SerializedName("currentMonthTotalSent")
  private Long currentMonthTotalSent = null;

  @SerializedName("totalSent")
  private Long totalSent = null;

  public GetChildInfoStatistics previousMonthTotalSent(Long previousMonthTotalSent) {
    this.previousMonthTotalSent = previousMonthTotalSent;
    return this;
  }

   /**
   * Overall emails sent for the previous month
   * @return previousMonthTotalSent
  **/
  @ApiModelProperty(example = "7654", value = "Overall emails sent for the previous month")
  public Long getPreviousMonthTotalSent() {
    return previousMonthTotalSent;
  }

  public void setPreviousMonthTotalSent(Long previousMonthTotalSent) {
    this.previousMonthTotalSent = previousMonthTotalSent;
  }

  public GetChildInfoStatistics currentMonthTotalSent(Long currentMonthTotalSent) {
    this.currentMonthTotalSent = currentMonthTotalSent;
    return this;
  }

   /**
   * Overall emails sent for current month
   * @return currentMonthTotalSent
  **/
  @ApiModelProperty(example = "4566", value = "Overall emails sent for current month")
  public Long getCurrentMonthTotalSent() {
    return currentMonthTotalSent;
  }

  public void setCurrentMonthTotalSent(Long currentMonthTotalSent) {
    this.currentMonthTotalSent = currentMonthTotalSent;
  }

  public GetChildInfoStatistics totalSent(Long totalSent) {
    this.totalSent = totalSent;
    return this;
  }

   /**
   * Overall emails sent for since the account exists
   * @return totalSent
  **/
  @ApiModelProperty(example = "987554", value = "Overall emails sent for since the account exists")
  public Long getTotalSent() {
    return totalSent;
  }

  public void setTotalSent(Long totalSent) {
    this.totalSent = totalSent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    GetChildInfoStatistics getChildInfoStatistics = (GetChildInfoStatistics) o;
    return ObjectUtils.equals(this.previousMonthTotalSent, getChildInfoStatistics.previousMonthTotalSent) &&
    ObjectUtils.equals(this.currentMonthTotalSent, getChildInfoStatistics.currentMonthTotalSent) &&
    ObjectUtils.equals(this.totalSent, getChildInfoStatistics.totalSent);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(previousMonthTotalSent, currentMonthTotalSent, totalSent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetChildInfoStatistics {\n");
    
    sb.append("    previousMonthTotalSent: ").append(toIndentedString(previousMonthTotalSent)).append("\n");
    sb.append("    currentMonthTotalSent: ").append(toIndentedString(currentMonthTotalSent)).append("\n");
    sb.append("    totalSent: ").append(toIndentedString(totalSent)).append("\n");
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

