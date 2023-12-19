package eofim;

public class retangulo {
	private double area;
	private double perimetro;
	private double base;
	private double altura;
	
	public retangulo () {
			
	}
	public retangulo (double base, double altura) {
		
	}
	
	
	public double getArea() {
		return area;
	}
	public void setArea() {
		this.area = base * altura;
	}
	public double getPerimetro() {
		return perimetro;
	}
	public void setPerimetro() {
		this.perimetro = 2*(base + altura);
	}
	

}
