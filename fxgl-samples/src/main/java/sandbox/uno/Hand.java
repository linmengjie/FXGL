/*
 * FXGL - JavaFX Game Library. The MIT License (MIT).
 * Copyright (c) AlmasB (almaslvl@gmail.com).
 * See LICENSE for details.
 */

package sandbox.uno;

import com.almasb.fxgl.entity.Entity;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * @author Almas Baimagambetov (almaslvl@gmail.com)
 */
public class Hand {

    private ObservableList<Entity> cards = FXCollections.observableArrayList();

    public ObservableList<Entity> cardsProperty() {
        return FXCollections.unmodifiableObservableList(cards);
    }

    public void addCard(Entity card) {
        cards.add(card);
    }

    public void removeCard(Entity card) {
        cards.remove(card);
    }
}
