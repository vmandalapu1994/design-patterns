package com.design_pattern.flyweight.implementation1;

import java.util.HashMap;
import java.util.Map;

public class FontFactory {

    private Map<String, Font> fontMap = new HashMap<>();

    public Font getFont(String fontName) {
        if (fontMap.containsKey(fontName)) {
            return fontMap.get(fontName);
        }
        Font font = new FontImpl(fontName);
        fontMap.put(fontName, font);
        return font;
    }

}
