package br.com.eaugusto.coursetasktests;


import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

import br.com.eaugusto.coursetask.Person;

/**
 * Unit test to verify that a filtered list contains only women.
 * 
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 19, 2025
 */
public class FilterByGenderTest {

	@Test
	public void testOnlyWomenAreInTheList() {

		// Simulating a list of people as if they were parsed from user input
		List<Person> people = List.of(
				new Person("Maria", "F"),
				new Person("Ana", "F"),
				new Person("Eduarda", "F"));

		// Filtering only women
		List<Person> women = people.stream()
				.filter(person -> person.getGender().equalsIgnoreCase("F"))
				.collect(Collectors.toList());
		

        // Verifying that ALL people in the filtered list are women
        boolean onlyWomen = women.stream().allMatch(person -> person.getGender().equalsIgnoreCase("F"));

        assertTrue(onlyWomen, "The list contains non-female entries.");
	}
}
