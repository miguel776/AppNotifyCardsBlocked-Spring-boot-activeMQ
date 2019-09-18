package com.jajmike.producer.cardsmanager.service;

import com.jajmike.producer.cardsmanager.model.Card;
import java.util.List;

/**
 * Interface of the ActiveMqService can contain different services related with our ActiveMQ, in this demo just have one but could have more
 *     - Send Cards Blocked to CardsNotifier by ActiveMq
 *
 * @author: Miguel Angel Gonzalez Hernandez
 * @version: 22/11/2018/A
 * @see <a href = "https://github.com/miguel776/" /> https://github.com/miguel776/ – Spring proyect backend; MVC, JPA, Maven, Toncat embedded </a>
 *
 */
public interface ActiveMqService {

    /**
     - Send Cards Blocked to CardsNotifier by ActiveMq
     * @param cardBlokedList List<Card>
     */
    void sendCardsBlockedApp(List<Card> cardBlokedList);

}
