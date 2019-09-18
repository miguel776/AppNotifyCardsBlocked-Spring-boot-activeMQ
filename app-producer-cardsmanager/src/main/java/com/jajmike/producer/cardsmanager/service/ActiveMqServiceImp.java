package com.jajmike.producer.cardsmanager.service;

import com.jajmike.producer.cardsmanager.component.jms.ActiveMqProductor;
import com.jajmike.producer.cardsmanager.model.Card;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementation of the ActiveMqService can contain different services related with our ActiveMQ, in this demo just have one but could have more
 *     - Send Cards Blocked to CardsNotifier by ActiveMq
 *
 * @author: Miguel Angel Gonzalez Hernandez
 * @version: 22/11/2018/A
 * @see <a href = "https://github.com/miguel776/" /> https://github.com/miguel776/ – Spring proyect backend; MVC, JPA, Maven, Toncat embedded </a>
 */
@Service
public class ActiveMqServiceImp implements ActiveMqService {

    @Autowired
    ActiveMqProductor activeMqProductor;

    /**
     * - Send Cards Blocked to CardsNotifier by ActiveMq
     *
     * @param cardBlokedList List<Card>
     */
    @Override
    public void sendCardsBlockedApp(List<Card> cardBlokedList) {

        activeMqProductor.productorCardsBlocked(cardBlokedList);
    }
}
