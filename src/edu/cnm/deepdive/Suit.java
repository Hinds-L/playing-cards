package edu.cnm.deepdive;

public enum Suit {
  CLUBS(Color.BLACK, '\u2663'),
  DIAMONDS(Color.RED, '\u2662'),
  HEART(Color.RED,'\u2661'),
  SPADES(Color.BLACK, '\u2660');

  private Color color;
  private char symbol;

  Suit(Color color, char symbol ) {
    this.symbol = symbol;
    this.color = color;
  }

  public Color getColor() {
    return color;
  }

  public char getSymbol(){
    return symbol;
  }

  public enum Color {
    BLACK, RED
  }
}
