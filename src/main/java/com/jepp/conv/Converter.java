package com.jepp.conv;

import java.util.ArrayList;
import java.util.List;

public class Converter {

    public List<String> convert(String word) {

        ICAOcodeDAO icaoCodeDAO = new ICAOcodeDAO();
        List<String> convertedCodes = new ArrayList<>();
        String[] letterTab = word.split("");

        for (String letter : letterTab) {
            String code = icaoCodeDAO.getRecordFromDatabase(letter);
            convertedCodes.add(code);
        }
        return convertedCodes;
    }
}
