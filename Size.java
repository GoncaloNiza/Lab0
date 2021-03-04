
/**
 * Enumeration class Size - write a description of the enum class here
 *
 * @author Goncalo
 * @version (version number or date here)
 */
/**
 * varios tamanhos de chavenas
 */
public enum Size {
/**
 * Variaveis
 */
 SMALL(32, 36, "Pequeno",'S'),
 MEDIUM(37, 44, "Médio",'M'),
 LARGE(45, 52, "Grande",'L');
 private final String description;
 private final int minValue;
 private final int maxValue;
 private final char code;

 private Size(int minValue, int maxValue, String description, char code){
 this.description=description;
 this.minValue=minValue;
 this.maxValue=maxValue;
 this.code=code;
 }
 @Override
 public String toString() {
 return this.description;
 }
 
 /**
  * metodo para returnar a descriçao
  */
 
 public String getDescription() {
 return description;
 }

 
 /**
  * metodo para returnar o valor minimo
  */
 
 public int getMinValue() {
 return minValue;
 }
 
 /**
  * metodo para returnar o valor maximo
  */
 
 public int getMaxValue() {
 return maxValue;
 }
 
 /**
  * metodo para returnar o codigo
  */
 
 public char getCode() {
 return code;
 }

}