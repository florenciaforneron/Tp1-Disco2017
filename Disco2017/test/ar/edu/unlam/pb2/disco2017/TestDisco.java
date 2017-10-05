package ar.edu.unlam.pb2.disco2017;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;



public class TestDisco {


		@Test
		public void testQueSeCreeUnDiscoConUnDeterminadoRadioInteriorYExterior() {
			Disco miDisco = new Disco (2.0,4.0);
		    Assert.assertEquals(2.0,miDisco.getRadioInterior(),0.1);
		    
		    Assert.assertEquals(4.0,miDisco.getRadioExterior(),0.1);
		}
		
		@Test
		public void testQueVerifiqueElPerimetroInteriorDeUnDiscoConDeterminadoRadioInterior(){
			Disco miDisco = new Disco (2.0,4.0);
			Assert.assertEquals(12.566,miDisco.calcularPerimetroInterior(),0.1);
		}
		
		@Test
		public void testQueVerifiqueElPerimetroExteriorDeUnDiscoConDeterminadoRadioExterior(){
			Disco miDisco = new Disco (2.0,4.0);
			Assert.assertEquals(25.132,miDisco.calcularPerimetroExterior(),0.1);
		}
		
		@Test
		public void testQueVerifiqueLaSuperficieDeUnDiscoConDeterminadoRadio(){
			Disco miDisco = new Disco (2.0,4.0);
			Assert.assertEquals(50.265, miDisco.calcularSuperficie(),0.1);
		}
		
		




}
