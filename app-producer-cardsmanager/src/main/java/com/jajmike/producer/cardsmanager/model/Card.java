package com.jajmike.producer.cardsmanager.model;

import javax.persistence.*;
import java.util.Date;

/**
 *  - The Card class is annotated with @Card, indicating that it is a JPA entity. For lack of a @Table annotation, it is assumed
 *    that this entity will be mapped to a table named CARD_BLOCKED_APP_B.
 *  - The Employee´s id property is annotated with @Id so that JPA will recognize it as the object’s ID.
 *  - The properties call name, card, cardHolderName, blocked, sentTo are annotate as @Column, it is mean that will be mapped to
 *    columns that share, on the other hand, card and cardHolderName properties can have max length 20, can´t be null as indicated
 *    in the annotation @Column.
 *
 * @author: Miguel Angel Gonzalez Hernandez
 * @version: 22/11/2018/A
 * @see <a href = "https://github.com/miguel776/" /> https://github.com/miguel776/ – Spring proyect backend; MVC, JPA, Maven, Toncat embedded </a>
 */
@Entity(name = "card")
@Table(name = "CARD_APP_A")
public class Card  {

    @Id
    public Integer id;

    @Column(name = "CARD", length = 20, nullable = false, unique=true)
    public String card;

    @Column(name = "CARD_HOLDER_NAME", length = 20, nullable = false, unique=false)
    public String cardHolderName;

    @Column(name = "EXPIRY_DATE",  nullable = false, unique=false)
    public Date expiryDate;

    @Column(name = "BLOCKED", nullable = false, unique=false)
    public Boolean blocked;

    @Column(name = "SENT_TO", nullable = false, unique=false)
    public Boolean sentTo;

    /**
     * Card identifier
     * @return Integer
     */
    public Integer getId() {
        return id;
    }

    /**
     * Card identifier
     * @param id Integer
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Card number
     * @return String
     */
    public String getCard() {
        return card;
    }

    /**
     * Card number
     * @param idCard String
     */
    public void setCard(String idCard) {
        this.card = idCard;
    }

    /**
     * Card holder name
     * @return String
     */
    public String getCardHolderName() {
        return cardHolderName;
    }

    /**
     * Card holder name
     * @param cardHolderName String
     */
    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    /**
     * Expiry date
     * @return Date
     */
    public Date getExpiryDate() {
        return expiryDate;
    }

    /**
     * Expiry date
     * @param expiryDate Date
     */
    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    /**
     * Indicate if card is blocked
     * @return Boolean
     */
    public Boolean getBlocked() {
        return blocked;
    }

    /**
     * Indicate if card is blocked
     * @param blocked Boolean
     */
    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    /**
     * Indicate if card is sent it
     * @return Boolean
     */
    public Boolean getSentTo() {
        return sentTo;
    }

    /**
     * Indicate if card is sent it
     * @param sentTo Boolean
     */
    public void setSentTo(Boolean sentTo) {
        this.sentTo = sentTo;
    }
}
