import static org.junit.Assert.*; 
import static org.junit.Assert.assertEquals; 
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PcTest 
	{
		@Test
		public void testCostruttorePc() 
		{

			Pc p=new Pc(1,"asus",3);			
			assertEquals("Identificativo ",1,p.getIdentificativo());
			assertEquals("Nome ", "asus",p.getNome());
			assertEquals("QuantitaDisponibile ", 3,p.getQuantitaDisponibile());
		}
		
		@Test
		public void testCostruttoreCopia() 
		{
			Pc p=new Pc(1,"asus",3);			
			assertEquals("Costruttore copia",p,new Pc (p));
		}
		
		@Test
		public void testCostruttoreVuoto() 
		{
			Pc p=new Pc();
			assertEquals("Identificativo ",0,p.getIdentificativo());
			assertEquals("Nome ", "",p.getNome());
			assertEquals("QuantitaDisponibile ",0,p.getQuantitaDisponibile());
		}

		@Test
		public void testSetIdentificativo()
		{
			Pc p =  new Pc();
			p.setIdentificativo(1);
			assertEquals("Settaggio identificativo pc ", 1,p.getIdentificativo());
		}
		
		@Test
		public void testSetNome()
		{
			Pc p =  new Pc();
			p.setNome("asus");
			assertTrue("Settaggio nome pc ", p.getNome().compareTo("asus")==0);
		}
		
		@Test
		public void testSetQuantitaDisponibile()
		{
			Pc p =  new Pc();
			p.setQuantitaDisponibile(3);
			assertEquals("Settaggio quantita disponibile di un pc ", 3,p.getQuantitaDisponibile());
		}
		
		@Test
		public void testToStringPc() 
		{
		
			Pc p=new Pc(1,"asus",3);	
			String s="Identificativo: 1  Nome: asus  Quantita disponibile: 3";
			assertEquals("toString Pc ",s, p.toString());
		}
		
		@Test
		public void testGetIdentificativo()
		{
			Pc p =  new Pc(1,"asus",3);
			assertEquals("Ottenimento identificativo pc ",1,p.getIdentificativo());
		}
		
		public void testGetNome()
		{
			Pc p =  new Pc(1,"asus",3);
			assertEquals("Ottenimento nome pc ","asus",p.getNome());
		}
		
		public void testGetQuantitaDispnibile()
		{
			Pc p =  new Pc(1,"asus",3);
			assertEquals("Ottenimento quantita disponibile di un pc ",3,p.getQuantitaDisponibile());
		}
	}


