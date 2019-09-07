import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import org.ehcache.Cache;
import org.ehcache.CacheManager;
import org.ehcache.config.Builder;
import org.ehcache.config.builders.CacheConfigurationBuilder;
import org.ehcache.config.builders.CacheManagerBuilder;
import org.ehcache.config.builders.ResourcePoolsBuilder;
import org.ehcache.config.units.EntryUnit;

public class Main {

	

	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		 ArrayList<String> paises = new ArrayList<String>();
		 ArrayList<String> facultades=new ArrayList<String>();
		 ArrayList<String> sedes=new ArrayList<String>();

		 ArrayList<String> programas = new ArrayList<String>();
		 
		 paises.add("Colombia");
		 paises.add("España");
		 paises.add("Mexico");
		 paises.add("Venezuela");
		 paises.add("Francia");
		 paises.add("Polonia");
		 paises.add("Paises Bajos");
		 facultades.add("Matematicas e Ingenieria");
		 facultades.add("Mercadeo y Negocios");
		 facultades.add("Psicologia");
		 sedes.add("CPC");
		 sedes.add("Central");
		 sedes.add("EDI");
		 sedes.add("LUNA");
		 sedes.add("Bienestar");
		 programas.add("Ingenieria de sistemas");
		 programas.add("Psicologia");
		 programas.add("Ingenieria Industrial");
		 programas.add("Negocios internacionales");
		 programas.add("Matemáticas");
		 
		 CacheManager cacheManager = CacheManagerBuilder.newCacheManagerBuilder()
	                .withCache("cache", CacheConfigurationBuilder.newCacheConfigurationBuilder(Integer.class, String.class,
	                    ResourcePoolsBuilder.newResourcePoolsBuilder().heap(100, EntryUnit.ENTRIES).build())	                  
	                    .build())
	                .build(true);
		 
		 
		 Cache<Integer, String> cache1 = cacheManager.getCache("cache",Integer.class, String.class);
		 IntStream.range(0, paises.size()).forEach(i-> cache1.put(i, paises.get(i)));
		 Cache<Integer, String> cache2 = cacheManager.getCache("cache",Integer.class, String.class);

		 IntStream.range(0, facultades.size()).forEach(i-> cache2.put(i, facultades.get(i)));
		 Cache<Integer, String> cache3 = cacheManager.getCache("cache",Integer.class, String.class);

		 IntStream.range(0, sedes.size()).forEach(i-> cache3.put(i, sedes.get(i)));
		 Cache<Integer, String> cache4 = cacheManager.getCache("cache",Integer.class, String.class);

		 IntStream.range(0, programas.size()).forEach(i-> cache4.put(i, programas.get(i)));
		 
		 
		 Scanner sc = new Scanner(System.in);
		 

		 System.out.println("Escriba el numero 1 para mostrar los paises");
		 System.out.println("Escriba el numero 2 para mostrar las facultades");

		 System.out.println("Escriba el numero 3 para mostrar las sedes");

		 System.out.println("Escriba el numero 4 para mostrar los programas");
		 int numero;
		 while((numero=sc.nextInt())!=0) {
			 switch (numero) {
			case 1:
				cache1.toString();
				break;
			case 2:
				cache2.toString();

				break;
			case 3:
				cache3.toString();

				break;

			case 4:
				cache4.toString();

				break;
			default:
				break;
			}			 
			 
		 }

	}
}
