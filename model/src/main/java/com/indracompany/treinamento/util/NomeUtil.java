package com.indracompany.treinamento.util;

import org.apache.commons.lang3.StringUtils;

public class NomeUtil {

    public static boolean validaNome(final String nome) {
        if (StringUtils.isNotBlank(nome)
                && !StringUtils.isNumeric(nome)
                && nome.length() >= 2) {
            return true;
        }

        return false;
    }
}
