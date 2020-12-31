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


package sibApi;

import sendinblue.ApiException;
import sibModel.BlockDomain;
import sibModel.CreateModel;
import sibModel.CreateSmtpEmail;
import sibModel.CreateSmtpTemplate;
import sibModel.DeleteHardbounces;
import sibModel.ErrorModel;
import sibModel.GetAggregatedReport;
import sibModel.GetBlockedDomains;
import sibModel.GetEmailEventReport;
import sibModel.GetReports;
import sibModel.GetSmtpTemplateOverview;
import sibModel.GetSmtpTemplates;
import sibModel.GetTransacBlockedContacts;
import sibModel.GetTransacEmailContent;
import sibModel.GetTransacEmailsList;
import org.threeten.bp.LocalDate;
import sibModel.PostSendFailed;
import sibModel.SendEmail;
import sibModel.SendSmtpEmail;
import sibModel.SendTemplateEmail;
import sibModel.SendTestEmail;
import sibModel.UpdateSmtpTemplate;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TransactionalEmailsApi
 */
@Ignore
public class TransactionalEmailsApiTest {

    private final TransactionalEmailsApi api = new TransactionalEmailsApi();

    
    /**
     * Add a new domain to the list of blocked domains
     *
     * Blocks a new domain in order to avoid messages being sent to the same
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void blockNewDomainTest() throws ApiException {
        BlockDomain blockDomain = null;
        api.blockNewDomain(blockDomain);

        // TODO: test validations
    }
    
    /**
     * Create an email template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSmtpTemplateTest() throws ApiException {
        CreateSmtpTemplate smtpTemplate = null;
        CreateModel response = api.createSmtpTemplate(smtpTemplate);

        // TODO: test validations
    }
    
    /**
     * Unblock an existing domain from the list of blocked domains
     *
     * Unblocks an existing domain from the list of blocked domains
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteBlockedDomainTest() throws ApiException {
        String domain = null;
        api.deleteBlockedDomain(domain);

        // TODO: test validations
    }
    
    /**
     * Delete hardbounces
     *
     * Delete hardbounces. To use carefully (e.g. in case of temporary ISP failures)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteHardbouncesTest() throws ApiException {
        DeleteHardbounces deleteHardbounces = null;
        api.deleteHardbounces(deleteHardbounces);

        // TODO: test validations
    }
    
    /**
     * Delete an inactive email template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSmtpTemplateTest() throws ApiException {
        Long templateId = null;
        api.deleteSmtpTemplate(templateId);

        // TODO: test validations
    }
    
    /**
     * Get your transactional email activity aggregated over a period of time
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAggregatedSmtpReportTest() throws ApiException {
        String startDate = null;
        String endDate = null;
        Integer days = null;
        String tag = null;
        GetAggregatedReport response = api.getAggregatedSmtpReport(startDate, endDate, days, tag);

        // TODO: test validations
    }
    
    /**
     * Get the list of blocked domains
     *
     * Get the list of blocked domains
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBlockedDomainsTest() throws ApiException {
        GetBlockedDomains response = api.getBlockedDomains();

        // TODO: test validations
    }
    
    /**
     * Get all your transactional email activity (unaggregated events)
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEmailEventReportTest() throws ApiException {
        Long limit = null;
        Long offset = null;
        String startDate = null;
        String endDate = null;
        Integer days = null;
        String email = null;
        String event = null;
        String tags = null;
        String messageId = null;
        Long templateId = null;
        String sort = null;
        GetEmailEventReport response = api.getEmailEventReport(limit, offset, startDate, endDate, days, email, event, tags, messageId, templateId, sort);

        // TODO: test validations
    }
    
    /**
     * Get your transactional email activity aggregated per day
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSmtpReportTest() throws ApiException {
        Long limit = null;
        Long offset = null;
        String startDate = null;
        String endDate = null;
        Integer days = null;
        String tag = null;
        String sort = null;
        GetReports response = api.getSmtpReport(limit, offset, startDate, endDate, days, tag, sort);

        // TODO: test validations
    }
    
    /**
     * Returns the template information
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSmtpTemplateTest() throws ApiException {
        Long templateId = null;
        GetSmtpTemplateOverview response = api.getSmtpTemplate(templateId);

        // TODO: test validations
    }
    
    /**
     * Get the list of email templates
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSmtpTemplatesTest() throws ApiException {
        Boolean templateStatus = null;
        Long limit = null;
        Long offset = null;
        String sort = null;
        GetSmtpTemplates response = api.getSmtpTemplates(templateStatus, limit, offset, sort);

        // TODO: test validations
    }
    
    /**
     * Get the list of blocked or unsubscribed transactional contacts
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTransacBlockedContactsTest() throws ApiException {
        String startDate = null;
        String endDate = null;
        Long limit = null;
        Long offset = null;
        List<String> senders = null;
        String sort = null;
        GetTransacBlockedContacts response = api.getTransacBlockedContacts(startDate, endDate, limit, offset, senders, sort);

        // TODO: test validations
    }
    
    /**
     * Get the personalized content of a sent transactional email
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTransacEmailContentTest() throws ApiException {
        String uuid = null;
        GetTransacEmailContent response = api.getTransacEmailContent(uuid);

        // TODO: test validations
    }
    
    /**
     * Get the list of transactional emails on the basis of allowed filters
     *
     * This endpoint will show the list of emails for past 30 days by default. To retrieve emails before that time, please pass startDate and endDate in query filters.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTransacEmailsListTest() throws ApiException {
        String email = null;
        Long templateId = null;
        String messageId = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        String sort = null;
        GetTransacEmailsList response = api.getTransacEmailsList(email, templateId, messageId, startDate, endDate, sort);

        // TODO: test validations
    }
    
    /**
     * Send a template
     *
     * This endpoint is deprecated. Prefer v3/smtp/email instead.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendTemplateTest() throws ApiException {
        Long templateId = null;
        SendEmail sendEmail = null;
        SendTemplateEmail response = api.sendTemplate(templateId, sendEmail);

        // TODO: test validations
    }
    
    /**
     * Send a template to your test list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendTestTemplateTest() throws ApiException {
        Long templateId = null;
        SendTestEmail sendTestEmail = null;
        api.sendTestTemplate(templateId, sendTestEmail);

        // TODO: test validations
    }
    
    /**
     * Send a transactional email
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendTransacEmailTest() throws ApiException {
        SendSmtpEmail sendSmtpEmail = null;
        CreateSmtpEmail response = api.sendTransacEmail(sendSmtpEmail);

        // TODO: test validations
    }
    
    /**
     * Unblock or resubscribe a transactional contact
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void smtpBlockedContactsEmailDeleteTest() throws ApiException {
        String email = null;
        api.smtpBlockedContactsEmailDelete(email);

        // TODO: test validations
    }
    
    /**
     * Delete an SMTP transactional log
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void smtpLogMessageIdDeleteTest() throws ApiException {
        String messageId = null;
        api.smtpLogMessageIdDelete(messageId);

        // TODO: test validations
    }
    
    /**
     * Update an email template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSmtpTemplateTest() throws ApiException {
        Long templateId = null;
        UpdateSmtpTemplate smtpTemplate = null;
        api.updateSmtpTemplate(templateId, smtpTemplate);

        // TODO: test validations
    }
    
}
