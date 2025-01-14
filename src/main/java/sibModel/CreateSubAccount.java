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

/**
 * CreateSubAccount
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-02T23:12:13.151+05:30")
public class CreateSubAccount {
  @SerializedName("companyName")
  private String companyName = null;

  @SerializedName("email")
  private String email = null;

  /**
   * Language for identifying localization information
   */
  @JsonAdapter(LanguageEnum.Adapter.class)
  public enum LanguageEnum {
    EN("en"),
    
    FR("fr"),
    
    IT("it"),
    
    ES("es"),
    
    PT("pt"),
    
    DE("de");

    private String value;

    LanguageEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LanguageEnum fromValue(String text) {
      for (LanguageEnum b : LanguageEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<LanguageEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LanguageEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LanguageEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LanguageEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("language")
  private LanguageEnum language = null;

  @SerializedName("timezone")
  private String timezone = null;

  public CreateSubAccount companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Name of the organization
   * @return companyName
  **/
  @ApiModelProperty(required = true, value = "Name of the organization")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public CreateSubAccount email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email address for the organization
   * @return email
  **/
  @ApiModelProperty(required = true, value = "Email address for the organization")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CreateSubAccount language(LanguageEnum language) {
    this.language = language;
    return this;
  }

   /**
   * Language for identifying localization information
   * @return language
  **/
  @ApiModelProperty(value = "Language for identifying localization information")
  public LanguageEnum getLanguage() {
    return language;
  }

  public void setLanguage(LanguageEnum language) {
    this.language = language;
  }

  public CreateSubAccount timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Request timezone of the client
   * @return timezone
  **/
  @ApiModelProperty(value = "Request timezone of the client")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSubAccount createSubAccount = (CreateSubAccount) o;
    return Objects.equals(this.companyName, createSubAccount.companyName) &&
        Objects.equals(this.email, createSubAccount.email) &&
        Objects.equals(this.language, createSubAccount.language) &&
        Objects.equals(this.timezone, createSubAccount.timezone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyName, email, language, timezone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSubAccount {\n");
    
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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

