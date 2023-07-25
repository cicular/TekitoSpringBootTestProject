package com.example.springTest.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Articles {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.articles.article_id
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    private Long articleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.articles.article_title
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    private String articleTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.articles.post_date
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    private LocalDate postDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.articles.article_url
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    private String articleUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.articles.article_content
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    private String articleContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.articles.twitter_link_flg
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    private Boolean twitterLinkFlg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.articles.akahata_link_flg
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    private Boolean akahataLinkFlg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.articles.num_of_comments
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    private Integer numOfComments;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.articles.registration_time
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    private LocalDateTime registrationTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.articles.update_time
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    private LocalDateTime updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.articles.delete_flg
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    private Boolean deleteFlg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.articles.remarks
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    private String remarks;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.articles.article_id
     *
     * @return the value of public.articles.article_id
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    public Long getArticleId() {
        return articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.articles.article_id
     *
     * @param articleId the value for public.articles.article_id
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.articles.article_title
     *
     * @return the value of public.articles.article_title
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    public String getArticleTitle() {
        return articleTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.articles.article_title
     *
     * @param articleTitle the value for public.articles.article_title
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.articles.post_date
     *
     * @return the value of public.articles.post_date
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    public LocalDate getPostDate() {
        return postDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.articles.post_date
     *
     * @param postDate the value for public.articles.post_date
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    public void setPostDate(LocalDate postDate) {
        this.postDate = postDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.articles.article_url
     *
     * @return the value of public.articles.article_url
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    public String getArticleUrl() {
        return articleUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.articles.article_url
     *
     * @param articleUrl the value for public.articles.article_url
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    public void setArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl == null ? null : articleUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.articles.article_content
     *
     * @return the value of public.articles.article_content
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    public String getArticleContent() {
        return articleContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.articles.article_content
     *
     * @param articleContent the value for public.articles.article_content
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent == null ? null : articleContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.articles.twitter_link_flg
     *
     * @return the value of public.articles.twitter_link_flg
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    public Boolean getTwitterLinkFlg() {
        return twitterLinkFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.articles.twitter_link_flg
     *
     * @param twitterLinkFlg the value for public.articles.twitter_link_flg
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    public void setTwitterLinkFlg(Boolean twitterLinkFlg) {
        this.twitterLinkFlg = twitterLinkFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.articles.akahata_link_flg
     *
     * @return the value of public.articles.akahata_link_flg
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    public Boolean getAkahataLinkFlg() {
        return akahataLinkFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.articles.akahata_link_flg
     *
     * @param akahataLinkFlg the value for public.articles.akahata_link_flg
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    public void setAkahataLinkFlg(Boolean akahataLinkFlg) {
        this.akahataLinkFlg = akahataLinkFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.articles.num_of_comments
     *
     * @return the value of public.articles.num_of_comments
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    public Integer getNumOfComments() {
        return numOfComments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.articles.num_of_comments
     *
     * @param numOfComments the value for public.articles.num_of_comments
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    public void setNumOfComments(Integer numOfComments) {
        this.numOfComments = numOfComments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.articles.registration_time
     *
     * @return the value of public.articles.registration_time
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    public LocalDateTime getRegistrationTime() {
        return registrationTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.articles.registration_time
     *
     * @param registrationTime the value for public.articles.registration_time
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    public void setRegistrationTime(LocalDateTime registrationTime) {
        this.registrationTime = registrationTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.articles.update_time
     *
     * @return the value of public.articles.update_time
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.articles.update_time
     *
     * @param updateTime the value for public.articles.update_time
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.articles.delete_flg
     *
     * @return the value of public.articles.delete_flg
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    public Boolean getDeleteFlg() {
        return deleteFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.articles.delete_flg
     *
     * @param deleteFlg the value for public.articles.delete_flg
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    public void setDeleteFlg(Boolean deleteFlg) {
        this.deleteFlg = deleteFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.articles.remarks
     *
     * @return the value of public.articles.remarks
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.articles.remarks
     *
     * @param remarks the value for public.articles.remarks
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.articles
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Articles other = (Articles) that;
        return (this.getArticleId() == null ? other.getArticleId() == null : this.getArticleId().equals(other.getArticleId()))
            && (this.getArticleTitle() == null ? other.getArticleTitle() == null : this.getArticleTitle().equals(other.getArticleTitle()))
            && (this.getPostDate() == null ? other.getPostDate() == null : this.getPostDate().equals(other.getPostDate()))
            && (this.getArticleUrl() == null ? other.getArticleUrl() == null : this.getArticleUrl().equals(other.getArticleUrl()))
            && (this.getArticleContent() == null ? other.getArticleContent() == null : this.getArticleContent().equals(other.getArticleContent()))
            && (this.getTwitterLinkFlg() == null ? other.getTwitterLinkFlg() == null : this.getTwitterLinkFlg().equals(other.getTwitterLinkFlg()))
            && (this.getAkahataLinkFlg() == null ? other.getAkahataLinkFlg() == null : this.getAkahataLinkFlg().equals(other.getAkahataLinkFlg()))
            && (this.getNumOfComments() == null ? other.getNumOfComments() == null : this.getNumOfComments().equals(other.getNumOfComments()))
            && (this.getRegistrationTime() == null ? other.getRegistrationTime() == null : this.getRegistrationTime().equals(other.getRegistrationTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getDeleteFlg() == null ? other.getDeleteFlg() == null : this.getDeleteFlg().equals(other.getDeleteFlg()))
            && (this.getRemarks() == null ? other.getRemarks() == null : this.getRemarks().equals(other.getRemarks()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.articles
     *
     * @mbg.generated Wed Jul 26 00:01:51 GMT+09:00 2023
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getArticleId() == null) ? 0 : getArticleId().hashCode());
        result = prime * result + ((getArticleTitle() == null) ? 0 : getArticleTitle().hashCode());
        result = prime * result + ((getPostDate() == null) ? 0 : getPostDate().hashCode());
        result = prime * result + ((getArticleUrl() == null) ? 0 : getArticleUrl().hashCode());
        result = prime * result + ((getArticleContent() == null) ? 0 : getArticleContent().hashCode());
        result = prime * result + ((getTwitterLinkFlg() == null) ? 0 : getTwitterLinkFlg().hashCode());
        result = prime * result + ((getAkahataLinkFlg() == null) ? 0 : getAkahataLinkFlg().hashCode());
        result = prime * result + ((getNumOfComments() == null) ? 0 : getNumOfComments().hashCode());
        result = prime * result + ((getRegistrationTime() == null) ? 0 : getRegistrationTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getDeleteFlg() == null) ? 0 : getDeleteFlg().hashCode());
        result = prime * result + ((getRemarks() == null) ? 0 : getRemarks().hashCode());
        return result;
    }
}