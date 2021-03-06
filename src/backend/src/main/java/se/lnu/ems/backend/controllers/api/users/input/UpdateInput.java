package se.lnu.ems.backend.controllers.api.users.input;


import javax.validation.constraints.*;

/**
 * A class for the update input.
 *
 * @author Jacob Yousif
 * @version 1.0
 * @since 2020 -05-01
 */
public class UpdateInput {

    /**
     * A private field for the e-mail.
     */
    @NotNull
    @Email
    private String email;

    /**
     * A private field for the first name.
     */
    @NotNull
    @NotEmpty()
    @Size(min = 1, max = 255)
    private String firstName;

    /**
     * A private field for the last name.
     */
    @NotNull
    @NotEmpty()
    @Size(min = 1, max = 255)
    private String lastName;

    /**
     * A private field for the role id.
     */
    @NotNull
    @Min(1)
    private Long roleId;

    /**
     * It sets the note.
     *
     * @param note note.
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * It returns the note.
     *
     * @return String. note
     */
    public String getNote() {
        return note;
    }

    /**
     * A private field for the note.
     */
    private String note;

    /**
     * It returns the e-mail
     *
     * @return String. email
     */
    public String getEmail() {
        return email;
    }

    /**
     * It sets the e-mail.
     *
     * @param email the e-mail.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * It returns the first name.
     *
     * @return String. first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * It sets the first name.
     *
     * @param firstName first name.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * It returns the last name.
     *
     * @return the last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * It sets the last name.
     *
     * @param lastName the last name.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * It returns the role id.
     *
     * @return Long. role id
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * It sets the role id.
     *
     * @param roleId the role id.
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
