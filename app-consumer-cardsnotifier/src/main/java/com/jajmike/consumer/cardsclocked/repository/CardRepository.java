package com.jajmike.consumer.cardsclocked.repository;

import com.jajmike.consumer.cardsclocked.model.Card;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *  - This is a  CrudRepository  of the Card entity.
 *  - CrudRepository is a Spring Data interface for generic CRUD operations on a repository of a
 *    specific type. It provides several methods out of the box for interacting with a database.
 *
 * @author: Miguel Angel Gonzalez Hernandez
 * @version: 22/09/2018/A
 * @see <a href = "https://github.com/miguel776/" /> https://github.com/miguel776/ – Spring proyect backend; MVC, JPA, Maven, Toncat embedded </a>
 */
@Repository
public interface CardRepository extends CrudRepository<Card, Long> {

    /**
     * - Get all Cards  finding by the field SentTo
     * @param sentTo Boolean
     * @return List<Card>
     */
    List<Card> findBySentTo(Boolean sentTo);
}
