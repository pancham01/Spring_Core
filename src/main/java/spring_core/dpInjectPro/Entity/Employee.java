package spring_core.dpInjectPro.Entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Employee {
	private String name;
	private List<String> address;
	private Set<Integer> phone;
	private Map<Integer,String> map;

}
