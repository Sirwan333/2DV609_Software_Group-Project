package se.lnu.ems.backend.controllers.api.questions.dto;

import java.util.Date;

/**
 * The type Question dto.
 */
public class QuestionDTO {
    private Long id;
    private String text;
    private String note;
    private Date createdAt;
    private Long examId;
    private Long type;
    private String typeName;


    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets note.
     *
     * @return the note
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets note.
     *
     * @param note the note
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * Gets created at.
     *
     * @return the created at
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets created at.
     *
     * @param createdAt the created at
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Gets text.
     *
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * Sets text.
     *
     * @param text the text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Gets exam id.
     *
     * @return the exam id
     */
    public Long getExamId() {
        return examId;
    }

    /**
     * Sets exam id.
     *
     * @param examId the exam id
     */
    public void setExamId(Long examId) {
        this.examId = examId;
    }

    /**
     * Gets type name.
     *
     * @return the type name
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * Sets type name.
     *
     * @param typeName the type name
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public Long getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(Long type) {
        this.type = type;
    }
}
