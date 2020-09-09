package com.tarento.walletService.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Keeps the information about each transaction of coins
 */
public class WalletLedger {

    @JsonProperty("id")
    private String id = null;

    @JsonProperty("from_user_wallet_id")
    private String fromUserWalletId = null;

    @JsonProperty("to_user_wallet_id")
    private String toUserWalletId = null;

    @JsonProperty("number_of_coins")
    private Integer numberOfCoins = null;

    @JsonProperty("comments")
    private String comments = null;

    @JsonProperty("transaction_by")
    private String transactionBy = null;

    @JsonProperty("transaction_datetime")
    private Long transactionDatetime = null;

    /**
     * Auto generated Primary Key Id
     *
     * @return id
     **/
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Reference to UserId of the person who initiated the transfer
     *
     * @return fromUserWalletId
     **/
    public String getFromUserWalletId() {
        return fromUserWalletId;
    }

    public void setFromUserWalletId(String fromUserWalletId) {
        this.fromUserWalletId = fromUserWalletId;
    }

    /**
     * Reference to UserId of the person who receives the coins in the transfer
     *
     * @return toUserWalletId
     **/
    public String getToUserWalletId() {
        return toUserWalletId;
    }

    public void setToUserWalletId(String toUserWalletId) {
        this.toUserWalletId = toUserWalletId;
    }

    /**
     * Number of coins transferred
     *
     * @return numberOfCoins
     **/
    public Integer getNumberOfCoins() {
        return numberOfCoins;
    }

    public void setNumberOfCoins(Integer numberOfCoins) {
        this.numberOfCoins = numberOfCoins;
    }

    /**
     * Comments about the transaction
     *
     * @return comments
     **/
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * Reference to UserId of the person who creates the entry
     *
     * @return transactionBy
     **/
    public String getTransactionBy() {
        return transactionBy;
    }

    public void setTransactionBy(String transactionBy) {
        this.transactionBy = transactionBy;
    }

    /**
     * Created DateTime in EPOCH format
     *
     * @return transactionDatetime
     **/
    public Long getTransactionDatetime() {
        return transactionDatetime;
    }

    public void setTransactionDatetime(Long transactionDatetime) {
        this.transactionDatetime = transactionDatetime;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WalletLedger walletLedger = (WalletLedger) o;
        return Objects.equals(this.id, walletLedger.id) &&
                Objects.equals(this.fromUserWalletId, walletLedger.fromUserWalletId) &&
                Objects.equals(this.toUserWalletId, walletLedger.toUserWalletId) &&
                Objects.equals(this.numberOfCoins, walletLedger.numberOfCoins) &&
                Objects.equals(this.comments, walletLedger.comments) &&
                Objects.equals(this.transactionBy, walletLedger.transactionBy) &&
                Objects.equals(this.transactionDatetime, walletLedger.transactionDatetime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fromUserWalletId, toUserWalletId, numberOfCoins, comments, transactionBy, transactionDatetime);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WalletLedger {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    fromUserWalletId: ").append(toIndentedString(fromUserWalletId)).append("\n");
        sb.append("    toUserWalletId: ").append(toIndentedString(toUserWalletId)).append("\n");
        sb.append("    numberOfCoins: ").append(toIndentedString(numberOfCoins)).append("\n");
        sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
        sb.append("    transactionBy: ").append(toIndentedString(transactionBy)).append("\n");
        sb.append("    transactionDatetime: ").append(toIndentedString(transactionDatetime)).append("\n");
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