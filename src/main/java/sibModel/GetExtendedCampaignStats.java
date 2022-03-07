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
import sibModel.GetExtendedCampaignStatsGlobalStats;
import sibModel.GetStatsByBrowser;
import sibModel.GetStatsByDevice;
import sibModel.GetStatsByDomain;

/**
 * GetExtendedCampaignStats
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-02T23:12:13.151+05:30")
public class GetExtendedCampaignStats {
  @SerializedName("globalStats")
  private GetExtendedCampaignStatsGlobalStats globalStats = null;

  @SerializedName("campaignStats")
  private List<Object> campaignStats = new ArrayList<Object>();

  @SerializedName("mirrorClick")
  private Long mirrorClick = null;

  @SerializedName("remaining")
  private Long remaining = null;

  @SerializedName("linksStats")
  private Object linksStats = null;

  @SerializedName("statsByDomain")
  private GetStatsByDomain statsByDomain = null;

  @SerializedName("statsByDevice")
  private GetStatsByDevice statsByDevice = null;

  @SerializedName("statsByBrowser")
  private GetStatsByBrowser statsByBrowser = null;

  public GetExtendedCampaignStats globalStats(GetExtendedCampaignStatsGlobalStats globalStats) {
    this.globalStats = globalStats;
    return this;
  }

   /**
   * Get globalStats
   * @return globalStats
  **/
  @ApiModelProperty(required = true, value = "")
  public GetExtendedCampaignStatsGlobalStats getGlobalStats() {
    return globalStats;
  }

  public void setGlobalStats(GetExtendedCampaignStatsGlobalStats globalStats) {
    this.globalStats = globalStats;
  }

  public GetExtendedCampaignStats campaignStats(List<Object> campaignStats) {
    this.campaignStats = campaignStats;
    return this;
  }

  public GetExtendedCampaignStats addCampaignStatsItem(Object campaignStatsItem) {
    this.campaignStats.add(campaignStatsItem);
    return this;
  }

   /**
   * List-wise statistics of the campaign.
   * @return campaignStats
  **/
  @ApiModelProperty(required = true, value = "List-wise statistics of the campaign.")
  public List<Object> getCampaignStats() {
    return campaignStats;
  }

  public void setCampaignStats(List<Object> campaignStats) {
    this.campaignStats = campaignStats;
  }

  public GetExtendedCampaignStats mirrorClick(Long mirrorClick) {
    this.mirrorClick = mirrorClick;
    return this;
  }

   /**
   * Number of clicks on mirror link
   * @return mirrorClick
  **/
  @ApiModelProperty(example = "120", required = true, value = "Number of clicks on mirror link")
  public Long getMirrorClick() {
    return mirrorClick;
  }

  public void setMirrorClick(Long mirrorClick) {
    this.mirrorClick = mirrorClick;
  }

  public GetExtendedCampaignStats remaining(Long remaining) {
    this.remaining = remaining;
    return this;
  }

   /**
   * Number of remaning emails to send
   * @return remaining
  **/
  @ApiModelProperty(example = "1000", required = true, value = "Number of remaning emails to send")
  public Long getRemaining() {
    return remaining;
  }

  public void setRemaining(Long remaining) {
    this.remaining = remaining;
  }

  public GetExtendedCampaignStats linksStats(Object linksStats) {
    this.linksStats = linksStats;
    return this;
  }

   /**
   * Statistics about the number of clicks for the links
   * @return linksStats
  **/
  @ApiModelProperty(example = "{\"example.abc.com\":7,\"example.domain.com\":10}", required = true, value = "Statistics about the number of clicks for the links")
  public Object getLinksStats() {
    return linksStats;
  }

  public void setLinksStats(Object linksStats) {
    this.linksStats = linksStats;
  }

  public GetExtendedCampaignStats statsByDomain(GetStatsByDomain statsByDomain) {
    this.statsByDomain = statsByDomain;
    return this;
  }

   /**
   * Get statsByDomain
   * @return statsByDomain
  **/
  @ApiModelProperty(required = true, value = "")
  public GetStatsByDomain getStatsByDomain() {
    return statsByDomain;
  }

  public void setStatsByDomain(GetStatsByDomain statsByDomain) {
    this.statsByDomain = statsByDomain;
  }

  public GetExtendedCampaignStats statsByDevice(GetStatsByDevice statsByDevice) {
    this.statsByDevice = statsByDevice;
    return this;
  }

   /**
   * Statistics about the campaign on the basis of various devices
   * @return statsByDevice
  **/
  @ApiModelProperty(required = true, value = "Statistics about the campaign on the basis of various devices")
  public GetStatsByDevice getStatsByDevice() {
    return statsByDevice;
  }

  public void setStatsByDevice(GetStatsByDevice statsByDevice) {
    this.statsByDevice = statsByDevice;
  }

  public GetExtendedCampaignStats statsByBrowser(GetStatsByBrowser statsByBrowser) {
    this.statsByBrowser = statsByBrowser;
    return this;
  }

   /**
   * Statistics about the campaign on the basis of various browsers
   * @return statsByBrowser
  **/
  @ApiModelProperty(required = true, value = "Statistics about the campaign on the basis of various browsers")
  public GetStatsByBrowser getStatsByBrowser() {
    return statsByBrowser;
  }

  public void setStatsByBrowser(GetStatsByBrowser statsByBrowser) {
    this.statsByBrowser = statsByBrowser;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetExtendedCampaignStats getExtendedCampaignStats = (GetExtendedCampaignStats) o;
    return Objects.equals(this.globalStats, getExtendedCampaignStats.globalStats) &&
        Objects.equals(this.campaignStats, getExtendedCampaignStats.campaignStats) &&
        Objects.equals(this.mirrorClick, getExtendedCampaignStats.mirrorClick) &&
        Objects.equals(this.remaining, getExtendedCampaignStats.remaining) &&
        Objects.equals(this.linksStats, getExtendedCampaignStats.linksStats) &&
        Objects.equals(this.statsByDomain, getExtendedCampaignStats.statsByDomain) &&
        Objects.equals(this.statsByDevice, getExtendedCampaignStats.statsByDevice) &&
        Objects.equals(this.statsByBrowser, getExtendedCampaignStats.statsByBrowser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(globalStats, campaignStats, mirrorClick, remaining, linksStats, statsByDomain, statsByDevice, statsByBrowser);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetExtendedCampaignStats {\n");
    
    sb.append("    globalStats: ").append(toIndentedString(globalStats)).append("\n");
    sb.append("    campaignStats: ").append(toIndentedString(campaignStats)).append("\n");
    sb.append("    mirrorClick: ").append(toIndentedString(mirrorClick)).append("\n");
    sb.append("    remaining: ").append(toIndentedString(remaining)).append("\n");
    sb.append("    linksStats: ").append(toIndentedString(linksStats)).append("\n");
    sb.append("    statsByDomain: ").append(toIndentedString(statsByDomain)).append("\n");
    sb.append("    statsByDevice: ").append(toIndentedString(statsByDevice)).append("\n");
    sb.append("    statsByBrowser: ").append(toIndentedString(statsByBrowser)).append("\n");
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

