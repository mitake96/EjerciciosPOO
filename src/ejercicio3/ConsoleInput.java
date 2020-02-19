package ejercicio3;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleInput {
	
	
	private final Scanner keyboard;
	public ConsoleInput(Scanner keyboard) {
	this.keyboard = keyboard;
	}
	private void cleanInput() {
	keyboard.nextLine();
	}
	
	public byte readByte() {
		
		byte result = 0;
		boolean y = true;
		do {
		try {
		result=keyboard.nextByte();
		y = false;
		}
		catch (InputMismatchException e) {
			y = true;
			System.out.println("Error, introduce un numero valido: ");
		} 
		finally { 
			cleanInput(); 
		}
		} while(y);
		return result;	
	}
	
	public short readShort() {
		short result = 0;
		boolean y = true;
		do {
		try {
		result=keyboard.nextShort();
		y = false;
		}
		catch (InputMismatchException e) {
			y = true;
			System.out.println("Error, introduce un numero valido: ");
		} 
		finally { 
			cleanInput(); 
		}
		} while(y);
		return result;	
	}
	
	public int readInt() {
		int result = 0;
		boolean y = true;
		do {
		try {
		result=keyboard.nextInt();
		y = false;
		}
		catch (InputMismatchException e) {
			y = true;
			System.out.println("Error, introduce un numero valido: ");
		} 
		finally { 
			cleanInput(); 
		}
		} while(y);
		return result;	
	}
	
	public long readLong() {
		long result = 0;
		boolean y = true;
		do {
		try {
		result=keyboard.nextLong();
		y = false;
		}
		catch (InputMismatchException e) {
			y = true;
			System.out.println("Error, introduce un numero valido: ");
		} 
		finally { 
			cleanInput(); 
		}
		} while(y);
		return result;	
	}
	
	public float readFloat() {
		float result = 0;
		boolean y = true;
		do {
		try {
		result=keyboard.nextFloat();
		y = false;
		}
		catch (InputMismatchException e) {
			y = true;
			System.out.println("Error, introduce un numero valido: ");
		} 
		finally { 
			cleanInput(); 
		}
		} while(y);
		return result;	
	}
	
	public double readDouble() {
		double result = 0;
		boolean y = true;
		do {
		try {
		result=keyboard.nextDouble();
		y = false;
		}
		catch (InputMismatchException e) {
			y = true;
			System.out.println("Error, introduce un numero valido: ");
		} 
		finally { 
			cleanInput(); 
		}
		} while(y);
		return result;	
	}
		
	public byte readByteLessThan(byte upperBound) {
		byte result;
		System.out.println("Introduzca un número menor que " + upperBound);
		do {
			result=readByte();
			if (result>=upperBound) {
				System.out.println("Introduzca un número menor que " + upperBound);
			}
		}while(result>=upperBound);
		return result;
	}
	
	public short readShortLessThan(short upperBound) {
		short result;
		System.out.println("Introduzca un número menor que " + upperBound);
		do {
			result=readShort();
			if (result>=upperBound) {
				System.out.println("Introduzca un número menor que " + upperBound);
			}
		}while(result>=upperBound);
		return result;
	}

	public int readIntLessThan(int upperBound) {
		int result;
		System.out.println("Introduzca un número menor que " + upperBound);
		do {
			result=readInt();
			if (result>=upperBound) {
				System.out.println("Introduzca un número menor que " + upperBound);
			}
		}while(result>=upperBound);
		return result;
	}
	
	public long readLongLessThan(long upperBound) {
		long result;
		System.out.println("Introduzca un número menor que " + upperBound);
		do {
			result=readLong();
			if (result>=upperBound) {
				System.out.println("Introduzca un número menor que " + upperBound);
			}
		}while(result>=upperBound);
		return result;
	}

	public float readFloatLessThan(float upperBound) {
		float result;
		System.out.println("Introduzca un número menor que " + upperBound);
		do {
			result=readFloat();
			if (result>=upperBound) {
				System.out.println("Introduzca un número menor que " + upperBound);
			}
		}while(result>=upperBound);
		return result;
	}

	public double readDoubleLessThan(double upperBound) {
		double result;
		System.out.println("Introduzca un número menor que " + upperBound);
		do {
			result=readDouble();
			if (result>=upperBound) {
				System.out.println("Introduzca un número menor que " + upperBound);
			}
		}while(result>=upperBound);
		return result;
	}
	
	public byte readByteLessOrEqualThan(byte upperBound) {
		byte result;
		System.out.println("Introduzca un número menor o igual que " + upperBound);
		do {
			result=readByte();
			if (result>upperBound) {
				System.out.println("Introduzca un número menor o igual que " + upperBound);
			}
		}while(result>upperBound);
		return result;
				
	}

	public short readShortLessOrEqualThan(short upperBound) {
		short result;
		System.out.println("Introduzca un número menor o igual que " + upperBound);
		do {
			result=readShort();
			if (result>upperBound) {
				System.out.println("Introduzca un número menor o igual que " + upperBound);
			}
		}while(result>upperBound);
		return result;
	}
	
	public int readIntLessOrEqualThan(int upperBound) {
		int result;
		System.out.println("Introduzca un número menor o igual que " + upperBound);
		do {
			result=readInt();
			if (result>upperBound) {
				System.out.println("Introduzca un número menor o igual que " + upperBound);
			}
		}while(result>upperBound);
		return result;
		
	}
	
	public long readLongLessOrEqualThan(long upperBound) {
		long result;
		System.out.println("Introduzca un número menor o igual que " + upperBound);
		do {
			result=readLong();
			if (result>upperBound) {
				System.out.println("Introduzca un número menor o igual que " + upperBound);
			}
		}while(result>upperBound);
		return result;
	}

	public float readFloatLessOrEqualThan(float upperBound) {
		float result;
		System.out.println("Introduzca un número menor o igual que " + upperBound);
		do {
			result=readFloat();
			if (result>upperBound) {
				System.out.println("Introduzca un número menor o igual que " + upperBound);
			}
		}while(result>upperBound);
		return result;
	}

	public double readDoubleLessOrEqualThan(double upperBound) {
		double result;
		System.out.println("Introduzca un número menor o igual que " + upperBound);
		do {
			result=readDouble();
			if (result>upperBound) {
				System.out.println("Introduzca un número menor o igual que " + upperBound);
			}
		}while(result>upperBound);
		return result;
	}
	
	public byte readByteGreaterThan(byte lowerBound) {
		byte result;
		System.out.println("Introduzca un número mayor que " + lowerBound);
		do {
			result=readByte();
			if (result<=lowerBound) {
				System.out.println("Introduzca un número mayor que " + lowerBound);
			}
		}while(result<=lowerBound);
		return result;
				
	}

	public short readShortGreatherThan(short lowerBound) {
		short result;
		System.out.println("Introduzca un número mayor que " + lowerBound);
		do {
			result=readShort();
			if (result<=lowerBound) {
				System.out.println("Introduzca un número mayor que " + lowerBound);
			}
		}while(result<=lowerBound);
		return result;
	}

	public int readIntGreatherThan(int lowerBound) {
		int result;
		System.out.println("Introduzca un número mayor que " + lowerBound);
		do {
			result=readInt();
			if (result<=lowerBound) {
				System.out.println("Introduzca un número mayor que " + lowerBound);
			}
		}while(result<=lowerBound);
		return result;
	}
	
	public long readLongGreatherThan(long lowerBound) {
		long result;
		System.out.println("Introduzca un número mayor que " + lowerBound);
		do {
			result=readLong();
			if (result<=lowerBound) {
				System.out.println("Introduzca un número mayor que " + lowerBound);
			}
		}while(result<=lowerBound);
		return result;
	}

	public float readFloatGreatherThan(float lowerBound) {
		float result;
		System.out.println("Introduzca un número mayor que " + lowerBound);
		do {
			result=readFloat();
			if (result<=lowerBound) {
				System.out.println("Introduzca un número mayor que " + lowerBound);
			}
		}while(result<=lowerBound);
		return result;
	}
	
	public double readDoubleGreatherThan(double lowerBound) {
		double result;
		System.out.println("Introduzca un número mayor que " + lowerBound);
		do {
			result=readDouble();
			if (result<=lowerBound) {
				System.out.println("Introduzca un número mayor que " + lowerBound);
			}
		}while(result<=lowerBound);
		return result;
	}
	
	public byte readByteGreaterOrEqualThan(byte lowerBound) {
		byte result;
		System.out.println("Introduzca un número mayor o igual que " + lowerBound);
		do {
			result=readByte();
			if (result<lowerBound) {
				System.out.println("Introduzca un número mayor o igual que " + lowerBound);
			}
		}while(result<lowerBound);
		return result;	
		
		
		
	}
	
	public short readShortGreaterorEqualThan(short lowerBound) {
		short result;
		System.out.println("Introduzca un número mayor o igual que " + lowerBound);
		do {
			result=readShort();
			if (result<lowerBound) {
				System.out.println("Introduzca un número mayor o igual que " + lowerBound);
			}
		}while(result<lowerBound);
		return result;	
	}
	
	public int readIntGreatherorEqualThan(int lowerBound) {
		int result;
		System.out.println("Introduzca un número mayor o igual que " + lowerBound);
		do {
			result=readInt();
			if (result<lowerBound) {
				System.out.println("Introduzca un número mayor o igual que " + lowerBound);
			}
		}while(result<lowerBound);
		return result;	
	}

	public long readLongGreatherorEqualThan(long lowerBound) {
		long result;
		System.out.println("Introduzca un número mayor o igual que " + lowerBound);
		do {
			result=readLong();
			if (result<lowerBound) {
				System.out.println("Introduzca un número mayor o igual que " + lowerBound);
			}
		}while(result<lowerBound);
		return result;	
	}

	public float readFloatGreatherorEqualThan(float lowerBound) {
		float result;
		System.out.println("Introduzca un número mayor o igual que " + lowerBound);
		do {
			result=readFloat();
			if (result<lowerBound) {
				System.out.println("Introduzca un número mayor o igual que " + lowerBound);
			}
		}while(result<lowerBound);
		return result;	
	}

	public double readDoubleGreatherorEqualThan(double lowerBound) {
		double result;
		System.out.println("Introduzca un número mayor o igual que " + lowerBound);
		do {
			result=readDouble();
			if (result<lowerBound) {
				System.out.println("Introduzca un número mayor o igual que " + lowerBound);
			}
		}while(result<lowerBound);
		return result;	
	}
	
	public byte readByteInRangeInclusive(byte lowerBound, byte upperBound) {
		byte result;
		System.out.println("Introduzca un número entre " + lowerBound + " y " + upperBound + "ambos incluidos");
		do {
			result=readByte();
			if (result>upperBound) {
				System.out.println("Introduzca un número entre " + lowerBound + " y " + upperBound + "ambos incluidos");
			}
			else if(result<lowerBound) {
				System.out.println("Introduzca un número entre " + lowerBound + " y " + upperBound + "ambos incluidos");
			}
		}while(result>upperBound || result<lowerBound);
		return result;		
	}
	
	public short readShortInRangeInclusive(short lowerBound, short upperBound) {
		short result;
		System.out.println("Introduzca un número entre " + lowerBound + " y " + upperBound + "ambos incluidos");
		do {
			result=readShort();
			if (result>upperBound) {
				System.out.println("Introduzca un número entre " + lowerBound + " y " + upperBound + "ambos incluidos");
			}
			else if(result<lowerBound) {
				System.out.println("Introduzca un número entre " + lowerBound + " y " + upperBound + "ambos incluidos");
			}
		}while(result>upperBound || result<lowerBound);
		return result;		
	}

	public int readIntInRangeInclusive(int lowerBound, int upperBound) {
		int result;
		System.out.println("Introduzca un número entre " + lowerBound + " y " + upperBound + "ambos incluidos");
		do {
			result=readInt();
			if (result>upperBound) {
				System.out.println("Introduzca un número entre " + lowerBound + " y " + upperBound + "ambos incluidos");
			}
			else if(result<lowerBound) {
				System.out.println("Introduzca un número entre " + lowerBound + " y " + upperBound + "ambos incluidos");
			}
		}while(result>upperBound || result<lowerBound);
		return result;		
	}
	
	public long readLongInRangeInclusive(long lowerBound, long upperBound) {
		long result;
		System.out.println("Introduzca un número entre " + lowerBound + " y " + upperBound + "ambos incluidos");
		do {
			result=readLong();
			if (result>upperBound) {
				System.out.println("Introduzca un número entre " + lowerBound + " y " + upperBound + "ambos incluidos");
			}
			else if(result<lowerBound) {
				System.out.println("Introduzca un número entre " + lowerBound + " y " + upperBound + "ambos incluidos");
			}
		}while(result>upperBound || result<lowerBound);
		return result;		
	}

	public float readFloatInRangeInclusive(float lowerBound, float upperBound) {
		float result;
		System.out.println("Introduzca un número entre " + lowerBound + " y " + upperBound + "ambos incluidos");
		do {
			result=readFloat();
			if (result>upperBound) {
				System.out.println("Introduzca un número entre " + lowerBound + " y " + upperBound + "ambos incluidos");
			}
			else if(result<lowerBound) {
				System.out.println("Introduzca un número entre " + lowerBound + " y " + upperBound + "ambos incluidos");
			}
		}while(result>upperBound || result<lowerBound);
		return result;		
	}

	public double readDoubleInRangeInclusive(double lowerBound, double upperBound) {
		double result;
		System.out.println("Introduzca un número entre " + lowerBound + " y " + upperBound + "ambos incluidos");
		do {
			result=readDouble();
			if (result>upperBound) {
				System.out.println("Introduzca un número entre " + lowerBound + " y " + upperBound + "ambos incluidos");
			}
			else if(result<lowerBound) {
				System.out.println("Introduzca un número entre " + lowerBound + " y " + upperBound + "ambos incluidos");
			}
		}while(result>upperBound || result<lowerBound);
		return result;		
	}
	
	public byte readByteInRangeExclusive(byte lowerBound, byte upperBound) {
		byte result;
		System.out.println("Introduzca un número entre " + lowerBound + " y " + upperBound + "ambos excluidos");
		do {
			result=readByte();
			if (result>=upperBound) {
				System.out.println("Introduzca un número entre " + lowerBound + " y " + upperBound + "ambos excluidos");
			}
			else if(result<lowerBound) {
				System.out.println("Introduzca un número entre " + lowerBound + " y " + upperBound + "ambos excluidos");
			}
		}while(result>=upperBound || result<lowerBound);
		return result;		
	}

	public short readShortInRangeExclusive(short lowerBound, short upperBound) {
		short result;
		System.out.println("Introduzca un número entre " + lowerBound + " y " + upperBound + "ambos excluidos");
		do {
			result=readShort();
			if (result>=upperBound) {
				System.out.println("Introduzca un número entre " + lowerBound + " y " + upperBound + "ambos excluidos");
			}
			else if(result<lowerBound) {
				System.out.println("Introduzca un número entre " + lowerBound + " y " + upperBound + "ambos excluidos");
			}
		}while(result>=upperBound || result<lowerBound);
		return result;
	}

	public int readIntInRangeExclusive(int lowerBound, int upperBound) {
		int result;
		System.out.println("Introduzca un número entre " + lowerBound + " y " + upperBound + "ambos excluidos");
		do {
			result=readInt();
			if (result>=upperBound) {
				System.out.println("Introduzca un número entre " + lowerBound + " y " + upperBound + "ambos excluidos");
			}
			else if(result<lowerBound) {
				System.out.println("Introduzca un número entre " + lowerBound + " y " + upperBound + "ambos excluidos");
			}
		}while(result>=upperBound || result<lowerBound);
		return result;		
	}

	public long readLongInRangeExclusive(long lowerBound, long upperBound) {
		long result;
		System.out.println("Introduzca un número entre " + lowerBound + " y " + upperBound + "ambos excluidos");
		do {
			result=readLong();
			if (result>=upperBound) {
				System.out.println("Introduzca un número entre " + lowerBound + " y " + upperBound + "ambos excluidos");
			}
			else if(result<lowerBound) {
				System.out.println("Introduzca un número entre " + lowerBound + " y " + upperBound + "ambos excluidos");
			}
		}while(result>=upperBound || result<lowerBound);
		return result;		
	}

	public float readFloatInRangeExclusive(float lowerBound, float upperBound) {
		float result;
		System.out.println("Introduzca un número entre " + lowerBound + " y " + upperBound + "ambos excluidos");
		do {
			result=readFloat();
			if (result>=upperBound) {
				System.out.println("Introduzca un número entre " + lowerBound + " y " + upperBound + "ambos excluidos");
			}
			else if(result<lowerBound) {
				System.out.println("Introduzca un número entre " + lowerBound + " y " + upperBound + "ambos excluidos");
			}
		}while(result>=upperBound || result<lowerBound);
		return result;		
	}

	public double readDoubleInRangeExclusive(double lowerBound, double upperBound) {
		double result;
		System.out.println("Introduzca un número entre " + lowerBound + " y " + upperBound + "ambos excluidos");
		do {
			result=readDouble();
			if (result>=upperBound) {
				System.out.println("Introduzca un número entre " + lowerBound + " y " + upperBound + "ambos excluidos");
			}
			else if(result<lowerBound) {
				System.out.println("Introduzca un número entre " + lowerBound + " y " + upperBound + "ambos excluidos");
			}
		}while(result>=upperBound || result<lowerBound);
		return result;		
	}

	public char readChar() {
		String cadena;
		char letra;
		do {
			cadena=keyboard.nextLine();
			if (cadena.length()!=1 ){
				System.out.println("Introduce un carácter válido ");
			}
		}while(cadena.length()!=1);
		letra = cadena.charAt(0);
		
		return letra;
	}

	public char readChar(String validCharacters) { //introduce un solo caracter
		char letra;
		int count=0;
		boolean condition=true;
		do {
			count=0;
			letra=readChar();
			do {
				if (letra==validCharacters.charAt(count) ){
				condition=false;
				}
				count++;
				}while(condition && count < validCharacters.length());
			if (condition) {
				System.out.println("El caracter introducido no coincide con los caracteres validos "+validCharacters+" vuelva a introducirlo: ");
			}
			}while(condition); 
		return letra;
		
		
	}

	public char readVowel() {		//introduce una sola vocal
		String cadena;
		char c;
		boolean cond1 = false, cond2;


		
		do {
			cond1 = true;

			do {
				cond2 = true;
				cadena = this.keyboard.nextLine();
				if (cadena.length() != 1) {
					System.out.println("Error, has introducido m�s de un caracter");
					cond2 = false;
				}
			} while (!cond2);

			c = Character.toLowerCase(cadena.charAt(0));

			if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
				System.out.println("Introduce una sola vocal");
				cond1 = false;
				cleanInput(); 
			}

		} while (!cond1);

		return c;
	}

	public char readDigit() {	//introduce un solo digito
		String cadena;
		char letra;
		boolean cond1 = false, cond2;


		
		do {
			cond1 = true;
			
			do {
				cond2 = true;
				cadena = this.keyboard.nextLine();
				if (cadena.length() != 1) {
					System.out.println("Introduce un solo digito");
					cond2 = false;
				}
			} while (!cond2);

			letra = cadena.charAt(0);

			if (letra <= 48 || letra >= 57) {	//codigos unicode desde el 0 hasta el 9
				cond1 = false;
				cleanInput();
			}

		} while (!cond1);

		return letra;
	}
 
	public char readLowerCase() {
		String cadena;
		char letra;
		boolean cond1 = false, cond2;

		System.out.println("Introduce un solo digito");
		
		do {
			cond1 = true;
			
			do {
				cond2 = true;
				cadena = this.keyboard.nextLine();
				if (cadena.length() != 1) {
					System.out.println("Introduce un solo caracter");
					cond2 = false;
				}
			} while (!cond2);

			letra = Character.toLowerCase(cadena.charAt(0));

			
			if (letra < 97 || letra > 122) {	//Caracteres de la a a la z en unicode
				System.out.println("Introduce un caracter valido");
				cond1 = false;
			}
		} while (!cond1);

		return letra;
	}

	public char readUpperCase() {
		String cadena;
		char letra;
		boolean cond1 = false, cond2;

		System.out.println("Introduce un solo digito");
		
		do {
			cond1 = true;
			
			do {
				cond2 = true;
				cadena = this.keyboard.nextLine();
				if (cadena.length() != 1) {
					System.out.println("Introduce un solo caracter");
					cond2 = false;
				}
			} while (!cond2);

			letra = Character.toLowerCase(cadena.charAt(0));

			
			if (letra < 65 || letra > 90) {	//Caracteres de la A la Z en unicode
				System.out.println("Introduce un caracter valido");
				cond1 = false;
			}
		} while (!cond1);

		return letra;
	}
	
	public String readString() {	//introduce una cadena
		String cad;
		cad=keyboard.nextLine();
		return cad;
	}

	public String readString(int maxLength) {
		String cad;
		System.out.println("Introduce una cadena de " + maxLength + "caracteres");
		do{
			cad=keyboard.nextLine();
			if (maxLength<cad.length()) {
				System.out.println("Introduce una cadena de " + maxLength + "caracteres");
			}
		}while(maxLength<cad.length());
		return cad;
	}
	
	public boolean readBooleanUsingChar(char affirmativeValue) {
		boolean result=false;
		System.out.println("Introduzca "+ affirmativeValue+ "para indicar verdadero u otro caracter para indicar falso");

			if (Character.toLowerCase(affirmativeValue) == Character.toLowerCase(readChar())) {
				result = true;
				System.out.println("Verdadero");
			}
			
			else {
				System.out.println("Falso");
			}

		return result;
	}
	
	public boolean readBooleanUsingChar()  { 
		System.out.println("Introduzca s o S para indicar verdadero u otro caracter para indicar falso");
		boolean result=false;

			if (Character.toLowerCase(readChar()) == 's') {
				result = true;
				System.out.println("Verdadero");
			} 
			
			else {
				System.out.println("Falso");
			}

		return result;
	}
	
	public boolean readBooleanUsingInt(int affirmativeValue) {
		boolean result=false;
		System.out.println("Introduce " + affirmativeValue + "para confirmar");
		if(affirmativeValue==keyboard.nextInt()) {
			result=true;
		}
		return result;
	}
	
	public boolean readBooleanUsintInt() {
		boolean result=false;
		int x = 1;
		System.out.println("Introduce " + x + "para confirmar");
		
		if(keyboard.nextInt()==x) {
			result=true;
		}
			
		return result;
	}

}
