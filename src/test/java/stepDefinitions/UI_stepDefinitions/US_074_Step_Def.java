package stepDefinitions.UI_stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;

public class US_074_Step_Def extends BasePage {
    @Given("user clicks any day on the calendar")
    public void user_clicks_any_day_on_the_calendar() {
getCalenderBookAnAppointmentPage().dateDate(3);

        }
    @Then("user verifies the Book An Appointment page is visible")
    public void user_verifies_the_book_an_appointment_page_is_visible() {
       getCalenderBookAnAppointmentPage().bookAnAppointmentText.isDisplayed();
        System.out.println("page title: "+getCalenderBookAnAppointmentPage().bookAnAppointmentText);
    }
    @Then("user verifies Register Service and Custom Servise options are clickable")
    public void user_verifies_register_service_and_custom_servise_options_are_clickable() {
       getCalenderBookAnAppointmentPage().registeredServiceRadioButton.isEnabled();
       getCalenderBookAnAppointmentPage().radioButtonCustomService.isEnabled();
    }
    @Then("user verifies Registered Services is selected by default in the Select Service Type section")
    public void user_verifies_registered_services_is_selected_by_default_in_the_select_service_type_section() {
       getCalenderBookAnAppointmentPage().registeredServiceRadioButton.isSelected();

    }
    @Then("user verifies Servise Dropdown is functional")
    public void user_verifies_servise_dropdown_is_functional() {
       getCalenderBookAnAppointmentPage().servicesDropdown.isEnabled();
    }
    @Then("user verifies Registered Services are visible in the service drop down menu")
    public void user_verifies_registered_services_are_visible_in_the_service_drop_down_menu() {
       Select select=new Select(getCalenderBookAnAppointmentPage().servicesDropdown);
        Assert.assertTrue(select.getOptions().size()>1);
    }
    @Then("user selects any dropdown option in the service drop down menu")
    public void user_selects_any_dropdown_option_in_the_service_drop_down_menu() {
       
    }
    @Then("user verifies location dropdown menu is functional")
    public void user_verifies_location_dropdown_menu_is_functional() {
       
    }
    @Then("user verifies various options are visible in the location dropdown menu")
    public void user_verifies_various_options_are_visible_in_the_location_dropdown_menu() {
       
    }
    @Then("user selects any location in the location drop down menu")
    public void user_selects_any_location_in_the_location_drop_down_menu() {
       
    }
    @Then("user verifies Repeat Options dropdown menu is functional")
    public void user_verifies_repeat_options_dropdown_menu_is_functional() {
       
    }
    @Then("user clicks Repeat Options dropdown menu")
    public void user_clicks_repeat_options_dropdown_menu() {
       
    }
    @Then("user verifies Repeat Options menu is visible and selectable")
    public void user_verifies_repeat_options_menu_is_visible_and_selectable(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }
    @Then("user selects {string} option")
    public void user_selects_option(String string) {
       
    }
    @Then("user verifies Repeat Option is disable")
    public void user_verifies_repeat_option_is_disable() {
       
    }
    @Then("user selects one of Daily, Weekly,BiWeekly,Monthly options")
    public void user_selects_one_of_daily_weekly_bi_weekly_monthly_options() {
       
    }
    @Then("user verifies Repeat Option is enable")
    public void user_verifies_repeat_option_is_enable() {
       
    }
    @Then("user selects any number from Repeat Times Option")
    public void user_selects_any_number_from_repeat_times_option() {
       
    }
    @Then("user verifies Date dropdown menu is functional")
    public void user_verifies_date_dropdown_menu_is_functional() {
       
    }
    @Then("user verifies the date click on the Calendar is visible by default")
    public void user_verifies_the_date_click_on_the_calendar_is_visible_by_default() {
       
    }
    @Then("user selects any date from the date dropdown menu")
    public void user_selects_any_date_from_the_date_dropdown_menu() {
       
    }
    @Then("user verifies Time Start, Time End dropdown menus are functional")
    public void user_verifies_time_start_time_end_dropdown_menus_are_functional() {
       
    }
    @Then("user verifies Time Start, Time End dropdown are visible at various times")
    public void user_verifies_time_start_time_end_dropdown_are_visible_at_various_times() {
       
    }
    @Then("user selects any time in the Time Start, Time End dropdown menus")
    public void user_selects_any_time_in_the_time_start_time_end_dropdown_menus() {
       
    }
    @Then("user verifies Registered Clients, New Client \\(Enter Manually) options are seen under the Select Service Type heading")
    public void user_verifies_registered_clients_new_client_enter_manually_options_are_seen_under_the_select_service_type_heading() {
       
    }
    @Then("user verifies New Client \\(Enter Manually) is selectable")
    public void user_verifies_new_client_enter_manually_is_selectable() {
       
    }
    @Then("user selects the New Client \\(Enter Manually) option")
    public void user_selects_the_new_client_enter_manually_option() {
       
    }
    @Then("user verifies the Enter Client Manually section is seen")
    public void user_verifies_the_enter_client_manually_section_is_seen() {
       
    }
    @Then("user verifies Enter Client Manually section is functional")
    public void user_verifies_enter_client_manually_section_is_functional() {
       
    }
    @Then("user enters a valid First Name in the First Name field")
    public void user_enters_a_valid_first_name_in_the_first_name_field() {
       
    }
    @Then("user enters a valid Last Name in the Last Name field")
    public void user_enters_a_valid_last_name_in_the_last_name_field() {
       
    }
    @Then("user enters a valid Phone Number in the Phone Number field")
    public void user_enters_a_valid_phone_number_in_the_phone_number_field() {
       
    }
    @Then("user enters a valid eMail in the eMail field")
    public void user_enters_a_valid_e_mail_in_the_e_mail_field() {
       
    }
    @Then("user clicks Submit button under Enter Client Manually")
    public void user_clicks_submit_button_under_enter_client_manually() {
       
    }
    @Then("user verifies New Meeting Created is visible")
    public void user_verifies_new_meeting_created_is_visible() {
       
    }
    @Then("user verifies Created client is visible in {string} section")
    public void user_verifies_created_client_is_visible_in_section(String string) {
   
    }

}
