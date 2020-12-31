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
import org.threeten.bp.LocalDate;

/**
 * GetTransacSmsReportReports
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-30T14:43:00.395+05:30")
public class GetTransacSmsReportReports {
  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("requests")
  private Long requests = null;

  @SerializedName("delivered")
  private Long delivered = null;

  @SerializedName("hardBounces")
  private Long hardBounces = null;

  @SerializedName("softBounces")
  private Long softBounces = null;

  @SerializedName("blocked")
  private Long blocked = null;

  @SerializedName("unsubscribed")
  private Long unsubscribed = null;

  @SerializedName("replied")
  private Long replied = null;

  @SerializedName("accepted")
  private Long accepted = null;

  @SerializedName("rejected")
  private Long rejected = null;

  public GetTransacSmsReportReports date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Date for which statistics are retrieved
   * @return date
  **/
  @ApiModelProperty(example = "2017-03-17", value = "Date for which statistics are retrieved")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public GetTransacSmsReportReports requests(Long requests) {
    this.requests = requests;
    return this;
  }

   /**
   * Number of requests for the date
   * @return requests
  **/
  @ApiModelProperty(example = "87", value = "Number of requests for the date")
  public Long getRequests() {
    return requests;
  }

  public void setRequests(Long requests) {
    this.requests = requests;
  }

  public GetTransacSmsReportReports delivered(Long delivered) {
    this.delivered = delivered;
    return this;
  }

   /**
   * Number of delivered SMS for the date
   * @return delivered
  **/
  @ApiModelProperty(example = "85", value = "Number of delivered SMS for the date")
  public Long getDelivered() {
    return delivered;
  }

  public void setDelivered(Long delivered) {
    this.delivered = delivered;
  }

  public GetTransacSmsReportReports hardBounces(Long hardBounces) {
    this.hardBounces = hardBounces;
    return this;
  }

   /**
   * Number of hardbounces for the date
   * @return hardBounces
  **/
  @ApiModelProperty(example = "1", value = "Number of hardbounces for the date")
  public Long getHardBounces() {
    return hardBounces;
  }

  public void setHardBounces(Long hardBounces) {
    this.hardBounces = hardBounces;
  }

  public GetTransacSmsReportReports softBounces(Long softBounces) {
    this.softBounces = softBounces;
    return this;
  }

   /**
   * Number of softbounces for the date
   * @return softBounces
  **/
  @ApiModelProperty(example = "1", value = "Number of softbounces for the date")
  public Long getSoftBounces() {
    return softBounces;
  }

  public void setSoftBounces(Long softBounces) {
    this.softBounces = softBounces;
  }

  public GetTransacSmsReportReports blocked(Long blocked) {
    this.blocked = blocked;
    return this;
  }

   /**
   * Number of blocked contact for the date
   * @return blocked
  **/
  @ApiModelProperty(example = "0", value = "Number of blocked contact for the date")
  public Long getBlocked() {
    return blocked;
  }

  public void setBlocked(Long blocked) {
    this.blocked = blocked;
  }

  public GetTransacSmsReportReports unsubscribed(Long unsubscribed) {
    this.unsubscribed = unsubscribed;
    return this;
  }

   /**
   * Number of unsubscription for the date
   * @return unsubscribed
  **/
  @ApiModelProperty(example = "1", value = "Number of unsubscription for the date")
  public Long getUnsubscribed() {
    return unsubscribed;
  }

  public void setUnsubscribed(Long unsubscribed) {
    this.unsubscribed = unsubscribed;
  }

  public GetTransacSmsReportReports replied(Long replied) {
    this.replied = replied;
    return this;
  }

   /**
   * Number of answered SMS for the date
   * @return replied
  **/
  @ApiModelProperty(example = "2", value = "Number of answered SMS for the date")
  public Long getReplied() {
    return replied;
  }

  public void setReplied(Long replied) {
    this.replied = replied;
  }

  public GetTransacSmsReportReports accepted(Long accepted) {
    this.accepted = accepted;
    return this;
  }

   /**
   * Number of accepted for the date
   * @return accepted
  **/
  @ApiModelProperty(example = "85", value = "Number of accepted for the date")
  public Long getAccepted() {
    return accepted;
  }

  public void setAccepted(Long accepted) {
    this.accepted = accepted;
  }

  public GetTransacSmsReportReports rejected(Long rejected) {
    this.rejected = rejected;
    return this;
  }

   /**
   * Number of rejected for the date
   * @return rejected
  **/
  @ApiModelProperty(example = "1", value = "Number of rejected for the date")
  public Long getRejected() {
    return rejected;
  }

  public void setRejected(Long rejected) {
    this.rejected = rejected;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    GetTransacSmsReportReports getTransacSmsReportReports = (GetTransacSmsReportReports) o;
    return ObjectUtils.equals(this.date, getTransacSmsReportReports.date) &&
    ObjectUtils.equals(this.requests, getTransacSmsReportReports.requests) &&
    ObjectUtils.equals(this.delivered, getTransacSmsReportReports.delivered) &&
    ObjectUtils.equals(this.hardBounces, getTransacSmsReportReports.hardBounces) &&
    ObjectUtils.equals(this.softBounces, getTransacSmsReportReports.softBounces) &&
    ObjectUtils.equals(this.blocked, getTransacSmsReportReports.blocked) &&
    ObjectUtils.equals(this.unsubscribed, getTransacSmsReportReports.unsubscribed) &&
    ObjectUtils.equals(this.replied, getTransacSmsReportReports.replied) &&
    ObjectUtils.equals(this.accepted, getTransacSmsReportReports.accepted) &&
    ObjectUtils.equals(this.rejected, getTransacSmsReportReports.rejected);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(date, requests, delivered, hardBounces, softBounces, blocked, unsubscribed, replied, accepted, rejected);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTransacSmsReportReports {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    delivered: ").append(toIndentedString(delivered)).append("\n");
    sb.append("    hardBounces: ").append(toIndentedString(hardBounces)).append("\n");
    sb.append("    softBounces: ").append(toIndentedString(softBounces)).append("\n");
    sb.append("    blocked: ").append(toIndentedString(blocked)).append("\n");
    sb.append("    unsubscribed: ").append(toIndentedString(unsubscribed)).append("\n");
    sb.append("    replied: ").append(toIndentedString(replied)).append("\n");
    sb.append("    accepted: ").append(toIndentedString(accepted)).append("\n");
    sb.append("    rejected: ").append(toIndentedString(rejected)).append("\n");
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

