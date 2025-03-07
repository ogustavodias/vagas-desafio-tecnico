package com.ogustavodias.vagas.enums;

public enum ExpLevel {
  TRAINEE(1), JUNIOR(2), MID_LEVEL(3), SENIOR(4), SPECIALIST(5);

  private final int cod;

  ExpLevel(int cod) {
    this.cod = cod;
  }

  public int getCod() {
    return cod;
  }

  public static ExpLevel fromCod(int cod) {
    for (ExpLevel expLevel : ExpLevel.values()) {
      if (cod == expLevel.getCod())
        return expLevel;
    }

    throw new IllegalArgumentException("Código inválido: " + cod);
  }
}
