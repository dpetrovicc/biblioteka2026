package biblioteka;

import java.util.ArrayList;
import java.util.List;

import biblioteka.interfejs.BibliotekaInterface;

public class Biblioteka implements BibliotekaInterface {
	
	private List<Knjiga> knjige = new ArrayList<Knjiga>();
	
	
	@Override
	public void dodajKnjigu(Knjiga knjiga) {
		if (knjiga == null) {
			throw new NullPointerException("Knjiga ne sme biti null");
		}
		if (knjige.contains(knjiga)) {
			throw new IllegalArgumentException("Knjiga vec postoji");
		}
		
		knjige.add(knjiga);
	}

	@Override
	public void obrisiKnjigu(Knjiga knjiga) {
		if (knjiga == null) {
			throw new NullPointerException("Knjiga ne sme biti null");
		}
		if (!knjige.contains(knjiga)) {
			throw new IllegalArgumentException("Knjiga ne postoji");
		}
		knjige.remove(knjiga);
	}

	@Override
	public List<Knjiga> vratiSveKnjige() {
		return knjige;
	}

	//Ova metoda za sada pretrazuje samo po naslovu
	@Override
	public List<Knjiga> pronadjiKnjigu(Autor autor, long isbn, String naslov, String izdavac) {
		
		if (autor == null && isbn <= 0 && naslov == null && izdavac == null) {
			throw new IllegalArgumentException("Mora se uneti bar jedan kriterijum pretrage");
		}
		
		List<Knjiga> rezultati = new ArrayList<Knjiga>();
		
		for (Knjiga k: knjige) {
			if (k.getNaslov().toUpperCase().contains(naslov.toUpperCase())) {
				rezultati.add(k);
			}
		}
		
		return rezultati;
	}

}
