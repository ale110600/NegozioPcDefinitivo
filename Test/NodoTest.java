import static org.junit.Assert.*; 
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class NodoTest 
	{
		@Test
		public void TestCostruttoreNodo() 
		{
			Pc p=new Pc();
			Nodo n=new Nodo(p);
			assertEquals("Costruttore nodo ",p,n.getInfo());
		}
		
		@Test
		public void testSetInfo() 
		{
			Pc p1=new Pc();
			Pc p2=new Pc();
			Nodo n=new Nodo(p1);
			n.setInfo(p2);
			assertTrue("settaggio informazioni del nodo ",n.getInfo().equals(p2)&& n.getLink()==null);
		}
		
		@Test
		public void testSetLink() 
		{
			Pc p1=new Pc();
			Pc p2=new Pc();
			Nodo n1=new Nodo(p1);
			Nodo n2=new Nodo(p2);
			n1.setLink(n2);
			assertTrue("settaggio link del nodo ",n1.getInfo().equals(p1)&& n1.getLink()==n2);
		}
		
		@Test
		public void testGetInfo() 
		{
			Pc p=new Pc();
			Nodo n=new Nodo(p);
			n.setInfo(p);
			assertEquals("ottenimento informazioni del nodo ",p,n.getInfo());
		}
		
		@Test
		public void testGetLink() 
		{
			Pc p1=new Pc();
			Pc p2=new Pc();
			Nodo n1=new Nodo(p1);
			Nodo n2=new Nodo(p2);
			n1.setLink(n2);
			assertEquals("ottenimento link del nodo ",n2,n1.getLink());
		}
	}


