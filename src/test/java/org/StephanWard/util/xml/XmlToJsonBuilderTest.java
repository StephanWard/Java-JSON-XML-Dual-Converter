package org.StephanWard.util.xml;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.StephanWard.util.xml.tool.XmlToJson;

/**
 * XmlToJson Build the test。
 * Operations on XML tag attribute nodes。
 * @author Stephan Ward
 */
public class XmlToJsonBuilderTest {

	/*
	<?xml version="1.0" encoding="utf-8"?>
<AddressBook>
<Contact>
<CustomerID>ALFKI</CustomerID>
<CompanyName>Alfreds Futterkiste</CompanyName>
<ContactName>Maria Anders</ContactName>
<ContactTitle>Sales Representative</ContactTitle>
<Address>Obere Str. 57</Address>
<City>Berlin</City>
<Email>dummy@gmail.com</Email>
<PostalCode>12209</PostalCode>
<Country>Germany</Country>
<Phone>030-0074321</Phone>
<Fax>030-0076545</Fax>
</Contact>
<Contact>
<CustomerID>ANATR</CustomerID>
<CompanyName>Ana Trujillo Emparedados y helados</CompanyName>
<ContactName>Ana Trujillo</ContactName>
<ContactTitle>Owner</ContactTitle>
<Address>Avda. de la Constitución 2222</Address>
<City>México D.F.</City>
<Email>dummy@gmail.com</Email>
<PostalCode>05021</PostalCode>
<Country>Mexico</Country>
<Phone>(5) 555-4729</Phone>
<Fax>(5) 555-3745</Fax>
</Contact>
<Contact>
<CustomerID>ANTON</CustomerID>
<CompanyName>Antonio Moreno Taquería</CompanyName>
<ContactName>Antonio Moreno</ContactName>
<ContactTitle>Owner</ContactTitle>
<Address>Mataderos 2312</Address>
<City>México D.F.</City>
<Email>dummy@gmail.com</Email>
<PostalCode>05023</PostalCode>
<Country>Mexico</Country>
<Phone>(5) 555-3932</Phone>
</Contact>
<Contact>
<CustomerID>AROUT</CustomerID>
<CompanyName>Around the Horn</CompanyName>
<ContactName>Thomas Hardy</ContactName>
<ContactTitle>Sales Representative</ContactTitle>
<Address>120 Hanover Sq.</Address>
<City>London</City>
<Email>dummy@gmail.com</Email>
<PostalCode>WA1 1DP</PostalCode>
<Country>UK</Country>
<Phone>(171) 555-7788</Phone>
<Fax>(171) 555-6750</Fax>
</Contact>
<Contact>
<CustomerID>BERGS</CustomerID>
<CompanyName>Berglunds snabbköp</CompanyName>
<ContactName>Christina Berglund</ContactName>
<ContactTitle>Order Administrator</ContactTitle>
<Address>Berguvsvägen 8</Address>
<City>Luleå</City>
<Email>dummy@gmail.com</Email>
<PostalCode>S-958 22</PostalCode>
<Country>Sweden</Country>
<Phone>0921-12 34 65</Phone>
<Fax>0921-12 34 67</Fax>
</Contact>
<Contact>
<CustomerID>BLAUS</CustomerID>
<CompanyName>Blauer See Delikatessen</CompanyName>
<ContactName>Hanna Moos</ContactName>
<ContactTitle>Sales Representative</ContactTitle>
<Address>Forsterstr. 57</Address>
<City>Mannheim</City>
<Email>dummy@gmail.com</Email>
<PostalCode>68306</PostalCode>
<Country>Germany</Country>
<Phone>0621-08460</Phone>
<Fax>0621-08924</Fax>
</Contact>
<Contact>
<CustomerID>BLONP</CustomerID>
<CompanyName>Blondel père et fils</CompanyName>
<ContactName>Frédérique Citeaux</ContactName>
<ContactTitle>Marketing Manager</ContactTitle>
<Address>24, place Kléber</Address>
<City>Strasbourg</City>
<Email>dummy@gmail.com</Email>
<PostalCode>67000</PostalCode>
<Country>France</Country>
<Phone>88.60.15.31</Phone>
<Fax>88.60.15.32</Fax>
</Contact>
<Contact>
<CustomerID>BOLID</CustomerID>
<CompanyName>Bólido Comidas preparadas</CompanyName>
<ContactName>Martín Sommer</ContactName>
<ContactTitle>Owner</ContactTitle>
<Address>C/ Araquil, 67</Address>
<City>Madrid</City>
<Email>dummy@gmail.com</Email>
<PostalCode>28023</PostalCode>
<Country>Spain</Country>
<Phone>(91) 555 22 82</Phone>
<Fax>(91) 555 91 99</Fax>
</Contact>
<Contact>
<CustomerID>BONAP</CustomerID>
<CompanyName>Bon app'</CompanyName>
<ContactName>Laurence Lebihan</ContactName>
<ContactTitle>Owner</ContactTitle>
<Address>12, rue des Bouchers</Address>
<City>Marseille</City>
<Email>dummy@gmail.com</Email>
<PostalCode>13008</PostalCode>
<Country>France</Country>
<Phone>91.24.45.40</Phone>
<Fax>91.24.45.41</Fax>
</Contact>
<Contact>
<CustomerID>BOTTM</CustomerID>
<CompanyName>Bottom-Dollar Markets</CompanyName>
<ContactName>Elizabeth Lincoln</ContactName>
<ContactTitle>Accounting Manager</ContactTitle>
<Address>23 Tsawassen Blvd.</Address>
<City>Tsawassen</City>
<Email>dummy@gmail.com</Email>
<Region>BC</Region>
<PostalCode>T2F 8M4</PostalCode>
<Country>Canada</Country>
<Phone>(604) 555-4729</Phone>
<Fax>(604) 555-3745</Fax>
</Contact>
<Contact>
<CustomerID>BSBEV</CustomerID>
<CompanyName>B's Beverages</CompanyName>
<ContactName>Victoria Ashworth</ContactName>
<ContactTitle>Sales Representative</ContactTitle>
<Address>Fauntleroy Circus</Address>
<City>London</City>
<Email>dummy@gmail.com</Email>
<PostalCode>EC2 5NT</PostalCode>
<Country>UK</Country>
<Phone>(171) 555-1212</Phone>
</Contact>
<Contact>
<CustomerID>CACTU</CustomerID>
<CompanyName>Cactus Comidas para llevar</CompanyName>
<ContactName>Patricio Simpson</ContactName>
<ContactTitle>Sales Agent</ContactTitle>
<Address>Cerrito 333</Address>
<City>Buenos Aires</City>
<Email>dummy@gmail.com</Email>
<PostalCode>1010</PostalCode>
<Country>Argentina</Country>
<Phone>(1) 135-5555</Phone>
<Fax>(1) 135-4892</Fax>
</Contact>
<Contact>
<CustomerID>CENTC</CustomerID>
<CompanyName>Centro comercial Moctezuma</CompanyName>
<ContactName>Francisco Chang</ContactName>
<ContactTitle>Marketing Manager</ContactTitle>
<Address>Sierras de Granada 9993</Address>
<City>México D.F.</City>
<Email>dummy@gmail.com</Email>
<PostalCode>05022</PostalCode>
<Country>Mexico</Country>
<Phone>(5) 555-3392</Phone>
<Fax>(5) 555-7293</Fax>
</Contact>
<Contact>
<CustomerID>CHOPS</CustomerID>
<CompanyName>Chop-suey Chinese</CompanyName>
<ContactName>Yang Wang</ContactName>
<ContactTitle>Owner</ContactTitle>
<Address>Hauptstr. 29</Address>
<City>Bern</City>
<Email>dummy@gmail.com</Email>
<PostalCode>3012</PostalCode>
<Country>Switzerland</Country>
<Phone>0452-076545</Phone>
</Contact>
<Contact>
<CustomerID>COMMI</CustomerID>
<CompanyName>Comércio Mineiro</CompanyName>
<ContactName>Pedro Afonso</ContactName>
<ContactTitle>Sales Associate</ContactTitle>
<Address>Av. dos Lusíadas, 23</Address>
<City>São Paulo</City>
<Email>dummy@gmail.com</Email>
<Region>SP</Region>
<PostalCode>05432-043</PostalCode>
<Country>Brazil</Country>
<Phone>(11) 555-7647</Phone>
</Contact>
<Contact>
<CustomerID>CONSH</CustomerID>
<CompanyName>Consolidated Holdings</CompanyName>
<ContactName>Elizabeth Brown</ContactName>
<ContactTitle>Sales Representative</ContactTitle>
<Address>Berkeley Gardens 12 Brewery</Address>
<City>London</City>
<Email>dummy@gmail.com</Email>
<PostalCode>WX1 6LT</PostalCode>
<Country>UK</Country>
<Phone>(171) 555-2282</Phone>
<Fax>(171) 555-9199</Fax>
</Contact>
<Contact>
<CustomerID>DRACD</CustomerID>
<CompanyName>Drachenblut Delikatessen</CompanyName>
<ContactName>Sven Ottlieb</ContactName>
<ContactTitle>Order Administrator</ContactTitle>
<Address>Walserweg 21</Address>
<City>Aachen</City>
<Email>dummy@gmail.com</Email>
<PostalCode>52066</PostalCode>
<Country>Germany</Country>
<Phone>0241-039123</Phone>
<Fax>0241-059428</Fax>
</Contact>
<Contact>
<CustomerID>DUMON</CustomerID>
<CompanyName>Du monde entier</CompanyName>
<ContactName>Janine Labrune</ContactName>
<ContactTitle>Owner</ContactTitle>
<Address>67, rue des Cinquante Otages</Address>
<City>Nantes</City>
<Email>dummy@gmail.com</Email>
<PostalCode>44000</PostalCode>
<Country>France</Country>
<Phone>40.67.88.88</Phone>
<Fax>40.67.89.89</Fax>
</Contact>
<Contact>
<CustomerID>EASTC</CustomerID>
<CompanyName>Eastern Connection</CompanyName>
<ContactName>Ann Devon</ContactName>
<ContactTitle>Sales Agent</ContactTitle>
<Address>35 King George</Address>
<City>London</City>
<Email>dummy@gmail.com</Email>
<PostalCode>WX3 6FW</PostalCode>
<Country>UK</Country>
<Phone>(171) 555-0297</Phone>
<Fax>(171) 555-3373</Fax>
</Contact>
<Contact>
<CustomerID>ERNSH</CustomerID>
<CompanyName>Ernst Handel</CompanyName>
<ContactName>Roland Mendel</ContactName>
<ContactTitle>Sales Manager</ContactTitle>
<Address>Kirchgasse 6</Address>
<City>Graz</City>
<Email>dummy@gmail.com</Email>
<PostalCode>8010</PostalCode>
<Country>Austria</Country>
<Phone>7675-3425</Phone>
<Fax>7675-3426</Fax>
</Contact>
<Contact>
<CustomerID>FAMIA</CustomerID>
<CompanyName>Familia Arquibaldo</CompanyName>
<ContactName>Aria Cruz</ContactName>
<ContactTitle>Marketing Assistant</ContactTitle>
<Address>Rua Orós, 92</Address>
<City>São Paulo</City>
<Email>dummy@gmail.com</Email>
<Region>SP</Region>
<PostalCode>05442-030</PostalCode>
<Country>Brazil</Country>
<Phone>(11) 555-9857</Phone>
</Contact>
<Contact>
<CustomerID>FISSA</CustomerID>
<CompanyName>FISSA Fabrica Inter. Salchichas S.A.</CompanyName>
<ContactName>Diego Roel</ContactName>
<ContactTitle>Accounting Manager</ContactTitle>
<Address>C/ Moralzarzal, 86</Address>
<City>Madrid</City>
<Email>dummy@gmail.com</Email>
<PostalCode>28034</PostalCode>
<Country>Spain</Country>
<Phone>(91) 555 94 44</Phone>
<Fax>(91) 555 55 93</Fax>
</Contact>
<Contact>
<CustomerID>FOLIG</CustomerID>
<CompanyName>Folies gourmandes</CompanyName>
<ContactName>Martine Rancé</ContactName>
<ContactTitle>Assistant Sales Agent</ContactTitle>
<Address>184, chaussée de Tournai</Address>
<City>Lille</City>
<Email>dummy@gmail.com</Email>
<PostalCode>59000</PostalCode>
<Country>France</Country>
<Phone>20.16.10.16</Phone>
<Fax>20.16.10.17</Fax>
</Contact>
<Contact>
<CustomerID>FOLKO</CustomerID>
<CompanyName>Folk och fä HB</CompanyName>
<ContactName>Maria Larsson</ContactName>
<ContactTitle>Owner</ContactTitle>
<Address>Åkergatan 24</Address>
<City>Bräcke</City>
<Email>dummy@gmail.com</Email>
<PostalCode>S-844 67</PostalCode>
<Country>Sweden</Country>
<Phone>0695-34 67 21</Phone>
</Contact>
<Contact>
<CustomerID>FRANK</CustomerID>
<CompanyName>Frankenversand</CompanyName>
<ContactName>Peter Franken</ContactName>
<ContactTitle>Marketing Manager</ContactTitle>
<Address>Berliner Platz 43</Address>
<City>München</City>
<Email>dummy@gmail.com</Email>
<PostalCode>80805</PostalCode>
<Country>Germany</Country>
<Phone>089-0877310</Phone>
<Fax>089-0877451</Fax>
</Contact>
<Contact>
<CustomerID>FRANR</CustomerID>
<CompanyName>France restauration</CompanyName>
<ContactName>Carine Schmitt</ContactName>
<ContactTitle>Marketing Manager</ContactTitle>
<Address>54, rue Royale</Address>
<City>Nantes</City>
<Email>dummy@gmail.com</Email>
<PostalCode>44000</PostalCode>
<Country>France</Country>
<Phone>40.32.21.21</Phone>
<Fax>40.32.21.20</Fax>
</Contact>
<Contact>
<CustomerID>FRANS</CustomerID>
<CompanyName>Franchi S.p.A.</CompanyName>
<ContactName>Paolo Accorti</ContactName>
<ContactTitle>Sales Representative</ContactTitle>
<Address>Via Monte Bianco 34</Address>
<City>Torino</City>
<Email>dummy@gmail.com</Email>
<PostalCode>10100</PostalCode>
<Country>Italy</Country>
<Phone>011-4988260</Phone>
<Fax>011-4988261</Fax>
</Contact>
<Contact>
<CustomerID>FURIB</CustomerID>
<CompanyName>Furia Bacalhau e Frutos do Mar</CompanyName>
<ContactName>Lino Rodriguez</ContactName>
<ContactTitle>Sales Manager</ContactTitle>
<Address>Jardim das rosas n. 32</Address>
<City>Lisboa</City>
<Email>dummy@gmail.com</Email>
<PostalCode>1675</PostalCode>
<Country>Portugal</Country>
<Phone>(1) 354-2534</Phone>
<Fax>(1) 354-2535</Fax>
</Contact>
<Contact>
<CustomerID>GALED</CustomerID>
<CompanyName>Galería del gastrónomo</CompanyName>
<ContactName>Eduardo Saavedra</ContactName>
<ContactTitle>Marketing Manager</ContactTitle>
<Address>Rambla de Cataluña, 23</Address>
<City>Barcelona</City>
<Email>dummy@gmail.com</Email>
<PostalCode>08022</PostalCode>
<Country>Spain</Country>
<Phone>(93) 203 4560</Phone>
<Fax>(93) 203 4561</Fax>
</Contact>
<Contact>
<CustomerID>GODOS</CustomerID>
<CompanyName>Godos Cocina Típica</CompanyName>
<ContactName>José Pedro Freyre</ContactName>
<ContactTitle>Sales Manager</ContactTitle>
<Address>C/ Romero, 33</Address>
<City>Sevilla</City>
<Email>dummy@gmail.com</Email>
<PostalCode>41101</PostalCode>
<Country>Spain</Country>
<Phone>(95) 555 82 82</Phone>
</Contact>
<Contact>
<CustomerID>GOURL</CustomerID>
<CompanyName>Gourmet Lanchonetes</CompanyName>
<ContactName>André Fonseca</ContactName>
<ContactTitle>Sales Associate</ContactTitle>
<Address>Av. Brasil, 442</Address>
<City>Campinas</City>
<Email>dummy@gmail.com</Email>
<Region>SP</Region>
<PostalCode>04876-786</PostalCode>
<Country>Brazil</Country>
<Phone>(11) 555-9482</Phone>
</Contact>
<Contact>
<CustomerID>GREAL</CustomerID>
<CompanyName>Great Lakes Food Market</CompanyName>
<ContactName>Howard Snyder</ContactName>
<ContactTitle>Marketing Manager</ContactTitle>
<Address>2732 Baker Blvd.</Address>
<City>Eugene</City>
<Email>dummy@gmail.com</Email>
<Region>OR</Region>
<PostalCode>97403</PostalCode>
<Country>USA</Country>
<Phone>(503) 555-7555</Phone>
</Contact>
<Contact>
<CustomerID>GROSR</CustomerID>
<CompanyName>GROSELLA-Restaurante</CompanyName>
<ContactName>Manuel Pereira</ContactName>
<ContactTitle>Owner</ContactTitle>
<Address>5ª Ave. Los Palos Grandes</Address>
<City>Caracas</City>
<Email>dummy@gmail.com</Email>
<Region>DF</Region>
<PostalCode>1081</PostalCode>
<Country>Venezuela</Country>
<Phone>(2) 283-2951</Phone>
<Fax>(2) 283-3397</Fax>
</Contact>
<Contact>
<CustomerID>HANAR</CustomerID>
<CompanyName>Hanari Carnes</CompanyName>
<ContactName>Mario Pontes</ContactName>
<ContactTitle>Accounting Manager</ContactTitle>
<Address>Rua do Paço, 67</Address>
<City>Rio de Janeiro</City>
<Email>dummy@gmail.com</Email>
<Region>RJ</Region>
<PostalCode>05454-876</PostalCode>
<Country>Brazil</Country>
<Phone>(21) 555-0091</Phone>
<Fax>(21) 555-8765</Fax>
</Contact>
<Contact>
<CustomerID>HILAA</CustomerID>
<CompanyName>HILARIÓN-Abastos</CompanyName>
<ContactName>Carlos Hernández</ContactName>
<ContactTitle>Sales Representative</ContactTitle>
<Address>Carrera 22 con Ave. Carlos Soublette #8-35</Address>
<City>San Cristóbal</City>
<Email>dummy@gmail.com</Email>
<Region>Táchira</Region>
<PostalCode>5022</PostalCode>
<Country>Venezuela</Country>
<Phone>(5) 555-1340</Phone>
<Fax>(5) 555-1948</Fax>
</Contact>
<Contact>
<CustomerID>HUNGC</CustomerID>
<CompanyName>Hungry Coyote Import Store</CompanyName>
<ContactName>Yoshi Latimer</ContactName>
<ContactTitle>Sales Representative</ContactTitle>
<Address>City Center Plaza 516 Main St.</Address>
<City>Elgin</City>
<Email>dummy@gmail.com</Email>
<Region>OR</Region>
<PostalCode>97827</PostalCode>
<Country>USA</Country>
<Phone>(503) 555-6874</Phone>
<Fax>(503) 555-2376</Fax>
</Contact>
<Contact>
<CustomerID>HUNGO</CustomerID>
<CompanyName>Hungry Owl All-Night Grocers</CompanyName>
<ContactName>Patricia McKenna</ContactName>
<ContactTitle>Sales Associate</ContactTitle>
<Address>8 Johnstown Road</Address>
<City>Cork</City>
<Email>dummy@gmail.com</Email>
<Region>Co. Cork</Region>
<Country>Ireland</Country>
<Phone>2967 542</Phone>
<Fax>2967 3333</Fax>
</Contact>
<Contact>
<CustomerID>ISLAT</CustomerID>
<CompanyName>Island Trading</CompanyName>
<ContactName>Helen Bennett</ContactName>
<ContactTitle>Marketing Manager</ContactTitle>
<Address>Garden House Crowther Way</Address>
<City>Cowes</City>
<Email>dummy@gmail.com</Email>
<Region>Isle of Wight</Region>
<PostalCode>PO31 7PJ</PostalCode>
<Country>UK</Country>
<Phone>(198) 555-8888</Phone>
</Contact>
<Contact>
<CustomerID>KOENE</CustomerID>
<CompanyName>Königlich Essen</CompanyName>
<ContactName>Philip Cramer</ContactName>
<ContactTitle>Sales Associate</ContactTitle>
<Address>Maubelstr. 90</Address>
<City>Brandenburg</City>
<Email>dummy@gmail.com</Email>
<PostalCode>14776</PostalCode>
<Country>Germany</Country>
<Phone>0555-09876</Phone>
</Contact>
<Contact>
<CustomerID>LACOR</CustomerID>
<CompanyName>La corne d'abondance</CompanyName>
<ContactName>Daniel Tonini</ContactName>
<ContactTitle>Sales Representative</ContactTitle>
<Address>67, avenue de l'Europe</Address>
<City>Versailles</City>
<Email>dummy@gmail.com</Email>
<PostalCode>78000</PostalCode>
<Country>France</Country>
<Phone>30.59.84.10</Phone>
<Fax>30.59.85.11</Fax>
</Contact>
<Contact>
<CustomerID>LAMAI</CustomerID>
<CompanyName>La maison d'Asie</CompanyName>
<ContactName>Annette Roulet</ContactName>
<ContactTitle>Sales Manager</ContactTitle>
<Address>1 rue Alsace-Lorraine</Address>
<City>Toulouse</City>
<Email>dummy@gmail.com</Email>
<PostalCode>31000</PostalCode>
<Country>France</Country>
<Phone>61.77.61.10</Phone>
<Fax>61.77.61.11</Fax>
</Contact>
<Contact>
<CustomerID>LAUGB</CustomerID>
<CompanyName>Laughing Bacchus Wine Cellars</CompanyName>
<ContactName>Yoshi Tannamuri</ContactName>
<ContactTitle>Marketing Assistant</ContactTitle>
<Address>1900 Oak St.</Address>
<City>Vancouver</City>
<Email>dummy@gmail.com</Email>
<Region>BC</Region>
<PostalCode>V3F 2K1</PostalCode>
<Country>Canada</Country>
<Phone>(604) 555-3392</Phone>
<Fax>(604) 555-7293</Fax>
</Contact>
<Contact>
<CustomerID>LAZYK</CustomerID>
<CompanyName>Lazy K Kountry Store</CompanyName>
<ContactName>John Steel</ContactName>
<ContactTitle>Marketing Manager</ContactTitle>
<Address>12 Orchestra Terrace</Address>
<City>Walla Walla</City>
<Email>dummy@gmail.com</Email>
<Region>WA</Region>
<PostalCode>99362</PostalCode>
<Country>USA</Country>
<Phone>(509) 555-7969</Phone>
<Fax>(509) 555-6221</Fax>
</Contact>
<Contact>
<CustomerID>LEHMS</CustomerID>
<CompanyName>Lehmanns Marktstand</CompanyName>
<ContactName>Renate Messner</ContactName>
<ContactTitle>Sales Representative</ContactTitle>
<Address>Magazinweg 7</Address>
<City>Frankfurt a.M.</City>
<Email>dummy@gmail.com</Email>
<PostalCode>60528</PostalCode>
<Country>Germany</Country>
<Phone>069-0245984</Phone>
<Fax>069-0245874</Fax>
</Contact>
<Contact>
<CustomerID>LETSS</CustomerID>
<CompanyName>Let's Stop N Shop</CompanyName>
<ContactName>Jaime Yorres</ContactName>
<ContactTitle>Owner</ContactTitle>
<Address>87 Polk St. Suite 5</Address>
<City>San Francisco</City>
<Email>dummy@gmail.com</Email>
<Region>CA</Region>
<PostalCode>94117</PostalCode>
<Country>USA</Country>
<Phone>(415) 555-5938</Phone>
</Contact>
<Contact>
<CustomerID>LILAS</CustomerID>
<CompanyName>LILA-Supermercado</CompanyName>
<ContactName>Carlos González</ContactName>
<ContactTitle>Accounting Manager</ContactTitle>
<Address>Carrera 52 con Ave. Bolívar #65-98 Llano Largo</Address>
<City>Barquisimeto</City>
<Email>dummy@gmail.com</Email>
<Region>Lara</Region>
<PostalCode>3508</PostalCode>
<Country>Venezuela</Country>
<Phone>(9) 331-6954</Phone>
<Fax>(9) 331-7256</Fax>
</Contact>
<Contact>
<CustomerID>LINOD</CustomerID>
<CompanyName>LINO-Delicateses</CompanyName>
<ContactName>Felipe Izquierdo</ContactName>
<ContactTitle>Owner</ContactTitle>
<Address>Ave. 5 de Mayo Porlamar</Address>
<City>I. de Margarita</City>
<Email>dummy@gmail.com</Email>
<Region>Nueva Esparta</Region>
<PostalCode>4980</PostalCode>
<Country>Venezuela</Country>
<Phone>(8) 34-56-12</Phone>
<Fax>(8) 34-93-93</Fax>
</Contact>
<Contact>
<CustomerID>LONEP</CustomerID>
<CompanyName>Lonesome Pine Restaurant</CompanyName>
<ContactName>Fran Wilson</ContactName>
<ContactTitle>Sales Manager</ContactTitle>
<Address>89 Chiaroscuro Rd.</Address>
<City>Portland</City>
<Email>dummy@gmail.com</Email>
<Region>OR</Region>
<PostalCode>97219</PostalCode>
<Country>USA</Country>
<Phone>(503) 555-9573</Phone>
<Fax>(503) 555-9646</Fax>
</Contact>
<Contact>
<CustomerID>MAGAA</CustomerID>
<CompanyName>Magazzini Alimentari Riuniti</CompanyName>
<ContactName>Giovanni Rovelli</ContactName>
<ContactTitle>Marketing Manager</ContactTitle>
<Address>Via Ludovico il Moro 22</Address>
<City>Bergamo</City>
<Email>dummy@gmail.com</Email>
<PostalCode>24100</PostalCode>
<Country>Italy</Country>
<Phone>035-640230</Phone>
<Fax>035-640231</Fax>
</Contact>
<Contact>
<CustomerID>MAISD</CustomerID>
<CompanyName>Maison Dewey</CompanyName>
<ContactName>Catherine Dewey</ContactName>
<ContactTitle>Sales Agent</ContactTitle>
<Address>Rue Joseph-Bens 532</Address>
<City>Bruxelles</City>
<Email>dummy@gmail.com</Email>
<PostalCode>B-1180</PostalCode>
<Country>Belgium</Country>
<Phone>(02) 201 24 67</Phone>
<Fax>(02) 201 24 68</Fax>
</Contact>
</AddressBook>
	 */
	
	String xmlStr = "<?xml version=\"1.0\" encoding=\"utf-8\"?><AddressBook>\n" +
			"<Contact>\n" +
			"<CustomerID>ALFKI</CustomerID>\n" +
			"<CompanyName>Alfreds Futterkiste</CompanyName>\n" +
			"<ContactName>Maria Anders</ContactName>\n" +
			"<ContactTitle>Sales Representative</ContactTitle>\n" +
			"<Address>Obere Str. 57</Address>\n" +
			"<City>Berlin</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<PostalCode>12209</PostalCode>\n" +
			"<Country>Germany</Country>\n" +
			"<Phone>030-0074321</Phone>\n" +
			"<Fax>030-0076545</Fax>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>ANATR</CustomerID>\n" +
			"<CompanyName>Ana Trujillo Emparedados y helados</CompanyName>\n" +
			"<ContactName>Ana Trujillo</ContactName>\n" +
			"<ContactTitle>Owner</ContactTitle>\n" +
			"<Address>Avda. de la Constitución 2222</Address>\n" +
			"<City>México D.F.</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<PostalCode>05021</PostalCode>\n" +
			"<Country>Mexico</Country>\n" +
			"<Phone>(5) 555-4729</Phone>\n" +
			"<Fax>(5) 555-3745</Fax>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>ANTON</CustomerID>\n" +
			"<CompanyName>Antonio Moreno Taquería</CompanyName>\n" +
			"<ContactName>Antonio Moreno</ContactName>\n" +
			"<ContactTitle>Owner</ContactTitle>\n" +
			"<Address>Mataderos 2312</Address>\n" +
			"<City>México D.F.</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<PostalCode>05023</PostalCode>\n" +
			"<Country>Mexico</Country>\n" +
			"<Phone>(5) 555-3932</Phone>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>AROUT</CustomerID>\n" +
			"<CompanyName>Around the Horn</CompanyName>\n" +
			"<ContactName>Thomas Hardy</ContactName>\n" +
			"<ContactTitle>Sales Representative</ContactTitle>\n" +
			"<Address>120 Hanover Sq.</Address>\n" +
			"<City>London</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<PostalCode>WA1 1DP</PostalCode>\n" +
			"<Country>UK</Country>\n" +
			"<Phone>(171) 555-7788</Phone>\n" +
			"<Fax>(171) 555-6750</Fax>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>BERGS</CustomerID>\n" +
			"<CompanyName>Berglunds snabbköp</CompanyName>\n" +
			"<ContactName>Christina Berglund</ContactName>\n" +
			"<ContactTitle>Order Administrator</ContactTitle>\n" +
			"<Address>Berguvsvägen 8</Address>\n" +
			"<City>Luleå</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<PostalCode>S-958 22</PostalCode>\n" +
			"<Country>Sweden</Country>\n" +
			"<Phone>0921-12 34 65</Phone>\n" +
			"<Fax>0921-12 34 67</Fax>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>BLAUS</CustomerID>\n" +
			"<CompanyName>Blauer See Delikatessen</CompanyName>\n" +
			"<ContactName>Hanna Moos</ContactName>\n" +
			"<ContactTitle>Sales Representative</ContactTitle>\n" +
			"<Address>Forsterstr. 57</Address>\n" +
			"<City>Mannheim</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<PostalCode>68306</PostalCode>\n" +
			"<Country>Germany</Country>\n" +
			"<Phone>0621-08460</Phone>\n" +
			"<Fax>0621-08924</Fax>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>BLONP</CustomerID>\n" +
			"<CompanyName>Blondel père et fils</CompanyName>\n" +
			"<ContactName>Frédérique Citeaux</ContactName>\n" +
			"<ContactTitle>Marketing Manager</ContactTitle>\n" +
			"<Address>24, place Kléber</Address>\n" +
			"<City>Strasbourg</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<PostalCode>67000</PostalCode>\n" +
			"<Country>France</Country>\n" +
			"<Phone>88.60.15.31</Phone>\n" +
			"<Fax>88.60.15.32</Fax>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>BOLID</CustomerID>\n" +
			"<CompanyName>Bólido Comidas preparadas</CompanyName>\n" +
			"<ContactName>Martín Sommer</ContactName>\n" +
			"<ContactTitle>Owner</ContactTitle>\n" +
			"<Address>C/ Araquil, 67</Address>\n" +
			"<City>Madrid</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<PostalCode>28023</PostalCode>\n" +
			"<Country>Spain</Country>\n" +
			"<Phone>(91) 555 22 82</Phone>\n" +
			"<Fax>(91) 555 91 99</Fax>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>BONAP</CustomerID>\n" +
			"<CompanyName>Bon app'</CompanyName>\n" +
			"<ContactName>Laurence Lebihan</ContactName>\n" +
			"<ContactTitle>Owner</ContactTitle>\n" +
			"<Address>12, rue des Bouchers</Address>\n" +
			"<City>Marseille</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<PostalCode>13008</PostalCode>\n" +
			"<Country>France</Country>\n" +
			"<Phone>91.24.45.40</Phone>\n" +
			"<Fax>91.24.45.41</Fax>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>BOTTM</CustomerID>\n" +
			"<CompanyName>Bottom-Dollar Markets</CompanyName>\n" +
			"<ContactName>Elizabeth Lincoln</ContactName>\n" +
			"<ContactTitle>Accounting Manager</ContactTitle>\n" +
			"<Address>23 Tsawassen Blvd.</Address>\n" +
			"<City>Tsawassen</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<Region>BC</Region>\n" +
			"<PostalCode>T2F 8M4</PostalCode>\n" +
			"<Country>Canada</Country>\n" +
			"<Phone>(604) 555-4729</Phone>\n" +
			"<Fax>(604) 555-3745</Fax>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>BSBEV</CustomerID>\n" +
			"<CompanyName>B's Beverages</CompanyName>\n" +
			"<ContactName>Victoria Ashworth</ContactName>\n" +
			"<ContactTitle>Sales Representative</ContactTitle>\n" +
			"<Address>Fauntleroy Circus</Address>\n" +
			"<City>London</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<PostalCode>EC2 5NT</PostalCode>\n" +
			"<Country>UK</Country>\n" +
			"<Phone>(171) 555-1212</Phone>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>CACTU</CustomerID>\n" +
			"<CompanyName>Cactus Comidas para llevar</CompanyName>\n" +
			"<ContactName>Patricio Simpson</ContactName>\n" +
			"<ContactTitle>Sales Agent</ContactTitle>\n" +
			"<Address>Cerrito 333</Address>\n" +
			"<City>Buenos Aires</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<PostalCode>1010</PostalCode>\n" +
			"<Country>Argentina</Country>\n" +
			"<Phone>(1) 135-5555</Phone>\n" +
			"<Fax>(1) 135-4892</Fax>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>CENTC</CustomerID>\n" +
			"<CompanyName>Centro comercial Moctezuma</CompanyName>\n" +
			"<ContactName>Francisco Chang</ContactName>\n" +
			"<ContactTitle>Marketing Manager</ContactTitle>\n" +
			"<Address>Sierras de Granada 9993</Address>\n" +
			"<City>México D.F.</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<PostalCode>05022</PostalCode>\n" +
			"<Country>Mexico</Country>\n" +
			"<Phone>(5) 555-3392</Phone>\n" +
			"<Fax>(5) 555-7293</Fax>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>CHOPS</CustomerID>\n" +
			"<CompanyName>Chop-suey Chinese</CompanyName>\n" +
			"<ContactName>Yang Wang</ContactName>\n" +
			"<ContactTitle>Owner</ContactTitle>\n" +
			"<Address>Hauptstr. 29</Address>\n" +
			"<City>Bern</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<PostalCode>3012</PostalCode>\n" +
			"<Country>Switzerland</Country>\n" +
			"<Phone>0452-076545</Phone>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>COMMI</CustomerID>\n" +
			"<CompanyName>Comércio Mineiro</CompanyName>\n" +
			"<ContactName>Pedro Afonso</ContactName>\n" +
			"<ContactTitle>Sales Associate</ContactTitle>\n" +
			"<Address>Av. dos Lusíadas, 23</Address>\n" +
			"<City>São Paulo</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<Region>SP</Region>\n" +
			"<PostalCode>05432-043</PostalCode>\n" +
			"<Country>Brazil</Country>\n" +
			"<Phone>(11) 555-7647</Phone>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>CONSH</CustomerID>\n" +
			"<CompanyName>Consolidated Holdings</CompanyName>\n" +
			"<ContactName>Elizabeth Brown</ContactName>\n" +
			"<ContactTitle>Sales Representative</ContactTitle>\n" +
			"<Address>Berkeley Gardens 12 Brewery</Address>\n" +
			"<City>London</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<PostalCode>WX1 6LT</PostalCode>\n" +
			"<Country>UK</Country>\n" +
			"<Phone>(171) 555-2282</Phone>\n" +
			"<Fax>(171) 555-9199</Fax>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>DRACD</CustomerID>\n" +
			"<CompanyName>Drachenblut Delikatessen</CompanyName>\n" +
			"<ContactName>Sven Ottlieb</ContactName>\n" +
			"<ContactTitle>Order Administrator</ContactTitle>\n" +
			"<Address>Walserweg 21</Address>\n" +
			"<City>Aachen</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<PostalCode>52066</PostalCode>\n" +
			"<Country>Germany</Country>\n" +
			"<Phone>0241-039123</Phone>\n" +
			"<Fax>0241-059428</Fax>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>DUMON</CustomerID>\n" +
			"<CompanyName>Du monde entier</CompanyName>\n" +
			"<ContactName>Janine Labrune</ContactName>\n" +
			"<ContactTitle>Owner</ContactTitle>\n" +
			"<Address>67, rue des Cinquante Otages</Address>\n" +
			"<City>Nantes</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<PostalCode>44000</PostalCode>\n" +
			"<Country>France</Country>\n" +
			"<Phone>40.67.88.88</Phone>\n" +
			"<Fax>40.67.89.89</Fax>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>EASTC</CustomerID>\n" +
			"<CompanyName>Eastern Connection</CompanyName>\n" +
			"<ContactName>Ann Devon</ContactName>\n" +
			"<ContactTitle>Sales Agent</ContactTitle>\n" +
			"<Address>35 King George</Address>\n" +
			"<City>London</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<PostalCode>WX3 6FW</PostalCode>\n" +
			"<Country>UK</Country>\n" +
			"<Phone>(171) 555-0297</Phone>\n" +
			"<Fax>(171) 555-3373</Fax>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>ERNSH</CustomerID>\n" +
			"<CompanyName>Ernst Handel</CompanyName>\n" +
			"<ContactName>Roland Mendel</ContactName>\n" +
			"<ContactTitle>Sales Manager</ContactTitle>\n" +
			"<Address>Kirchgasse 6</Address>\n" +
			"<City>Graz</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<PostalCode>8010</PostalCode>\n" +
			"<Country>Austria</Country>\n" +
			"<Phone>7675-3425</Phone>\n" +
			"<Fax>7675-3426</Fax>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>FAMIA</CustomerID>\n" +
			"<CompanyName>Familia Arquibaldo</CompanyName>\n" +
			"<ContactName>Aria Cruz</ContactName>\n" +
			"<ContactTitle>Marketing Assistant</ContactTitle>\n" +
			"<Address>Rua Orós, 92</Address>\n" +
			"<City>São Paulo</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<Region>SP</Region>\n" +
			"<PostalCode>05442-030</PostalCode>\n" +
			"<Country>Brazil</Country>\n" +
			"<Phone>(11) 555-9857</Phone>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>FISSA</CustomerID>\n" +
			"<CompanyName>FISSA Fabrica Inter. Salchichas S.A.</CompanyName>\n" +
			"<ContactName>Diego Roel</ContactName>\n" +
			"<ContactTitle>Accounting Manager</ContactTitle>\n" +
			"<Address>C/ Moralzarzal, 86</Address>\n" +
			"<City>Madrid</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<PostalCode>28034</PostalCode>\n" +
			"<Country>Spain</Country>\n" +
			"<Phone>(91) 555 94 44</Phone>\n" +
			"<Fax>(91) 555 55 93</Fax>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>FOLIG</CustomerID>\n" +
			"<CompanyName>Folies gourmandes</CompanyName>\n" +
			"<ContactName>Martine Rancé</ContactName>\n" +
			"<ContactTitle>Assistant Sales Agent</ContactTitle>\n" +
			"<Address>184, chaussée de Tournai</Address>\n" +
			"<City>Lille</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<PostalCode>59000</PostalCode>\n" +
			"<Country>France</Country>\n" +
			"<Phone>20.16.10.16</Phone>\n" +
			"<Fax>20.16.10.17</Fax>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>FOLKO</CustomerID>\n" +
			"<CompanyName>Folk och fä HB</CompanyName>\n" +
			"<ContactName>Maria Larsson</ContactName>\n" +
			"<ContactTitle>Owner</ContactTitle>\n" +
			"<Address>Åkergatan 24</Address>\n" +
			"<City>Bräcke</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<PostalCode>S-844 67</PostalCode>\n" +
			"<Country>Sweden</Country>\n" +
			"<Phone>0695-34 67 21</Phone>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>FRANK</CustomerID>\n" +
			"<CompanyName>Frankenversand</CompanyName>\n" +
			"<ContactName>Peter Franken</ContactName>\n" +
			"<ContactTitle>Marketing Manager</ContactTitle>\n" +
			"<Address>Berliner Platz 43</Address>\n" +
			"<City>München</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<PostalCode>80805</PostalCode>\n" +
			"<Country>Germany</Country>\n" +
			"<Phone>089-0877310</Phone>\n" +
			"<Fax>089-0877451</Fax>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>FRANR</CustomerID>\n" +
			"<CompanyName>France restauration</CompanyName>\n" +
			"<ContactName>Carine Schmitt</ContactName>\n" +
			"<ContactTitle>Marketing Manager</ContactTitle>\n" +
			"<Address>54, rue Royale</Address>\n" +
			"<City>Nantes</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<PostalCode>44000</PostalCode>\n" +
			"<Country>France</Country>\n" +
			"<Phone>40.32.21.21</Phone>\n" +
			"<Fax>40.32.21.20</Fax>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>FRANS</CustomerID>\n" +
			"<CompanyName>Franchi S.p.A.</CompanyName>\n" +
			"<ContactName>Paolo Accorti</ContactName>\n" +
			"<ContactTitle>Sales Representative</ContactTitle>\n" +
			"<Address>Via Monte Bianco 34</Address>\n" +
			"<City>Torino</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<PostalCode>10100</PostalCode>\n" +
			"<Country>Italy</Country>\n" +
			"<Phone>011-4988260</Phone>\n" +
			"<Fax>011-4988261</Fax>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>FURIB</CustomerID>\n" +
			"<CompanyName>Furia Bacalhau e Frutos do Mar</CompanyName>\n" +
			"<ContactName>Lino Rodriguez</ContactName>\n" +
			"<ContactTitle>Sales Manager</ContactTitle>\n" +
			"<Address>Jardim das rosas n. 32</Address>\n" +
			"<City>Lisboa</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<PostalCode>1675</PostalCode>\n" +
			"<Country>Portugal</Country>\n" +
			"<Phone>(1) 354-2534</Phone>\n" +
			"<Fax>(1) 354-2535</Fax>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>GALED</CustomerID>\n" +
			"<CompanyName>Galería del gastrónomo</CompanyName>\n" +
			"<ContactName>Eduardo Saavedra</ContactName>\n" +
			"<ContactTitle>Marketing Manager</ContactTitle>\n" +
			"<Address>Rambla de Cataluña, 23</Address>\n" +
			"<City>Barcelona</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<PostalCode>08022</PostalCode>\n" +
			"<Country>Spain</Country>\n" +
			"<Phone>(93) 203 4560</Phone>\n" +
			"<Fax>(93) 203 4561</Fax>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>GODOS</CustomerID>\n" +
			"<CompanyName>Godos Cocina Típica</CompanyName>\n" +
			"<ContactName>José Pedro Freyre</ContactName>\n" +
			"<ContactTitle>Sales Manager</ContactTitle>\n" +
			"<Address>C/ Romero, 33</Address>\n" +
			"<City>Sevilla</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<PostalCode>41101</PostalCode>\n" +
			"<Country>Spain</Country>\n" +
			"<Phone>(95) 555 82 82</Phone>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>GOURL</CustomerID>\n" +
			"<CompanyName>Gourmet Lanchonetes</CompanyName>\n" +
			"<ContactName>André Fonseca</ContactName>\n" +
			"<ContactTitle>Sales Associate</ContactTitle>\n" +
			"<Address>Av. Brasil, 442</Address>\n" +
			"<City>Campinas</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<Region>SP</Region>\n" +
			"<PostalCode>04876-786</PostalCode>\n" +
			"<Country>Brazil</Country>\n" +
			"<Phone>(11) 555-9482</Phone>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>GREAL</CustomerID>\n" +
			"<CompanyName>Great Lakes Food Market</CompanyName>\n" +
			"<ContactName>Howard Snyder</ContactName>\n" +
			"<ContactTitle>Marketing Manager</ContactTitle>\n" +
			"<Address>2732 Baker Blvd.</Address>\n" +
			"<City>Eugene</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<Region>OR</Region>\n" +
			"<PostalCode>97403</PostalCode>\n" +
			"<Country>USA</Country>\n" +
			"<Phone>(503) 555-7555</Phone>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>GROSR</CustomerID>\n" +
			"<CompanyName>GROSELLA-Restaurante</CompanyName>\n" +
			"<ContactName>Manuel Pereira</ContactName>\n" +
			"<ContactTitle>Owner</ContactTitle>\n" +
			"<Address>5ª Ave. Los Palos Grandes</Address>\n" +
			"<City>Caracas</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<Region>DF</Region>\n" +
			"<PostalCode>1081</PostalCode>\n" +
			"<Country>Venezuela</Country>\n" +
			"<Phone>(2) 283-2951</Phone>\n" +
			"<Fax>(2) 283-3397</Fax>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>HANAR</CustomerID>\n" +
			"<CompanyName>Hanari Carnes</CompanyName>\n" +
			"<ContactName>Mario Pontes</ContactName>\n" +
			"<ContactTitle>Accounting Manager</ContactTitle>\n" +
			"<Address>Rua do Paço, 67</Address>\n" +
			"<City>Rio de Janeiro</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<Region>RJ</Region>\n" +
			"<PostalCode>05454-876</PostalCode>\n" +
			"<Country>Brazil</Country>\n" +
			"<Phone>(21) 555-0091</Phone>\n" +
			"<Fax>(21) 555-8765</Fax>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>HILAA</CustomerID>\n" +
			"<CompanyName>HILARIÓN-Abastos</CompanyName>\n" +
			"<ContactName>Carlos Hernández</ContactName>\n" +
			"<ContactTitle>Sales Representative</ContactTitle>\n" +
			"<Address>Carrera 22 con Ave. Carlos Soublette #8-35</Address>\n" +
			"<City>San Cristóbal</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<Region>Táchira</Region>\n" +
			"<PostalCode>5022</PostalCode>\n" +
			"<Country>Venezuela</Country>\n" +
			"<Phone>(5) 555-1340</Phone>\n" +
			"<Fax>(5) 555-1948</Fax>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>HUNGC</CustomerID>\n" +
			"<CompanyName>Hungry Coyote Import Store</CompanyName>\n" +
			"<ContactName>Yoshi Latimer</ContactName>\n" +
			"<ContactTitle>Sales Representative</ContactTitle>\n" +
			"<Address>City Center Plaza 516 Main St.</Address>\n" +
			"<City>Elgin</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<Region>OR</Region>\n" +
			"<PostalCode>97827</PostalCode>\n" +
			"<Country>USA</Country>\n" +
			"<Phone>(503) 555-6874</Phone>\n" +
			"<Fax>(503) 555-2376</Fax>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>HUNGO</CustomerID>\n" +
			"<CompanyName>Hungry Owl All-Night Grocers</CompanyName>\n" +
			"<ContactName>Patricia McKenna</ContactName>\n" +
			"<ContactTitle>Sales Associate</ContactTitle>\n" +
			"<Address>8 Johnstown Road</Address>\n" +
			"<City>Cork</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<Region>Co. Cork</Region>\n" +
			"<Country>Ireland</Country>\n" +
			"<Phone>2967 542</Phone>\n" +
			"<Fax>2967 3333</Fax>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>ISLAT</CustomerID>\n" +
			"<CompanyName>Island Trading</CompanyName>\n" +
			"<ContactName>Helen Bennett</ContactName>\n" +
			"<ContactTitle>Marketing Manager</ContactTitle>\n" +
			"<Address>Garden House Crowther Way</Address>\n" +
			"<City>Cowes</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<Region>Isle of Wight</Region>\n" +
			"<PostalCode>PO31 7PJ</PostalCode>\n" +
			"<Country>UK</Country>\n" +
			"<Phone>(198) 555-8888</Phone>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>KOENE</CustomerID>\n" +
			"<CompanyName>Königlich Essen</CompanyName>\n" +
			"<ContactName>Philip Cramer</ContactName>\n" +
			"<ContactTitle>Sales Associate</ContactTitle>\n" +
			"<Address>Maubelstr. 90</Address>\n" +
			"<City>Brandenburg</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<PostalCode>14776</PostalCode>\n" +
			"<Country>Germany</Country>\n" +
			"<Phone>0555-09876</Phone>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>LACOR</CustomerID>\n" +
			"<CompanyName>La corne d'abondance</CompanyName>\n" +
			"<ContactName>Daniel Tonini</ContactName>\n" +
			"<ContactTitle>Sales Representative</ContactTitle>\n" +
			"<Address>67, avenue de l'Europe</Address>\n" +
			"<City>Versailles</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<PostalCode>78000</PostalCode>\n" +
			"<Country>France</Country>\n" +
			"<Phone>30.59.84.10</Phone>\n" +
			"<Fax>30.59.85.11</Fax>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>LAMAI</CustomerID>\n" +
			"<CompanyName>La maison d'Asie</CompanyName>\n" +
			"<ContactName>Annette Roulet</ContactName>\n" +
			"<ContactTitle>Sales Manager</ContactTitle>\n" +
			"<Address>1 rue Alsace-Lorraine</Address>\n" +
			"<City>Toulouse</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<PostalCode>31000</PostalCode>\n" +
			"<Country>France</Country>\n" +
			"<Phone>61.77.61.10</Phone>\n" +
			"<Fax>61.77.61.11</Fax>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>LAUGB</CustomerID>\n" +
			"<CompanyName>Laughing Bacchus Wine Cellars</CompanyName>\n" +
			"<ContactName>Yoshi Tannamuri</ContactName>\n" +
			"<ContactTitle>Marketing Assistant</ContactTitle>\n" +
			"<Address>1900 Oak St.</Address>\n" +
			"<City>Vancouver</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<Region>BC</Region>\n" +
			"<PostalCode>V3F 2K1</PostalCode>\n" +
			"<Country>Canada</Country>\n" +
			"<Phone>(604) 555-3392</Phone>\n" +
			"<Fax>(604) 555-7293</Fax>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>LAZYK</CustomerID>\n" +
			"<CompanyName>Lazy K Kountry Store</CompanyName>\n" +
			"<ContactName>John Steel</ContactName>\n" +
			"<ContactTitle>Marketing Manager</ContactTitle>\n" +
			"<Address>12 Orchestra Terrace</Address>\n" +
			"<City>Walla Walla</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<Region>WA</Region>\n" +
			"<PostalCode>99362</PostalCode>\n" +
			"<Country>USA</Country>\n" +
			"<Phone>(509) 555-7969</Phone>\n" +
			"<Fax>(509) 555-6221</Fax>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>LEHMS</CustomerID>\n" +
			"<CompanyName>Lehmanns Marktstand</CompanyName>\n" +
			"<ContactName>Renate Messner</ContactName>\n" +
			"<ContactTitle>Sales Representative</ContactTitle>\n" +
			"<Address>Magazinweg 7</Address>\n" +
			"<City>Frankfurt a.M.</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<PostalCode>60528</PostalCode>\n" +
			"<Country>Germany</Country>\n" +
			"<Phone>069-0245984</Phone>\n" +
			"<Fax>069-0245874</Fax>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>LETSS</CustomerID>\n" +
			"<CompanyName>Let's Stop N Shop</CompanyName>\n" +
			"<ContactName>Jaime Yorres</ContactName>\n" +
			"<ContactTitle>Owner</ContactTitle>\n" +
			"<Address>87 Polk St. Suite 5</Address>\n" +
			"<City>San Francisco</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<Region>CA</Region>\n" +
			"<PostalCode>94117</PostalCode>\n" +
			"<Country>USA</Country>\n" +
			"<Phone>(415) 555-5938</Phone>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>LILAS</CustomerID>\n" +
			"<CompanyName>LILA-Supermercado</CompanyName>\n" +
			"<ContactName>Carlos González</ContactName>\n" +
			"<ContactTitle>Accounting Manager</ContactTitle>\n" +
			"<Address>Carrera 52 con Ave. Bolívar #65-98 Llano Largo</Address>\n" +
			"<City>Barquisimeto</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<Region>Lara</Region>\n" +
			"<PostalCode>3508</PostalCode>\n" +
			"<Country>Venezuela</Country>\n" +
			"<Phone>(9) 331-6954</Phone>\n" +
			"<Fax>(9) 331-7256</Fax>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>LINOD</CustomerID>\n" +
			"<CompanyName>LINO-Delicateses</CompanyName>\n" +
			"<ContactName>Felipe Izquierdo</ContactName>\n" +
			"<ContactTitle>Owner</ContactTitle>\n" +
			"<Address>Ave. 5 de Mayo Porlamar</Address>\n" +
			"<City>I. de Margarita</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<Region>Nueva Esparta</Region>\n" +
			"<PostalCode>4980</PostalCode>\n" +
			"<Country>Venezuela</Country>\n" +
			"<Phone>(8) 34-56-12</Phone>\n" +
			"<Fax>(8) 34-93-93</Fax>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>LONEP</CustomerID>\n" +
			"<CompanyName>Lonesome Pine Restaurant</CompanyName>\n" +
			"<ContactName>Fran Wilson</ContactName>\n" +
			"<ContactTitle>Sales Manager</ContactTitle>\n" +
			"<Address>89 Chiaroscuro Rd.</Address>\n" +
			"<City>Portland</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<Region>OR</Region>\n" +
			"<PostalCode>97219</PostalCode>\n" +
			"<Country>USA</Country>\n" +
			"<Phone>(503) 555-9573</Phone>\n" +
			"<Fax>(503) 555-9646</Fax>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>MAGAA</CustomerID>\n" +
			"<CompanyName>Magazzini Alimentari Riuniti</CompanyName>\n" +
			"<ContactName>Giovanni Rovelli</ContactName>\n" +
			"<ContactTitle>Marketing Manager</ContactTitle>\n" +
			"<Address>Via Ludovico il Moro 22</Address>\n" +
			"<City>Bergamo</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<PostalCode>24100</PostalCode>\n" +
			"<Country>Italy</Country>\n" +
			"<Phone>035-640230</Phone>\n" +
			"<Fax>035-640231</Fax>\n" +
			"</Contact>\n" +
			"<Contact>\n" +
			"<CustomerID>MAISD</CustomerID>\n" +
			"<CompanyName>Maison Dewey</CompanyName>\n" +
			"<ContactName>Catherine Dewey</ContactName>\n" +
			"<ContactTitle>Sales Agent</ContactTitle>\n" +
			"<Address>Rue Joseph-Bens 532</Address>\n" +
			"<City>Bruxelles</City>\n" +
			"<Email>dummy@gmail.com</Email>\n" +
			"<PostalCode>B-1180</PostalCode>\n" +
			"<Country>Belgium</Country>\n" +
			"<Phone>(02) 201 24 67</Phone>\n" +
			"<Fax>(02) 201 24 68</Fax>\n" +
			"</Contact>\n" +
			"</AddressBook>";
	
	@Test
	public void xmlToJsonTest() throws IOException{
		
		XmlToJson xmlToJson1 = new XmlToJson.Builder(xmlStr).build();
		System.out.println(xmlToJson1.toString());
		
		//XmlToJson xmlToJson2 = new XmlToJson.Builder(IOUtils.toInputStream(xmlStr,"UTF-8"), null).build();
		//System.out.println(xmlToJson2.toFormattedString());
		
	}
	
	
	//@Test
	//public void XmlToJsonAttributeHandlerTest(){
		
		/*
		 * Custom label content node name
		 */
		//XmlToJson xmlToJson1 = new XmlToJson.Builder(xmlStr)
				//.setContentName("/Users/User/book", "title")
				//.build();
		//System.out.println(xmlToJson1.toFormattedString());
		
		//Ignore certain tags and attributes
		//XmlToJson xmlToJson2 = new XmlToJson.Builder(xmlStr)
				//.skipTag("/Users/User/Name")
				//.skipAttribute("/Users/User/book/id")
				//.build();
		//System.out.println(xmlToJson2.toFormattedString());
		
	//}
	
}
