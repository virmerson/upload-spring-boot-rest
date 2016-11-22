package br.com.fabricadeprogramador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EasyUploadApplicationTests {

	@Test
	public void contextLoads() {
		
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Merilyn");
		nomes.add("Thiago");
		nomes.add("duk");
		
		/* for (String n: nomes){
			System.out.println(n);
		} */
		
		/* nomes.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
		}); */
		
		//Lambda
		/* nomes.forEach((String t)-> {
				System.out.println(t);
			}
		);*/
		
		Iterator<String> iterator = nomes.iterator();
		
		while ( iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
	
		
		
	}

}
