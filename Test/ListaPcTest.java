import static org.junit.Assert.*;

import java.io.IOException;
import java.time.LocalDateTime;

import org.junit.Test;

public class ListaPcTest 
{
	@Test
	public void testCostruttoreListaPc() 
	{
		ListaPc a=new ListaPc();
		assertEquals("Costruttore della lista pc ",0,a.getElementi());
	}
	
	@Test
	public void testGetElementi() 
	{
		ListaPc a=new ListaPc();
		Pc p =new Pc();
		a.InserisciComputer(p);
		assertEquals("contatore degli elementi presenti nella lista ",1,a.getElementi());
	}
	
	@Test
	public void testInserisciComputer()
	{
		ListaPc a=new ListaPc();
		ListaPc a1=new ListaPc();
		Pc p1=new Pc(1,"asus",3);
		Pc p2=new Pc(2,"hp",5);
		Pc p3=new Pc(p1);
		Pc p4=new Pc(p2);
		a.InserisciComputer(p1);
		a.InserisciComputer(p2);
		a1.InserisciComputer(p3);
		a1.InserisciComputer(p4);
		assertEquals("Inserimento in testa ",a1.toString(),a.toString());
	}
	
	@Test
	public void testEliminaPcNome1() throws ListaPcException, IOException, FileException
	{
		ListaPc a=new ListaPc();
		Pc p1=new Pc(1,"asus",3);
		Pc p2=new Pc(2,"hp",5);
		Pc p3=new Pc(3,"acer",8);
	    a.InserisciComputer(p1);
		a.InserisciComputer(p2);
		a.InserisciComputer(p3);
		System.out.println("inserisci hp");
		a.eliminaComputerNome("testPcEliminati.txt");
		assertTrue("Inserimento in testa ",a.getPc(1).getNome()=="acer"||a.getPc(2).getNome()=="asus");
	}
	
	@Test
	public void testEliminaPcNome2() throws ListaPcException, IOException, FileException
	{
		ListaPc a=new ListaPc();
		Pc p1=new Pc(1,"asus",3);
	    a.InserisciComputer(p1);
		System.out.println("inserisci asus");
		a.eliminaComputerNome("testPcEliminati.txt");
		assertTrue("Inserimento in testa ",a.getPc(1).getNome()==null);
	}
	
	@Test
	public void testEliminaPcNome3() throws ListaPcException, IOException, FileException
	{
		ListaPc a=new ListaPc();
		Pc p1=new Pc(1,"asus",3);
		Pc p2=new Pc(2,"hp",5);
		Pc p3=new Pc(3,"acer",8);
	    a.InserisciComputer(p1);
		a.InserisciComputer(p2);
		a.InserisciComputer(p3);
		System.out.println("inserisci acer");
		a.eliminaComputerNome("testPcEliminati.txt");
		assertTrue("Inserimento in testa ",a.getPc(1).getNome()=="hp"||a.getPc(2).getNome()=="asus");
	}
	
	@Test
	public void testEliminaPcId1() throws ListaPcException, IOException, FileException
	{
		ListaPc a=new ListaPc();
		Pc p1=new Pc(1,"asus",3);
		Pc p2=new Pc(2,"hp",5);
		Pc p3=new Pc(3,"acer",8);
	    a.InserisciComputer(p1);
		a.InserisciComputer(p2);
		a.InserisciComputer(p3);
		System.out.println("inserisci 2");
		a.eliminaComputerId("testPcEliminati.txt");
		assertTrue("Inserimento in testa ",a.getPc(1).getIdentificativo()==3||a.getPc(2).getIdentificativo()==1);
	}
	
	@Test
	public void testEliminaPcId2() throws ListaPcException, IOException, FileException
	{
		ListaPc a=new ListaPc();
		Pc p1=new Pc(1,"asus",3);
	    a.InserisciComputer(p1);
		System.out.println("inserisci 1");
		a.eliminaComputerId("testPcEliminati.txt");
		assertTrue("Inserimento in testa ",a.getPc(1).getIdentificativo()==0);
	}
	
	@Test
	public void testEliminaPcId3() throws ListaPcException, IOException, FileException
	{
		ListaPc a=new ListaPc();
		Pc p1=new Pc(1,"asus",3);
		Pc p2=new Pc(2,"hp",5);
		Pc p3=new Pc(3,"acer",8);
	    a.InserisciComputer(p1);
		a.InserisciComputer(p2);
		a.InserisciComputer(p3);
		System.out.println("inserisci 1");
		a.eliminaComputerId("testPcEliminati.txt");
		assertTrue("Inserimento in testa ",a.getPc(1).getIdentificativo()==2||a.getPc(2).getIdentificativo()==1);
	}
	
	@Test
	public void testVendi() throws NumberFormatException, ListaPcException, IOException
	{
		ListaPc a=new ListaPc();
		Pc p1=new Pc(1,"asus",3);
		a.InserisciComputer(p1);
		System.out.println("Inserisci 1 e poi 2 ");
		assertEquals("vendita di pc ",a.Vendi(),1);
	}
	
	@Test
	public void testAcquista() throws NumberFormatException, ListaPcException, IOException
	{
		ListaPc a=new ListaPc();
		Pc p1=new Pc(1,"asus",3);
		a.InserisciComputer(p1);
		System.out.println("inserisci 1 e poi 4 ");
		assertEquals("acquisto di pc ",7,a.Acquista());
	}
	
	@Test
	public void testGetPc() throws ListaPcException,PcNonPresente
	{
		ListaPc a=new ListaPc();
		Pc p1 =  new Pc(1,"asus",3);
		Pc p2 =  new Pc(2,"hp",5);
		a.InserisciComputer(p1);
		a.InserisciComputer(p2);
		assertTrue("ottenimento informazioni pc ",a.getPc(1)==p2);
	}
	
	@Test
	public void testConvertiListaPc() throws ListaPcException 
	{
		ListaPc a=new ListaPc();
		Pc p1=new Pc();
		p1.setIdentificativo(1);		
		Pc p2=new Pc();
		p2.setIdentificativo(1);
		a.InserisciComputer(p1);
		a.InserisciComputer(p2);
		Pc[] array=a.convertiListaPc();
		assertEquals("Converitore dalla lista all'array", array[0].getIdentificativo(),array[1].getIdentificativo());
	}
	
	@Test
	public void testConvertiPc() throws ListaPcException 
	{
		ListaPc a=new ListaPc();
		Pc p1=new Pc();
		p1.setIdentificativo(1);		
		Pc p2=new Pc();
		p2.setIdentificativo(2);
		a.InserisciComputer(p1);
		a.InserisciComputer(p2);
		Pc[] array=a.convertiListaPc();
		ListaPc a1=new ListaPc();
		a1.convertiPc(array);
		assertEquals("Convertitore dell'array alla lista ",a1.getPc(2),a.getPc(2) );
	}
	
	@Test
	public void testSalvaLisataPcECaricaListaPc() throws ClassNotFoundException, IOException 
	{
		ListaPc a=new ListaPc();
		Pc p1=new Pc(1,"asus",3);
		a.InserisciComputer(p1);
		a.salvaListaPc("testListaPc.bin");
		ListaPc a2=a.caricaListaPc("testListaPc.bin");
		assertTrue("Serializzazione e Deserializzzazione",a.toString().equals(a2.toString()));
	}
	
	@Test 
	public void testToStringVuoto() 
	{
		ListaPc a=new ListaPc();
		assertEquals("ListaPc--> ",a.toString());
	}
	
	
	@Test
	public void testToString()
	{
		ListaPc a=new ListaPc();
		ListaPc a1=new ListaPc();
		Pc p1=new Pc(1,"asus",3);
		Pc p2=new Pc(2,"hp",5);
		Pc p3=new Pc(p1);
		Pc p4=new Pc(p2);
		a.InserisciComputer(p1);
		a.InserisciComputer(p2);
		a1.InserisciComputer(p3);
		a1.InserisciComputer(p4);
		assertEquals("Inserimento in testa ",a1.toString(),a.toString());
	}
	
	@Test 
	public void testOrdinaPerQuantitaDisponibile() throws ListaPcException, NumberFormatException, IOException 
	{
		ListaPc a=new ListaPc();
		Pc p1=new Pc(1,"asus",3);
		Pc p2=new Pc(2,"hp",5);
		Pc p3=new Pc(3,"acer",8);
	    a.InserisciComputer(p1);
		a.InserisciComputer(p2);
		a.InserisciComputer(p3);
		Pc[] array=a.convertiListaPc();
		a.OrdinaPcPerQuantitaDisponbile(array);
		a.convertiPc(array);
		assertTrue("Lista ordinata per quantita crescente",a.getPc(1).getQuantitaDisponibile()==8||a.getPc(2).getQuantitaDisponibile()==5||a.getPc(3).getQuantitaDisponibile()==3);
	}
	
	@Test 
	public void testOrdinaPerOrdineAlfabetico() throws ListaPcException, NumberFormatException, IOException 
	{
		ListaPc a=new ListaPc();
		Pc p1=new Pc(1,"asus",3);
		Pc p2=new Pc(2,"hp",5);
		Pc p3=new Pc(3,"acer",8);
	    a.InserisciComputer(p1);
		a.InserisciComputer(p2);
		a.InserisciComputer(p3);
		Pc[] array=a.convertiListaPc();
		a.OrdinaPcPerOrdineAlfabetico(array);
		a.convertiPc(array);
		assertTrue("Lista ordinata per quantita crescente",a.getPc(1).getNome()=="acer"||a.getPc(2).getNome()=="asus"||a.getPc(3).getNome()=="hp");
	}
	
	@Test
	public void testVisualizzaPcQuantitaInferiore() throws NumberFormatException, IOException
	{
		ListaPc a=new ListaPc();
		Pc p1=new Pc(1,"asus",3);
		Pc p2=new Pc(2,"hp",5);
		Pc p3=new Pc(3,"acer",8);
	    a.InserisciComputer(p1);
		a.InserisciComputer(p2);
		a.InserisciComputer(p3);
		System.out.println("inseirisci 100 ");
		assertEquals("visualizza tutti i pc con quantita inferiore ad una soglia ",a.VisualizzaPcQuantitaInferiore(),a.toString());
	}
	
}