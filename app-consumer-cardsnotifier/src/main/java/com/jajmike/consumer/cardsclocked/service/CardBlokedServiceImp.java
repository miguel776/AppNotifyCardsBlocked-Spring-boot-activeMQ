package com.jajmike.consumer.cardsclocked.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jajmike.consumer.cardsclocked.repository.CardRepository;
import com.jajmike.consumer.cardsclocked.model.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Implementation  of the CardBlokedService for the management of card of the application
 *     - Save a list Card
 *     - Update a list Card
 *     - Get a list Card by the field sendTo
 *
 * @author: Miguel Angel Gonzalez Hernandez
 * @version: 22/11/2018/A
 * @see <a href = "https://github.com/miguel776/" /> https://github.com/miguel776/ – Spring proyect backend; MVC, JPA, Maven, Toncat embedded </a>
 */
@Service
public class CardBlokedServiceImp implements CardBlokedService {

    @Autowired
    private CardRepository cardBlokerRepository;

    /**
     * - Save a list Card  in the table CARD_BLOCKED_APP_B
     * @param cardBlokedList List<Card>
     */
    @Override
    public void setListCard(List<Card> cardBlokedList) {

        ObjectMapper mapper = new ObjectMapper();
        Iterable<Card> driverlocationsList = mapper.convertValue(cardBlokedList, new TypeReference<Iterable<Card>>() { });

        cardBlokerRepository.saveAll(driverlocationsList);
    }

    /**
     * - Update a list Card Bloked in the table CARD_BLOCKED_APP_B
     * @param cardList List<Card>
     * @return Boolean
     */
    @Override
    public List<Card> upDateList(List<Card> cardList){

        ObjectMapper mapper = new ObjectMapper();
        Iterable<Card> driverlocationsList = mapper.convertValue(cardList, new TypeReference<Iterable<Card>>() { });

        List<Card> ListResul = (List<Card>) cardBlokerRepository.saveAll(driverlocationsList);
        return ListResul;
    }

    /**
     * - Get a list Card by the field ToSend in the table CARD_BLOCKED_APP_B
     * @param sendTo List<Card>
     * @return Boolean
     */
    @Override
    public List<Card> getListCardsToSend(Boolean sendTo) {

        List<Card> result = cardBlokerRepository.findBySentTo(sendTo);
        return result;
    }
}
