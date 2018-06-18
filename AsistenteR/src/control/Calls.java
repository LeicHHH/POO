package control;

public class calls {
	private String nombreContacto;
	private int Number;
	private String areaCode;
	private String horaLlamada;
	
	public calls(int number, String areaCode, String NombreContacto,String horaLLamada) {
		this.nombreContacto = NombreContacto;
		this.Number = number;
		this.areaCode = areaCode;
		this.horaLlamada = horaLLamada;
	}
	
	public void printCall() {
          System.out.println("LLamada de :" + this.nombreContacto + "Hora llamada:" + this.horaLlamada );
	}
	
	public void SetLlamada(String LLamada) {
		this.nombreContacto = LLamada;
	}
	
	

}
