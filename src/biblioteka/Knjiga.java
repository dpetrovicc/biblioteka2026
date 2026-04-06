package biblioteka;

import java.util.List;
import java.util.Objects;

/**
 * Predstavlja knjigu u biblioteci.
 * 
 * Svaka knjiga ima naslov, ISBN broj, listu autora,
 * izdavaca i broj izdanja.
 * 
 * @author Dusan Petrovic
 * @version 1.0
 */
public class Knjiga {

	/**
	 * Naslov knjige kao String.
	 */
	private String naslov;
	
	/**
	 * ISBN broj knjige.
	 */
	private long isbn;
	
	/**
	 * Lista autora knjige.
	 */
	private List<Autor> autori;
	
	/**
	 * Naziv izdavaca knjige.
	 */
	private String izdavac;
	
	/**
	 * Broj izdanja knjige.
	 */
	private int izdanje;
	
	/**
	 * Vraca naslov knjige.
	 * 
	 * @return naslov knjige kao String.
	 */
	public String getNaslov() {
		return naslov;
	}
	
	/**
	 * Postavlja naslov knjige na unetu vrednost.
	 * 
	 * @param naslov Novi naslov knjige.
	 * @throws java.lang.NullPointerException Ako je naslov null.
	 * @throws java.lang.IllegalArgumentException Ako je naslov prazan String.
	 */
	public void setNaslov(String naslov) {
		if (naslov == null)
			throw new NullPointerException("Naslov ne sme biti null");
		
		if (naslov.isEmpty())
			throw new IllegalArgumentException("Naslov ne sme biti prazan");
		
		this.naslov = naslov;
	}
	
	/**
	 * Vraca ISBN broj knjige.
	 * 
	 * @return ISBN kao long vrednost.
	 */
	public long getIsbn() {
		return isbn;
	}
	
	/**
	 * Postavlja ISBN broj knjige.
	 * 
	 * @param isbn Novi ISBN broj.
	 * @throws java.lang.IllegalArgumentException Ako je ISBN manji ili jednak nuli.
	 */
	public void setIsbn(long isbn) {
		if(isbn <= 0)
			throw new IllegalArgumentException("ISBN mora biti veci od nule");
		
		this.isbn = isbn;
	}
	
	/**
	 * Vraca listu autora knjige.
	 * 
	 * @return lista autora.
	 */
	public List<Autor> getAutori() {
		return autori;
	}

	/**
	 * Postavlja listu autora knjige.
	 * 
	 * @param autori Lista autora.
	 */
	public void setAutori(List<Autor> autori) {
		this.autori = autori;
	}

	/**
	 * Vraca izdavaca knjige.
	 * 
	 * @return izdavac kao String.
	 */
	public String getIzdavac() {
		return izdavac;
	}
	
	/**
	 * Postavlja izdavaca knjige.
	 * 
	 * @param izdavac Novi izdavac.
	 * @throws java.lang.NullPointerException Ako je izdavac null.
	 * @throws java.lang.IllegalArgumentException Ako je izdavac prazan String.
	 */
	public void setIzdavac(String izdavac) {
		if (izdavac== null)
			throw new NullPointerException("Izdavac ne sme biti null");
		
		if (izdavac.isEmpty())
			throw new IllegalArgumentException("Izdavac ne sme biti prazan");
		
		this.izdavac = izdavac;
	}
	
	/**
	 * Vraca broj izdanja knjige.
	 * 
	 * @return broj izdanja kao int.
	 */
	public int getIzdanje() {
		return izdanje;
	}
	
	/**
	 * Postavlja broj izdanja knjige.
	 * 
	 * @param izdanje Novi broj izdanja.
	 * @throws java.lang.IllegalArgumentException Ako je izdanje manje ili jednako nuli.
	 */
	public void setIzdanje(int izdanje) {
		if(izdanje <= 0)
			throw new IllegalArgumentException("Izdanje mora biti vece od nule");
		
		this.izdanje = izdanje;
	}

	/**
	 * Vraca String reprezentaciju knjige.
	 * 
	 * @return svi podaci o knjizi u formatu:
	 * "Knjiga [naslov=..., isbn=..., autori=..., izdavac=..., izdanje=...]"
	 */
	@Override
	public String toString() {
		return "Knjiga [naslov=" + naslov + ", isbn=" + isbn + ", autori=" + autori + ", izdavac=" + izdavac
				+ ", izdanje=" + izdanje + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	/**
	 * Poredi dve knjige po ISBN broju.
	 * 
	 * @param obj Druga knjiga sa kojom se poredi.
	 * @return
	 * <ul>
	 * 
	 * <li><b>true</b> ako su obe knjige iste ili imaju isti ISBN.</li>
	 * 
	 * <li><b>false</b> ako je objekat null, druge klase ili imaju razlicit ISBN.</li>
	 * 
	 * </ul>
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Knjiga other = (Knjiga) obj;
		return isbn == other.isbn;
	}
}