import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class isUniqueTest {

	@Test
	void testIsUnique() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("Marty", "Steep");
		map.put("Stuart", "Reges");
		map.put("Jessica", "Miller");
		map.put("Amanda", "Camp");
		map.put("Hal", "Perkins");
		assertTrue(isUnique.isUnique(map));
		
		Map<String, String> map2 = new HashMap<String, String>();
		map2.put("Kendrick", "Perkins");
		map2.put("Stuart", "Reges"); 		//same value
		map2.put("Jessica", "Miller");
		map2.put("Bruce", "Reges"); 		//same value
		map2.put("Hal", "Perkins");
		assertFalse(isUnique.isUnique(map2));
	}

}
