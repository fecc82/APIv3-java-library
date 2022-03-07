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
import sibModel.GetExtendedListCampaignStats;
import sibModel.GetList;

/**
 * GetExtendedList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-02T23:12:13.151+05:30")
public class GetExtendedList extends GetList {
  @SerializedName("folderId")
  private Long folderId = null;

  @SerializedName("createdAt")
  private String createdAt = null;

  @SerializedName("campaignStats")
  private List<GetExtendedListCampaignStats> campaignStats = null;

  @SerializedName("dynamicList")
  private Boolean dynamicList = null;

  public GetExtendedList folderId(Long folderId) {
    this.folderId = folderId;
    return this;
  }

   /**
   * ID of the folder
   * @return folderId
  **/
  @ApiModelProperty(example = "2", required = true, value = "ID of the folder")
  public Long getFolderId() {
    return folderId;
  }

  public void setFolderId(Long folderId) {
    this.folderId = folderId;
  }

  public GetExtendedList createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Creation UTC date-time of the list (YYYY-MM-DDTHH:mm:ss.SSSZ)
   * @return createdAt
  **/
  @ApiModelProperty(example = "2017-03-13T17:05:09Z", required = true, value = "Creation UTC date-time of the list (YYYY-MM-DDTHH:mm:ss.SSSZ)")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public GetExtendedList campaignStats(List<GetExtendedListCampaignStats> campaignStats) {
    this.campaignStats = campaignStats;
    return this;
  }

  public GetExtendedList addCampaignStatsItem(GetExtendedListCampaignStats campaignStatsItem) {
    if (this.campaignStats == null) {
      this.campaignStats = new ArrayList<GetExtendedListCampaignStats>();
    }
    this.campaignStats.add(campaignStatsItem);
    return this;
  }

   /**
   * Get campaignStats
   * @return campaignStats
  **/
  @ApiModelProperty(value = "")
  public List<GetExtendedListCampaignStats> getCampaignStats() {
    return campaignStats;
  }

  public void setCampaignStats(List<GetExtendedListCampaignStats> campaignStats) {
    this.campaignStats = campaignStats;
  }

  public GetExtendedList dynamicList(Boolean dynamicList) {
    this.dynamicList = dynamicList;
    return this;
  }

   /**
   * Status telling if the list is dynamic or not (true&#x3D;dynamic, false&#x3D;not dynamic)
   * @return dynamicList
  **/
  @ApiModelProperty(example = "false", value = "Status telling if the list is dynamic or not (true=dynamic, false=not dynamic)")
  public Boolean isDynamicList() {
    return dynamicList;
  }

  public void setDynamicList(Boolean dynamicList) {
    this.dynamicList = dynamicList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetExtendedList getExtendedList = (GetExtendedList) o;
    return Objects.equals(this.folderId, getExtendedList.folderId) &&
        Objects.equals(this.createdAt, getExtendedList.createdAt) &&
        Objects.equals(this.campaignStats, getExtendedList.campaignStats) &&
        Objects.equals(this.dynamicList, getExtendedList.dynamicList) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(folderId, createdAt, campaignStats, dynamicList, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetExtendedList {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    campaignStats: ").append(toIndentedString(campaignStats)).append("\n");
    sb.append("    dynamicList: ").append(toIndentedString(dynamicList)).append("\n");
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

