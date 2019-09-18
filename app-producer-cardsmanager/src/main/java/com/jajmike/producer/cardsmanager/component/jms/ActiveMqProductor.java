package com.jajmike.producer.cardsmanager.component.jms;

import com.jajmike.producer.cardsmanager.model.Card;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
import java.util.List;

/**
 * - The follow component there are the producers of the different queue of ActiveMq server.
 * - In this demo there is just a producer to the queue cardsclocked but could be more.
 *
 * @author: Miguel Angel Gonzalez Hernandez
 * @version: 22/11/2018/A
 * @see <a href = "https://github.com/miguel776/" /> https://github.com/miguel776/ – Spring proyect backend; MVC, JPA, Maven, Toncat embedded </a>
 */
@Component
public class ActiveMqProductor {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${activemq.queue-Cb}")
    private String activemqQueueCardsBlocked;

    @Autowired
    private JmsTemplate jmsTemplate;

    /**
     * - This  is a producer that is responsible to record the messages of the queue cardsnotifier
     *   of activeMQ, each message contain a list of cads block.
     *
     * @param messageJmsAll List<Card>
     */
    public void productorCardsBlocked( List<Card> messageJmsAll) {

        logger.info("#### ActiveMq:::productorCardsBlocked:::producer that is responsible to record the messages of the queue cardsnotifier of activeMQ" );

        jmsTemplate.convertAndSend(activemqQueueCardsBlocked, messageJmsAll);

    }

}
