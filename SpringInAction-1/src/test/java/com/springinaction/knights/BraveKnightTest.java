package com.springinaction.knights;

import com.springinaction.quests.Quest;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkOnQuest() {
        //given
        Quest mockQuest = mock(Quest.class);
        BraveKnight braveKnight = new BraveKnight(mockQuest);

        //when
        braveKnight.embarkOnQuest();

        //then
        verify(mockQuest, times(1)).embark();
    }

}
