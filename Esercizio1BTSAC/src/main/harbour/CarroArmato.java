package main.harbour;

/**
 * ************* * DA COMPLETARE * ************* *
 */
public class CarroArmato extends Invasore {
	private int missili;
	private int stazza;

	public CarroArmato() {
		missili = 1;
		stazza = 1;
	}

	public CarroArmato(int mi, int st) {
		missili = mi;
		stazza = st;
	}

	public int getMissili() {
		return missili;
	}

	public void setMissili(int missili) {
		this.missili = missili;
	}

	public int getStazza() {
		return stazza;
	}

	public void setStazza(int stazza) {
		this.stazza = stazza;
	}

	@Override
	public int potenzaFuoco() {
		int pf = 0;
		pf = (missili * stazza) * 30 / 100;// parentesi solo per forma
		return pf;
	}
}
