package com.jajmike.consumer.cardsclocked.service;

import com.jajmike.consumer.cardsclocked.model.Card;

import java.util.List;

/**
 * Interface of the CardBlokedService for the management of card of the application
 *     - Save a list Card
 *     - Update a list Card
 *     - Get a list Card by the field sendTo
 *
 * @author: Miguel Angel Gonzalez Hernandez
 * @version: 22/11/2018/A
 * @see <a href = "https://github.com/miguel776/" /> https://github.com/miguel776/ – Spring proyect backend; MVC, JPA, Maven, Toncat embedded </a>
 */
public interface CardBlokedService {

    /**
     * - Save a list Card  in the table CARD_BLOCKED_APP_B
     * @param cardBlokedList List<Card>
     */
    void setListCard(List<Card> cardBlokedList);

    /**
     * - Update a list Card Bloked in the table CARD_BLOCKED_APP_B
     * @param cardList List<Card>
     * @return Boolean
     */
    List<Card> upDateList(List<Card> cardList);

    /**
     * - Get a list Card by the field ToSend in the table CARD_BLOCKED_APP_B
     * @param sendTo List<Card>
     * @return Boolean
     */
    List<Card> getListCardsToSend(Boolean sendTo);
}
