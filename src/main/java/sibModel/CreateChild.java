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
 * CreateChild
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-02T23:12:13.151+05:30")
public class CreateChild {
  @SerializedName("email")
  private String email = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("companyName")
  private String companyName = null;

  @SerializedName("password")
  private String password = null;

  /**
   * Language of the child account
   */
  @JsonAdapter(LanguageEnum.Adapter.class)
  public enum LanguageEnum {
    FR("fr"),
    
    ES("es"),
    
    PT("pt"),
    
    IT("it"),
    
    DE("de"),
    
    EN("en");

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

  public CreateChild email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email address to create the child account
   * @return email
  **/
  @ApiModelProperty(example = "josh.cruise@example.com", required = true, value = "Email address to create the child account")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CreateChild firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * First name to use to create the child account
   * @return firstName
  **/
  @ApiModelProperty(example = "Josh", required = true, value = "First name to use to create the child account")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public CreateChild lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name to use to create the child account
   * @return lastName
  **/
  @ApiModelProperty(example = "Cruise", required = true, value = "Last name to use to create the child account")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public CreateChild companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Company name to use to create the child account
   * @return companyName
  **/
  @ApiModelProperty(example = "Your Company", required = true, value = "Company name to use to create the child account")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public CreateChild password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password for the child account to login
   * @return password
  **/
  @ApiModelProperty(example = "Pa55w0rd65", required = true, value = "Password for the child account to login")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public CreateChild language(LanguageEnum language) {
    this.language = language;
    return this;
  }

   /**
   * Language of the child account
   * @return language
  **/
  @ApiModelProperty(example = "en", value = "Language of the child account")
  public LanguageEnum getLanguage() {
    return language;
  }

  public void setLanguage(LanguageEnum language) {
    this.language = language;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateChild createChild = (CreateChild) o;
    return Objects.equals(this.email, createChild.email) &&
        Objects.equals(this.firstName, createChild.firstName) &&
        Objects.equals(this.lastName, createChild.lastName) &&
        Objects.equals(this.companyName, createChild.companyName) &&
        Objects.equals(this.password, createChild.password) &&
        Objects.equals(this.language, createChild.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, firstName, lastName, companyName, password, language);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChild {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

