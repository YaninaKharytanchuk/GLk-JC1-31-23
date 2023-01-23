package Task2;

public class Room {
  private byte name; // Объявление переменных глобальных
  private short room = 89;
  private int height = 3;
  private long length = 16;
  private boolean window;
  private char sign = 'p';
  private String street = "title";
  private float meaning1;
  private double meaning2 = 15.01;
  private Integer i = 33; // Объявление оболочек переменных
  private Character c = 'r';
  private Long l = 44L;
  private Short s =9;
  private Byte b = (byte)9;
  private Double d = 2.1;
  private Float f = 0.9F;
  private Boolean o = true;

  public byte getName() { // Созданы геттеры и сеттеры
    return name;
  }

  public void setName(byte name) {
    this.name = name;
  }

  public short getRoom() {
    return room;
  }

  public void setRoom(short room) {
    this.room = room;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public long getLength() {
    return length;
  }

  public void setLength(long length) {
    this.length = length;
  }

  public boolean isWindow() {
    return window;
  }

  public void setWindow(boolean window) {
    this.window = window;
  }

  public char getSign() {
    return sign;
  }

  public void setSign(char sign) {
    this.sign = sign;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public float getMeaning1() {
    return meaning1;
  }

  public void setMeaning1(float meaning1) {
    this.meaning1 = meaning1;
  }

  public double getMeaning2() {
    return meaning2;
  }

  public void setMeaning2(double meaning2) {
    this.meaning2 = meaning2;
  }

  public Integer getI() {
    return i;
  }

  public void setI(Integer i) {
    this.i = i;
  }

  public Character getC() {
    return c;
  }

  public void setC(Character c) {
    this.c = c;
  }

  public Long getL() {
    return l;
  }

  public void setL(Long l) {
    this.l = l;
  }

  public Short getS() {
    return s;
  }

  public void setS(Short s) {
    this.s = s;
  }

  public Byte getB() {
    return b;
  }

  public void setB(Byte b) {
    this.b = b;
  }

  public Double getD() {
    return d;
  }

  public void setD(Double d) {
    this.d = d;
  }

  public Float getF() {
    return f;
  }

  public void setF(Float f) {
    this.f = f;
  }

  public Boolean getO() {
    return o;
  }

  public void setO(Boolean o) {
    this.o = o;
  }
}

