package jp.ac.uryukyu.ie.e175736;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

class TestPlay {

    @Test
    void changeKomaColor() {
        Field field = new Field();
        field.changeStoneColor(4, 4, "W");
        assertEquals("W", field.getKoma(4,4).getColor());
    }
}